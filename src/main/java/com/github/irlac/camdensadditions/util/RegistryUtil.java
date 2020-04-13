package com.github.irlac.camdensadditions.util;

// Start of Imports
import com.github.irlac.camdensadditions.Main;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
// End of Imports

// This class simply defines an easier route to registering items and blocks.
// Rather than manually setting up the register for each new item / block, these functions do it automatically when called. (Used in RegistrationHandler.java!)
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