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
    public static final Block ShadowStarBlock = new ShadowStarBlock();
    public static final Block ShadowCrop = new ShadowCrop();

    public static void init()
    {
        GameRegistry.registerBlock(ShadowOre, Refs.SHADOW_ORE);
        GameRegistry.registerBlock(NetherShadowOre, Refs.NETHER_SHADOW_ORE);
        GameRegistry.registerBlock(EndShadowOre, Refs.END_SHADOW_ORE);
        GameRegistry.registerBlock(ShadowMetalBlock, Refs.SHADOW_METAL_BLOCK);
        GameRegistry.registerBlock(ShadowStarBlock, Refs.SHADOW_STAR_BLOCK);
        GameRegistry.registerBlock(ShadowCrop, Refs.SHADOW_CROPS);
    }
}
