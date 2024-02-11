package net.mcreator.golemsawakening.procedures;

import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.golemsawakening.GolemsAwakeningMod;

public class BlockTestPlacageOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double range = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double sxf = 0;
		double syf = 0;
		double szf = 0;
		for (int index0 = 0; index0 < 7; index0++) {
			range = range + 1;
			sx = range * (-1);
			sy = range * (-1);
			sz = range * (-1);
			while (sx <= range) {
				while (sy <= range) {
					while (sz <= range) {
						if (!found) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() instanceof BonemealableBlock) {
								found = true;
								sxf = sx;
								syf = sy;
								szf = sz;
								GolemsAwakeningMod.LOGGER.info("bloc trouvé:" + "x:" + (x + sxf) + "(sx=" + sxf + ") " + "y:" + (y + syf) + "(sy=" + syf + ") " + "z:" + (z + szf) + "(sz=" + sxf + ") ");
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
		if (found) {
			world.setBlock(BlockPos.containing(x + sxf, y + syf, z + szf), Blocks.BUDDING_AMETHYST.defaultBlockState(), 3);
		}
	}
}
