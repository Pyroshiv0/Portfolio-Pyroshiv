package net.mcreator.golemsawakening.procedures;

import net.minecraft.world.entity.Entity;

public class ComposterGolemOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("composterLevel", 0);
		entity.getPersistentData().putBoolean("isFilled", false);
		entity.getPersistentData().putBoolean("grassBonemealable", false);
		entity.getPersistentData().putDouble("timer", 0);
	}
}
