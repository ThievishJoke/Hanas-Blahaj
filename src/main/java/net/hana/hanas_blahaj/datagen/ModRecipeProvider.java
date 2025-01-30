package net.hana.hanas_blahaj.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hana.hanas_blahaj.item.ModItems;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static CraftingRecipeJsonBuilder createBlahajRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .input('W', ItemTags.WOOL)
                .input('S', Items.STRING)
                .input('D', input)
                .pattern(" W ")
                .pattern("WSW")
                .pattern("DW ")
                .criterion(hasItem(input), conditionsFromItem(input));
    }

    @Override
    public void generate(RecipeExporter exporter) {
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
                ModItems.WHITE_BLAHAJ,
                ModItems.ORANGE_BLAHAJ,
                ModItems.MAGENTA_BLAHAJ,
                ModItems.LIGHT_BLUE_BLAHAJ,
                ModItems.YELLOW_BLAHAJ,
                ModItems.LIME_BLAHAJ,
                ModItems.PINK_BLAHAJ,
                ModItems.GRAY_BLAHAJ,
                ModItems.LIGHT_GRAY_BLAHAJ,
                ModItems.CYAN_BLAHAJ,
                ModItems.PURPLE_BLAHAJ,
                ModItems.BLAHAJ,
                ModItems.BROWN_BLAHAJ,
                ModItems.GREEN_BLAHAJ,
                ModItems.RED_BLAHAJ,
                ModItems.BLACK_BLAHAJ
        );

        for (int i = 0; i < dye_list.size(); i++) {
            createBlahajRecipe(exporter, colored_blahaj_list.get(i), dye_list.get(i));
        }

        offerDyeableRecipes(exporter, dye_list, colored_blahaj_list, "colored_blahaj");
    }
}
