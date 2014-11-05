package com.zerren.interstellarores;

import com.zerren.interstellarores.proxy.IProxy;
import com.zerren.interstellarores.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class InterstellarOres {

    @Mod.Instance(Reference.MOD_ID)
    public static InterstellarOres instance;

    @SidedProxy(clientSide = "com.zerren.interstellarores.proxy.ClientProxy",
            serverSide = "com.zerren.interstellarores.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
