
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justenoughtgadgets.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JustEnoughtGadgetsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JustEnoughtGadgetsModEntities.HUGE_BUCKET_EMP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JustEnoughtGadgetsModEntities.LAVA_HUGE_BUC.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JustEnoughtGadgetsModEntities.EMP_BUCK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JustEnoughtGadgetsModEntities.LAVA_BUCK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JustEnoughtGadgetsModEntities.WATER_BUCK.get(), ThrownItemRenderer::new);
	}
}
