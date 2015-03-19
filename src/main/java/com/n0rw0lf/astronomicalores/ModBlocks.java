package com.n0rw0lf.astronomicalores;

import com.n0rw0lf.astronomicalores.block.*;
import com.n0rw0lf.astronomicalores.item.itemBlock.*;
import com.n0rw0lf.astronomicalores.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Edited by n0rw0lf on 03/17/2015
 */

/**
 * Created by Zerren on 11/4/2014.
 */
public class ModBlocks {
    public static final BlockMetaBase moonOre = new BlockMoonOre(3.0F, 5.0F);
    public static final BlockMetaBase marsOre = new BlockMarsOre(3.0F, 5.0F);
    public static final BlockMetaBase asteroidOre = new BlockAsteroidOre(3.0F, 5.0F);
    public static final BlockMetaBase iceOre = new BlockIceOre(2.0F, 3.0F);

    public static final BlockAstronomical astronomicalMetal = new BlockMetals(5.0F, 10.0F);

    public static void init() {
        GameRegistry.registerBlock(moonOre, ItemBlockMoonOre.class, Names.Blocks.MOON_ORE);
        GameRegistry.registerBlock(marsOre, ItemBlockMarsOre.class, Names.Blocks.MARS_ORE);
        GameRegistry.registerBlock(asteroidOre, ItemBlockAsteroidOre.class, Names.Blocks.ASTEROID_ORE);
        GameRegistry.registerBlock(iceOre, ItemBlockIceOre.class, Names.Blocks.ICE_ORE);
        GameRegistry.registerBlock(astronomicalMetal, ItemBlockMetal.class, Names.Blocks.BLOCK_METAL);
    }
}
