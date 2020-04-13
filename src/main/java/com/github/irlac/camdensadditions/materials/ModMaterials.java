package com.github.irlac.camdensadditions.materials;

// Start of Imports
import com.github.irlac.camdensadditions.Main;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
// End of Imports

public class ModMaterials { // This class is used to initialize the Material for tools, and define their individual values.
    public static final ToolMaterial YEETUS_SWORD = EnumHelper.addToolMaterial(Main.MODID + ":" + "yeetus_sword", 2, 2000, 20.0F, 6965.0F, 10);
}
