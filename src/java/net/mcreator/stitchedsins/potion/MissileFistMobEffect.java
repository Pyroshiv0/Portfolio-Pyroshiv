
package net.mcreator.stitchedsins.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MissileFistMobEffect extends MobEffect {
	public MissileFistMobEffect() {
		super(MobEffectCategory.NEUTRAL, -11834533);
	}

	@Override
	public String getDescriptionId() {
		return "effect.stitched_sins.missile_fist";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
