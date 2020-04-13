package com.github.irlac.camdensadditions.recipes;

//Start of Imports
import com.github.irlac.camdensadditions.init.ModBlocks;
import com.github.irlac.camdensadditions.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
// End of Imports

public class ModRecipes { // This class is for defining smelting recipes! Crafting recipes should be defined in an individual JSON file in the "recipes" resource directory.
    public static void initSmelting() { // Registers smelting operations. First value is INPUT (Item / block to be smelted), second value is OUTPUT (Resulting item / block), third value is XP received from the operation.
        GameRegistry.addSmelting(ModBlocks.YEETUS_ORE, new ItemStack(ModItems.YEETUS_CRYSTAL), 10.0F);
    }
}
