package com.n0rw0lf.astronomicalores.block;

import com.n0rw0lf.astronomicalores.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

/**
 * Created by Zerren on 11/12/2014.
 */
public class BlockMetals extends BlockMetaBase {

    private static final String oreName = Names.Blocks.BLOCK_METAL;
    private static final String[] allSubtypes = Names.Blocks.BLOCK_METAL_SUBTYPES;
    private static final int oreCount = Names.Blocks.BLOCK_METAL_SUBTYPES.length;

    public BlockMetals(float hardness, float resistance) {
        super(oreName, allSubtypes, oreCount, Material.iron);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    @Override
    public int getLightValue(IBlockAccess world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        switch (meta) {
            case 2: return 10;
            default: return 0;
        }
    }
}