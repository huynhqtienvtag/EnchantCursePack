package me.hsgamer.enchantcursepack.enchants;

import com.sucy.enchant.api.CustomEnchantment;
import com.sucy.enchant.api.ItemSet;
import com.sucy.enchant.api.Tasks;
import org.bukkit.entity.LivingEntity;
import org.bukkit.scheduler.BukkitTask;

import java.util.Hashtable;
import java.util.UUID;

public class Fire extends CustomEnchantment {

    private static Hashtable<UUID, BukkitTask> tasks = new Hashtable<>();
    private static String FREQUENCY = "frequency";
    private static String TICK = "fire-tick";

    public Fire() {
        super("Curse Of Fire", "Cause Burning while wearing");

        setMaxLevel(1, 1);
        setWeight(2);
        settings.set(FREQUENCY, 5, 0);
        settings.set(TICK, 10);

        addNaturalItems(ItemSet.ARMOR.getItems());
    }

    public void applyEquip(LivingEntity user, int level) {
        int frequency = (int) settings.get(FREQUENCY, level) * 20;
        int firetick = (int) settings.get(TICK) * 20;
        tasks.put(user.getUniqueId(), Tasks.schedule(() -> user.setFireTicks(firetick), frequency, frequency));
    }

    public void applyUnequip(LivingEntity user, int level) {
        tasks.remove(user.getUniqueId()).cancel();
    }
}
