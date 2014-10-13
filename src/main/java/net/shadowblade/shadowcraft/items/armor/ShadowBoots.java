package net.shadowblade.shadowcraft.items.armor;

import net.shadowblade.shadowcraft.ShadowCraft;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.items.armor.main.ShadowArmor;
import net.shadowblade.shadowcraft.references.Refs;
import thaumcraft.api.IRepairable;

public class ShadowBoots extends ShadowArmor implements IRepairable
{
    public ShadowBoots()
    {
        super(SCItems.ShadowArmorMaterial, ShadowCraft.proxy.addArmor("shadowArmor"), 3);
        this.setUnlocalizedName(Refs.SHADOW_BOOTS);
        this.setMaxDamage(8192);
    }
}
