
package net.mcreator.stitchedsins.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.stitchedsins.procedures.FreezingTickEffectNewProcedure;

public class FreezingMobEffect extends MobEffect {
	public FreezingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10384973);
	}

	@Override
	public String getDescriptionId() {
		return "effect.stitched_sins.freezing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FreezingTickEffectNewProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, amplifier);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
