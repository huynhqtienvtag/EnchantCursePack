package me.hsgamer.enchantcursepack;

import com.sucy.enchant.api.EnchantPlugin;
import com.sucy.enchant.api.EnchantmentRegistry;
import me.hsgamer.enchantcursepack.enchants.Fire;
import me.hsgamer.enchantcursepack.enchants.Spike;
import me.hsgamer.enchantcursepack.enchants.Thorn;
import me.hsgamer.enchantcursepack.enchants.potion.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantCursePack extends JavaPlugin implements EnchantPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "EnchantCursePack has been added");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "EnchantCursePack has been removed");
    }

    @Override
    public void registerEnchantments(EnchantmentRegistry enchantmentRegistry) {
        enchantmentRegistry.register(
                new Poison(),
                new Blindness(),
                new Weakness(),
                new Wither(),
                new Slowness(),
                new Spike(),
                new Fatigue(),
                new Nausea(),
                new Hunger(),
                new Thorn(),
                new Fire()
        );
    }
}
