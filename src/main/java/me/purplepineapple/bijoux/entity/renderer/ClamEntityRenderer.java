package me.purplepineapple.bijoux.entity.renderer;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.entity.entities.ClamEntity;
import me.purplepineapple.bijoux.entity.model.ClamEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ClamEntityRenderer<T extends ClamEntity> extends MobRenderer<T, ClamEntityModel<T>> {

    public static final ResourceLocation CLAM = new ResourceLocation(Bijoux.MOD_ID,
            "textures/entity/clam.png");

    public ClamEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new ClamEntityModel<>(context.bakeLayer(ClamEntityModel.LAYER_LOCATION)), 1.0F);
    }

    @Override
    public ResourceLocation getTextureLocation(ClamEntity entity) {
        return CLAM;
    }

}
