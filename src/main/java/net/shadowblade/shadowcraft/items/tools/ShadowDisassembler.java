package net.shadowblade.shadowcraft.items.tools;

import buildcraft.api.tools.IToolWrench;
import cofh.api.item.IToolHammer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.railcraft.api.core.items.IToolCrowbar;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.items.BaseItem;
import net.shadowblade.shadowcraft.references.Refs;

import java.util.List;

public class ShadowDisassembler extends ItemSword implements IToolHammer, IToolWrench, IToolCrowbar
{
    float digSpeed = 32768.0F * 32;

    public ShadowDisassembler()
    {
        super(SCItems.ShadowDisassemblerMaterial);
        this.setUnlocalizedName(Refs.SHADOW_DISASSEMBLER);
        this.setMaxDamage(-1);
        this.setMaxStackSize(1);
        this.setFull3D();
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
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return false;
    }
    @Override
    public boolean canHarvestBlock(Block block, ItemStack stack)
    {
        if (block == Blocks.bedrock)
        {
            return false;
        }
        return true;
    }
    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int meta)
    {
        return digSpeed;
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
        super.addInformation(stack, player, list, bool);
        list.add(EnumChatFormatting.DARK_RED + "Dangerous!");
        list.add(EnumChatFormatting.DARK_GREEN + "Also acts as a wrench!");
        list.add(EnumChatFormatting.BLUE + "Just for DimitrisKater:");

    }
    @Override
    public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player)
    {
        return true;
    }
    public boolean isUsable(ItemStack item, EntityLivingBase user, int x, int y, int z)
    {
        return true;
    }
    public void toolUsed(ItemStack item, EntityLivingBase user, int x, int y, int z)
    {

    }
    public boolean canWrench(EntityPlayer player, int x, int y, int z)
    {
        return true;
    }
    public void wrenchUsed(EntityPlayer player, int x, int y, int z)
    {

    }
    public boolean canWhack(EntityPlayer player, ItemStack crowbar, int x, int y, int z)
    {
        return true;
    }
    public void onWhack(EntityPlayer player, ItemStack crowbar, int x, int y, int z)
    {

    }
    public boolean canLink(EntityPlayer player, ItemStack crowbar, EntityMinecart cart)
    {
        return true;
    }
    public void onLink(EntityPlayer player, ItemStack crowbar, EntityMinecart cart)
    {

    }
    public boolean canBoost(EntityPlayer player, ItemStack crowbar, EntityMinecart cart)
    {
        return true;
    }
    public void onBoost(EntityPlayer player, ItemStack crowbar, EntityMinecart cart)
    {

    }
}
