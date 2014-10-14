package net.shadowblade.shadowcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class SCRecipes
{
    public static void init()
    {
        //Materials
        float xp = 0.1F;
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowIronDust), new ItemStack(Items.iron_ingot), xp);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowGoldDust), new ItemStack(Items.gold_ingot), xp);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowCopperDust), new ItemStack(SCItems.CopperIngot), xp);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowTinDust), new ItemStack(SCItems.TinIngot), xp);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowSilverDust), new ItemStack(SCItems.SilverIngot), xp);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowLeadDust), new ItemStack(SCItems.LeadIngot), xp);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowNickelDust), new ItemStack(SCItems.NickelIngot), xp);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowPlatinumDust), new ItemStack(SCItems.PlatinumIngot), xp);

        int oreOutput = 4;
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowIronDust, oreOutput),
                new ItemStack(SCItems.ShadowOrb), "oreIron"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowGoldDust, oreOutput),
                new ItemStack(SCItems.ShadowOrb), "oreGold"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowCopperDust, oreOutput),
                new ItemStack(SCItems.ShadowOrb), "oreCopper"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowTinDust, oreOutput),
                new ItemStack(SCItems.ShadowOrb), "oreTin"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowSilverDust, oreOutput),
                new ItemStack(SCItems.ShadowOrb), "oreSilver"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowLeadDust, oreOutput),
                new ItemStack(SCItems.ShadowOrb), "oreLead"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowNickelDust, oreOutput),
                new ItemStack(SCItems.ShadowOrb), "oreNickel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowPlatinumDust, oreOutput),
                new ItemStack(SCItems.ShadowOrb), "orePlatinum"));

        //Basic Items
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowCrystal), "AAA", "ABA", "AAA",
                'A', "shardsShadow",
                'B', "blockDiamond"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowNugget, 9), "ingotShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowIngot), " A ", "ABA", " A ",
                'A', "crystalShadow",
                'B', "blockIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowIngot, 9), "AAA", "AAA", "AAA",
                'A', SCBlocks.ShadowMetalBlock));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowIngot), "AAA", "AAA", "AAA",
                'A', "nuggetShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowGear), " A ", "ABA", " A ",
                'A', "ingotShadow",
                'B', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowOrb), "AAA", "ABA", "AAA",
                'A', "crystalShadow",
                'B', Items.flint));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowStar), "AAA", "ABA", "AAA",
                'A', "crystalShadow",
                'B', Items.nether_star));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowStick, 2), "A  ", "A  ", "   ",
                'A', "ingotShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowStickLong), "  A", " A ", "A  ",
                'A', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowPlate, 4), "AA ", "AA ", "   ",
                'A', "ingotShadow"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowSeeds, 2), SCItems.ShadowStar, Items.wheat_seeds));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowSeeds, 2), SCItems.ShadowStar, Items.melon_seeds));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowSeeds, 2), SCItems.ShadowStar, Items.pumpkin_seeds));

        //Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowSword), " A ", " A ", " B ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowPickaxe), "AAA", " B ", " B ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowSpade), " A ", " B ", " B ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowAxe), "AA ", "AB ", " B ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowHoe), "AA ", " B ", " B ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowShears), " A ", "B  ", "   ",
                'A', "ingotShadow",
                'B', "nuggetShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowFishingRod), "  A", " AB", "ACB",
                'A', "ingotShadow",
                'B', Items.string,
                'C', "ingotIron"));
        ItemStack shadowDisassemblerFort = new ItemStack(SCItems.ShadowDisassembler);
        shadowDisassemblerFort.addEnchantment(Enchantment.fortune, 5);
        GameRegistry.addRecipe(new ShapedOreRecipe(shadowDisassemblerFort, "ABD", "CFD", "DDE",
                'A', new ItemStack(SCItems.ShadowPickaxe, OreDictionary.WILDCARD_VALUE),
                'B', new ItemStack(SCItems.ShadowAxe, OreDictionary.WILDCARD_VALUE),
                'C', new ItemStack(SCItems.ShadowSpade, OreDictionary.WILDCARD_VALUE),
                'D', SCBlocks.ShadowStarBlock,
                'E', SCItems.ShadowStickLong,
                'F', "blockDiamond"));
        ItemStack shadowDisassemblerSilk = new ItemStack(SCItems.ShadowDisassembler);
        shadowDisassemblerSilk.addEnchantment(Enchantment.silkTouch, 5);
        GameRegistry.addRecipe(new ShapedOreRecipe(shadowDisassemblerSilk, "ABD", "CFD", "DDE",
                'A', new ItemStack(SCItems.ShadowPickaxe, OreDictionary.WILDCARD_VALUE),
                'B', new ItemStack(SCItems.ShadowAxe, OreDictionary.WILDCARD_VALUE),
                'C', new ItemStack(SCItems.ShadowSpade, OreDictionary.WILDCARD_VALUE),
                'D', SCBlocks.ShadowStarBlock,
                'E', SCItems.ShadowStickLong,
                'F', "blockEmerald"));

        //Armor
            ItemStack shadowHelmet = new ItemStack(SCItems.ShadowHelmet);
            shadowHelmet.addEnchantment(Enchantment.protection, 10);
            shadowHelmet.addEnchantment(Enchantment.fireProtection, 10);
            shadowHelmet.addEnchantment(Enchantment.blastProtection, 10);
            shadowHelmet.addEnchantment(Enchantment.projectileProtection, 10);
        GameRegistry.addRecipe(new ShapedOreRecipe(shadowHelmet, "AAA", "A A", "   ",
                'A', "plateShadow"));
            ItemStack shadowChestplate = new ItemStack(SCItems.ShadowChestplate);
            shadowChestplate.addEnchantment(Enchantment.protection, 10);
            shadowChestplate.addEnchantment(Enchantment.fireProtection, 10);
            shadowChestplate.addEnchantment(Enchantment.blastProtection, 10);
            shadowChestplate.addEnchantment(Enchantment.projectileProtection, 10);
        GameRegistry.addRecipe(new ShapedOreRecipe(shadowChestplate, "A A", "AAA", "AAA",
                'A', "plateShadow"));
            ItemStack shadowLeggings = new ItemStack(SCItems.ShadowLeggings);
            shadowLeggings.addEnchantment(Enchantment.protection, 10);
            shadowLeggings.addEnchantment(Enchantment.fireProtection, 10);
            shadowLeggings.addEnchantment(Enchantment.blastProtection, 10);
            shadowLeggings.addEnchantment(Enchantment.projectileProtection, 10);
        GameRegistry.addRecipe(new ShapedOreRecipe(shadowLeggings, "AAA", "A A", "A A",
                'A', "plateShadow"));
            ItemStack shadowBoots = new ItemStack(SCItems.ShadowBoots);
            shadowBoots.addEnchantment(Enchantment.protection, 10);
            shadowBoots.addEnchantment(Enchantment.fireProtection, 10);
            shadowBoots.addEnchantment(Enchantment.blastProtection, 10);
            shadowBoots.addEnchantment(Enchantment.projectileProtection, 10);
        GameRegistry.addRecipe(new ShapedOreRecipe(shadowBoots, "   ", "A A", "A A",
                'A', "plateShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowHelmetOfRevealing), "ABC", "#D#", "EFG",
                'A', "shardAir",
                'B', "shardFire",
                'C', "shardWater",
                'D', SCItems.ShadowHelmet,
                'E', "shardEarth",
                'F', "shardOrder",
                'G', "shardEntropy",
                '#', "ingotThaumium"));

        //Baubles
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowAmuletOfRegeneration), "AAA", "ABA", "CDC",
                'A', Items.string,
                'B', Items.ghast_tear,
                'C', "crystalShadow",
                'D', SCItems.ShadowStar));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowRingOfFireResistance), " A ", "ABA", " A ",
                'A', "ingotShadow",
                'B', Items.magma_cream));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowRingOfNightVision), " A ", "ABA", " A ",
                'A', "ingotShadow",
                'B', Items.golden_carrot));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowBeltOfFlight), "ABA", "CCC", " D ",
                'A', Items.feather,
                'B', SCItems.ShadowStar,
                'C', Items.leather,
                'D', "nuggetGold"));

        //Battlegear
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowWaraxe), "A A", "ABA", " B ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowDagger), "A  ", "B  ", "   ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowMace), " AA", " AA", "B  ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowSpear), " A ", "B  ", "   ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStickLong));

        //Blocks
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCBlocks.ShadowStarBlock), "AAA", "AAA", "AAA",
                'A', SCItems.ShadowStar));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCBlocks.ShadowMetalBlock), "AAA", "AAA", "AAA",
                'A', "ingotShadow"));
    }
}
