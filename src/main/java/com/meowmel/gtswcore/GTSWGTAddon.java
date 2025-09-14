package com.meowmel.gtswcore;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

import net.minecraft.data.recipes.FinishedRecipe;

import com.meowmel.gtswcore.api.registries.GTSWRegistires;
import com.meowmel.gtswcore.common.data.GTSWRecipes;

import java.util.function.Consumer;

@SuppressWarnings("unused")
@GTAddon
public class GTSWGTAddon implements IGTAddon {

    @Override
    public GTRegistrate getRegistrate() {
        return GTSWRegistires.REGISTRATE;
    }

    @Override
    public void initializeAddon() {
        System.out.println("ExampleGTAddon initialized!");
        GTCEu.LOGGER.info("ExampleGTAddon initialized![]");
    }

    @Override
    public String addonModId() {
        return GTSWCore.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        // CustomTagPrefixes.init();
        System.out.println("ExampleGTAddon TagPrefixes initialized!");
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        // CustomRecipes.init(provider);
        System.out.println("ExampleGTAddon Recipes initialized!");
        GTSWRecipes.init(provider);
    }

    // If you have custom ingredient types, uncomment this & change to match your capability.
    // KubeJS WILL REMOVE YOUR RECIPES IF THESE ARE NOT REGISTERED.
    /*
     * public static final ContentJS<Double> PRESSURE_IN = new ContentJS<>(NumberComponent.ANY_DOUBLE,
     * GregitasRecipeCapabilities.PRESSURE, false);
     * public static final ContentJS<Double> PRESSURE_OUT = new ContentJS<>(NumberComponent.ANY_DOUBLE,
     * GregitasRecipeCapabilities.PRESSURE, true);
     * 
     * @Override
     * public void registerRecipeKeys(KJSRecipeKeyEvent event) {
     * event.registerKey(CustomRecipeCapabilities.PRESSURE, Pair.of(PRESSURE_IN, PRESSURE_OUT));
     * }
     */
}
