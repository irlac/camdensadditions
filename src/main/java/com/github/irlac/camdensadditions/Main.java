package com.github.irlac.camdensadditions;

import com.github.irlac.camdensadditions.recipes.ModRecipes;
import com.github.irlac.camdensadditions.world.gen.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "camdensadditions";
    public static final String NAME = "Camden's Additions";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";

    private static final Logger LOGGER = LogManager.getLogger(Main.MODID);

    public static final CreativeTabs CREATIVE_TAB = new CreativeModTab();


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LOGGER.info(Main.NAME + " say hi!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.initSmelting();
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
    }
}
