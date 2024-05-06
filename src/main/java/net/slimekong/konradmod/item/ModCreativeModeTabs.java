package net.slimekong.konradmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.slimekong.konradmod.KonradMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KonradMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SLIMESTUFF_TAB = CREATIVE_MODE_TABS.register("slimestuff_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SLIMECOIN.get()))
                    .title(Component.translatable("creativetab.slimestuff_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SLIMECOIN.get());
                        pOutput.accept(ModItems.BLUE_SLIME_BALL.get());
                        pOutput.accept(Items.SLIME_BALL);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
