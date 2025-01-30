package net.hana.hanas_blahaj;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hana.hanas_blahaj.datagen.ModItemTagProvider;
import net.hana.hanas_blahaj.datagen.ModRecipeProvider;

public class HanasBlahajDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
    		pack.addProvider(ModItemTagProvider::new);
            pack.addProvider(ModRecipeProvider::new);
    }
}
