package com.n0rw0lf.astronomicalores.registry;

import com.n0rw0lf.astronomicalores.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Edited by n0rw0lf on 03/17/2015.
 */

/**
 * Created by Zerren on 11/6/2014.
 */
public class AstronomicalDictionary {

    public static void registerOreRecipes(){
        //blocks
        OreDictionary.registerOre("blockOlivine", new ItemStack(ModBlocks.astronomicalMetal,1, 0));
        OreDictionary.registerOre("blockChromium", new ItemStack(ModBlocks.astronomicalMetal,1, 1));
        OreDictionary.registerOre("blockAdamantium", new ItemStack(ModBlocks.astronomicalMetal,1, 2));

        //moon
        OreDictionary.registerOre("oreRedstone", new ItemStack(ModBlocks.moonOre, 1, 0));
        OreDictionary.registerOre("oreOsmium", new ItemStack(ModBlocks.moonOre, 1, 1));
        OreDictionary.registerOre("oreIron", new ItemStack(ModBlocks.moonOre, 1, 2));
        OreDictionary.registerOre("oreSilver", new ItemStack(ModBlocks.moonOre, 1, 3));
        OreDictionary.registerOre("oreOlivine", new ItemStack(ModBlocks.moonOre, 1, 4));
        OreDictionary.registerOre("oreCertusQuartz", new ItemStack(ModBlocks.marsOre, 1, 5));
        OreDictionary.registerOre("oreCertusQuartz", new ItemStack(ModBlocks.marsOre, 1, 6));

        //mars
        OreDictionary.registerOre("oreGold", new ItemStack(ModBlocks.marsOre, 1, 0));
        OreDictionary.registerOre("orePlatinum", new ItemStack(ModBlocks.marsOre, 1, 1));
        OreDictionary.registerOre("oreCobalt", new ItemStack(ModBlocks.marsOre, 1, 2));
        OreDictionary.registerOre("oreArdite", new ItemStack(ModBlocks.marsOre, 1, 3));
        OreDictionary.registerOre("oreChromium", new ItemStack(ModBlocks.marsOre, 1, 4));

        //asteroid
        OreDictionary.registerOre("oreDiamond", new ItemStack(ModBlocks.asteroidOre, 1, 0));
        OreDictionary.registerOre("oreNaquadah", new ItemStack(ModBlocks.asteroidOre, 1, 1));

        //ice
        OreDictionary.registerOre("oreDiamond", new ItemStack(ModBlocks.iceOre, 1, 0));
        OreDictionary.registerOre("oreMythril", new ItemStack(ModBlocks.iceOre, 1, 1));
        OreDictionary.registerOre("oreAdamantium", new ItemStack(ModBlocks.iceOre, 1, 2));
    }
}
