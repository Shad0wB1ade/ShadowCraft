package net.shadowblade.shadowcraft.items.armor;

import net.shadowblade.shadowcraft.ShadowCraft;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.items.armor.main.ShadowArmor;
import net.shadowblade.shadowcraft.references.Refs;
import thaumcraft.api.IRepairable;

public class ShadowHelmet extends ShadowArmor implements IRepairable
{
    public ShadowHelmet()
    {
        super(SCItems.ShadowArmorMaterial, ShadowCraft.proxy.addArmor("shadowArmor"), 0);
        this.setUnlocalizedName(Refs.SHADOW_HELMET);
        this.setMaxDamage(8192);
    }
}
