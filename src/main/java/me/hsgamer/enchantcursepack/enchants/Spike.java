package me.hsgamer.enchantcursepack.enchants;

import com.sucy.enchant.api.CustomEnchantment;
import com.sucy.enchant.api.ItemSet;
import com.sucy.enchant.api.Tasks;
import org.bukkit.entity.LivingEntity;
import org.bukkit.scheduler.BukkitTask;

import java.util.Hashtable;
import java.util.UUID;

public class Spike extends CustomEnchantment {

    private static Hashtable<UUID, BukkitTask> tasks = new Hashtable<>();
    private static String FREQUENCY = "frequency";
    private static String DAMAGE = "damage";

    public Spike() {
        super("Curse Of Spike", "Cause Damage while wearing");

        setMaxLevel(1, 1);
        setWeight(2);
        settings.set(FREQUENCY, 5, 0);
        settings.set(DAMAGE, 5, 0);

        addNaturalItems(ItemSet.SWORDS.getItems());
        addNaturalItems(ItemSet.ARMOR.getItems());
        addNaturalItems(ItemSet.BOWS.getItems());
    }

    public void applyEquip(LivingEntity user, int level) {
        int frequency = (int) settings.get(FREQUENCY, level) * 20;
        double damage = settings.get(DAMAGE, level);
        tasks.put(user.getUniqueId(), Tasks.schedule(() -> user.damage(damage, user), frequency, frequency));
    }

    public void applyUnequip(LivingEntity user, int level) {
        tasks.remove(user.getUniqueId()).cancel();
    }
}
