package net.shadowblade.shadowcraft.items.baubles;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.items.BaseItem;
import net.shadowblade.shadowcraft.references.Refs;

public class ShadowBeltOfFlight extends BaseItem implements IBauble
{
    public ShadowBeltOfFlight()
    {
        this.setUnlocalizedName(Refs.SHADOW_BELT_OF_FLIGHT);
        this.setMaxStackSize(1);
    }
    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.BELT;
    }
    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase entity)
    {

    }
    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase entity)
    {
        EntityPlayer player = (EntityPlayer) entity;
        player.capabilities.allowFlying = true;

        if (!entity.worldObj.isRemote) {
            entity.worldObj.playSoundAtEntity(entity, "random.orb", 0.1F, 1.3f);
        }
    }
    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase entity)
    {
        EntityPlayer player = (EntityPlayer) entity;

        player.capabilities.isFlying = false;
        player.capabilities.allowFlying = false;
    }
    @Override
    public boolean canEquip(ItemStack itemstack, EntityLivingBase entity)
    {
        return true;
    }
    @Override
    public boolean canUnequip(ItemStack itemstack, EntityLivingBase entity)
    {
        return true;
    }
}
