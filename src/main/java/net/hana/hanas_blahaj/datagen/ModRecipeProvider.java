package net.hana.hanas_blahaj.datagen;

import net.hana.hanas_blahaj.HanasBlahaj;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {

        //createBlahajRecipe(ModItems.BLACK_BLAHAJ, Items.BLACK_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.BLAHAJ, Items.BLUE_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.BROWN_BLAHAJ, Items.BROWN_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.CYAN_BLAHAJ, Items.CYAN_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);

        //createBlahajRecipe(ModItems.GRAY_BLAHAJ, Items.GRAY_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.GREEN_BLAHAJ, Items.GREEN_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.LIGHT_BLUE_BLAHAJ, Items.LIGHT_BLUE_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.LIGHT_GRAY_BLAHAJ, Items.LIGHT_GRAY_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);

        //createBlahajRecipe(ModItems.LIME_BLAHAJ, Items.LIME_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.MAGENTA_BLAHAJ, Items.MAGENTA_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.ORANGE_BLAHAJ, Items.ORANGE_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.PINK_BLAHAJ, Items.PINK_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);;

        //createBlahajRecipe(ModItems.PURPLE_BLAHAJ, Items.PURPLE_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.RED_BLAHAJ, Items.RED_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.YELLOW_BLAHAJ, Items.YELLOW_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);
        //createBlahajRecipe(ModItems.WHITE_BLAHAJ, Items.WHITE_DYE)
        //        .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
        //        .offerTo(exporter);

        //colorBlockWithDye(exporter, dye_list, colored_blahaj_list, "colored_blahaj");

    }

    private void createBlahajRecipe(RecipeOutput out, ItemLike result, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern(" W ")
                .pattern("WSW")
                .pattern("DW ")
                .define('W', ItemTags.WOOL)
                .define('S', net.minecraft.world.item.Items.STRING)
                .define('D', input)
                .unlockedBy("has_string", has(net.minecraft.world.item.Items.STRING))
                .save(out);
    }

    private void createSquishRecipe(RecipeOutput out, ItemLike result, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("   ")
                .pattern("WSW")
                .pattern("D  ")
                .define('W', ItemTags.WOOL)
                .define('S', net.minecraft.world.item.Items.STRING)
                .define('D', input)
                .unlockedBy("has_string", has(net.minecraft.world.item.Items.STRING))
                .save(out);
    }

    private static ResourceLocation modId(String path) {
        return ResourceLocation.fromNamespaceAndPath(HanasBlahaj.MOD_ID, path);
    }
}
