package me.hsgamer.enchantcursepack.enchants.potion;

import com.sucy.enchant.api.ItemSet;
import org.bukkit.potion.PotionEffectType;

public class Nausea extends PotionCurse {
    public Nausea() {
        super("Curse Of Nausea", "Cause Nausea while wearing");

        addNaturalItems(ItemSet.HELMETS.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.CONFUSION;
    }
}
