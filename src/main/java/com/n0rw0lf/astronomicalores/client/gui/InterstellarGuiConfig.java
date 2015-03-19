package com.n0rw0lf.astronomicalores.client.gui;

import com.n0rw0lf.astronomicalores.handler.ConfigHandler;
import com.n0rw0lf.astronomicalores.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by Zerren on 11/4/2014.
 */
public class InterstellarGuiConfig extends GuiConfig {

    public InterstellarGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }
}
