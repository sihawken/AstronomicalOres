package com.n0rw0lf.astronomicalores.registry;

import appeng.api.AEApi;
import appeng.api.definitions.Materials;
import com.n0rw0lf.astronomicalores.handler.ConfigHandler;
import cpw.mods.fml.common.Loader;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Zerren on 11/6/2014.
 */
public class ModIntegration {

    public static ItemStack certusQuartz;
    public static ItemStack certusQuartzCharged;

    public static void tryLoadingMods() {

        boolean appliedenergistics = false;
        boolean galacticraft = false;

        if (Loader.isModLoaded("appliedenergistics2") && ConfigHandler.appEngModule) {
            appliedenergistics = true;
        }

        registerAEComponents(appliedenergistics);
    }

    public static void registerAEComponents(boolean loaded) {
        if (loaded) {
            Materials aeMaterials = AEApi.instance().materials();

            certusQuartz = aeMaterials.materialCertusQuartzCrystal.stack(1);
            certusQuartz.setItemDamage(11);
            certusQuartzCharged = aeMaterials.materialCertusQuartzCrystalCharged.stack(1);
            certusQuartzCharged.setItemDamage(12);
        }
        else {
            certusQuartz = new ItemStack(Items.quartz);
            certusQuartzCharged = new ItemStack(Items.quartz);
        }
    }
}
