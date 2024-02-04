
package net.mcreator.stitchedsins.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LastLoveMobEffect extends MobEffect {
	public LastLoveMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.stitched_sins.last_love";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
