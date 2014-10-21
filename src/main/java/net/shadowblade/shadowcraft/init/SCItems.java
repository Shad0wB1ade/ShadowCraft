package net.shadowblade.shadowcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.shadowblade.shadowcraft.items.armor.*;
import net.shadowblade.shadowcraft.items.battlegear.*;
import net.shadowblade.shadowcraft.items.baubles.*;
import net.shadowblade.shadowcraft.items.main.*;
import net.shadowblade.shadowcraft.items.materials.dusts.*;
import net.shadowblade.shadowcraft.items.materials.ingots.*;
import net.shadowblade.shadowcraft.items.tools.*;
import net.shadowblade.shadowcraft.references.Refs;

public class SCItems
{
    //Tool Materials
    public static ToolMaterial ShadowSwordMaterial = EnumHelper.addToolMaterial("ShadowSwordMaterial", 5, 2048, 16.0F, 8.0F, 64);
    public static ToolMaterial ShadowToolMaterial = EnumHelper.addToolMaterial("ShadowToolMaterial", 5, 2048, 16.0F, 2.0F, 64);

    //Armor Materials
    public static ArmorMaterial ShadowArmorMaterial = EnumHelper.addArmorMaterial("ShadowArmorMaterial", 2048, new int[]{3, 8, 6, 3}, 64);

    //Basic Items
    public static final Item ShadowShards = new ShadowShards();
    public static final Item ShadowCrystal = new ShadowCrystal();
    public static final Item ShadowNugget = new ShadowNugget();
    public static final Item ShadowIngot = new ShadowIngot();
    public static final Item ShadowGear = new ShadowGear();
    public static final Item ShadowOrb = new ShadowOrb();
    public static final Item ShadowStarX1 = new ShadowStarX1();
    public static final Item ShadowStarX9 = new ShadowStarX9();
    public static final Item ShadowStarX81 = new ShadowStarX81();
    public static final Item ShadowStick = new ShadowStick();
    public static final Item ShadowStickLong = new ShadowStickLong();
    public static final Item ShadowPlate = new ShadowPlate();
    public static final Item ShadowHammer = new ShadowHammer();
    public static final Item ShadowSeeds = new ShadowSeeds();

    //Tools
    public static final Item ShadowSword = new ShadowSword();
    public static final Item ShadowPickaxe = new ShadowPickaxe();
    public static final Item ShadowSpade = new ShadowSpade();
    public static final Item ShadowAxe = new ShadowAxe();
    public static final Item ShadowHoe = new ShadowHoe();
    public static final Item ShadowBow = new ShadowBow();
    public static final Item ShadowShears = new ShadowShears();
    public static final Item ShadowFishingRod = new ShadowFishingRod();
    public static final Item ShadowDisassembler = new ShadowDisassembler();

    //Armor
    public static final Item ShadowHelmet = new ShadowHelmet();
    public static final Item ShadowChestplate = new ShadowChestplate();
    public static final Item ShadowLeggings = new ShadowLeggings();
    public static final Item ShadowBoots = new ShadowBoots();

    public static final Item ShadowHelmetOfRevealing = new ShadowHelmetOfRevealing();

    //Baubles
    public static final Item ShadowAmuletOfRegeneration = new ShadowAmuletOfRegeneration();
    public static final Item ShadowRingOfFireResistance = new ShadowRingOfFireResistance();
    public static final Item ShadowRingOfNightVision = new ShadowRingOfNightVision();
    public static final Item ShadowBeltOfFlight = new ShadowBeltOfFlight();

    //Battlegear
    public static final Item ShadowWaraxe = new ShadowWaraxe();
    public static final Item ShadowDagger = new ShadowDagger();
    public static final Item ShadowMace = new ShadowMace();
    public static final Item ShadowSpear = new ShadowSpear();

    //Materials
    public static final Item ShadowIronDust = new ShadowIronDust();
    public static final Item ShadowGoldDust = new ShadowGoldDust();
    public static final Item ShadowCopperDust = new ShadowCopperDust();
    public static final Item ShadowTinDust = new ShadowTinDust();
    public static final Item ShadowSilverDust = new ShadowSilverDust();
    public static final Item ShadowLeadDust = new ShadowLeadDust();
    public static final Item ShadowNickelDust = new ShadowNickelDust();
    public static final Item ShadowPlatinumDust = new ShadowPlatinumDust();

    public static final Item CopperIngot = new CopperIngot();
    public static final Item TinIngot = new TinIngot();
    public static final Item SilverIngot = new SilverIngot();
    public static final Item LeadIngot = new LeadIngot();
    public static final Item NickelIngot = new NickelIngot();
    public static final Item PlatinumIngot = new PlatinumIngot();

    public static void init()
    {
        //Basic Items
        GameRegistry.registerItem(ShadowShards, Refs.SHADOW_SHARDS);
        GameRegistry.registerItem(ShadowCrystal, Refs.SHADOW_CRYSTAL);
        GameRegistry.registerItem(ShadowNugget, Refs.SHADOW_NUGGET);
        GameRegistry.registerItem(ShadowIngot, Refs.SHADOW_INGOT);
        GameRegistry.registerItem(ShadowGear, Refs.SHADOW_GEAR);
        GameRegistry.registerItem(ShadowOrb, Refs.SHADOW_ORB);
        GameRegistry.registerItem(ShadowStarX1, Refs.SHADOW_STAR_X1);
        GameRegistry.registerItem(ShadowStarX9, Refs.SHADOW_STAR_X9);
        GameRegistry.registerItem(ShadowStarX81, Refs.SHADOW_STAR_X81);
        GameRegistry.registerItem(ShadowStick, Refs.SHADOW_STICK);
        GameRegistry.registerItem(ShadowStickLong, Refs.SHADOW_STICK_LONG);
        GameRegistry.registerItem(ShadowPlate, Refs.SHADOW_PLATE);
        GameRegistry.registerItem(ShadowHammer, Refs.SHADOW_HAMMER);
        GameRegistry.registerItem(ShadowSeeds, Refs.SHADOW_SEEDS);

        //Tools
        GameRegistry.registerItem(ShadowSword, Refs.SHADOW_SWORD);
        GameRegistry.registerItem(ShadowPickaxe, Refs.SHADOW_PICKAXE);
        GameRegistry.registerItem(ShadowSpade, Refs.SHADOW_SPADE);
        GameRegistry.registerItem(ShadowAxe, Refs.SHADOW_AXE);
        GameRegistry.registerItem(ShadowHoe, Refs.SHADOW_HOE);
        GameRegistry.registerItem(ShadowBow, Refs.SHADOW_BOW);
        GameRegistry.registerItem(ShadowShears, Refs.SHADOW_SHEARS);
        GameRegistry.registerItem(ShadowFishingRod, Refs.SHADOW_FISHING_ROD);
        GameRegistry.registerItem(ShadowDisassembler, Refs.SHADOW_DISASSEMBLER);

        //Armor
        GameRegistry.registerItem(ShadowHelmet, Refs.SHADOW_HELMET);
        GameRegistry.registerItem(ShadowChestplate, Refs.SHADOW_CHESTPLATE);
        GameRegistry.registerItem(ShadowLeggings, Refs.SHADOW_LEGGINGS);
        GameRegistry.registerItem(ShadowBoots, Refs.SHADOW_BOOTS);

        GameRegistry.registerItem(ShadowHelmetOfRevealing, Refs.SHADOW_HELMET_OF_REVEALING);

        //Baubles
        GameRegistry.registerItem(ShadowAmuletOfRegeneration, Refs.SHADOW_AMULET_OF_REGENERATION);
        GameRegistry.registerItem(ShadowRingOfFireResistance, Refs.SHADOW_RING_OF_FIRE_RESISTANCE);
        GameRegistry.registerItem(ShadowRingOfNightVision, Refs.SHADOW_RING_OF_NIGHT_VISION);
        GameRegistry.registerItem(ShadowBeltOfFlight, Refs.SHADOW_BELT_OF_FLIGHT);

        //Battlegear
        GameRegistry.registerItem(ShadowWaraxe, Refs.SHADOW_WARAXE);
        GameRegistry.registerItem(ShadowDagger, Refs.SHADOW_DAGGER);
        GameRegistry.registerItem(ShadowMace, Refs.SHADOW_MACE);
        GameRegistry.registerItem(ShadowSpear, Refs.SHADOW_SPEAR);

        //Material
        GameRegistry.registerItem(ShadowIronDust, Refs.SHADOW_IRON_DUST);
        GameRegistry.registerItem(ShadowGoldDust, Refs.SHADOW_GOLD_DUST);
        GameRegistry.registerItem(ShadowCopperDust, Refs.SHADOW_COPPER_DUST);
        GameRegistry.registerItem(ShadowTinDust, Refs.SHADOW_TIN_DUST);
        GameRegistry.registerItem(ShadowSilverDust, Refs.SHADOW_SILVER_DUST);
        GameRegistry.registerItem(ShadowLeadDust, Refs.SHADOW_LEAD_DUST);
        GameRegistry.registerItem(ShadowNickelDust, Refs.SHADOW_NICKEL_DUST);
        GameRegistry.registerItem(ShadowPlatinumDust, Refs.SHADOW_PLATINUM_DUST);

        GameRegistry.registerItem(CopperIngot, Refs.COPPER_INGOT);
        GameRegistry.registerItem(TinIngot, Refs.TIN_INGOT);
        GameRegistry.registerItem(SilverIngot, Refs.SILVER_INGOT);
        GameRegistry.registerItem(LeadIngot, Refs.LEAD_INGOT);
        GameRegistry.registerItem(NickelIngot, Refs.NICKEL_INGOT);
        GameRegistry.registerItem(PlatinumIngot, Refs.PLATINUM_INGOT);
    }
}
