package me.hsgamer.enchantcursepack.enchants.potion;

import com.sucy.enchant.api.ItemSet;
import org.bukkit.potion.PotionEffectType;

public class Weakness extends PotionCurse {

    public Weakness() {
        super("Curse Of Weakness", "Cause Weakness while wearing");

        addNaturalItems(ItemSet.ARMOR.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.WEAKNESS;
    }
}
