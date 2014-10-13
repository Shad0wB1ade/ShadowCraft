package net.shadowblade.shadowcraft.items.armor;

import net.shadowblade.shadowcraft.ShadowCraft;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.items.armor.main.ShadowArmor;
import net.shadowblade.shadowcraft.references.Refs;
import thaumcraft.api.IRepairable;

public class ShadowChestplate extends ShadowArmor implements IRepairable
{
    public ShadowChestplate()
    {
        super(SCItems.ShadowArmorMaterial, ShadowCraft.proxy.addArmor("shadowArmor"), 1);
        this.setUnlocalizedName(Refs.SHADOW_CHESTPLATE);
        this.setMaxDamage(8192);
    }
}
