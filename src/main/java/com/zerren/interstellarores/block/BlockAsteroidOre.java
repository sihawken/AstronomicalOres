package com.zerren.interstellarores.block;

import com.zerren.interstellarores.reference.Names;
import com.zerren.interstellarores.registry.ModIntegration;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Zerren on 11/5/2014.
 */
public class BlockAsteroidOre extends BlockMetaBase {

    private static final String oreName = Names.Blocks.ASTEROID_ORE;
    private static final String[] allSubtypes = Names.Blocks.ASTEROID_ORE_SUBTYPES;
    private static final int oreCount = Names.Blocks.ASTEROID_ORE_SUBTYPES.length;

    public BlockAsteroidOre(float hardness, float resistance) {
        super(oreName, allSubtypes, oreCount);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public Item getItemDropped(int meta, Random random, int par2) {

        switch (meta) {
            case 0: return net.minecraft.init.Items.diamond;
            case 2: return ModIntegration.certusQuartz.getItem();
            case 3: return ModIntegration.certusQuartzCharged.getItem();
            default: return Item.getItemFromBlock(this);
        }
    }

    public int damageDropped(int meta) {
        switch (meta) {
            case 0: return 0; //diamond
            case 2: return 0; //certus quartz
            case 3: return 1; //charged quartz;
            default: return meta;
        }
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(meta, random, fortune)) {
            int j = random.nextInt(fortune + 2) - 1;

            if (j < 0) {
                j = 0;
            }

            return this.quantityDropped(random) * (j + 1);
        }
        else {
            return this.quantityDropped(random);
        }
    }

    @Override
    public void dropBlockAsItemWithChance(World w, int x, int y, int z, int blockID, float something, int meta) {
        super.dropBlockAsItemWithChance( w, x, y, z, blockID, something, meta );

        if ( getItemDropped( blockID, w.rand, meta ) != Item.getItemFromBlock( this ) ) {
            int xp = MathHelper.getRandomIntegerInRange( w.rand, 2, 5 );

            this.dropXpOnBlockBreak( w, x, y, z, xp );
        }
    }
}