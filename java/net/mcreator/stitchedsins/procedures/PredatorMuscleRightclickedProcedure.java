package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class PredatorMuscleRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.shrink(1);
		PredatorMuscleEffectProcedure.execute(entity);
	}
}
