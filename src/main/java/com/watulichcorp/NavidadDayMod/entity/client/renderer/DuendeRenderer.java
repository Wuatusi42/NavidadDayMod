package com.watulichcorp.NavidadDayMod.entity.client.renderer;

import com.watulichcorp.NavidadDayMod.NavidadDayMod;
import com.watulichcorp.NavidadDayMod.entity.custom.DuendeEntity;
import com.watulichcorp.NavidadDayMod.entity.client.model.DuendeModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DuendeRenderer extends MobRenderer<DuendeEntity, DuendeModel> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(NavidadDayMod.MODID, "textures/entity/duende.png");

    public DuendeRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new DuendeModel(ctx.bakeLayer(DuendeModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(DuendeEntity entity) {
        return TEXTURE;
    }
}

