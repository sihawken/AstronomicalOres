package com.n0rw0lf.astronomicalores.item.itemBlock;

import com.n0rw0lf.astronomicalores.ModBlocks;
import com.n0rw0lf.astronomicalores.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 11/5/2014.
 */
public class ItemBlockMoonOre extends ItemMultiTexture {
    public ItemBlockMoonOre(Block block) {
        super(ModBlocks.moonOre, ModBlocks.moonOre, Names.Blocks.MOON_ORE_SUBTYPES);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}