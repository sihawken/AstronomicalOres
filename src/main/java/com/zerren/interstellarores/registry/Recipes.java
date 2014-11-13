package com.zerren.interstellarores.registry;

import com.zerren.interstellarores.ModBlocks;
import com.zerren.interstellarores.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Zerren on 11/12/2014.
 */
public class Recipes {

    public static void init() {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.interstellarMetal, 1, 0), "xxx","xxx","xxx", 'x', "materialLunarium"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.lunariumMaterial, 9, 0), "blockLunarium"));
    }
}
