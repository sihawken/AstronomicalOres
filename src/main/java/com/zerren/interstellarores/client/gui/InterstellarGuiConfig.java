package com.zerren.interstellarores.client.gui;

import com.zerren.interstellarores.handler.ConfigHandler;
import com.zerren.interstellarores.reference.Reference;
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
