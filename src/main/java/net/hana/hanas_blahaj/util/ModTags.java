package net.hana.hanas_blahaj.util;

import net.hana.hanas_blahaj.HanasBlahaj;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> BLAHAJ = createTag("blahaj");
        public static final TagKey<Item> PRIDE_BLAHAJ = createTag("pride_blahaj");
        public static final TagKey<Item> OTHER_PLUSHIES = createTag("other_plushies");
        public static final TagKey<Item> ALL_PLUSHIES = createTag("all_plushies");


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(HanasBlahaj.MOD_ID, name));
        }
    }
}
