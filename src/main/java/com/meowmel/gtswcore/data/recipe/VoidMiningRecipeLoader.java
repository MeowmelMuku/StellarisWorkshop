package com.meowmel.gtswcore.data.recipe;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.LV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ore;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.toolHeadDrill;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Oilsands;
import static com.meowmel.gtswcore.common.data.GTSWRecipeTypes.VOID_MINER_RECIPES;
import static net.minecraft.world.item.Items.*;

public class VoidMiningRecipeLoader {

    public static void init(Consumer<FinishedRecipe> provider) {
        int duration = 800;
        int EUt = VA[LV];

        // 主世界

        VOID_MINER_RECIPES.recipeBuilder("bronze_drill_mining_1")
                .notConsumable(toolHeadDrill, Bronze)
                .circuitMeta(1)
                .inputFluids(Lubricant.getFluid(1))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(ore, Silver, 2500, 500)
                .chancedOutput(ore, Iron, 2500, 500)
                .chancedOutput(ore, Tin, 2500, 500)
                .chancedOutput(ore, Copper, 2500, 500)
                .chancedOutput(ore, Coal, 5000, 1000)
                .save(provider);

        VOID_MINER_RECIPES.recipeBuilder("bronze_drill_mining_2")
                .notConsumable(toolHeadDrill, Bronze)
                .circuitMeta(2)
                .inputFluids(Lubricant.getFluid(1))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(ore, Diamond, 2500, 500)
                .chancedOutput(ore, Redstone, 2500, 500)
                .chancedOutput(ore, Lapis, 2500, 500)
                .chancedOutput(ore, Salt, 2500, 500)
                .chancedOutput(ore, Gold, 2500, 500)
                .save(provider);

        VOID_MINER_RECIPES.recipeBuilder("bronze_drill_mining_3")
                .notConsumable(toolHeadDrill, Bronze)
                .circuitMeta(3)
                .inputFluids(Lubricant.getFluid(1))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(ore, Lead, 1000, 0)
                .chancedOutput(ore, Nickel, 1000, 0)
                .chancedOutput(ore, Oilsands, 1000, 0)
                .save(provider);

        VOID_MINER_RECIPES.recipeBuilder("bronze_drill_mining_4")
                .notConsumable(toolHeadDrill, Bronze)
                .circuitMeta(4)
                .inputFluids(Lubricant.getFluid(1))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(new ItemStack(CLAY), 5000, 500)
                .chancedOutput(new ItemStack(DIRT), 5000, 500)
                .chancedOutput(new ItemStack(SAND), 5000, 500)
                .chancedOutput(new ItemStack(GRAVEL), 5000, 500)
                .save(provider);

        // 地狱
        EUt *= 4;
        VOID_MINER_RECIPES.recipeBuilder("invar_drill_mining_1")
                .notConsumable(toolHeadDrill, Invar)
                .circuitMeta(1)
                .inputFluids(Lubricant.getFluid(4))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(ore, Sulfur, 5000, 500)
                .chancedOutput(ore, Sphalerite, 5000, 500)
                .chancedOutput(ore, Emerald, 5000, 500)
                .chancedOutput(ore, Molybdenum, 5000, 500)
                .chancedOutput(ore, Barite, 5000, 500)
                .save(provider);

        VOID_MINER_RECIPES.recipeBuilder("invar_drill_mining_2")
                .notConsumable(toolHeadDrill, Invar)
                .circuitMeta(2)
                .inputFluids(Lubricant.getFluid(4))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(ore, Stibnite, 5000, 500)
                .chancedOutput(ore, Tetrahedrite, 5000, 500)
                .chancedOutput(ore, NetherQuartz, 5000, 500)
                .chancedOutput(ore, Quartzite, 5000, 500)
                .chancedOutput(ore, Alunite, 5000, 500)
                .save(provider);

        VOID_MINER_RECIPES.recipeBuilder("invar_drill_mining_3")
                .notConsumable(toolHeadDrill, Invar)
                .circuitMeta(3)
                .inputFluids(Lubricant.getFluid(4))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(new ItemStack(MAGMA_BLOCK), 5000, 500)
                .chancedOutput(new ItemStack(SOUL_SAND), 5000, 500)
                .chancedOutput(new ItemStack(GLOWSTONE), 5000, 500)
                .chancedOutput(new ItemStack(NETHERRACK), 5000, 500)
                .chancedOutput(new ItemStack(BLACKSTONE), 5000, 500)
                .save(provider);

        // 末地
        EUt *= 16;
        duration *= 2;

        VOID_MINER_RECIPES.recipeBuilder("aluminium_drill_mining_1")
                .notConsumable(toolHeadDrill, Aluminium)
                .circuitMeta(1)
                .inputFluids(Lubricant.getFluid(16))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(ore, Aluminium, 5000, 500)
                .chancedOutput(ore, Chromite, 5000, 500)
                .chancedOutput(ore, Gold, 5000, 500)
                .chancedOutput(ore, VanadiumMagnetite, 5000, 500)
                .chancedOutput(ore, Ilmenite, 5000, 500)
                .save(provider);

        VOID_MINER_RECIPES.recipeBuilder("aluminium_drill_mining_2")
                .notConsumable(toolHeadDrill, Aluminium)
                .circuitMeta(2)
                .inputFluids(Lubricant.getFluid(16))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(ore, Cooperite, 5000, 500)
                .chancedOutput(ore, Scheelite, 5000, 500)
                .chancedOutput(ore, Lithium, 5000, 500)
                .chancedOutput(ore, Tungstate, 5000, 500)
                .chancedOutput(ore, Uraninite, 5000, 500)
                .save(provider);

        VOID_MINER_RECIPES.recipeBuilder("aluminium_drill_mining_3")
                .notConsumable(toolHeadDrill, Aluminium)
                .circuitMeta(3)
                .inputFluids(Lubricant.getFluid(16))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(ore, Palladium, 100, 500)
                .chancedOutput(ore, Platinum, 100, 500)
                .chancedOutput(ore, Pitchblende, 5000, 500)
                .chancedOutput(ore, Plutonium239, 100, 500)
                .chancedOutput(ore, Naquadah, 100, 500)
                .save(provider);

        VOID_MINER_RECIPES.recipeBuilder("aluminium_drill_mining_4")
                .notConsumable(toolHeadDrill, Aluminium)
                .circuitMeta(4)
                .inputFluids(Lubricant.getFluid(16))
                .EUt(EUt)
                .duration(duration)
                .chancedOutput(new ItemStack(END_STONE), 5000, 500)
                .chancedOutput(new ItemStack(CHORUS_FRUIT), 5000, 500)
                .chancedOutput(new ItemStack(OBSERVER), 5000, 500)
                .save(provider);
    }
}
