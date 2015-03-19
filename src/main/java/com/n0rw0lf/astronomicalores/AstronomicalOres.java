package com.n0rw0lf.astronomicalores;

import com.n0rw0lf.astronomicalores.handler.ConfigHandler;
import com.n0rw0lf.astronomicalores.proxy.IProxy;
import com.n0rw0lf.astronomicalores.reference.Reference;
import com.n0rw0lf.astronomicalores.registry.AstronomicalDictionary;
import com.n0rw0lf.astronomicalores.registry.ModIntegration;
import com.n0rw0lf.astronomicalores.registry.Recipes;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUIFACTORY_CLASS, dependencies = "after:appliedenergistics2")
public class AstronomicalOres {

    public static AstronomicalTab astronomicalTab;

    @Mod.Instance(Reference.MOD_ID)
    public static AstronomicalOres instance;

    @SidedProxy(clientSide = Reference.CLIENTPROXY_CLASS, serverSide = Reference.SERVERPROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModIntegration.tryLoadingMods();

        if(ConfigHandler.creativeTab)
            astronomicalTab = new AstronomicalTab("AstronomicalOres");

        ModBlocks.init();

        AstronomicalDictionary.registerOreRecipes();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Recipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
