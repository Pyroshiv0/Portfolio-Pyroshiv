package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.mcreator.stitchedsins.init.StitchedSinsModParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;




public class FreezingTickEffectNewProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amplifier) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (StitchedSinsModParticleTypes.FREEZING_PARTICLE.get()), x, y, z, 5, 1, 2, 1, 1);
		double i = 0;
		double dx = 0;
		double dz = 0;
		double range = 0;
		range = amplifier + 3;
		for(dx=-1*range;dx<=range;dx++) {
			for(dz=-1*range;dz<=range;dz++){
				if (!entity.isInWater()) {
					if ((world.getBlockState(BlockPos.containing(x + dx, y - 1, z + dz))).getBlock() == Blocks.WATER) {
						world.setBlock(BlockPos.containing(x + dx, y - 1, z + dz), Blocks.FROSTED_ICE.defaultBlockState(), 3);
					}
				}
				
			}
			
		}
	}
}
