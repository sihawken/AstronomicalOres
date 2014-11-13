package com.zerren.interstellarores;

import com.zerren.interstellarores.block.*;
import com.zerren.interstellarores.item.itemBlock.*;
import com.zerren.interstellarores.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Zerren on 11/4/2014.
 */
public class ModBlocks {
    public static final BlockMetaBase moonOre = new BlockMoonOre(3.0F, 5.0F);
    public static final BlockMetaBase marsOre = new BlockMarsOre(3.0F, 5.0F);
    public static final BlockMetaBase asteroidOre = new BlockAsteroidOre(3.0F, 5.0F);
    public static final BlockMetaBase iceOre = new BlockIceOre(2.0F, 3.0F);

    public static final BlockInterstellar interstellarMetal = new BlockMetals(5.0F, 10.0F);

    public static void init() {
        GameRegistry.registerBlock(moonOre, ItemBlockMoonOre.class, Names.Blocks.MOON_ORE);
        GameRegistry.registerBlock(marsOre, ItemBlockMarsOre.class, Names.Blocks.MARS_ORE);
        GameRegistry.registerBlock(asteroidOre, ItemBlockAsteroidOre.class, Names.Blocks.ASTEROID_ORE);
        GameRegistry.registerBlock(iceOre, ItemBlockIceOre.class, Names.Blocks.ICE_ORE);

        GameRegistry.registerBlock(interstellarMetal, ItemBlockMetal.class, Names.Blocks.BLOCK_METAL);
    }
}
