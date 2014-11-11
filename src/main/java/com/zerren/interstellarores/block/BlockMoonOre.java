package com.zerren.interstellarores.block;

import com.zerren.interstellarores.ModBlocks;
import com.zerren.interstellarores.ModItems;
import com.zerren.interstellarores.reference.Names;
import com.zerren.interstellarores.registry.ModIntegration;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

/**
 * Created by Zerren on 11/5/2014.
 */
public class BlockMoonOre extends BlockOreBase {

    private static final String oreName = Names.Blocks.MOON_ORE;
    private static final String[] allSubtypes = Names.Blocks.MOON_ORE_SUBTYPES;
    private static final int oreCount = Names.Blocks.MOON_ORE_SUBTYPES.length;

    public BlockMoonOre(float hardness, float resistance) {
        super(oreName, allSubtypes, oreCount);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public Item getItemDropped(int par1, Random random, int par2) {

        switch (par1) {
            case 9: return ModItems.lunariumMaterial;
        }
        return Item.getItemFromBlock(this);
    }

    public int damageDropped(int meta) {
        switch (meta) {
            case 9: return 0; //Lunarium
        }
        return meta;
    }
}
