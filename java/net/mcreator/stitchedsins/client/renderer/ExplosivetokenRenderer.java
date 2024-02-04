
package net.mcreator.stitchedsins.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.stitchedsins.procedures.ExplosivetokenConditionDeModelePourUneEntiteTransparenteProcedure;
import net.mcreator.stitchedsins.entity.ExplosivetokenEntity;

public class ExplosivetokenRenderer extends HumanoidMobRenderer<ExplosivetokenEntity, HumanoidModel<ExplosivetokenEntity>> {
	public ExplosivetokenRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ExplosivetokenEntity entity) {
		return new ResourceLocation("stitched_sins:textures/entities/dragon_hear_confirmedt.png");
	}

	@Override
	protected boolean isBodyVisible(ExplosivetokenEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return !ExplosivetokenConditionDeModelePourUneEntiteTransparenteProcedure.execute();
	}
}
