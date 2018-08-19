package me.hsgamer.enchantcursepack.enchants.potion;

import com.sucy.enchant.api.ItemSet;
import org.bukkit.potion.PotionEffectType;

public class Blindness extends PotionCurse {

    public Blindness() {
        super("Curse Of Blindness", "Cause Blindness while wearing");

        addNaturalItems(ItemSet.HELMETS.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.BLINDNESS;
    }
}
