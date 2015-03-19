package com.n0rw0lf.astronomicalores.item.itemBlock;

import com.n0rw0lf.astronomicalores.ModBlocks;
import com.n0rw0lf.astronomicalores.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 11/12/2014.
 */
public class ItemBlockMetal extends ItemMultiTexture {
    public ItemBlockMetal(Block block) {
        super(ModBlocks.astronomicalMetal, ModBlocks.astronomicalMetal, Names.Blocks.BLOCK_METAL_SUBTYPES);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}