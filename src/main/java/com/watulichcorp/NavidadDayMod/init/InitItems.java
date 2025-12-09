package com.watulichcorp.NavidadDayMod.init;

import com.watulichcorp.NavidadDayMod.NavidadDayMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NavidadDayMod.MODID);

    public  static final RegistryObject<Item> BASTCARAMEL = ITEMS.register("baston_caramelo",
            () -> new Item(new Item.Properties()
                    .fireResistant()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.3f)
                            .build())));
}
