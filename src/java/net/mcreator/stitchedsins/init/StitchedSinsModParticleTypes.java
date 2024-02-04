
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stitchedsins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.stitchedsins.StitchedSinsMod;

public class StitchedSinsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, StitchedSinsMod.MODID);
	public static final RegistryObject<SimpleParticleType> FREEZING_PARTICLE = REGISTRY.register("freezing_particle", () -> new SimpleParticleType(false));
}
