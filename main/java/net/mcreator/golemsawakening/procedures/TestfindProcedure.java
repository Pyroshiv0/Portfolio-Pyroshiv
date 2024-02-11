package net.mcreator.golemsawakening.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.golemsawakening.GolemsAwakeningMod;

import java.util.concurrent.atomic.AtomicReference;

public class TestfindProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double range = 0;
		range = 0;
		found = false;
		for (int index0 = 0; index0 < 6; index0++) {
			sx = range * (-1);
			sy = range * (-1);
			sz = range * (-1);
			for (int index1 = 0; index1 < (int) (range * 2 + 1); index1++) {
				for (int index2 = 0; index2 < (int) (range * 2 + 1); index2++) {
					for (int index3 = 0; index3 < (int) (range * 2 + 1); index3++) {
						if (sx > range || sy > range || sz > range) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() instanceof BonemealableBlock) {
								found = true;
								GolemsAwakeningMod.LOGGER.info("found block at x:" + (x + sx) + ",y:" + (y + sy) + ",z:" + (z + sz));
							}
						}
						if (found == false) {
							sz = sz + 1;
						}
					}
					if (found == false) {
						sy = sy + 1;
					}
				}
				if (found == false) {
					sx = sx + 1;
				}
			}
			if (found == false) {
				range = range + 1;
			}
		}
		if (found == true) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(5, entity)).getItem() == Items.BONE_MEAL) {
				{
					final int _slotid = 5;
					final ItemStack _setstack = new ItemStack(Items.BONE_MEAL);
					_setstack.setCount((int) ((new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(5, entity)).getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			} else if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(6, entity)).getItem() == Items.BONE_MEAL) {
				{
					final int _slotid = 6;
					final ItemStack _setstack = new ItemStack(Items.BONE_MEAL);
					_setstack.setCount((int) ((new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(6, entity)).getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			} else if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(7, entity)).getItem() == Items.BONE_MEAL) {
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				{
					final int _slotid = 7;
					final ItemStack _setstack = new ItemStack(Items.BONE_MEAL);
					_setstack.setCount((int) ((new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(7, entity)).getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
			}
		}
	}
}
