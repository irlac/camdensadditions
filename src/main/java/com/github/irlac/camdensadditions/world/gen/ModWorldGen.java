package com.github.irlac.camdensadditions.world.gen;

// Start of Imports

import com.github.irlac.camdensadditions.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;
// End of Imports

public class ModWorldGen implements IWorldGenerator { // This massive class defines custom worldgen, as in it defines ore generation.
    private final WorldGenMinable modOverworldGen; // Sets up a minable overworld generator.

    public ModWorldGen() { // Constructor that initializes our generator to create our ore with a maximum vein of 3 blocks, replacing any available stone (rather than overwriting other ores).
        modOverworldGen = new WorldGenMinable(ModBlocks.YEETUS_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) { // This function tells the game to generate our ore ONLY in the overworld dimension.
        switch (world.provider.getDimensionType()) {
            case NETHER:
                break;

            case OVERWORLD:
                genStandard(modOverworldGen, world, random, chunkX, chunkZ, 10, 0, 200); // If the dimension is the overworld, call our generation algorithm.
                break;

            case THE_END:
                break;

        }
    }

    private void genStandard(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int spawnTries, int minHeight, int maxHeight) {
        if(minHeight < 0) minHeight = 0; // Fixes minimum height to avoid errors.
        if(maxHeight > 255) maxHeight = 255; // Fixes maximum height to avoid errors.

        if(maxHeight < minHeight) {
            int i = minHeight;
            minHeight = maxHeight;
            maxHeight = i;
        } else if(maxHeight == minHeight) {
            if(maxHeight < 255) {
                maxHeight++;
            } else minHeight--;
        }

        BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4); // Creates a generic block position based on chunk position.
        int heightDiff = maxHeight - minHeight + 1;

        for (int i = 0; i < spawnTries; i++) { // For the amount of times the game attempts generation, create blocks with a random position and amount.
            generator.generate(world, random,
                    chunkPosAsBlockPos.add(
                            random.nextInt(16),
                            minHeight + random.nextInt(heightDiff),
                            random.nextInt(16)
                    )
            );
        }
    }
}