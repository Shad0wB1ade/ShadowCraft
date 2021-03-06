package net.shadowblade.shadowcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class SCRecipes
{
    public static void init()
    {
        //Basic Items
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowCrystal), "AAA", "ABA", "AAA",
                'A', "shardsShadow",
                'B', "gemDiamond"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowNugget, 9), "ingotShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowIngot), "AAA", "AAA", "AAA",
                'A', "nuggetShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowIngot), "AAA", "BBB", "AAA",
                'A', "ingotIron",
                'B', "crystalShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowGear), " A ", "ABA", " A ",
                'A', "shardsShadow",
                'B', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowOrb), "ABA", "ACA", "AAA",
                'A', "crystalShadow",
                'B', Items.flint,
                'C', SCItems.ShadowStarX81));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowStarX1), "ABA", "BCB", "ABA",
                'A', "crystalShadow",
                'B', "shardsShadow",
                'C', Items.nether_star));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowStarX9), "AAA", "AAA", "AAA",
                'A', SCItems.ShadowStarX1));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowStarX81), "AAA", "AAA", "AAA",
                'A', SCItems.ShadowStarX9));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowStick, 2), "A  ", "A  ", "   ",
                'A', "ingotShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowStickLong), "  A", " A ", "A  ",
                'A', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowPlate, 4), "AA ", "AA ", "B  ",
                'A', "ingotShadow",
                'B', new ItemStack(SCItems.ShadowHammer, 1, OreDictionary.WILDCARD_VALUE)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowHammer), "AAA", "AAA", " B ",
                'A', "ingotShadow",
                'B', SCItems.ShadowStick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowSeeds, 4), "ABA", "BCB", "ABA",
                'A', "crystalShadow",
                'B', SCItems.ShadowStarX1,
                'C', Items.wheat_seeds));

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
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowBow), "AAB", "C A", " CA",
                'A', "ingotShadow",
                'B', Items.leather,
                'C', Items.string));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowShears), " A ", "B  ", "   ",
                'A', "ingotShadow",
                'B', "nuggetShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowFishingRod), "  A", " AB", "ACB",
                'A', "ingotShadow",
                'B', Items.string,
                'C', "ingotIron"));
        ItemStack shadowDisassembler = new ItemStack(SCItems.ShadowDisassembler);
        shadowDisassembler.addEnchantment(Enchantment.silkTouch, 1);
        GameRegistry.addRecipe(new ShapedOreRecipe(shadowDisassembler, "ADA", "BEB", "CFC",
                'A', SCItems.ShadowPickaxe,
                'B', SCItems.ShadowSpade,
                'C', SCItems.ShadowAxe,
                'D', SCItems.ShadowSword,
                'E', SCItems.ShadowStarX81,
                'F', SCItems.ShadowStickLong));

        //Armor
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowHelmet), "AAA", "ABA", "   ",
                'A', SCItems.ShadowPlate,
                'B', new ItemStack(SCItems.ShadowHammer, 1, OreDictionary.WILDCARD_VALUE)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowChestplate), "ABA", "AAA", "AAA",
                'A', SCItems.ShadowPlate,
                'B', new ItemStack(SCItems.ShadowHammer, 1, OreDictionary.WILDCARD_VALUE)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowLeggings), "AAA", "ABA", "A A",
                'A', SCItems.ShadowPlate,
                'B', new ItemStack(SCItems.ShadowHammer, 1, OreDictionary.WILDCARD_VALUE)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowBoots), "A A", "ABA", "   ",
                'A', SCItems.ShadowPlate,
                'B', new ItemStack(SCItems.ShadowHammer, 1, OreDictionary.WILDCARD_VALUE)));

        Item goggles = (Item) Item.itemRegistry.getObject("Thaumcraft:ItemGoggles");
        ThaumcraftApi.addShapelessArcaneCraftingRecipe("", new ItemStack(SCItems.ShadowHelmetOfRevealing), (new AspectList()).add(Aspect.EARTH, 50).add(Aspect.FIRE, 50).add(Aspect.AIR, 50).add(Aspect.WATER, 50).add(Aspect.ORDER, 50).add(Aspect.ENTROPY, 50), SCItems.ShadowHelmet, goggles);

        //Baubles
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowAmuletOfRegeneration), "AAA", "ABA", " C ",
                'A', Items.string,
                'B', SCItems.ShadowStarX9,
                'C', Items.ghast_tear));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowRingOfFireResistance), " A ", "ABA", " A ",
                'A', "ingotShadow",
                'B', Items.magma_cream));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowRingOfNightVision), " A ", "ABA", " A ",
                'A', "ingotShadow",
                'B', Items.golden_carrot));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCItems.ShadowBeltOfFlight), "ABA", "CDC", "EEE",
                'A', Items.feather,
                'B', SCItems.ShadowStarX1,
                'C', Items.leather,
                'D', Items.gold_nugget,
                'E', "crystalShadow"));

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

        //Materials
        int oreOutput = 4;
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowIronDust, oreOutput), SCItems.ShadowOrb, "oreIron"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowGoldDust, oreOutput), SCItems.ShadowOrb, "oreGold"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowCopperDust, oreOutput), SCItems.ShadowOrb, "oreCopper"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowTinDust, oreOutput), SCItems.ShadowOrb, "oreTin"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowSilverDust, oreOutput), SCItems.ShadowOrb, "oreSilver"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowLeadDust, oreOutput), SCItems.ShadowOrb, "oreLead"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowNickelDust, oreOutput), SCItems.ShadowOrb, "oreNickel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(SCItems.ShadowPlatinumDust, oreOutput), SCItems.ShadowOrb, "orePlatinum"));

        float xpOutput = 1.0F;
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowIronDust), new ItemStack(Items.iron_ingot), xpOutput);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowGoldDust), new ItemStack(Items.gold_ingot), xpOutput);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowCopperDust), new ItemStack(SCItems.CopperIngot), xpOutput);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowTinDust), new ItemStack(SCItems.TinIngot), xpOutput);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowSilverDust), new ItemStack(SCItems.SilverIngot), xpOutput);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowLeadDust), new ItemStack(SCItems.LeadIngot), xpOutput);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowNickelDust), new ItemStack(SCItems.NickelIngot), xpOutput);
        GameRegistry.addSmelting(new ItemStack(SCItems.ShadowPlatinumDust), new ItemStack(SCItems.PlatinumIngot), xpOutput);

        //Misc
        GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh), new ItemStack(Items.leather), xpOutput);
        GameRegistry.addSmelting(new ItemStack(Items.glass_bottle), new ItemStack(Items.experience_bottle), xpOutput);

        //Blocks
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCBlocks.ShadowStone, 8), "AAA", "ABA", "AAA",
                'A', Blocks.stone,
                'B', "ingotShadow"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCBlocks.ShadowStoneBricks, 4), "AA ", "AA ", "   ",
                'A', SCBlocks.ShadowStone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCBlocks.ShadowStoneBricksCracked, 4), "AA ", "AA ", "   ",
                'A', SCBlocks.ShadowStoneBricks));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCBlocks.ShadowStoneBricksCarved, 4), "AA ", "AA ", "   ",
                'A', SCBlocks.ShadowStoneBricksCracked));
    }
}
