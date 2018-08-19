package me.hsgamer.enchantcursepack.enchants.potion;

import com.sucy.enchant.api.ItemSet;
import org.bukkit.potion.PotionEffectType;

public class Hunger extends PotionCurse {
    public Hunger() {
        super("Curse Of Hunger", "Cause Hunger when wearing");

        addNaturalItems(ItemSet.ARMOR.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.HUNGER;
    }
}
