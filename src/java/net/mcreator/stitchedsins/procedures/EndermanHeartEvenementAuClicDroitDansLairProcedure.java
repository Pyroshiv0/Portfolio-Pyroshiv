package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

public class EndermanHeartEvenementAuClicDroitDansLairProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		EndermanHeartEatenProcedure.execute(world, x, y, z);
		itemstack.shrink(1);
	}
}
