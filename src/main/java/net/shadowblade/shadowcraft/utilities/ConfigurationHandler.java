package net.shadowblade.shadowcraft.utilities;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import net.shadowblade.shadowcraft.references.Refs;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Refs.MOD_ID))
        {
            loadConfiguration();
        }
    }
    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", "Main", false, "This is a test config value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
