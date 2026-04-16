package net.hana.hanas_blahaj.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(net.hana.hanas_blahaj.HanasBlahaj.MOD_ID);
    //todo asexual, aromantic, demi-sexual and demi-romantic
    public static final DeferredItem<Item> WHITE_BLAHAJ = ITEMS.register("white_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> ORANGE_BLAHAJ = ITEMS.register("orange_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> MAGENTA_BLAHAJ = ITEMS.register("magenta_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> LIGHT_BLUE_BLAHAJ = ITEMS.register("light_blue_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> YELLOW_BLAHAJ = ITEMS.register("yellow_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> LIME_BLAHAJ = ITEMS.register("lime_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> PINK_BLAHAJ = ITEMS.register("pink_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> GRAY_BLAHAJ = ITEMS.register("gray_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> LIGHT_GRAY_BLAHAJ = ITEMS.register("light_gray_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> CYAN_BLAHAJ = ITEMS.register("cyan_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> PURPLE_BLAHAJ = ITEMS.register("purple_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> BLAHAJ = ITEMS.register("blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> BROWN_BLAHAJ = ITEMS.register("brown_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> GREEN_BLAHAJ = ITEMS.register("green_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> RED_BLAHAJ = ITEMS.register("red_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> BLACK_BLAHAJ = ITEMS.register("black_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));

    //neon blahaj
    public static final DeferredItem<Item> NEON_PINK_BLAHAJ = ITEMS.register("neon_pink_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

    //pride blahaj
    public static final DeferredItem<Item> PRIDE_BLAHAJ = ITEMS.register("pride_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> INTERSEX_BLAHAJ = ITEMS.register("intersex_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> TRANSGENDER_BLAHAJ = ITEMS.register("transgender_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> DEMIBOY_BLAHAJ = ITEMS.register("demiboy_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> DEMIGIRL_BLAHAJ = ITEMS.register("demigirl_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> GENDERFLUID_BLAHAJ = ITEMS.register("genderfluid_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> NON_BINARY_BLAHAJ = ITEMS.register("non_binary_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> POLYGENDER_BLAHAJ = ITEMS.register("polygender_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> LESBIAN_BLAHAJ = ITEMS.register("lesbian_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> GAY_BLAHAJ = ITEMS.register("gay_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> PANSEXUAL_BLAHAJ = ITEMS.register("pansexual_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> BISEXUAL_BLAHAJ = ITEMS.register("bisexual_blahaj",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    // Others
    public static final DeferredItem<Item> DJUNGELSKOG = ITEMS.register("djungelskog",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SKOGSDUVA = ITEMS.register("skogsduva",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
