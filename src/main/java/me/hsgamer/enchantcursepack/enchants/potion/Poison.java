package me.hsgamer.enchantcursepack.enchants.potion;

import com.sucy.enchant.api.ItemSet;
import org.bukkit.potion.PotionEffectType;

public class Poison extends PotionCurse {

    public Poison() {
        super("Curse Of Poisoning", "Cause Poison while wearing");

        addNaturalItems(ItemSet.ARMOR.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.POISON;
    }

}
