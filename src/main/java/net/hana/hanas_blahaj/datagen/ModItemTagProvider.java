package net.hana.hanas_blahaj.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hana.hanas_blahaj.item.ModItems;
import net.hana.hanas_blahaj.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.BLAHAJ)
                .add(ModItems.WHITE_BLAHAJ)
                .add(ModItems.ORANGE_BLAHAJ)
                .add(ModItems.MAGENTA_BLAHAJ)
                .add(ModItems.LIGHT_BLUE_BLAHAJ)
                .add(ModItems.YELLOW_BLAHAJ)
                .add(ModItems.LIME_BLAHAJ)
                .add(ModItems.PINK_BLAHAJ)
                .add(ModItems.GRAY_BLAHAJ)
                .add(ModItems.LIGHT_GRAY_BLAHAJ)
                .add(ModItems.CYAN_BLAHAJ)
                .add(ModItems.PURPLE_BLAHAJ)
                .add(ModItems.BLAHAJ)
                .add(ModItems.BROWN_BLAHAJ )
                .add(ModItems.GREEN_BLAHAJ)
                .add(ModItems.RED_BLAHAJ)
                .add(ModItems.BLACK_BLAHAJ)
        
                .add(ModItems.NEON_PINK_BLAHAJ)
        
                .add(ModItems.PRIDE_BLAHAJ)
                .add(ModItems.TRANSGENDER_BLAHAJ)
                .add(ModItems.DEMIBOY_BLAHAJ)
                .add(ModItems.DEMIGIRL_BLAHAJ)
                .add(ModItems.GENDERFLUID_BLAHAJ)
                .add(ModItems.NON_BINARY_BLAHAJ)
                .add(ModItems.POLYGENDER_BLAHAJ)
                .add(ModItems.LESBIAN_BLAHAJ)
                .add(ModItems.GAY_BLAHAJ)
                .add(ModItems.PANSEXUAL_BLAHAJ)
                .add(ModItems.BISEXUAL_BLAHAJ);
        getOrCreateTagBuilder(ModTags.Items.PRIDE_BLAHAJ)
                .add(ModItems.PRIDE_BLAHAJ)
                .add(ModItems.TRANSGENDER_BLAHAJ)
                .add(ModItems.DEMIBOY_BLAHAJ)
                .add(ModItems.DEMIGIRL_BLAHAJ)
                .add(ModItems.GENDERFLUID_BLAHAJ)
                .add(ModItems.NON_BINARY_BLAHAJ)
                .add(ModItems.POLYGENDER_BLAHAJ)
                .add(ModItems.LESBIAN_BLAHAJ)
                .add(ModItems.GAY_BLAHAJ)
                .add(ModItems.PANSEXUAL_BLAHAJ)
                .add(ModItems.BISEXUAL_BLAHAJ);
    }
}
