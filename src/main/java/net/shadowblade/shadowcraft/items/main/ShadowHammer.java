package net.shadowblade.shadowcraft.items.main;

import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.items.BaseItem;
import net.shadowblade.shadowcraft.references.Refs;

public class ShadowHammer extends BaseItem
{
    // Huge thanks to Darkhax & madcock8338 for helping with the recipes!
    public ShadowHammer()
    {
        this.setUnlocalizedName(Refs.SHADOW_HAMMER);
        this.setMaxDamage(9);
        this.setMaxStackSize(1);
        this.setContainerItem(this);
    }
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.stackSize = 1;

        return stack;
    }
}
