package net.shadowblade.shadowcraft.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.shadowblade.shadowcraft.references.Refs;

public class SCTabs
{
    public static final CreativeTabs SC_TAB = new CreativeTabs(Refs.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return SCItems.ShadowDisassembler;
        }
    };
}
