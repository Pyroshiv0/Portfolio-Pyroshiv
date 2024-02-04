
package net.mcreator.golemsawakening.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.golemsawakening.entity.ComposterGolemEntity;
import net.mcreator.golemsawakening.client.model.Modelgolemcomposter;

public class ComposterGolemRenderer extends MobRenderer<ComposterGolemEntity, Modelgolemcomposter<ComposterGolemEntity>> {
	public ComposterGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgolemcomposter(context.bakeLayer(Modelgolemcomposter.LAYER_LOCATION)), 0.75f);
	}

	@Override
	public ResourceLocation getTextureLocation(ComposterGolemEntity entity) {
		return new ResourceLocation("golems_awakening:textures/entities/golemcomposter.png");
	}
}
