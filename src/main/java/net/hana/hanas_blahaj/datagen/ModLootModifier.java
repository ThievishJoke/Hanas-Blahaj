package net.hana.hanas_blahaj.datagen;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.hana.hanas_blahaj.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;


public class ModLootModifier {

    private static final Identifier WOODLAND_MANSION_LOOT = Identifier.of("minecraft", "chests/woodland_mansion");
    private static final Identifier BURIED_TREASURE_LOOT = Identifier.of("minecraft", "chests/buried_treasure");
    private static final Identifier ABANDONED_MINESHAFT_LOOT = Identifier.of("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier SHIPWRECK_TREASURE_LOOT = Identifier.of("minecraft", "chests/shipwreck_treasure");
    private static final Identifier END_CITY_LOOT = Identifier.of("minecraft", "chests/end_city_treasure");
    private static final Identifier ANCIENT_CITY_LOOT = Identifier.of("minecraft", "chests/ancient_city");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (id.equals(WOODLAND_MANSION_LOOT)) {
                LootPool pool = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0F, 1.0F))
                        .with(ItemEntry.builder(ModItems.PRIDE_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.INTERSEX_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.TRANSGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIBOY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIGIRL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GENDERFLUID_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.NON_BINARY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.POLYGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.LESBIAN_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GAY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.PANSEXUAL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.BISEXUAL_BLAHAJ).weight(2))
                        .build();

                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (id.equals(BURIED_TREASURE_LOOT)) {
                LootPool pool = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0F, 1.0F))
                        .with(ItemEntry.builder(ModItems.PRIDE_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.INTERSEX_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.TRANSGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIBOY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIGIRL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GENDERFLUID_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.NON_BINARY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.POLYGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.LESBIAN_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GAY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.PANSEXUAL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.BISEXUAL_BLAHAJ).weight(2))
                        .build();

                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (id.equals(ABANDONED_MINESHAFT_LOOT)) {
                LootPool pool = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0F, 1.0F))
                        .with(ItemEntry.builder(ModItems.PRIDE_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.INTERSEX_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.TRANSGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIBOY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIGIRL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GENDERFLUID_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.NON_BINARY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.POLYGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.LESBIAN_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GAY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.PANSEXUAL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.BISEXUAL_BLAHAJ).weight(2))
                        .build();

                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (id.equals(SHIPWRECK_TREASURE_LOOT)) {
                LootPool pool = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0F, 1.0F))
                        .with(ItemEntry.builder(ModItems.PRIDE_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.INTERSEX_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.TRANSGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIBOY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIGIRL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GENDERFLUID_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.NON_BINARY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.POLYGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.LESBIAN_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GAY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.PANSEXUAL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.BISEXUAL_BLAHAJ).weight(2))
                        .build();

                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (id.equals(END_CITY_LOOT)) {
                LootPool pool = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0F, 1.0F))
                        .with(ItemEntry.builder(ModItems.PRIDE_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.INTERSEX_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.TRANSGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIBOY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIGIRL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GENDERFLUID_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.NON_BINARY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.POLYGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.LESBIAN_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GAY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.PANSEXUAL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.BISEXUAL_BLAHAJ).weight(2))
                        .build();

                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (id.equals(ANCIENT_CITY_LOOT)) {
                LootPool pool = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0F, 1.0F))
                        .with(ItemEntry.builder(ModItems.PRIDE_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.TRANSGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIBOY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.DEMIGIRL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GENDERFLUID_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.NON_BINARY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.POLYGENDER_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.LESBIAN_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.GAY_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.PANSEXUAL_BLAHAJ).weight(2))
                        .with(ItemEntry.builder(ModItems.BISEXUAL_BLAHAJ).weight(2))
                        .build();

                tableBuilder.pool(pool);
            }
        });
    }
}