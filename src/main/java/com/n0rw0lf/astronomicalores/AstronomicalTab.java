package com.n0rw0lf.astronomicalores;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by n0rw0lf on 03/17/2015.
 */
public class AstronomicalTab extends CreativeTabs {

    public AstronomicalTab(String unlocalized) {

        super(unlocalized);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() {
        return new ItemStack(ModBlocks.marsOre, 1, 1);
    }


}
