
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stitchedsins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.stitchedsins.potion.PredatorGrowlMobEffect;
import net.mcreator.stitchedsins.potion.MissileFistMobEffect;
import net.mcreator.stitchedsins.potion.LastLoveMobEffect;
import net.mcreator.stitchedsins.potion.FreezingMobEffect;
import net.mcreator.stitchedsins.StitchedSinsMod;

public class StitchedSinsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, StitchedSinsMod.MODID);
	public static final RegistryObject<MobEffect> LAST_LOVE = REGISTRY.register("last_love", () -> new LastLoveMobEffect());
	public static final RegistryObject<MobEffect> FREEZING = REGISTRY.register("freezing", () -> new FreezingMobEffect());
	public static final RegistryObject<MobEffect> PREDATOR_GROWL = REGISTRY.register("predator_growl", () -> new PredatorGrowlMobEffect());
	public static final RegistryObject<MobEffect> MISSILE_FIST = REGISTRY.register("missile_fist", () -> new MissileFistMobEffect());
}
