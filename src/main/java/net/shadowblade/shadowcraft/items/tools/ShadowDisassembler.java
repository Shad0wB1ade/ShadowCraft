package net.shadowblade.shadowcraft.items.tools;

import buildcraft.api.tools.IToolWrench;
import cofh.api.item.IToolHammer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.battlegear2.api.weapons.IPenetrateWeapon;
import mods.railcraft.api.core.items.IToolCrowbar;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.shadowblade.shadowcraft.items.BaseItem;
import net.shadowblade.shadowcraft.references.Refs;

import java.util.List;

public class ShadowDisassembler extends BaseItem implements IToolHammer, IToolWrench, IToolCrowbar, IPenetrateWeapon
{
    float digSpeed = 32768.0F * 32;
    int damage = 20;

    public ShadowDisassembler()
    {
        super();
        this.setUnlocalizedName(Refs.SHADOW_DISASSEMBLER);
        this.setMaxDamage(-1);
        this.setMaxStackSize(1);
        this.setFull3D();
    }
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return false;
    }
    @Override
    public boolean canHarvestBlock(Block block, ItemStack stack)
    {
        if (block == Blocks.bedrock || block == Blocks.end_portal_frame)
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
    public int getPenetratingPower(ItemStack stack)
    {
        return damage;
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
        super.addInformation(stack, player, list, bool);
        list.add(EnumChatFormatting.DARK_RED + "Dangerous!");
        list.add(EnumChatFormatting.DARK_GREEN + "Also acts as a wrench!");
        list.add("");
        list.add(EnumChatFormatting.BLUE + "+20 Armor Bypass Damage");

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
    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return true;
    }

    @Override
    public int getItemEnchantability(ItemStack stack) {
        return 256;
    }
}
