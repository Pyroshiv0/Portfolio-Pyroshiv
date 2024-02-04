package net.mcreator.golemsawakening.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgolemcomposter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("golems_awakening", "modelgolemcomposter"), "main");
	public final ModelPart golem;

	public Modelgolemcomposter(ModelPart root) {
		this.golem = root.getChild("golem");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition golem = partdefinition.addOrReplaceChild("golem", CubeListBuilder.create(), PartPose.offset(0.0F, 43.0F, 4.0F));
		PartDefinition backpack = golem.addOrReplaceChild("backpack", CubeListBuilder.create().texOffs(0, 21).addBox(-4.0F, -28.0F, 2.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 31)
				.addBox(-4.0F, -31.0F, 2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -29.0F, 6.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body = golem.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -30.0F, -10.0F, 12.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(24, 26).addBox(-6.0F, -33.0F, 0.0F, 12.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
						.addBox(-6.0F, -33.0F, -10.0F, 12.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(-6.0F, -33.0F, -8.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(4.0F, -33.0F, -8.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-8.0F, -31.0F, -10.1F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition brasdroit = golem.addOrReplaceChild("brasdroit", CubeListBuilder.create().texOffs(44, 31).addBox(6.0F, -7.0F, -11.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, 5.0F));
		PartDefinition brasgauche = golem.addOrReplaceChild("brasgauche", CubeListBuilder.create().texOffs(0, 44).addBox(-9.0F, -27.0F, 6.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition jambedroite = golem.addOrReplaceChild("jambedroite", CubeListBuilder.create().texOffs(32, 38).addBox(1.0F, -21.0F, -7.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition jambegauche = golem.addOrReplaceChild("jambegauche", CubeListBuilder.create().texOffs(14, 38).addBox(-4.0F, -21.0F, -7.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		golem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
