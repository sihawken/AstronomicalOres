package com.zerren.interstellarores.block;

import com.zerren.interstellarores.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;
import java.util.Random;

/**
 * Created by Zerren on 11/5/2014.
 */
public class BlockMoonOre extends BlockInterstellar {

    @SideOnly(Side.CLIENT)
    private IIcon[] icon;

    public BlockMoonOre() {
        super();
        this.setBlockName(Names.Blocks.MOON_ORE);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par2) {
        return Item.getItemFromBlock(this);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        for (int meta = 0; meta < Names.Blocks.MOON_ORE_SUBTYPES.length; meta++) {
            list.add(new ItemStack(item, 1, meta));
        }
    }
    @Override
    public int damageDropped(int meta) {
        return meta;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icon = new IIcon[Names.Blocks.MOON_ORE_SUBTYPES.length];

        for (int i = 0; i < Names.Blocks.MOON_ORE_SUBTYPES.length; i++) {
            icon[i] = iconRegister.registerIcon(String.format("%s.%s", unwrapName(this.getUnlocalizedName()), Names.Blocks.MOON_ORE_SUBTYPES[i]));
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metaData) {
        metaData = MathHelper.clamp_int(metaData, 0, Names.Blocks.MOON_ORE_SUBTYPES.length - 1);
        return icon[metaData];
    }
}
