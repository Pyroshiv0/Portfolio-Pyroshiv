package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class StitchedOrganEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("creeper_ribs")) {
			LastBreathProcedure.execute(world, x, y, z, entity);
		}
		if (itemstack.getOrCreateTag().getBoolean("enderman_muscles")) {
			InstinctEffetTestProcedure.execute(world, x, y, z, entity);
		}
		if (itemstack.getOrCreateTag().getBoolean("blazing_heart")) {
			BoilingProcedure.execute(world, x, y, z, entity);
		}
		if (itemstack.getOrCreateTag().getBoolean("golem_cuirass")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1, false, false));
		}
		if (itemstack.getOrCreateTag().getBoolean("ice_heart")) {
			IceHeartEffectProcedure.execute(entity);
		}
		if (itemstack.getOrCreateTag().getBoolean("predator_muscle")) {
			PredatorMuscleEffectProcedure.execute(entity);
		}
		if (itemstack.getOrCreateTag().getBoolean("warped_golem_cuirass")) {
			WarpedGolemCuirassEffectProcedure.execute(entity);
		}
		if (itemstack.getOrCreateTag().getBoolean("rose_creeper_ribs")) {
			RoseCreeperRibsEffectProcedure.execute(entity);
		}
		if (itemstack.getOrCreateTag().getBoolean("wolf_ribs")) {
			if (!itemstack.getOrCreateTag().getBoolean("wolf_ribs_triggered")) {
				entity.getPersistentData().putDouble("ragetimer", 0);
				itemstack.getOrCreateTag().putBoolean("wolf_ribs_triggered", true);
			} else {
				if (entity.getPersistentData().getDouble("ragetimer") > 0) {
					entity.getPersistentData().putDouble("ragetimer", (entity.getPersistentData().getDouble("ragetimer") - 1));
				} else {
					WolfRibsTriggerProcedure.execute(world, x, y, z, entity);
					entity.getPersistentData().putDouble("ragetimer", 30);
				}
			}
		}
		if (itemstack.getOrCreateTag().getBoolean("enderman_heart")) {
			if (!itemstack.getOrCreateTag().getBoolean("enderman_heart_triggered")) {
				entity.getPersistentData().putDouble("enderhearttimer", 0);
				itemstack.getOrCreateTag().putBoolean("enderman_heart_triggered", true);
			} else {
				if (entity.getPersistentData().getDouble("enderhearttimer") > 0) {
					entity.getPersistentData().putDouble("enderhearttimer", (entity.getPersistentData().getDouble("enderhearttimer") - 1));
				} else {
					EndermanHeartEatenProcedure.execute(world, x, y, z);
					entity.getPersistentData().putDouble("enderhearttimer", 50);
				}
			}
		}
		if (itemstack.getOrCreateTag().getBoolean("dragon_heart")) {
			if (!itemstack.getOrCreateTag().getBoolean("dragon_heart_triggered")) {
				entity.getPersistentData().putDouble("dragontimer", 0);
				itemstack.getOrCreateTag().putBoolean("dragon_heart_triggered", true);
			} else {
				if (entity.getPersistentData().getDouble("dragontimer") > 0) {
					entity.getPersistentData().putDouble("dragontimer", (entity.getPersistentData().getDouble("dragontimer") - 1));
				} else {
					DragonheartShootFIREBallProcedure.execute(world, x, y, z, entity);
					entity.getPersistentData().putDouble("dragontimer", 600);
				}
			}
		}
		if (itemstack.getOrCreateTag().getDouble("slowness") < 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, (int) ((itemstack.getOrCreateTag().getDouble("slowness") + 1) * (-1)), false, false));
		} else if (itemstack.getOrCreateTag().getDouble("slowness") > 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, (int) (itemstack.getOrCreateTag().getDouble("slowness") - 1), false, false));
		}
		if (itemstack.getOrCreateTag().getDouble("healthboost") == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 0, false, false));
		}
		if (itemstack.getOrCreateTag().getDouble("weakness") < 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200, (int) ((itemstack.getOrCreateTag().getDouble("weakness") + 1) * (-1)), false, false));
		} else if (itemstack.getOrCreateTag().getDouble("weakness") > 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, (int) (itemstack.getOrCreateTag().getDouble("weakness") - 1), false, false));
		}
		if (itemstack.getOrCreateTag().getDouble("poison") < 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 1200, (int) ((itemstack.getOrCreateTag().getDouble("poison") + 1) * (-1)), false, false));
		} else if (itemstack.getOrCreateTag().getDouble("poison") > 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200, (int) (itemstack.getOrCreateTag().getDouble("poison") - 1), false, false));
		}
	}
}
