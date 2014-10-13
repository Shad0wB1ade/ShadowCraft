package net.shadowblade.shadowcraft.items.main;

import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.items.BaseItem;
import net.shadowblade.shadowcraft.references.Refs;

public class ShadowOrb extends BaseItem
{
    public ShadowOrb()
    {
        this.setUnlocalizedName(Refs.SHADOW_ORB);
        this.setMaxStackSize(1);
        this.setMaxDamage(8192);
    }
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.stackSize = 1;

        return stack;
    }
}
