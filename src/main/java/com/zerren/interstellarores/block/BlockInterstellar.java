package com.zerren.interstellarores.block;

import com.zerren.interstellarores.handler.ConfigHandler;
import com.zerren.interstellarores.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

/**
 * Created by Zerren on 11/5/2014.
 */
public class BlockInterstellar extends Block {

    public BlockInterstellar(Material material) {
        super(material);

        if (ConfigHandler.creativeTab) {
            this.setCreativeTab(CreativeTabs.tabBlock);
        }
    }

    public BlockInterstellar() {
        this(Material.rock);

        if (ConfigHandler.creativeTab) {
            this.setCreativeTab(CreativeTabs.tabBlock);
        }
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par2) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
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
