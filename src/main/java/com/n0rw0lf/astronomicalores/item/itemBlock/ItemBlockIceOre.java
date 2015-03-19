package com.n0rw0lf.astronomicalores.item.itemBlock;

import com.n0rw0lf.astronomicalores.ModBlocks;
import com.n0rw0lf.astronomicalores.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 11/6/2014.
 */
public class ItemBlockIceOre extends ItemMultiTexture {
    public ItemBlockIceOre(Block block) {
        super(ModBlocks.iceOre, ModBlocks.iceOre, Names.Blocks.ICE_ORE_SUBTYPES);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}
