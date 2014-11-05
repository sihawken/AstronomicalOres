package com.zerren.interstellarores;

import com.zerren.interstellarores.block.BlockInterstellar;
import com.zerren.interstellarores.block.BlockLunarium;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Zerren on 11/4/2014.
 */
public class ModBlocks {
    public static final BlockInterstellar lunariumOre = new BlockLunarium();

    public static void init() {
        GameRegistry.registerBlock(lunariumOre, "lunariumOre");
    }
}
