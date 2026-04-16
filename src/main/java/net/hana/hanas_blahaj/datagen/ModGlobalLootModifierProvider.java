package net.hana.hanas_blahaj.datagen;

import net.hana.hanas_blahaj.HanasBlahaj;
import net.hana.hanas_blahaj.loot.AddItemModifier;
import net.hana.hanas_blahaj.util.ModLists;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, HanasBlahaj.MOD_ID);
    }

    private static final ResourceLocation WOODLAND_MANSION_LOOT = ResourceLocation.withDefaultNamespace("chests/woodland_mansion");
    private static final ResourceLocation BURIED_TREASURE_LOOT = ResourceLocation.withDefaultNamespace("chests/buried_treasure");
    private static final ResourceLocation ABANDONED_MINESHAFT_LOOT = ResourceLocation.withDefaultNamespace("chests/abandoned_mineshaft");
    private static final ResourceLocation SHIPWRECK_TREASURE_LOOT = ResourceLocation.withDefaultNamespace("chests/shipwreck_treasure");
    private static final ResourceLocation END_CITY_LOOT = ResourceLocation.withDefaultNamespace("chests/end_city_treasure");
    private static final ResourceLocation ANCIENT_CITY_LOOT = ResourceLocation.withDefaultNamespace("chests/ancient_city");

    List<ResourceLocation> lootTables = List.of(
            WOODLAND_MANSION_LOOT,
            BURIED_TREASURE_LOOT,
            ABANDONED_MINESHAFT_LOOT,
            SHIPWRECK_TREASURE_LOOT,
            END_CITY_LOOT,
            ANCIENT_CITY_LOOT
    );

    @Override
    protected void start() {
        List<Item> allPlushies = new ModLists().lootplush_list.stream()
                .flatMap(List::stream)      // Flatten List<List<DeferredItem>> to Stream<DeferredItem>
                .map(DeferredItem::get)     // Convert DeferredItem to Item
                .toList();

        for (ResourceLocation lootTable : lootTables) {
            String name = "random_plush_from_" + lootTable.getPath().replace("chests/", "");

            this.add(name,
                    new AddItemModifier(new LootItemCondition[]{
                            new LootTableIdCondition.Builder(lootTable).build(),
                            LootItemRandomChanceCondition.randomChance(0.40f).build()
                    }, allPlushies)
            );
        }

        // Debug
        //    System.out.println("=== Modified Loot Tables for " + HanasBlahaj.MOD_ID + " ===");
        //    System.out.println("Total unique plushies available in loot: " + allPlushies.size());
    }
}