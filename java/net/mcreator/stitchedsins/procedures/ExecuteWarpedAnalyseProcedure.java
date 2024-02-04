package net.mcreator.stitchedsins.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.stitchedsins.init.StitchedSinsModItems;

import java.util.concurrent.atomic.AtomicReference;
import net.mcreator.stitchedsins.procedures.ReversedOrgansProcedure;

public class ExecuteWarpedAnalyseProcedure {
	public static ItemStack execute(LevelAccessor world, double x, double y, double z) {
		ItemStack organ1 = ItemStack.EMPTY;
		ItemStack organ2 = ItemStack.EMPTY;
		ItemStack finalorgan = ItemStack.EMPTY;
		organ1 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0));
		organ2 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1));
		if (organ1.getItem() == StitchedSinsModItems.WARPED_CHIP.get()) {
			finalorgan =ReversedOrgansProcedure.execute(organ2);
			//finalorgan.getOrCreateTag().putBoolean("warped",true);
		} else if (organ2.getItem() == StitchedSinsModItems.WARPED_CHIP.get()) {
			finalorgan =ReversedOrgansProcedure.execute(organ1);
			//finalorgan.getOrCreateTag().putBoolean("warped",true);
		}
		return finalorgan;
	}
}
