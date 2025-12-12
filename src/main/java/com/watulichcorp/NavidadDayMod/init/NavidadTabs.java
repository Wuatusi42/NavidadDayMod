package com.watulichcorp.NavidadDayMod.init;

import com.watulichcorp.NavidadDayMod.NavidadDayMod;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NavidadDayMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NavidadTabs {

    @SubscribeEvent
    public static void addItemsToTabs(BuildCreativeModeTabContentsEvent event) {

        // Ingredientes
        if (event.getTabKey().equals(CreativeModeTabs.INGREDIENTS)) {
            event.accept(InitItems.BASTCARAMEL.get());   // CORREGIDO
        }

        // Huevos de spawneo
        if (event.getTabKey().equals(CreativeModeTabs.SPAWN_EGGS)) {
            event.accept(ModItems.DUENDE_SPAWN_EGG.get());   // CORREGIDO
        }
    }
}
