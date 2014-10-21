package net.shadowblade.shadowcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.shadowblade.shadowcraft.blocks.main.*;
import net.shadowblade.shadowcraft.references.Refs;

public class SCBlocks
{
    public static final Block ShadowOre = new ShadowOre();
    public static final Block NetherShadowOre = new NetherShadowOre();
    public static final Block EndShadowOre = new EndShadowOre();
    public static final Block ShadowMetalBlock = new ShadowMetalBlock();
    public static final Block ShadowCrop = new ShadowCrop();
    public static final Block ShadowStone = new ShadowStone();
    public static final Block ShadowStoneBricks = new ShadowStoneBricks();
    public static final Block ShadowStoneBricksCracked = new ShadowStoneBricksCracked();
    public static final Block ShadowStoneBricksCarved = new ShadowStoneBricksCarved();

    public static void init()
    {
        GameRegistry.registerBlock(ShadowOre, Refs.SHADOW_ORE);
        GameRegistry.registerBlock(NetherShadowOre, Refs.NETHER_SHADOW_ORE);
        GameRegistry.registerBlock(EndShadowOre, Refs.END_SHADOW_ORE);
        GameRegistry.registerBlock(ShadowMetalBlock, Refs.SHADOW_METAL_BLOCK);
        GameRegistry.registerBlock(ShadowCrop, Refs.SHADOW_CROPS);
        GameRegistry.registerBlock(ShadowStone, Refs.SHADOW_STONE);
        GameRegistry.registerBlock(ShadowStoneBricks, Refs.SHADOW_STONE_BRICKS);
        GameRegistry.registerBlock(ShadowStoneBricksCracked, Refs.SHADOW_STONE_BRICKS_CRACKED);
        GameRegistry.registerBlock(ShadowStoneBricksCarved, Refs.SHADOW_STONE_BRICKS_CARVED);
    }
}
