package com.github.irlac.camdensadditions.util.handlers;

// Start of Imports
import com.github.irlac.camdensadditions.Main;
import com.github.irlac.camdensadditions.init.ModBlocks;
import com.github.irlac.camdensadditions.item.YeetusSword;
import com.github.irlac.camdensadditions.materials.ModMaterials;
import com.github.irlac.camdensadditions.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
// End of Imports

@EventBusSubscriber(modid = Main.MODID) // Tells Forge that this class manipulates registration events.
public class RegistryHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) { // Registers all items (Tools, blocks in-inventory, etc.).
        final Item[] items = { // Sets up our array of custom items, and defines things such as name and where it should be shown in creative. Uses RegistryUtil!
                RegistryUtil.setItemName(new Item(), "yeetus_crystal").setCreativeTab(Main.CREATIVE_TAB),
                RegistryUtil.setItemName(new YeetusSword(ModMaterials.YEETUS_SWORD), "yeetus_sword").setCreativeTab(Main.CREATIVE_TAB)
                // Add more as necessary...
        };

        final Item[] itemBlocks = { // Same as above, but with blocks. Rather than defining name and details (that is done in the registerBlocks function below), only does the primary registration.
                new ItemBlock(ModBlocks.YEETUS_ORE).setRegistryName(ModBlocks.YEETUS_ORE.getRegistryName())
                // Add more as necessary...
        };

        // These two function calls perform the registrations for the definitions in the arrays above!
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) { // Registers all blocks (physically), and their details.
        final Block[] blocks = { // Array of defined blocks.
                RegistryUtil.setBlockName(new Block(Material.ROCK).setHardness(10.0F), "yeetus_ore").setCreativeTab(Main.CREATIVE_TAB)
                // Add more as necessary...
        };

        // Performs block registration.
        event.getRegistry().registerAll(blocks);
    }

    public static void preInitRegistries(FMLPreInitializationEvent event) {
        EntityHandler.registerEntities();
        RenderHandler.registerEntityRenders();
        ModEventHandler.registerEvents();
    }
}