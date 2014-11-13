package com.zerren.interstellarores.item.itemBlock;

import com.zerren.interstellarores.ModBlocks;
import com.zerren.interstellarores.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 11/12/2014.
 */
public class ItemBlockMetal extends ItemMultiTexture {
    public ItemBlockMetal(Block block) {
        super(ModBlocks.interstellarMetal, ModBlocks.interstellarMetal, Names.Blocks.BLOCK_METAL_SUBTYPES);
    }
}