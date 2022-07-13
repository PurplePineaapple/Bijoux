package me.purplepineapple.bijoux;

import me.purplepineapple.bijoux.block.BijouxBlocks;
import me.purplepineapple.bijoux.entity.BijouxEntityTypes;
import me.purplepineapple.bijoux.item.BijouxItems;
import me.purplepineapple.bijoux.villager.BijouxVillagers;
import net.minecraft.world.entity.ai.attributes.DefaultAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("bijoux")
public class Bijoux {

    public static final String MOD_ID = "bijoux";

    public Bijoux() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BijouxItems.ITEMS.register(bus);
        BijouxBlocks.BLOCKS.register(bus);
        BijouxVillagers.register(bus);
        BijouxEntityTypes.ENTITY_TYPES.register(bus);

        bus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
           BijouxVillagers.registerPOIs();
           DefaultAttributes.hasSupplier(BijouxEntityTypes.CLAM.get());
        });
    }
}
