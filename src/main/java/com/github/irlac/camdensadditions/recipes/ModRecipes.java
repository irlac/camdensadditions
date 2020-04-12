package com.github.irlac.camdensadditions.recipes;

import com.github.irlac.camdensadditions.init.ModBlocks;
import com.github.irlac.camdensadditions.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void initSmelting() {
        GameRegistry.addSmelting(ModBlocks.YEETUS_ORE, new ItemStack(ModItems.YEETUS_CRYSTAL), 10.0F);
    }
}
