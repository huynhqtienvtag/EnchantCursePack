package me.hsgamer.enchantcursepack.enchants.potion;

import com.sucy.enchant.api.ItemSet;
import org.bukkit.potion.PotionEffectType;

public class Fatigue extends PotionCurse {

    public Fatigue() {
        super("Curse Of Fatigue", "Cause Fatigue while using");

        addNaturalItems(ItemSet.SWORDS.getItems());
        addNaturalItems(ItemSet.TOOLS.getItems());
    }

    public PotionEffectType type() {
        return PotionEffectType.SLOW_DIGGING;
    }
}
