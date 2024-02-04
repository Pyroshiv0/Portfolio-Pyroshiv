package net.mcreator.golemsawakening.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.golemsawakening.network.GolemsAwakeningModVariables;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class CheckGrassBoneMealProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (((entity.getCapability(GolemsAwakeningModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GolemsAwakeningModVariables.PlayerVariables())).LastgolemP).equals(entity.getUUID().toString())) {
						entity.getPersistentData().putBoolean("grassBonemealable", (!entity.getPersistentData().getBoolean("grassBonemealable")));
					}
				}
			}
		}
	}
}
