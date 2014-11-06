package com.zerren.interstellarores.item.itemBlock;

import com.zerren.interstellarores.ModBlocks;
import com.zerren.interstellarores.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 11/6/2014.
 */
public class ItemBlockMarsOre extends ItemMultiTexture {
    public ItemBlockMarsOre(Block block) {
        super(ModBlocks.marsOre, ModBlocks.marsOre, Names.Blocks.MARS_ORE_SUBTYPES);
    }
}