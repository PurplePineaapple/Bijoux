package me.purplepineapple.bijoux;

import me.purplepineapple.bijoux.core.registry.RegisterItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("bijoux")
public class Bijoux {

    public static final String MOD_ID = "bijoux";

    public Bijoux() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        RegisterItems.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
