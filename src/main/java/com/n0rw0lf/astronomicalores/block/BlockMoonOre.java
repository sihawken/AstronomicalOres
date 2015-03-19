package com.n0rw0lf.astronomicalores.block;

import com.n0rw0lf.astronomicalores.reference.Names;
import com.n0rw0lf.astronomicalores.registry.ModIntegration;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Zerren on 11/5/2014.
 */
public class BlockMoonOre extends BlockMetaBase {

    private static final String oreName = Names.Blocks.MOON_ORE;
    private static final String[] allSubtypes = Names.Blocks.MOON_ORE_SUBTYPES;
    private static final int oreCount = Names.Blocks.MOON_ORE_SUBTYPES.length;

    public BlockMoonOre(float hardness, float resistance) {
        super(oreName, allSubtypes, oreCount);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public Item getItemDropped(int meta, Random random, int par2) {
        switch (meta) {
            case 0: return Items.redstone;
            case 5: return ModIntegration.certusQuartz.getItem();
            case 6: return ModIntegration.certusQuartzCharged.getItem();
            default: return Item.getItemFromBlock(this);
        }
    }

    @Override
    public int getLightValue(IBlockAccess world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        switch (meta) {
            case 9: return 5;
            default: return 0;
        }
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        int numDrops = 1;

        if(meta == 0) {
            numDrops = 4;
        }
        else if(meta == 5 || meta == 6) {
            numDrops = 1;
        }

        if(fortune>0 && Item.getItemFromBlock( this ) != this.getItemDropped( meta, random, fortune )){

            System.out.println("Fortune is " + fortune + "!");
            int j = random.nextInt( fortune + numDrops ) - 1;

            if ( j < 0 )
            {
                j = 0;
            }
            return this.quantityDropped( random ) * (j + numDrops);
        }

        else if(fortune == 0 && Item.getItemFromBlock( this ) != this.getItemDropped( meta, random, fortune )){
            System.out.println("Fortune is " + fortune + "!");
            return numDrops + random.nextInt( 2 );
        }

        else{
            return numDrops;
        }
    }

    @Override
    public int damageDropped(int meta) {
        switch (meta) {
            case 5: return 0;
            case 6: return 1;
            default: return meta;
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
