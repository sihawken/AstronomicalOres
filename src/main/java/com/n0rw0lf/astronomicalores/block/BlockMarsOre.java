package com.n0rw0lf.astronomicalores.block;

import com.n0rw0lf.astronomicalores.reference.Names;

/**
 * Created by Zerren on 11/5/2014.
 */
public class BlockMarsOre extends BlockMetaBase {

    private static final String oreName = Names.Blocks.MARS_ORE;
    private static final String[] allSubtypes = Names.Blocks.MARS_ORE_SUBTYPES;
    private static final int oreCount = Names.Blocks.MARS_ORE_SUBTYPES.length;

    public BlockMarsOre(float hardness, float resistance) {
        super(oreName, allSubtypes, oreCount);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }
}
