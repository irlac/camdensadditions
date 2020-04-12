package com.github.irlac.camdensadditions.util;

import com.github.irlac.camdensadditions.Main;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {

    public static Item setItemName(final Item item, final String name) {
        item.setRegistryName(Main.MODID, name).setTranslationKey(Main.MODID + "." + name);
        return item;
    }

    public static Block setBlockName(final Block block, final String name) {
        block.setRegistryName(Main.MODID, name).setTranslationKey(Main.MODID + "." + name);
        return block;
    }

}