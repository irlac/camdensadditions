package com.github.irlac.camdensadditions;

// Start of Imports
import com.github.irlac.camdensadditions.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
// End of Imports

public class CreativeModTab extends CreativeTabs { // This class defines a new tab for creative mode players.
    public CreativeModTab() {
        super(Main.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.YEETUS_CRYSTAL); // Defines the icon used for the tab, in this case the texture for the Yeetus Crystal.
    }
}
