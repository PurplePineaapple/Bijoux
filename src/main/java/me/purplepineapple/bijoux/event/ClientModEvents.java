package me.purplepineapple.bijoux.event;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.entity.BijouxEntityTypes;
import me.purplepineapple.bijoux.entity.model.ClamEntityModel;
import me.purplepineapple.bijoux.entity.renderer.ClamEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bijoux.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ClamEntityModel.LAYER_LOCATION, ClamEntityModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(BijouxEntityTypes.CLAM.get(), ClamEntityRenderer::new);
    }
}
