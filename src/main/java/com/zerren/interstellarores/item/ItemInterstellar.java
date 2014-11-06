package com.zerren.interstellarores.item;

import com.zerren.interstellarores.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Zerren on 11/4/2014.
 */
public class ItemInterstellar extends Item {

    public ItemInterstellar() {
        super();
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setNoRepair();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    //Gets the internal name for the item and unwraps it using the method below unwrapName. One for generic and one for an ItemStack
    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, unwrapName(super.getUnlocalizedName()));
    }
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, unwrapName(super.getUnlocalizedName()));
    }

    protected String unwrapName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
