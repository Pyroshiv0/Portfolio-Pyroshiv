package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.stitchedsins.init.StitchedSinsModMobEffects;

public class WarpedGolemCuirassEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(StitchedSinsModMobEffects.MISSILE_FIST.get(), 1200, 0));
	}
}
