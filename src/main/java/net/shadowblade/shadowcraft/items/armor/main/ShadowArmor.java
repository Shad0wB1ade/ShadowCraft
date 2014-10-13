package net.shadowblade.shadowcraft.items.armor.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.init.SCTabs;
import net.shadowblade.shadowcraft.references.Refs;

public class ShadowArmor extends ItemArmor
{
    public ShadowArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_)
    {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(SCTabs.SC_TAB);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == SCItems.ShadowHelmet || stack.getItem() == SCItems.ShadowChestplate || stack.getItem() == SCItems.ShadowBoots)
        {
            return Refs.ARMOR_LOCATION + "shadowArmor1.png";
        }
        else if(stack.getItem() == SCItems.ShadowLeggings)
        {
            return Refs.ARMOR_LOCATION + "shadowArmor2.png";
        }
        else if (stack.getItem() == SCItems.ShadowHelmetOfRevealing)
        {
            return Refs.ARMOR_LOCATION + "shadowArmor3.png";
        }
        else
        {
            return null;
        }
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
