package net.hana.hanas_blahaj.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hana.hanas_blahaj.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.hana.hanas_blahaj.recipe.ModRecipe.createBlahajRecipe;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                List<Item> dye_list = List.of(
                        Items.BLACK_DYE,
                        Items.BLUE_DYE,
                        Items.BROWN_DYE,
                        Items.CYAN_DYE,
                        Items.GRAY_DYE,
                        Items.GREEN_DYE,
                        Items.LIGHT_BLUE_DYE,
                        Items.LIGHT_GRAY_DYE,
                        Items.LIME_DYE,
                        Items.MAGENTA_DYE,
                        Items.ORANGE_DYE,
                        Items.PINK_DYE,
                        Items.PURPLE_DYE,
                        Items.RED_DYE,
                        Items.YELLOW_DYE,
                        Items.WHITE_DYE
                );
                List<Item> colored_blahaj_list = List.of(
                        ModItems.BLACK_BLAHAJ,
                        ModItems.BLAHAJ,
                        ModItems.BROWN_BLAHAJ,
                        ModItems.CYAN_BLAHAJ,
                        ModItems.GRAY_BLAHAJ,
                        ModItems.GREEN_BLAHAJ,
                        ModItems.LIGHT_BLUE_BLAHAJ,
                        ModItems.LIGHT_GRAY_BLAHAJ,
                        ModItems.LIME_BLAHAJ,
                        ModItems.MAGENTA_BLAHAJ,
                        ModItems.ORANGE_BLAHAJ,
                        ModItems.PINK_BLAHAJ,
                        ModItems.PURPLE_BLAHAJ,
                        ModItems.RED_BLAHAJ,
                        ModItems.YELLOW_BLAHAJ,
                        ModItems.WHITE_BLAHAJ
                );

                createBlahajRecipe(RecipeCategory.MISC, ModItems.BLACK_BLAHAJ, Ingredient.ofItem(Items.BLACK_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.BLAHAJ, Ingredient.ofItem(Items.BLUE_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.BROWN_BLAHAJ, Ingredient.ofItem(Items.BROWN_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.CYAN_BLAHAJ, Ingredient.ofItem(Items.CYAN_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);

                createBlahajRecipe(RecipeCategory.MISC, ModItems.GRAY_BLAHAJ, Ingredient.ofItem(Items.GRAY_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.GREEN_BLAHAJ, Ingredient.ofItem(Items.GREEN_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.LIGHT_BLUE_BLAHAJ, Ingredient.ofItem(Items.LIGHT_BLUE_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.LIGHT_GRAY_BLAHAJ, Ingredient.ofItem(Items.LIGHT_GRAY_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);

                createBlahajRecipe(RecipeCategory.MISC, ModItems.LIME_BLAHAJ, Ingredient.ofItem(Items.LIME_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.MAGENTA_BLAHAJ, Ingredient.ofItem(Items.MAGENTA_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.ORANGE_BLAHAJ, Ingredient.ofItem(Items.ORANGE_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.PINK_BLAHAJ, Ingredient.ofItem(Items.PINK_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);;

                createBlahajRecipe(RecipeCategory.MISC, ModItems.PURPLE_BLAHAJ, Ingredient.ofItem(Items.PURPLE_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.RED_BLAHAJ, Ingredient.ofItem(Items.RED_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.YELLOW_BLAHAJ, Ingredient.ofItem(Items.YELLOW_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                createBlahajRecipe(RecipeCategory.MISC, ModItems.WHITE_BLAHAJ, Ingredient.ofItem(Items.WHITE_DYE))
                        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                        .offerTo(exporter);

                offerDyeableRecipes(dye_list, colored_blahaj_list, "colored_blahaj");
            }
        };
    }

    @Override
    public String getName() {
        return "HanasBlahaj Recipes";
    }
}
