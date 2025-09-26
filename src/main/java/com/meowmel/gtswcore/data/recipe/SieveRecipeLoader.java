package com.meowmel.gtswcore.data.recipe;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.meowmel.gtswcore.common.data.GTSWItems.*;
import static com.meowmel.gtswcore.common.data.GTSWRecipeTypes.SIEVE_RECIPES;

public class SieveRecipeLoader {
    static List<ItemEntry<ComponentItem>> sieveItems = new ArrayList<>();

    public static void init(Consumer<FinishedRecipe> provider) {
        sieveItems.add(STEEL_SIEVE_NET);
        sieveItems.add(ALUMINIUM_SIEVE_NET);
        sieveItems.add(STAINLESS_STEEL_SIEVE_NET);
        sieveItems.add(TITANIUM_SIEVE_NET);
        sieveItems.add(TUNGSTEN_STEEL_SIEVE_NET);

        createMachineRecipes(provider);
        createSieveRecipes(provider);
    }

    private static void createMachineRecipes(Consumer<FinishedRecipe> provider) {
    }

    private static void createSieveRecipes(Consumer<FinishedRecipe> provider) {
        //沙砾
        createSieveRecipe(provider, new ItemStack(Blocks.GRAVEL), 1, 1, GTMaterials.Cassiterite, GTMaterials.Coal, GTMaterials.Tin, GTMaterials.Galena,
                GTMaterials.Lead, GTMaterials.Silver);
        createSieveRecipe(provider, new ItemStack(Blocks.GRAVEL), 1, 2, GTMaterials.Lepidolite, GTMaterials.RockSalt, GTMaterials.Salt,
                GTMaterials.Soapstone, GTMaterials.Bentonite);
        createSieveRecipe(provider, new ItemStack(Blocks.GRAVEL), 1, 3, GTMaterials.Bauxite, GTMaterials.Kyanite, GTMaterials.Mica,
                GTMaterials.Pollucite, GTMaterials.Glowstone);
        //沙子
        createSieveRecipe(provider, new ItemStack(Blocks.SAND), 1, 1, GTMaterials.Asbestos, GTMaterials.BasalticMineralSand, GTMaterials.CassiteriteSand, GTMaterials.Diatomite,
                GTMaterials.FullersEarth, GTMaterials.GraniticMineralSand, GTMaterials.GarnetSand, GTMaterials.Gypsum);
        createSieveRecipe(provider, new ItemStack(Blocks.SAND), 1, 2, GTMaterials.Almandine, GTMaterials.Amethyst, GTMaterials.GreenSapphire, GTMaterials.Opal,
                GTMaterials.Pyrope, GTMaterials.GarnetRed, GTMaterials.Sapphire, GTMaterials.GarnetYellow);
        createSieveRecipe(provider, new ItemStack(Blocks.SAND), 1, 3, GTMaterials.Oilsands);

        //CRUSHED_DEEPSLATE
        createSieveRecipe(provider, new ItemStack(Blocks.DEEPSLATE), 1, 1, GTMaterials.Chalcopyrite, GTMaterials.Coal,
                GTMaterials.Pyrite, GTMaterials.Cinnabar, GTMaterials.Redstone, GTMaterials.Ruby);
        createSieveRecipe(provider, new ItemStack(Blocks.DEEPSLATE), 1, 2, GTMaterials.Galena, GTMaterials.Diamond,
                GTMaterials.Graphite, GTMaterials.Copper, GTMaterials.Iron, GTMaterials.Pentlandite, GTMaterials.Malachite);
        createSieveRecipe(provider, new ItemStack(Blocks.DEEPSLATE), 1, 3, GTMaterials.Apatite, GTMaterials.Pyrochlore,
                GTMaterials.TricalciumPhosphate, GTMaterials.Magnesite);

        //CRUSHED_BLACKSTONE
        createSieveRecipe(provider, new ItemStack(Blocks.BLACKSTONE), 1, 1, GTMaterials.Cassiterite, GTMaterials.Chalcopyrite,
                GTMaterials.Coal, GTMaterials.Zeolite, GTMaterials.Olivine);

        createSieveRecipe(provider, new ItemStack(Blocks.BLACKSTONE), 1, 2, GTMaterials.Calcite, GTMaterials.Lapis,
                GTMaterials.Lazurite, GTMaterials.Sodalite);

        createSieveRecipe(provider, new ItemStack(Blocks.BLACKSTONE), 1, 3, GTMaterials.Cobaltite, GTMaterials.Garnierite,
                GTMaterials.Nickel, GTMaterials.Pentlandite);

        createSieveRecipe(provider, new ItemStack(Blocks.BLACKSTONE), 1, 4, GTMaterials.GlauconiteSand, GTMaterials.Soapstone,
                GTMaterials.Talc, GTMaterials.Grossular, GTMaterials.Pyrolusite);

        //粉碎地狱岩
        createSieveRecipe(provider, new ItemStack(Blocks.NETHERRACK), 1, 1, GTMaterials.Goethite, GTMaterials.YellowLimonite, GTMaterials.Hematite, GTMaterials.Malachite,
                GTMaterials.Gold, GTMaterials.Stibnite, GTMaterials.Tetrahedrite);
        createSieveRecipe(provider, new ItemStack(Blocks.NETHERRACK), 1, 2, GTMaterials.NetherQuartz, GTMaterials.Pyrite, GTMaterials.Quartzite, GTMaterials.Sphalerite,
                GTMaterials.Sulfur, GTMaterials.Spessartine, GTMaterials.Tantalite);
        createSieveRecipe(provider, new ItemStack(Blocks.NETHERRACK), 1, 3, GTMaterials.Beryllium, GTMaterials.BlueTopaz, GTMaterials.Bornite, GTMaterials.Chalcocite,
                GTMaterials.Emerald, GTMaterials.Glowstone, GTMaterials.Thorium, GTMaterials.Topaz);
        createSieveRecipe(provider, new ItemStack(Blocks.NETHERRACK), 1, 4, GTMaterials.Bastnasite, GTMaterials.Electrotine, GTMaterials.Molybdenite, GTMaterials.Monazite,
                GTMaterials.Neodymium, GTMaterials.Powellite, GTMaterials.Wulfenite);

        //粉碎末地石
        createSieveRecipe(provider, new ItemStack(Blocks.END_STONE), 1, 1, GTMaterials.Aluminium, GTMaterials.Bauxite, GTMaterials.Chromite, GTMaterials.Gold,
                GTMaterials.IlmeniteSlag, GTMaterials.Magnetite, GTMaterials.VanadiumMagnetite);
        createSieveRecipe(provider, new ItemStack(Blocks.END_STONE), 1, 2, GTMaterials.Bornite, GTMaterials.Cooperite, GTMaterials.Scheelite,
                GTMaterials.Tungstate);
        createSieveRecipe(provider, new ItemStack(Blocks.END_STONE), 1, 3, GTMaterials.Naquadah, GTMaterials.Pitchblende, GTMaterials.Plutonium239,
                GTMaterials.Uraninite);

    }

    private static void createSieveRecipe(Consumer<FinishedRecipe> provider, ItemStack input, int tier, int circuit, Material... materials) {
        int booster = 1;
        for (ItemEntry<ComponentItem> wrap : sieveItems) {
            booster++;
            GTRecipeBuilder recipes = SIEVE_RECIPES.recipeBuilder(input.getItem() + "_sieve_to_" + materials[0].getName());
            recipes.EUt(VA[tier])
                    .circuitMeta(circuit)
                    .inputItems(input)
                    .notConsumable(wrap);
            for (Material material : materials)
                recipes.chancedOutput(TagPrefix.rawOre, material, 500 * booster, 500);
            recipes.duration(tier * 20 * materials.length)
                    .save(provider);
        }
    }
}
