package com.github.irlac.camdensadditions;

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
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Main.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                RegistryUtil.setItemName(new Item(), "yeetus_crystal").setCreativeTab(Main.CREATIVE_TAB),
                RegistryUtil.setItemName(new YeetusSword(ModMaterials.YEETUS_SWORD), "yeetus_sword").setCreativeTab(Main.CREATIVE_TAB)
                // Add more as necessary...
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.YEETUS_ORE).setRegistryName(ModBlocks.YEETUS_ORE.getRegistryName())
                // Add more as necessary...
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                RegistryUtil.setBlockName(new Block(Material.ROCK).setHardness(10.0F), "yeetus_ore").setCreativeTab(Main.CREATIVE_TAB)
        };

        event.getRegistry().registerAll(blocks);
    }
}