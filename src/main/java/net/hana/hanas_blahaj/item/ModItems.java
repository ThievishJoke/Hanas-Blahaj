package net.hana.hanas_blahaj.item;

import net.hana.hanas_blahaj.HanasBlahaj;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    //todo asexual, aromantic, demi-sexual and demi-romantic
    public static final Item WHITE_BLAHAJ = registerItem("white_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "white_blahaj")))));
    public static final Item ORANGE_BLAHAJ = registerItem("orange_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "orange_blahaj")))));
    public static final Item MAGENTA_BLAHAJ = registerItem("magenta_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "magenta_blahaj")))));
    public static final Item LIGHT_BLUE_BLAHAJ = registerItem("light_blue_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "light_blue_blahaj")))));
    public static final Item YELLOW_BLAHAJ = registerItem("yellow_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "yellow_blahaj")))));
    public static final Item LIME_BLAHAJ = registerItem("lime_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "lime_blahaj")))));
    public static final Item PINK_BLAHAJ = registerItem("pink_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "pink_blahaj")))));
    public static final Item GRAY_BLAHAJ = registerItem("gray_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "gray_blahaj")))));
    public static final Item LIGHT_GRAY_BLAHAJ = registerItem("light_gray_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "light_gray_blahaj")))));
    public static final Item CYAN_BLAHAJ = registerItem("cyan_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "cyan_blahaj")))));
    public static final Item PURPLE_BLAHAJ = registerItem("purple_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "purple_blahaj")))));
    public static final Item BLAHAJ = registerItem("blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "blahaj")))));
    public static final Item BROWN_BLAHAJ = registerItem("brown_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "brown_blahaj")))));
    public static final Item GREEN_BLAHAJ = registerItem("green_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "green_blahaj")))));
    public static final Item RED_BLAHAJ = registerItem("red_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "red_blahaj")))));
    public static final Item BLACK_BLAHAJ = registerItem("black_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.COMMON)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "black_blahaj")))));

    //neon blahaj
    public static final Item NEON_PINK_BLAHAJ = registerItem("neon_pink_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "neon_pink_blahaj")))));

    //pride blahaj
    public static final Item PRIDE_BLAHAJ = registerItem("pride_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "pride_blahaj")))));
    public static final Item INTERSEX_BLAHAJ = registerItem("intersex_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "intersex_blahaj")))));
    public static final Item TRANSGENDER_BLAHAJ = registerItem("transgender_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "transgender_blahaj")))));
    public static final Item DEMIBOY_BLAHAJ = registerItem("demiboy_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "demiboy_blahaj")))));
    public static final Item DEMIGIRL_BLAHAJ = registerItem("demigirl_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "demigirl_blahaj")))));
    public static final Item GENDERFLUID_BLAHAJ = registerItem("genderfluid_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "genderfluid_blahaj")))));
    public static final Item NON_BINARY_BLAHAJ = registerItem("non_binary_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "non_binary_blahaj")))));
    public static final Item POLYGENDER_BLAHAJ = registerItem("polygender_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "polygender_blahaj")))));
    public static final Item LESBIAN_BLAHAJ = registerItem("lesbian_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "lesbian_blahaj")))));
    public static final Item GAY_BLAHAJ = registerItem("gay_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "gay_blahaj")))));
    public static final Item PANSEXUAL_BLAHAJ = registerItem("pansexual_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "pansexual_blahaj")))));
    public static final Item BISEXUAL_BLAHAJ = registerItem("bisexual_blahaj",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "bisexual_blahaj")))));

    // Others
    public static final Item DJUNGELSKOG = registerItem("djungelskog",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "djungelskog")))));
    public static final Item SKOGSDUVA = registerItem("skogsduva",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HanasBlahaj.MOD_ID, "skogsduva")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HanasBlahaj.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HanasBlahaj.LOGGER.info("Registering Mod Items for " + HanasBlahaj.MOD_ID);
    }
}
