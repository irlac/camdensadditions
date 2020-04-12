package com.github.irlac.camdensadditions;

import com.github.irlac.camdensadditions.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeModTab extends CreativeTabs {
    public CreativeModTab() {
        super(Main.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.YEETUS_CRYSTAL);
    }
}
