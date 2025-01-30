package net.hana.hanas_blahaj;

import net.fabricmc.api.ModInitializer;
import net.hana.hanas_blahaj.datagen.ModLootModifier;
import net.hana.hanas_blahaj.item.ModItems;
import net.hana.hanas_blahaj.item.ModdItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HanasBlahaj implements ModInitializer {
    public static final String MOD_ID = "hanas_blahaj";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Hanas Blåhaj Mod...");

        ModItems.registerModItems();
        ModdItemGroups.registerCardModItemGroups();
        ModLootModifier.modifyLootTables();
    }
}
