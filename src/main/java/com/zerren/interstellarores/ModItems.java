package com.zerren.interstellarores;

import com.zerren.interstellarores.item.ItemInterstellar;
import com.zerren.interstellarores.item.ItemLunarium;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Zerren on 11/4/2014.
 */
public class ModItems {

    public static final ItemInterstellar lunariumMaterial = new ItemLunarium();

    public static void init() {
        GameRegistry.registerItem(lunariumMaterial, "lunariumMaterial");
    }
}
