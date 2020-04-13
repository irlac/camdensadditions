package com.github.irlac.camdensadditions;

// Start of Imports
import com.github.irlac.camdensadditions.client.CreativeModTab;
import com.github.irlac.camdensadditions.recipes.ModRecipes;
import com.github.irlac.camdensadditions.util.handlers.ModSoundHandler;
import com.github.irlac.camdensadditions.util.handlers.RegistryHandler;
import com.github.irlac.camdensadditions.world.gen.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// End of Imports

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION) // Tells Forge that this is a mod, and passes on important information, such as the name of the mod.
public class Main {
    public static final String MODID = "camdensadditions";
    public static final String NAME = "Camden's Additions";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";

    private static final Logger LOGGER = LogManager.getLogger(Main.MODID);

    public static final CreativeTabs CREATIVE_TAB = new CreativeModTab();

    public static final int ENTITY_PINNY = 250;

    @Mod.Instance
    public static Main instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) { // Pre-Initialization events. These run when the game is first starting up.
        LOGGER.info(Main.NAME + " say hi!");
        RegistryHandler.preInitRegistries(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) { // Main initialization events. These run as the game loads (Mojang logo screen).
        ModRecipes.initSmelting(); // Says "Hey! Game! Make sure you know about our custom smelting!"
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 0); // Shouts at the game until it's so scared that it has no choice but to incorporate our custom worldgen.
        ModSoundHandler.registerSounds();
    }
}
