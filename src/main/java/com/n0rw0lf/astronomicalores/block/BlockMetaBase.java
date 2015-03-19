package com.n0rw0lf.astronomicalores.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

/**
 * Created by Zerren on 11/6/2014.
 */
public class BlockMetaBase extends BlockAstronomical {

    @SideOnly(Side.CLIENT)
    private IIcon[] icon;

    private int blockCountBase;
    private String[] allSubtypesBase;

    //For use with ores that aren't stone (ice, gravel)
    public BlockMetaBase(String name, String[] allSubtypes, int blockCount, Material material) {
        super(material);
        this.setBlockName(name);
        blockCountBase = blockCount;
        allSubtypesBase = allSubtypes;
    }

    //Every other ore (stone)
    public BlockMetaBase(String name, String[] allSubtypes, int blockCount) {
        super();
        this.setBlockName(name);
        blockCountBase = blockCount;
        allSubtypesBase = allSubtypes;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        for (int meta = 0; meta < blockCountBase; meta++) {
            list.add(new ItemStack(item, 1, meta));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icon = new IIcon[blockCountBase];

        for (int i = 0; i < blockCountBase; i++) {
            icon[i] = iconRegister.registerIcon(String.format("%s.%s", unwrapName(this.getUnlocalizedName()), allSubtypesBase[i]));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metaData) {
        metaData = MathHelper.clamp_int(metaData, 0, blockCountBase - 1);
        return icon[metaData];
    }
}
