package net.shadowblade.shadowcraft.blocks.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.references.Refs;

import java.util.Random;

public class ShadowCrop extends BlockCrops
{
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;
    public ShadowCrop()
    {
        this.setBlockName(Refs.SHADOW_CROPS);
    }
    public void registerBlockIcons(IIconRegister register)
    {
        this.iconArray = new IIcon[4];

        for (int i = 0; i < this.iconArray.length; i++)
        {
            this.iconArray[i] = register.registerIcon(Refs.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + (i + 1));
        }
    }
    public IIcon getIcon(int side, int meta)
    {
        if (meta < 7)
        {
            if (meta == 6)
            {
                meta = 5;
            }
            return this.iconArray[meta >> 1];
        }
        return this.iconArray[3];
    }
    public int quantityDropped(Random random)
    {
        return 1;
    }
    protected Item func_149866_i()
    {
        return SCItems.ShadowSeeds;
    }
    protected Item func_149865_P()
    {
        return SCItems.ShadowShards;
    }
}
