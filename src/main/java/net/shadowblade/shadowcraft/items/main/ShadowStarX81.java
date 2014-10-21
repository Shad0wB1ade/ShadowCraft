package net.shadowblade.shadowcraft.items.main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.shadowblade.shadowcraft.items.BaseItem;
import net.shadowblade.shadowcraft.references.Refs;

import java.util.List;

/**
 * Created by Богдан on 16.10.2014.
 */
public class ShadowStarX81 extends BaseItem
{
    public ShadowStarX81()
    {
        this.setUnlocalizedName(Refs.SHADOW_STAR_X81);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool)
    {
        list.add("X81 Compressed");
    }
}
