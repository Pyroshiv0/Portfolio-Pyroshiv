package net.mcreator.justenoughtgadgets.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import java.util.ArrayList;

public class LavaBuckProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.LAVA.defaultBlockState(), 3);
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getUUID()).equals(entity.getPersistentData().getString("launcherName"))) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.BUCKET);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
