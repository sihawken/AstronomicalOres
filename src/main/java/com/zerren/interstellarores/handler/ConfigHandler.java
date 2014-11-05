package com.zerren.interstellarores.handler;

import com.zerren.interstellarores.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Zerren on 11/4/2014.
 */
public class ConfigHandler {

    public static Configuration config;
    public static boolean testValue = false;

    public static void init(File configFile){
        
        if (config == null) {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    private static void loadConfig() {
        testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example");

        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfig();
        }
    }
}
