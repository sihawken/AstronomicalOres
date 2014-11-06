package com.zerren.interstellarores.item.itemBlock;

import com.zerren.interstellarores.ModBlocks;
import com.zerren.interstellarores.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 11/6/2014.
 */
public class ItemBlockIceOre extends ItemMultiTexture {
    public ItemBlockIceOre(Block block) {
        super(ModBlocks.iceOre, ModBlocks.iceOre, Names.Blocks.ICE_ORE_SUBTYPES);
    }
}
