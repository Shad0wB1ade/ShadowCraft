package net.shadowblade.shadowcraft.items.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.shadowblade.shadowcraft.init.SCTabs;
import net.shadowblade.shadowcraft.references.Refs;
import thaumcraft.api.IRepairable;

public class ShadowFishingRod extends ItemFishingRod implements IRepairable
{
    public ShadowFishingRod()
    {
        super();
        this.setUnlocalizedName(Refs.SHADOW_FISHING_ROD);
        this.setCreativeTab(SCTabs.SC_TAB);
        this.setMaxDamage(8192);
    }
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        if (entityPlayer.fishEntity != null)
        {
            int i = entityPlayer.fishEntity.func_146034_e();
            itemStack.damageItem(i, entityPlayer);
            entityPlayer.swingItem();
        }
        else
        {
            world.playSoundAtEntity(entityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!world.isRemote)
            {
                world.spawnEntityInWorld(new EntityFishHook(world, entityPlayer));
            }

            entityPlayer.swingItem();
        }

        return itemStack;
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
