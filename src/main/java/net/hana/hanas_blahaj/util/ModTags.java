package net.hana.hanas_blahaj.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import static net.hana.hanas_blahaj.HanasBlahaj.MOD_ID;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> BLAHAJ =
                    createTag("blahaj");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name));
        }
    }
}
