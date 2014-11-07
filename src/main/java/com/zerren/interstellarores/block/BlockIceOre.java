package com.zerren.interstellarores.block;

import com.zerren.interstellarores.ModBlocks;
import com.zerren.interstellarores.reference.Names;
import com.zerren.interstellarores.registry.ModIntegration;
import net.minecraft.item.Item;

import java.util.Random;

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
        this.setStepSound(soundTypeGlass);
        this.slipperiness = 0.98F;
    }

    public Item getItemDropped(int par1, Random random, int par2) {

        switch (par1) {
            case 0: return net.minecraft.init.Items.diamond;
            case 2: return ModIntegration.certusQuartz.getItem();
            case 3: return ModIntegration.certusQuartzCharged.getItem();
        }
        return Item.getItemFromBlock(ModBlocks.asteroidOre);
    }

    public int damageDropped(int meta) {
        switch (meta) {
            case 0: return 0; //diamond
            case 1: return meta; //platinum
            case 2: return 0; //certus quartz
            case 3: return 1; //charged quartz;
        }
        return meta;
    }
}