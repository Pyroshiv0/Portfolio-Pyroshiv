package net.mcreator.justenoughtgadgets.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class EmpBuckWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState throught = Blocks.AIR.defaultBlockState();
		throught = (world.getBlockState(BlockPos.containing(x, y, z)));
		if (throught.getBlock() == Blocks.WATER || throught.getBlock() == Blocks.WATER || throught.getBlock() == Blocks.BUBBLE_COLUMN) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (throught.getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
