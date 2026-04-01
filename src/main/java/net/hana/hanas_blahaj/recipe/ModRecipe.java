package net.hana.hanas_blahaj.recipe;

import net.hana.hanas_blahaj.HanasBlahaj;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class ModRecipe {
    protected RegistryWrapper.WrapperLookup registries;
    private static RegistryEntryLookup<Item> itemLookup;
    protected RecipeExporter exporter;

    protected void RecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        this.registries = registries;
        itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
        this.exporter = exporter;
    }

    public static CraftingRecipeJsonBuilder createExampleRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(, RecipeCategory.MISC, output, 1)
                .input('W', ItemTags.WOOL)
                .input('S', Items.STRING)
                .input('D', input)
                .pattern(" W ")
                .pattern("WSW")
                .pattern("DW ");
    }

    public static CraftingRecipeJsonBuilder createBlahajRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return createShapedPlush(category, output)
                .input('W', ItemTags.WOOL)
                .input('S', Items.STRING)
                .input('D', input)
                .pattern(" W ")
                .pattern("WSW")
                .pattern("DW ");
    }

    public CraftingRecipeJsonBuilder createSquishRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return createShapedPlush(category, output)
                .input('W', ItemTags.WOOL)
                .input('S', Items.STRING)
                .input('D', input)
                .pattern("   ")
                .pattern("WSW")
                .pattern("D  ");
    }

    public static ShapedRecipeJsonBuilder createShapedPlush(RecipeCategory category, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create(itemLookup, category, output);
    }
}
