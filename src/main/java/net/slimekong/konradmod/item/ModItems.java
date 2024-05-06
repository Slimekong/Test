package net.slimekong.konradmod.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.slimekong.konradmod.KonradMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KonradMod.MOD_ID);


    public static final RegistryObject<Item> SLIMECOIN = ITEMS.register("slimecoin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_SLIME_BALL = ITEMS.register("blue_slime_ball",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
