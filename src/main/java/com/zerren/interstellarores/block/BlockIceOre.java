package com.zerren.interstellarores.block;

import com.zerren.interstellarores.reference.Names;

/**
 * Created by Zerren on 11/5/2014.
 */
public class BlockIceOre extends BlockOreBase {

    private static final String oreName = Names.Blocks.ICE_ORE;
    private static final String[] allSubtypes = Names.Blocks.ICE_ORE_SUBTYPES;
    private static final int oreCount = Names.Blocks.ICE_ORE_SUBTYPES.length;

    public BlockIceOre(float hardness, float resistance) {
        super(oreName, allSubtypes, oreCount);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }
}