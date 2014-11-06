package com.zerren.interstellarores.item;

import com.zerren.interstellarores.reference.Names;
import com.zerren.interstellarores.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

/**
 * Created by Zerren on 11/5/2014.
 */
public class ItemLunarium extends ItemInterstellar {

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemLunarium() {
        super();
        this.setHasSubtypes(true);
        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.LUNARIUM);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, Names.Items.LUNARIUM);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s.%s", Textures.RESOURCE_PREFIX, Names.Items.LUNARIUM, Names.Items.LUNARIUM_SUBTYPES[MathHelper.clamp_int(itemStack.getItemDamage(), 0, Names.Items.LUNARIUM_SUBTYPES.length - 1)]);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
        return icons[MathHelper.clamp_int(meta, 0, Names.Items.LUNARIUM_SUBTYPES.length - 1)];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTab, List list) {
        for (int meta = 0; meta < Names.Items.LUNARIUM_SUBTYPES.length; ++meta) {
            list.add(new ItemStack(this, 1, meta));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        icons = new IIcon[Names.Items.LUNARIUM_SUBTYPES.length];

        for (int i = 0; i < Names.Items.LUNARIUM_SUBTYPES.length; i++) {
            icons[i] = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + Names.Items.LUNARIUM + "." + Names.Items.LUNARIUM_SUBTYPES[i]);
        }
    }
}
