package net.shadowblade.shadowcraft.items.baubles;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.shadowblade.shadowcraft.items.BaseItem;
import net.shadowblade.shadowcraft.references.Refs;

public class ShadowRingOfNightVision extends BaseItem implements IBauble
{
    public ShadowRingOfNightVision()
    {
        this.setUnlocalizedName(Refs.SHADOW_RING_OF_NIGHT_VISION);
        this.setMaxStackSize(1);
    }
    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.RING;
    }
    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase entity)
    {
        if (itemstack.getItemDamage()==0 && !entity.isPotionActive(Potion.nightVision)) {
            entity.addPotionEffect(new PotionEffect(Potion.nightVision.id, 4800, 3, true));
        }
    }
    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase entity)
    {
        if (!entity.worldObj.isRemote) {
            entity.worldObj.playSoundAtEntity(entity, "random.orb", 0.1F, 1.3f);
        }
    }
    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase entity)
    {

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
