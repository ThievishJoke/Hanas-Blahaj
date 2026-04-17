package net.hana.hanas_blahaj.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hana.hanas_blahaj.util.ModLists;
import net.hana.hanas_blahaj.util.ModTags;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        createBlahajRecipe(exporter, ModLists.dye_list, ModLists.colored_blahaj_list, "colored_blahaj");

        offerPlushDyeableRecipes(exporter, ModLists.dye_list, ModLists.colored_blahaj_list, "dye_colored_blahaj");
    }

    public static void createBlahajRecipe(RecipeExporter exporter, List<Item> dyes, List<Item> colors, String group) {
        for(int i = 0; i < dyes.size(); ++i) {
            Item item = dyes.get(i);
            Item item2 = colors.get(i);
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, item2, 1)
                    .input('W', ItemTags.WOOL)
                    .input('S', Items.STRING)
                    .input('D', item)
                    .pattern(" W ")
                    .pattern("WSW")
                    .pattern("DW ")
                    .group(group)
                    .criterion("has_string", conditionsFromItem(Items.STRING))
                    .criterion("has_wool", conditionsFromTag(ItemTags.WOOL))
                    .criterion("has_dye", conditionsFromItem(item))
                    .offerTo(exporter)
            ;
        }
    }

    public static void offerPlushDyeableRecipes(RecipeExporter exporter, List<Item> dyes, List<Item> dyeables, String group) {
        for(int i = 0; i < dyes.size(); ++i) {
            Item item = dyes.get(i);
            Item item2 = dyeables.get(i);
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, item2)
                    .input(item)
                    .input(Ingredient.ofStacks(dyeables.stream().filter((dyeable) -> !dyeable.equals(item2)).map(ItemStack::new)))
                    .group(group)
                    .criterion("has_dye", conditionsFromItem(item))
                    .criterion("has_blahaj", conditionsFromTag(ModTags.Items.COLORED_BLAHAJ))
                    .offerTo(exporter, "dye_" + RecipeProvider.getItemPath(item2))
            ;
        }
    }
}
