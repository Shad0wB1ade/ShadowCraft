package net.shadowblade.shadowcraft.items.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.init.SCTabs;
import net.shadowblade.shadowcraft.references.Refs;
import thaumcraft.api.IRepairable;

public class ShadowHoe extends ItemHoe implements IRepairable
{
    public ShadowHoe()
    {
        super(SCItems.ShadowToolMaterial);
        this.setUnlocalizedName(Refs.SHADOW_HOE);
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
