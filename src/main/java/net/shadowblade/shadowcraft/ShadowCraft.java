package net.shadowblade.shadowcraft;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.shadowblade.shadowcraft.init.SCBlocks;
import net.shadowblade.shadowcraft.init.SCItems;
import net.shadowblade.shadowcraft.init.SCMisc;
import net.shadowblade.shadowcraft.init.SCRecipes;
import net.shadowblade.shadowcraft.proxies.CommonProxy;
import net.shadowblade.shadowcraft.references.Refs;
import net.shadowblade.shadowcraft.utilities.ConfigurationHandler;
import net.shadowblade.shadowcraft.utilities.LogHelper;


@Mod(modid = Refs.MOD_ID,
        name = Refs.MOD_NAME,
            version = Refs.MOD_VERSION,
                guiFactory = Refs.GUI_FACTORY,
                    dependencies = Refs.MOD_DEPENDENCIES)
public class ShadowCraft
{
    @SidedProxy(clientSide = Refs.CLIENT_PROXY,
                    serverSide = Refs.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance(Refs.MOD_ID)
    public static ShadowCraft instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Pre Initialization Started");
        SCItems.init();
        SCBlocks.init();
        SCMisc.init();
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Started");
        SCRecipes.init();
        proxy.registerRenderers();
        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Started");
        LogHelper.info("Post Initialization Complete");
    }
}
