package net.hana.hanas_blahaj.util;

import net.hana.hanas_blahaj.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

public class ModLists {
    public List<Item> dye_list = List.of(
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

    public List<DeferredItem<Item>> colored_blahaj_list = List.of(
            ModItems.BLACK_BLAHAJ,
            ModItems.BLAHAJ,
            ModItems.BROWN_BLAHAJ,
            ModItems.CYAN_BLAHAJ,
            ModItems.GRAY_BLAHAJ,
            ModItems.GREEN_BLAHAJ,
            ModItems.LIGHT_BLUE_BLAHAJ,
            ModItems.LIGHT_GRAY_BLAHAJ,
            ModItems.LIME_BLAHAJ,
            ModItems.MAGENTA_BLAHAJ,
            ModItems.ORANGE_BLAHAJ,
            ModItems.PINK_BLAHAJ,
            ModItems.PURPLE_BLAHAJ,
            ModItems.RED_BLAHAJ,
            ModItems.YELLOW_BLAHAJ,
            ModItems.WHITE_BLAHAJ
    );

    public List<DeferredItem<Item>> pride_blahaj_list = List.of(
            ModItems.PRIDE_BLAHAJ,
            ModItems.INTERSEX_BLAHAJ,
            ModItems.TRANSGENDER_BLAHAJ,
            ModItems.DEMIBOY_BLAHAJ,
            ModItems.DEMIGIRL_BLAHAJ,
            ModItems.GENDERFLUID_BLAHAJ,
            ModItems.NON_BINARY_BLAHAJ,
            ModItems.POLYGENDER_BLAHAJ,
            ModItems.LESBIAN_BLAHAJ,
            ModItems.GAY_BLAHAJ,
            ModItems.PANSEXUAL_BLAHAJ,
            ModItems.BISEXUAL_BLAHAJ
    );

    public List<DeferredItem<Item>> otherplush_list = List.of(
            ModItems.DJUNGELSKOG,
            ModItems.SKOGSDUVA
    );

    public List<List<DeferredItem<Item>>> lootplush_list = List.of(
            pride_blahaj_list,
            otherplush_list
    );

    public List<List<DeferredItem<Item>>> allplush_list = List.of(
            colored_blahaj_list,
            pride_blahaj_list,
            otherplush_list
    );
}
