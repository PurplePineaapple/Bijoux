package me.purplepineapple.bijoux.entity;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.entity.entities.ClamEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BijouxEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            Bijoux.MOD_ID);

    public static final RegistryObject<EntityType<ClamEntity>> CLAM = ENTITY_TYPES.register("clam", () ->
            EntityType.Builder.of(ClamEntity::new, MobCategory.WATER_CREATURE).sized(1F, 0.5F)
                    .build(new ResourceLocation(Bijoux.MOD_ID, "clam").toString()));




}
