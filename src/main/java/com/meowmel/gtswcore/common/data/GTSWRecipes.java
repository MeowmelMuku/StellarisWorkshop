package com.meowmel.gtswcore.common.data;

import net.minecraft.data.recipes.FinishedRecipe;

import com.meowmel.gtswcore.data.recipe.MiscRecipeLoader;

import java.util.function.Consumer;

public class GTSWRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        MiscRecipeLoader.init(provider);
    }
}
