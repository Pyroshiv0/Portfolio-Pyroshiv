package net.mcreator.golemsawakening.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.golemsawakening.network.GolemsAwakeningModVariables;

public class Image4ConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(GolemsAwakeningModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GolemsAwakeningModVariables.PlayerVariables())).cLevel == 4) {
			return true;
		}
		return false;
	}
}
