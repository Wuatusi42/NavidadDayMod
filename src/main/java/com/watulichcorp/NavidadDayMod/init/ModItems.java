package com.watulichcorp.NavidadDayMod.init;

import com.watulichcorp.NavidadDayMod.NavidadDayMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.common.ForgeSpawnEggItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NavidadDayMod.MODID);

    public static final RegistryObject<Item> DUENDE_SPAWN_EGG =
            ITEMS.register("duende_spawn_egg",
                    () -> new ForgeSpawnEggItem(
                            ModEntities.DUENDE, // NO llames .get()
                            0x2ECC71,
                            0x145A32,
                            new Item.Properties()
                    )
            );
}
