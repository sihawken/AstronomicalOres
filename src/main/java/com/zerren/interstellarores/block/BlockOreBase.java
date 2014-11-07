package com.zerren.interstellarores.block;

import com.zerren.interstellarores.reference.Names;
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
public class BlockOreBase extends BlockInterstellar {

    @SideOnly(Side.CLIENT)
    private IIcon[] icon;

    private int oreCount2;
    private String[] allSubtypes2;

    //For use with ores that aren't stone (ice, gravel)
    public BlockOreBase(String oreName, String[] allSubtypes, int oreCount, Material material) {
        super(material);
        this.setBlockName(oreName);
        oreCount2 = oreCount;
        allSubtypes2 = allSubtypes;
    }

    //Every other ore (stone)
    public BlockOreBase(String oreName, String[] allSubtypes, int oreCount) {
        super();
        this.setBlockName(oreName);
        oreCount2 = oreCount;
        allSubtypes2 = allSubtypes;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        for (int meta = 0; meta < oreCount2; meta++) {
            list.add(new ItemStack(item, 1, meta));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icon = new IIcon[oreCount2];

        for (int i = 0; i < oreCount2; i++) {
            icon[i] = iconRegister.registerIcon(String.format("%s.%s", unwrapName(this.getUnlocalizedName()), allSubtypes2[i]));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metaData) {
        metaData = MathHelper.clamp_int(metaData, 0, oreCount2 - 1);
        return icon[metaData];
    }
}
