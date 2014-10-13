package net.shadowblade.shadowcraft.items.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.init.SCBlocks;
import net.shadowblade.shadowcraft.init.SCTabs;
import net.shadowblade.shadowcraft.references.Refs;

public class ShadowSeeds extends ItemSeeds
{
    public ShadowSeeds()
    {
        super(SCBlocks.ShadowCrop, Blocks.farmland);
        this.setUnlocalizedName(Refs.SHADOW_SEEDS);
        this.setCreativeTab(SCTabs.SC_TAB);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Refs.TEXTURE_LOCATION, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Refs.TEXTURE_LOCATION, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
