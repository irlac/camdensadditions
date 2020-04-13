package com.github.irlac.camdensadditions.init;

// Start of Imports
import com.github.irlac.camdensadditions.Main;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
// End of Imports

@GameRegistry.ObjectHolder(Main.MODID) // Tells Forge that this contains identifiers for blocks.
public class ModBlocks { // Please instantiate block data (hardness, etc.) in the blocks individual register call (in the RegistrationHandler.java file), not here!
    public static final Block YEETUS_ORE = null;
}
