package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class ExplosivetokenChaqueMiseAJourDeTickDeLentiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 60, 1, false, false));
		if (entity.getPersistentData().getDouble("explosivedelay") > 0) {
			entity.getPersistentData().putDouble("explosivedelay", (entity.getPersistentData().getDouble("explosivedelay") - 1));
		} else {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Level.ExplosionInteraction.NONE);
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
