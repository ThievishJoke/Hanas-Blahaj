package net.hana.hanas_blahaj.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, net.hana.hanas_blahaj.HanasBlahaj.MOD_ID);

    public static final Supplier<CreativeModeTab> PLUSHIES = CREATIVE_MODE_TAB.register(
            "plushies",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BLAHAJ.get()))
                    .title(Component.translatable("itemgroup.plushies"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WHITE_BLAHAJ.get());
                        output.accept(ModItems.ORANGE_BLAHAJ.get());
                        output.accept(ModItems.MAGENTA_BLAHAJ.get());
                        output.accept(ModItems.LIGHT_BLUE_BLAHAJ.get());
                        output.accept(ModItems.YELLOW_BLAHAJ.get());
                        output.accept(ModItems.LIME_BLAHAJ.get());
                        output.accept(ModItems.PINK_BLAHAJ.get());
                        output.accept(ModItems.GRAY_BLAHAJ.get());
                        output.accept(ModItems.LIGHT_GRAY_BLAHAJ.get());
                        output.accept(ModItems.CYAN_BLAHAJ.get());
                        output.accept(ModItems.PURPLE_BLAHAJ.get());
                        output.accept(ModItems.BLAHAJ.get());
                        output.accept(ModItems.BROWN_BLAHAJ .get());
                        output.accept(ModItems.GREEN_BLAHAJ.get());
                        output.accept(ModItems.RED_BLAHAJ.get());
                        output.accept(ModItems.BLACK_BLAHAJ.get());

                        output.accept(ModItems.NEON_PINK_BLAHAJ.get());

                        output.accept(ModItems.PRIDE_BLAHAJ.get());
                        output.accept(ModItems.INTERSEX_BLAHAJ.get());
                        output.accept(ModItems.TRANSGENDER_BLAHAJ.get());
                        output.accept(ModItems.DEMIBOY_BLAHAJ.get());
                        output.accept(ModItems.DEMIGIRL_BLAHAJ.get());
                        output.accept(ModItems.GENDERFLUID_BLAHAJ.get());
                        output.accept(ModItems.NON_BINARY_BLAHAJ.get());
                        output.accept(ModItems.POLYGENDER_BLAHAJ.get());
                        output.accept(ModItems.LESBIAN_BLAHAJ.get());
                        output.accept(ModItems.GAY_BLAHAJ.get());
                        output.accept(ModItems.PANSEXUAL_BLAHAJ.get());
                        output.accept(ModItems.BISEXUAL_BLAHAJ.get());
                        output.accept(ModItems.DJUNGELSKOG.get());
                        output.accept(ModItems.SKOGSDUVA.get());
                    }).build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}