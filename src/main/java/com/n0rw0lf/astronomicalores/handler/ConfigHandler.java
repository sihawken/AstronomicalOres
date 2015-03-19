package com.n0rw0lf.astronomicalores.handler;

import com.n0rw0lf.astronomicalores.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Zerren on 11/4/2014.
 */
public class ConfigHandler {

    public static Configuration config;
    public static boolean appEngModule = true;
    public static boolean creativeTab = false;

    public static void init(File configFile){
        
        if (config == null) {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    private static void loadConfig() {
        appEngModule = config.getBoolean("appEngModule", Configuration.CATEGORY_GENERAL, true, "Should the Applied Energistics module be loaded (Asteroid Quartz will drop Nether Quartz if false");
        creativeTab = config.getBoolean("creativeTab", Configuration.CATEGORY_GENERAL, true, "Should ore blocks be in their own creative tab?");

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
