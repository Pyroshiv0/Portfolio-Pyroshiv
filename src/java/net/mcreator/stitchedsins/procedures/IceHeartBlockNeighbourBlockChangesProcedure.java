package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class IceHeartBlockNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.BLUE_ICE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.BLUE_ICE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.BLUE_ICE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.BLUE_ICE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.BLUE_ICE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.BLUE_ICE.defaultBlockState(), 3);
		}
	}
}
