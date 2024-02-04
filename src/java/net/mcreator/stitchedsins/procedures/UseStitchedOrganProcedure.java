package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class UseStitchedOrganProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		StitchedOrganEffectProcedure.execute(world, x, y, z, entity, itemstack);
		itemstack.shrink(1);
	}
}
