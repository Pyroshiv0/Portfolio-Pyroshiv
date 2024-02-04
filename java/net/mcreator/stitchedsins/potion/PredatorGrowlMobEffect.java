
package net.mcreator.stitchedsins.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PredatorGrowlMobEffect extends MobEffect {
	public PredatorGrowlMobEffect() {
		super(MobEffectCategory.NEUTRAL, -9829616);
	}

	@Override
	public String getDescriptionId() {
		return "effect.stitched_sins.predator_growl";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
