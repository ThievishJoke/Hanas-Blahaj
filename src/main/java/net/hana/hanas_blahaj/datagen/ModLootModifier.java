package net.hana.hanas_blahaj.datagen;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.hana.hanas_blahaj.util.ModTags;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.TagEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModLootModifier {

    private static final List<Identifier> LOOT_LOCATIONS = List.of(
            Identifier.of("minecraft", "chests/woodland_mansion"),
            Identifier.of("minecraft", "chests/buried_treasure"),
            Identifier.of("minecraft", "chests/abandoned_mineshaft"),
            Identifier.of("minecraft", "chests/shipwreck_supply"),
            Identifier.of("minecraft", "chests/end_city"),
            Identifier.of("minecraft", "chests/ancient_city")
    );

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, id, source) -> {
            if (LOOT_LOCATIONS.contains(id)) {
                LootPool pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(TagEntry.builder(ModTags.Items.PRIDE_BLAHAJ).weight(5))
                        .build();

                tableBuilder.pool(pool);
            }
        });
    }
}