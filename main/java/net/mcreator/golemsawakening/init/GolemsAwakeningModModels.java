
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.golemsawakening.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.golemsawakening.client.model.Modelgolemcomposter;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GolemsAwakeningModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgolemcomposter.LAYER_LOCATION, Modelgolemcomposter::createBodyLayer);
	}
}
