package net.shadowblade.shadowcraft.items.main;

import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.items.BaseItem;
import net.shadowblade.shadowcraft.references.Refs;

public class ShadowOrb extends BaseItem
{
    // Huge thanks to Darkhax & madcock8338 for helping with the recipes!
    public ShadowOrb()
    {
        this.setUnlocalizedName(Refs.SHADOW_ORB);
        this.setMaxStackSize(1);
        this.setContainerItem(this);
    }
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
}
