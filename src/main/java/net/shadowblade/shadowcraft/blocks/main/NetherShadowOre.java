package net.shadowblade.shadowcraft.blocks.main;

import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.shadowblade.shadowcraft.blocks.BaseBlock;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.references.Refs;

import java.util.Random;

public class NetherShadowOre extends BaseBlock
{
    public NetherShadowOre()
    {
        this.setBlockName(Refs.NETHER_SHADOW_ORE);
    }
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return SCItems.ShadowShards;
    }
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        return this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(p_149679_1_ + 1);
    }
    public int quantityDropped(Random p_149745_1_)
    {
        return 1 + p_149745_1_.nextInt(2);
    }
    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);
    }
    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            return 1 + rand.nextInt(5);
        }
        return 0;
    }
}
