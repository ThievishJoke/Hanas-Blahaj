package net.hana.hanas_blahaj.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hana.hanas_blahaj.HanasBlahaj;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModdItemGroups {
    public static final ItemGroup BLAHAJ = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasBlahaj.MOD_ID, "blahaj"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blahaj"))
                    .icon(() -> new ItemStack(ModItems.BLAHAJ)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WHITE_BLAHAJ);
                        entries.add(ModItems.ORANGE_BLAHAJ);
                        entries.add(ModItems.MAGENTA_BLAHAJ);
                        entries.add(ModItems.LIGHT_BLUE_BLAHAJ);
                        entries.add(ModItems.YELLOW_BLAHAJ);
                        entries.add(ModItems.LIME_BLAHAJ);
                        entries.add(ModItems.PINK_BLAHAJ);
                        entries.add(ModItems.GRAY_BLAHAJ);
                        entries.add(ModItems.LIGHT_GRAY_BLAHAJ);
                        entries.add(ModItems.CYAN_BLAHAJ);
                        entries.add(ModItems.PURPLE_BLAHAJ);
                        entries.add(ModItems.BLAHAJ);
                        entries.add(ModItems.BROWN_BLAHAJ );
                        entries.add(ModItems.GREEN_BLAHAJ);
                        entries.add(ModItems.RED_BLAHAJ);
                        entries.add(ModItems.BLACK_BLAHAJ);

                        entries.add(ModItems.NEON_PINK_BLAHAJ);

                        entries.add(ModItems.PRIDE_BLAHAJ);
                        entries.add(ModItems.INTERSEX_BLAHAJ);
                        entries.add(ModItems.TRANSGENDER_BLAHAJ);
                        entries.add(ModItems.DEMIBOY_BLAHAJ);
                        entries.add(ModItems.DEMIGIRL_BLAHAJ);
                        entries.add(ModItems.GENDERFLUID_BLAHAJ);
                        entries.add(ModItems.NON_BINARY_BLAHAJ);
                        entries.add(ModItems.POLYGENDER_BLAHAJ);
                        entries.add(ModItems.LESBIAN_BLAHAJ);
                        entries.add(ModItems.GAY_BLAHAJ);
                        entries.add(ModItems.PANSEXUAL_BLAHAJ);
                        entries.add(ModItems.BISEXUAL_BLAHAJ);

                    }).build());

    public static void registerCardModItemGroups() {
        HanasBlahaj.LOGGER.info("Registering Item Groups for " + HanasBlahaj.MOD_ID);
    }
}
