package com.github.irlac.camdensadditions.client;

// Start of Imports
import com.github.irlac.camdensadditions.Main;
import com.github.irlac.camdensadditions.init.ModBlocks;
import com.github.irlac.camdensadditions.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
//End of Imports

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Main.MODID) // Event bus call, tells Forge that this class controls various registry events, in this case Models.
public class ModelRegistrationHandler {

    // Primary registration event. Registers ALL items and blocks!
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.YEETUS_CRYSTAL, 0);
        registerModel(ModItems.YEETUS_SWORD, 0);
        registerModel(Item.getItemFromBlock(ModBlocks.YEETUS_ORE), 0);
        // Add more as necessary...
    }

    // Secondary model registers, allows for general loading of models.
    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}