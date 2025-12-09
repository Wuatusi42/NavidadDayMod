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
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(InitItems.BASTCARAMEL);
        }
    }
}
