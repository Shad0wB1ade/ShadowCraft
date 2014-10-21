package net.shadowblade.shadowcraft.utilities;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderGenerate;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.shadowblade.shadowcraft.init.SCBlocks;

import java.util.Random;

public class WorldGenHandler implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if (!(chunkGenerator instanceof ChunkProviderHell) && !(chunkGenerator instanceof ChunkProviderEnd))
        {
            for (int i = 0; i < 32; i++)
            {
                int randPosX = (chunkX * 16) + random.nextInt(16);
                int randPosY = random.nextInt(256);
                int randPosZ = (chunkZ * 16) + random.nextInt(16);
                new WorldGenMinable(SCBlocks.ShadowOre, 0, 8, Blocks.stone).generate(world, random, randPosX, randPosY, randPosZ);
            }
        }
        if (!(chunkGenerator instanceof ChunkProviderGenerate) && !(chunkGenerator instanceof ChunkProviderEnd))
        {
            for (int i = 0; i < 32; i++)
            {
                int randPosX = (chunkX * 16) + random.nextInt(16);
                int randPosY = random.nextInt(256);
                int randPosZ = (chunkZ * 16) + random.nextInt(16);
                new WorldGenMinable(SCBlocks.NetherShadowOre, 1, 8, Blocks.netherrack).generate(world, random, randPosX, randPosY, randPosZ);
            }
        }
        if (!(chunkGenerator instanceof ChunkProviderHell) && !(chunkGenerator instanceof ChunkProviderGenerate))
        {
            for (int i = 0; i < 32; i++)
            {
                int randPosX = (chunkX * 16) + random.nextInt(16);
                int randPosY = random.nextInt(256);
                int randPosZ = (chunkZ * 16) + random.nextInt(16);
                new WorldGenMinable(SCBlocks.EndShadowOre, 2, 8, Blocks.end_stone).generate(world, random, randPosX, randPosY, randPosZ);
            }
        }
    }
}
