package com.zerren.interstellarores.item.itemBlock;

import com.zerren.interstellarores.ModBlocks;
import com.zerren.interstellarores.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 11/6/2014.
 */
public class ItemBlockAsteroidOre extends ItemMultiTexture {
    public ItemBlockAsteroidOre(Block block) {
        super(ModBlocks.asteroidOre, ModBlocks.asteroidOre, Names.Blocks.ASTEROID_ORE_SUBTYPES);
    }
}
