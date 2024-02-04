
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stitchedsins.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stitchedsins.client.particle.FreezingParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StitchedSinsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(StitchedSinsModParticleTypes.FREEZING_PARTICLE.get(), FreezingParticleParticle::provider);
	}
}
