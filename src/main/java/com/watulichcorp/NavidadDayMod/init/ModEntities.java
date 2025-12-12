package com.watulichcorp.NavidadDayMod.init;


import com.watulichcorp.NavidadDayMod.NavidadDayMod;
import com.watulichcorp.NavidadDayMod.entity.custom.DuendeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NavidadDayMod.MODID);

    public static final RegistryObject<EntityType<DuendeEntity>> DUENDE =
            ENTITIES.register("duende",
                    () -> EntityType.Builder.of(DuendeEntity::new, MobCategory.CREATURE)
                            .sized(0.6f, 1.4f)
                            .build(new ResourceLocation(NavidadDayMod.MODID, "duende").toString()));
}
