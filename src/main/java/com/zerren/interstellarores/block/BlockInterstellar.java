package com.zerren.interstellarores.block;

import com.zerren.interstellarores.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

/**
 * Created by Zerren on 11/5/2014.
 */
public class BlockInterstellar extends Block {

    public BlockInterstellar(Material material) {
        super(material);
    }

    public BlockInterstellar() {
        this(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, unwrapName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", unwrapName(this.getUnlocalizedName())));
    }

    protected String unwrapName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
