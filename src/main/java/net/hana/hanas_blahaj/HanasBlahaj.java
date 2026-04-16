package net.hana.hanas_blahaj;

import net.hana.hanas_blahaj.datagen.DataGenerators;
import net.hana.hanas_blahaj.item.ModCreativeModeTabs;
import net.hana.hanas_blahaj.item.ModItems;
import net.hana.hanas_blahaj.loot.ModLootModifiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(HanasBlahaj.MOD_ID)
public class HanasBlahaj {
    public static final String MOD_ID = "hanas_blahaj";
    //public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public HanasBlahaj(IEventBus modEventBus) {
        modEventBus.register(DataGenerators.class);
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModLootModifiers.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
