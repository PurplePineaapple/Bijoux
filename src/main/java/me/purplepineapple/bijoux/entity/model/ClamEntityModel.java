package me.purplepineapple.bijoux.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.entity.entities.ClamEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class ClamEntityModel<T extends ClamEntity> extends EntityModel<T> {

    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Bijoux.MOD_ID, "clam"), "clam");
    private final ModelPart layer1;
    private final ModelPart layer2;
    private final ModelPart layer3;
    private final ModelPart pearl;
    private final ModelPart layer4;
    private final ModelPart layer5;
    private final ModelPart layer6;

    public ClamEntityModel(ModelPart root) {
        this.layer1 = root.getChild("layer1");
        this.layer2 = root.getChild("layer2");
        this.layer3 = root.getChild("layer3");
        this.pearl = root.getChild("pearl");
        this.layer4 = root.getChild("layer4");
        this.layer5 = root.getChild("layer5");
        this.layer6 = root.getChild("layer6");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition layer1 = partdefinition.addOrReplaceChild("layer1", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 24).addBox(-2.0F, -6.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 26).addBox(-2.0F, -6.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(25, 9).addBox(-3.0F, -6.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(-4.0F, -6.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(21, 17).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(25, 11).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(29, 32).addBox(-2.0F, -6.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 29.0F, 0.0F));

        PartDefinition layer2 = partdefinition.addOrReplaceChild("layer2", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, 0.0F));

        PartDefinition layer1_r1 = layer2.addOrReplaceChild("layer1_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-2.0F, -10.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 20).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 14).addBox(-5.0F, -10.0F, -3.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(-6.0F, -10.0F, -1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 31).addBox(-1.0F, -10.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 2).addBox(-6.0F, -10.0F, 0.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 12).addBox(-5.0F, -10.0F, 1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 20).addBox(-4.0F, -10.0F, 2.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(25, 1).addBox(-3.0F, -10.0F, 3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 26).addBox(-2.0F, -10.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

        PartDefinition bone2 = layer2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition layer3 = partdefinition.addOrReplaceChild("layer3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = layer3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 7).addBox(-3.0F, -2.0F, 4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 0).addBox(3.0F, -2.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 38).addBox(4.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(34, 37).addBox(5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(17, 28).addBox(6.0F, -2.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(37, 30).addBox(5.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(17, 37).addBox(4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 19).addBox(2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 35).addBox(-4.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 30).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 37).addBox(-5.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(9, 37).addBox(-6.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 26).addBox(-7.0F, -2.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(31, 36).addBox(-6.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 36).addBox(-5.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

        PartDefinition cube_r2 = layer3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 37).addBox(-4.0F, -4.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 34).addBox(-1.0F, -4.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

        PartDefinition pearl = partdefinition.addOrReplaceChild("pearl", CubeListBuilder.create().texOffs(8, 34).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition layer4 = partdefinition.addOrReplaceChild("layer4", CubeListBuilder.create().texOffs(24, 38).addBox(-5.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 38).addBox(-6.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 35).addBox(-1.0F, -4.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 16).addBox(-4.0F, -4.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 30).addBox(-7.0F, -4.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(38, 14).addBox(-6.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 12).addBox(-5.0F, -4.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 30).addBox(-2.0F, -4.0F, -6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 28).addBox(-4.0F, -4.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 21).addBox(2.0F, -4.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 10).addBox(4.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 8).addBox(5.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 29).addBox(6.0F, -4.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(38, 6).addBox(5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 4).addBox(4.0F, -4.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 33).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(38, 2).addBox(3.0F, -4.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(21, 19).addBox(-3.0F, -4.0F, 4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition layer5 = partdefinition.addOrReplaceChild("layer5", CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, -5.0F, 1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(21, 36).addBox(-1.0F, -5.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 33).addBox(-2.0F, -5.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 34).addBox(-2.0F, -5.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 22).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-6.0F, -5.0F, 0.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 18).addBox(-5.0F, -5.0F, -3.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 8).addBox(-6.0F, -5.0F, -1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 24).addBox(-3.0F, -5.0F, 3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 24).addBox(-4.0F, -5.0F, 2.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 10).addBox(-6.0F, -5.0F, -2.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition layer6 = partdefinition.addOrReplaceChild("layer6", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition layer8_r1 = layer6.addOrReplaceChild("layer8_r1", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(25, 3).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(21, 15).addBox(-4.0F, -8.0F, -2.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(21, 13).addBox(-4.0F, -8.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(25, 5).addBox(-3.0F, -8.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(-2.0F, -8.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 28).addBox(-2.0F, -8.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(-1.0F, -8.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        layer1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        layer2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        layer3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        pearl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        layer4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        layer5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        layer6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}
