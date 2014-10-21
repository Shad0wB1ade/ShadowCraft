package net.shadowblade.shadowcraft.items.armor;

import net.shadowblade.shadowcraft.ShadowCraft;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.items.armor.main.ShadowArmor;
import net.shadowblade.shadowcraft.references.Refs;
import thaumcraft.api.IRepairable;

public class ShadowLeggings extends ShadowArmor implements IRepairable
{
    public ShadowLeggings()
    {
        super(SCItems.ShadowArmorMaterial, ShadowCraft.proxy.addArmor("shadowArmor"), 2);
        this.setUnlocalizedName(Refs.SHADOW_LEGGINGS);
    }
}
