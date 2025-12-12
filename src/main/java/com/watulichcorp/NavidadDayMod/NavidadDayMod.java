package com.watulichcorp.NavidadDayMod;

import com.watulichcorp.NavidadDayMod.init.InitItems;
import com.watulichcorp.NavidadDayMod.init.ModEntities;
import com.watulichcorp.NavidadDayMod.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NavidadDayMod.MODID)
public class NavidadDayMod {
    public static final String MODID = "navidaddaymod";

    public NavidadDayMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntities.ENTITIES.register(bus);
        InitItems.ITEMS.register(bus);
        ModItems.ITEMS.register(bus);  // FALTABA ESTO

    }
}
