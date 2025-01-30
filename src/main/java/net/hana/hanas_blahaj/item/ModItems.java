package net.hana.hanas_blahaj.item;

import net.hana.hanas_blahaj.HanasBlahaj;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item WHITE_BLAHAJ = registerItem("white_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item ORANGE_BLAHAJ = registerItem("orange_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item MAGENTA_BLAHAJ = registerItem("magenta_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item LIGHT_BLUE_BLAHAJ = registerItem("light_blue_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item YELLOW_BLAHAJ = registerItem("yellow_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item LIME_BLAHAJ = registerItem("lime_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item PINK_BLAHAJ = registerItem("pink_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item GRAY_BLAHAJ = registerItem("gray_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item LIGHT_GRAY_BLAHAJ = registerItem("light_gray_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item CYAN_BLAHAJ = registerItem("cyan_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item PURPLE_BLAHAJ = registerItem("purple_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item BLAHAJ = registerItem("blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item BROWN_BLAHAJ = registerItem("brown_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item GREEN_BLAHAJ = registerItem("green_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item RED_BLAHAJ = registerItem("red_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item BLACK_BLAHAJ = registerItem("black_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));

    //neon blahaj
    public static final Item NEON_PINK_BLAHAJ = registerItem("neon_pink_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));

    //pride blahaj
    public static final Item PRIDE_BLAHAJ = registerItem("pride_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item TRANSGENDER_BLAHAJ = registerItem("transgender_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item DEMIBOY_BLAHAJ = registerItem("demiboy_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item DEMIGIRL_BLAHAJ = registerItem("demigirl_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item GENDERFLUID_BLAHAJ = registerItem("genderfluid_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item NON_BINARY_BLAHAJ = registerItem("non_binary_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item POLYGENDER_BLAHAJ = registerItem("polygender_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item LESBIAN_BLAHAJ = registerItem("lesbian_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item GAY_BLAHAJ = registerItem("gay_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item PANSEXUAL_BLAHAJ = registerItem("pansexual_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item BISEXUAL_BLAHAJ = registerItem("bisexual_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HanasBlahaj.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HanasBlahaj.LOGGER.info("Registering Mod Items for " + HanasBlahaj.MOD_ID);
    }
}
