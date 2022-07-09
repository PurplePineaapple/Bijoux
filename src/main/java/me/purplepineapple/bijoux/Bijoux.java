package me.purplepineapple.bijoux;

import me.purplepineapple.bijoux.registry.BijouxBlocks;
import me.purplepineapple.bijoux.registry.BijouxItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
// TODO: ORE GENERATION: AQUAMARINE, OPAL, PLATINUM, ROSE QUARTZ, RUBY
// TODO: FIX UPDATECHECKER.JSON
@Mod("bijoux")
public class Bijoux {

    public static final String MOD_ID = "bijoux";

    public Bijoux() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BijouxItems.ITEMS.register(bus);
        BijouxBlocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
