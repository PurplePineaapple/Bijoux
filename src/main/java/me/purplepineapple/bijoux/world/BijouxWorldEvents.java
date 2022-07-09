package me.purplepineapple.bijoux.world;

import com.google.common.eventbus.Subscribe;
import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.world.feature.BijouxOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bijoux.MOD_ID)
public class BijouxWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        System.out.println(event.getName());
        BijouxOreGeneration.generateOres(event);
    }
}
