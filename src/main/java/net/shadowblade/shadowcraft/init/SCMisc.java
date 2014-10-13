package net.shadowblade.shadowcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.shadowblade.shadowcraft.references.Refs;
import net.shadowblade.shadowcraft.utilities.LogHelper;
import net.shadowblade.shadowcraft.utilities.WorldGenHandler;

public class SCMisc
{
    public static void init()
    {
        LogHelper.info("Version " + Refs.MOD_VERSION);

        //Ore Dictionary
            LogHelper.info("Ore Dictionary Registry Started");


            //Items Ore Dictionary
            OreDictionary.registerOre(Refs.SHADOW_SHARDS_DICT, SCItems.ShadowShards);
            LogHelper.info("Registered " + Refs.SHADOW_SHARDS_DICT);

            OreDictionary.registerOre(Refs.SHADOW_CRYSTAL_DICT, SCItems.ShadowCrystal);
            LogHelper.info("Registered " + Refs.SHADOW_CRYSTAL_DICT);

            OreDictionary.registerOre(Refs.SHADOW_NUGGET_DICT, SCItems.ShadowNugget);
            LogHelper.info("Registered " + Refs.SHADOW_NUGGET_DICT);

            OreDictionary.registerOre(Refs.SHADOW_INGOT_DICT, SCItems.ShadowIngot);
            LogHelper.info("Registered " + Refs.SHADOW_INGOT_DICT);

            OreDictionary.registerOre(Refs.SHADOW_GEAR_DICT, SCItems.ShadowGear);
            LogHelper.info("Registered " + Refs.SHADOW_GEAR_DICT);

            OreDictionary.registerOre(Refs.SHADOW_PLATE_DICT, SCItems.ShadowPlate);
            LogHelper.info("Registered " + Refs.SHADOW_PLATE_DICT);

            OreDictionary.registerOre(Refs.SHADOW_IRON_DUST_DICT, SCItems.ShadowIronDust);
            LogHelper.info("Registered " + Refs.SHADOW_IRON_DUST_DICT);

            OreDictionary.registerOre(Refs.SHADOW_GOLD_DUST_DICT, SCItems.ShadowGoldDust);
            LogHelper.info("Registered " + Refs.SHADOW_GOLD_DUST_DICT);

            OreDictionary.registerOre(Refs.SHADOW_COPPER_DUST_DICT, SCItems.ShadowCopperDust);
            LogHelper.info("Registered " + Refs.SHADOW_COPPER_DUST_DICT);

            OreDictionary.registerOre(Refs.SHADOW_TIN_DUST_DICT, SCItems.ShadowTinDust);
            LogHelper.info("Registered " + Refs.SHADOW_TIN_DUST_DICT);

            OreDictionary.registerOre(Refs.SHADOW_SILVER_DUST_DICT, SCItems.ShadowSilverDust);
            LogHelper.info("Registered " + Refs.SHADOW_SILVER_DUST_DICT);

            OreDictionary.registerOre(Refs.SHADOW_LEAD_DUST_DICT, SCItems.ShadowLeadDust);
            LogHelper.info("Registered " + Refs.SHADOW_LEAD_DUST_DICT);

            OreDictionary.registerOre(Refs.SHADOW_NICKEL_DUST_DICT, SCItems.ShadowNickelDust);
            LogHelper.info("Registered " + Refs.SHADOW_NICKEL_DUST_DICT);

            OreDictionary.registerOre(Refs.SHADOW_PLATINUM_DUST_DICT, SCItems.ShadowPlatinumDust);
            LogHelper.info("Registered " + Refs.SHADOW_PLATINUM_DUST_DICT);

            OreDictionary.registerOre(Refs.COPPER_INGOT_DICT, SCItems.CopperIngot);
            LogHelper.info("Registered " + Refs.COPPER_INGOT_DICT);

            OreDictionary.registerOre(Refs.TIN_INGOT_DICT, SCItems.TinIngot);
            LogHelper.info("Registered " + Refs.TIN_INGOT_DICT);

            OreDictionary.registerOre(Refs.SILVER_INGOT_DICT, SCItems.SilverIngot);
            LogHelper.info("Registered " + Refs.SILVER_INGOT_DICT);

            OreDictionary.registerOre(Refs.LEAD_INGOT_DICT, SCItems.LeadIngot);
            LogHelper.info("Registered " + Refs.LEAD_INGOT_DICT);

            OreDictionary.registerOre(Refs.NICKEL_INGOT_DICT, SCItems.NickelIngot);
            LogHelper.info("Registered " + Refs.NICKEL_INGOT_DICT);

            OreDictionary.registerOre(Refs.PLATINUM_INGOT_DICT, SCItems.PlatinumIngot);
            LogHelper.info("Registered " + Refs.PLATINUM_INGOT_DICT);

            //Blocks Ore Dictionary
            OreDictionary.registerOre(Refs.SHADOW_ORE_DICT, SCBlocks.ShadowOre);
            OreDictionary.registerOre(Refs.SHADOW_ORE_DICT, SCBlocks.NetherShadowOre);
            OreDictionary.registerOre(Refs.SHADOW_ORE_DICT, SCBlocks.EndShadowOre);
            LogHelper.info("Registered " + Refs.SHADOW_ORE_DICT);


            LogHelper.info("Ore Dictionary Registry Complete");

        //World Gen Handler
        GameRegistry.registerWorldGenerator(new WorldGenHandler(), 0);
    }
}
