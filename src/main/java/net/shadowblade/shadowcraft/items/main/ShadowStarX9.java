package net.shadowblade.shadowcraft.items.main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.items.BaseItem;
import net.shadowblade.shadowcraft.references.Refs;

import java.util.List;

public class ShadowStarX9 extends BaseItem
{
    public ShadowStarX9()
    {
        this.setUnlocalizedName(Refs.SHADOW_STAR_X9);
    }
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool)
    {
        list.add("X9 Compressed");
    }
}
