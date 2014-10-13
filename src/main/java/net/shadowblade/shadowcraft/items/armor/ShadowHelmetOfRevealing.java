package net.shadowblade.shadowcraft.items.armor;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.ShadowCraft;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.items.armor.main.ShadowArmor;
import net.shadowblade.shadowcraft.references.Refs;
import thaumcraft.api.IGoggles;
import thaumcraft.api.IRepairable;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.nodes.IRevealer;

public class ShadowHelmetOfRevealing extends ShadowArmor implements IRevealer, IGoggles, IVisDiscountGear, IRepairable
{
    public ShadowHelmetOfRevealing()
    {
        super(SCItems.ShadowArmorMaterial, ShadowCraft.proxy.addArmor("shadowArmor"), 0);
        this.setUnlocalizedName(Refs.SHADOW_HELMET_OF_REVEALING);
        this.setMaxDamage(8192);
    }
    public boolean showNodes(ItemStack itemstack, EntityLivingBase player)
    {
        return true;
    }
    public boolean showIngamePopups(ItemStack itemstack, EntityLivingBase player)
    {
        return true;
    }
    public int getVisDiscount(ItemStack stack, EntityPlayer player, Aspect aspect)
    {
        return 5;
    }
}
