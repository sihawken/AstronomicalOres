package com.zerren.interstellarores.item.itemBlock;

import com.zerren.interstellarores.ModBlocks;
import com.zerren.interstellarores.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemMultiTexture;

/**
 * Created by Zerren on 11/5/2014.
 */
public class ItemBlockMoonOre extends ItemMultiTexture {
    public ItemBlockMoonOre(Block block) {
        super(ModBlocks.moonOre, ModBlocks.moonOre, Names.Blocks.MOON_ORE_SUBTYPES);
    }
}
