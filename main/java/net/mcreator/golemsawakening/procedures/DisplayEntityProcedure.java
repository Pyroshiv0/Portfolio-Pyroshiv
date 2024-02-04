package net.mcreator.golemsawakening.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.golemsawakening.init.GolemsAwakeningModEntities;
import net.mcreator.golemsawakening.entity.ComposterGolemEntity;

public class DisplayEntityProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new ComposterGolemEntity(GolemsAwakeningModEntities.COMPOSTER_GOLEM.get(), _level) : null;
	}
}
