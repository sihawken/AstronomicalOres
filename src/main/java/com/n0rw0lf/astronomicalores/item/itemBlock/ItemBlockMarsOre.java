package com.n0rw0lf.astronomicalores.item.itemBlock;

import com.n0rw0lf.astronomicalores.ModBlocks;
import com.n0rw0lf.astronomicalores.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 11/6/2014.
 */
public class ItemBlockMarsOre extends ItemMultiTexture {
    public ItemBlockMarsOre(Block block) {
        super(ModBlocks.marsOre, ModBlocks.marsOre, Names.Blocks.MARS_ORE_SUBTYPES);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}