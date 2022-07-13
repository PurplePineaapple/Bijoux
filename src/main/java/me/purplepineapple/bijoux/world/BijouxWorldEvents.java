package me.purplepineapple.bijoux.world;

 import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.world.feature.generation.BijouxOreGeneration;
 import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bijoux.MOD_ID)
public class BijouxWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {



        BijouxOreGeneration.generateOres(event);
    }
}
