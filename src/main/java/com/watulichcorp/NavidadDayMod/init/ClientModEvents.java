package com.watulichcorp.NavidadDayMod.init;

import com.watulichcorp.NavidadDayMod.NavidadDayMod;
import com.watulichcorp.NavidadDayMod.entity.client.model.DuendeModel;
import com.watulichcorp.NavidadDayMod.entity.client.renderer.DuendeRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NavidadDayMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.DUENDE.get(), DuendeRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DuendeModel.LAYER_LOCATION, DuendeModel::createBodyLayer);
    }
}
