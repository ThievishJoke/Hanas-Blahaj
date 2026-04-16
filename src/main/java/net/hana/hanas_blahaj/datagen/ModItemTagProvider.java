package net.hana.hanas_blahaj.datagen;

import net.hana.hanas_blahaj.HanasBlahaj;
import net.hana.hanas_blahaj.item.ModItems;
import net.hana.hanas_blahaj.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, HanasBlahaj.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(ModTags.Items.BLAHAJ)
                .add(ModItems.WHITE_BLAHAJ.get())
                .add(ModItems.ORANGE_BLAHAJ.get())
                .add(ModItems.MAGENTA_BLAHAJ.get())
                .add(ModItems.LIGHT_BLUE_BLAHAJ.get())
                .add(ModItems.YELLOW_BLAHAJ.get())
                .add(ModItems.LIME_BLAHAJ.get())
                .add(ModItems.PINK_BLAHAJ.get())
                .add(ModItems.GRAY_BLAHAJ.get())
                .add(ModItems.LIGHT_GRAY_BLAHAJ.get())
                .add(ModItems.CYAN_BLAHAJ.get())
                .add(ModItems.PURPLE_BLAHAJ.get())
                .add(ModItems.BLAHAJ.get())
                .add(ModItems.BROWN_BLAHAJ .get())
                .add(ModItems.GREEN_BLAHAJ.get())
                .add(ModItems.RED_BLAHAJ.get())
                .add(ModItems.BLACK_BLAHAJ.get())

                .add(ModItems.NEON_PINK_BLAHAJ.get())

                .add(ModItems.PRIDE_BLAHAJ.get())
                .add(ModItems.INTERSEX_BLAHAJ.get())
                .add(ModItems.TRANSGENDER_BLAHAJ.get())
                .add(ModItems.DEMIBOY_BLAHAJ.get())
                .add(ModItems.DEMIGIRL_BLAHAJ.get())
                .add(ModItems.GENDERFLUID_BLAHAJ.get())
                .add(ModItems.NON_BINARY_BLAHAJ.get())
                .add(ModItems.POLYGENDER_BLAHAJ.get())
                .add(ModItems.LESBIAN_BLAHAJ.get())
                .add(ModItems.GAY_BLAHAJ.get())
                .add(ModItems.PANSEXUAL_BLAHAJ.get())
                .add(ModItems.BISEXUAL_BLAHAJ.get())
        ;
        tag(ModTags.Items.PRIDE_BLAHAJ)
                .add(ModItems.PRIDE_BLAHAJ.get())
                .add(ModItems.INTERSEX_BLAHAJ.get())
                .add(ModItems.TRANSGENDER_BLAHAJ.get())
                .add(ModItems.DEMIBOY_BLAHAJ.get())
                .add(ModItems.DEMIGIRL_BLAHAJ.get())
                .add(ModItems.GENDERFLUID_BLAHAJ.get())
                .add(ModItems.NON_BINARY_BLAHAJ.get())
                .add(ModItems.POLYGENDER_BLAHAJ.get())
                .add(ModItems.LESBIAN_BLAHAJ.get())
                .add(ModItems.GAY_BLAHAJ.get())
                .add(ModItems.PANSEXUAL_BLAHAJ.get())
                .add(ModItems.BISEXUAL_BLAHAJ.get())
        ;
        tag(ModTags.Items.OTHER_PLUSHIES)
                .add(ModItems.DJUNGELSKOG.get())
                .add(ModItems.SKOGSDUVA.get())
        ;
        tag(ModTags.Items.ALL_PLUSHIES)
                .addTag(ModTags.Items.BLAHAJ)
                .addTag(ModTags.Items.OTHER_PLUSHIES)
        ;
    }
}