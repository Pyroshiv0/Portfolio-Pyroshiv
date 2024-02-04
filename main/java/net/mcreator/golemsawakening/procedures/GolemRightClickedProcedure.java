package net.mcreator.golemsawakening.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.golemsawakening.network.GolemsAwakeningModVariables;

public class GolemRightClickedProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		Entity golem = null;
		String UuidEntity = "";
		golem = entity;
		{
			String _setval = entity.getUUID().toString();
			sourceentity.getCapability(GolemsAwakeningModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.LastgolemP = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("composterLevel");
			sourceentity.getCapability(GolemsAwakeningModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.cLevel = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
	}
}
