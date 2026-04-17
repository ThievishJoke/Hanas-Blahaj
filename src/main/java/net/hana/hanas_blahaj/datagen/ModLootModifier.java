package net.hana.hanas_blahaj.datagen;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.hana.hanas_blahaj.util.ModLists;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.List;


public class ModLootModifier {

    private static final Identifier WOODLAND_MANSION_LOOT = Identifier.of("minecraft", "chests/woodland_mansion");
    private static final Identifier BURIED_TREASURE_LOOT = Identifier.of("minecraft", "chests/buried_treasure");
    private static final Identifier ABANDONED_MINESHAFT_LOOT = Identifier.of("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier SHIPWRECK_TREASURE_LOOT = Identifier.of("minecraft", "chests/shipwreck_treasure");
    private static final Identifier END_CITY_LOOT = Identifier.of("minecraft", "chests/end_city_treasure");
    private static final Identifier ANCIENT_CITY_LOOT = Identifier.of("minecraft", "chests/ancient_city");

    List<Identifier> lootTables = List.of(
            WOODLAND_MANSION_LOOT,
            BURIED_TREASURE_LOOT,
            ABANDONED_MINESHAFT_LOOT,
            SHIPWRECK_TREASURE_LOOT,
            END_CITY_LOOT,
            ANCIENT_CITY_LOOT
    );

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {

            if (new ModLootModifier().lootTables.contains(key.getValue())) {

                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0.0f, 1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.40f))
                        ;

                // Flatten lists
                ModLists.lootplush_list.stream()
                        .flatMap(List::stream)
                        .forEach(plushie -> poolBuilder.with(ItemEntry.builder(plushie).weight(2)));

                tableBuilder.pool(poolBuilder);
            }
        });
    }
}