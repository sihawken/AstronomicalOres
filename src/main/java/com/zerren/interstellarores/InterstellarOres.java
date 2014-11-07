package com.zerren.interstellarores;

import com.zerren.interstellarores.handler.ConfigHandler;
import com.zerren.interstellarores.proxy.IProxy;
import com.zerren.interstellarores.reference.Reference;
import com.zerren.interstellarores.registry.InterstellarDictionary;
import com.zerren.interstellarores.registry.ModIntegration;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUIFACTORY_CLASS, dependencies = "after:appliedenergistics2")
public class InterstellarOres {

    @Mod.Instance(Reference.MOD_ID)
    public static InterstellarOres instance;

    @SidedProxy(clientSide = Reference.CLIENTPROXY_CLASS, serverSide = Reference.SERVERPROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModIntegration.tryLoadingMods();

        ModItems.init();
        ModBlocks.init();

        InterstellarDictionary.registerOreRecipes();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
