package me.purplepineapple.bijoux.event;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.entity.BijouxEntityTypes;
import me.purplepineapple.bijoux.entity.entities.ClamEntity;
import me.purplepineapple.bijoux.item.items.BijouxSpawnEggItem;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bijoux.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(BijouxEntityTypes.CLAM.get(), ClamEntity.createAttributes().build());
    }


    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        BijouxSpawnEggItem.registerSpawnEggs();
    }
}
