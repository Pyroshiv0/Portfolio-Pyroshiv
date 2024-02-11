package net.mcreator.justenoughtgadgets.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;


import net.mcreator.justenoughtgadgets.init.JustEnoughtGadgetsModItems;
import net.minecraft.world.InteractionHand;


public class WaterHugeBucketItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity, ItemStack itemstack) {
		int dx=0;
		int dy=0;
		int dz=0;
		if (direction == null || entity == null)
			return;
		if (direction == Direction.DOWN && ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR)) {

			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.WATER.defaultBlockState(), 3);
			itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));

			for (dx = -1; dx<=1; dx++) {
									for (dy = -1; dy<=1; dy++) {
										for (dz = -1; dz<=1; dz++) {
									
											if (!(dx == 0 && dy == 0 && dz == 0)) {
												if (itemstack.getOrCreateTag().getDouble("containing") >0) {
													


												if (direction == Direction.DOWN && ((world.getBlockState(BlockPos.containing(x+dx, y+dy - 1, z+dz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x+dx, y+dy - 1, z+dz))).getBlock() == Blocks.WATER
												|| (world.getBlockState(BlockPos.containing(x+dx, y+dy - 1, z+dz))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x+dx, y+dy - 1, z+dz))).getBlock() == Blocks.AIR
												|| (world.getBlockState(BlockPos.containing(x+dx, y+dy - 1, z+dz))).getBlock() == Blocks.CAVE_AIR)) {
															world.setBlock(BlockPos.containing(x+dx, y+dy - 1, z+dz), Blocks.WATER.defaultBlockState(), 3);
															itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));
														}
													}
												}
											}
										}
									
								}
			if (!world.isClientSide()) {
				if (Math.random() > 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y-1, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y-1, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y-1, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9);
						} else {
							_level.playLocalSound(x, y-1, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
						}
					}
				}
			}
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (itemstack.getOrCreateTag().getDouble("containing") <  1) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(JustEnoughtGadgetsModItems.HUGE_BUCKET.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		} else if (direction == Direction.UP && ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));

			for (dx = -1; dx<=1; dx++) {
					for (dy = -1; dy<=1; dy++) {
							for (dz = -1; dz<=1; dz++) {
										if (!(dx == 0 && dy == 0 && dz == 0)) {
											if (itemstack.getOrCreateTag().getDouble("containing") >0) {
												if (direction == Direction.UP && ((world.getBlockState(BlockPos.containing(x+dx, y+dy + 1, z+dz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x+dx, y+dy + 1, z+dz))).getBlock() == Blocks.WATER
												|| (world.getBlockState(BlockPos.containing(x+dx, y+dy + 1, z+dz))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x+dx, y+dy + 1, z+dz))).getBlock() == Blocks.AIR
												|| (world.getBlockState(BlockPos.containing(x+dx, y+dy + 1, z+dz))).getBlock() == Blocks.CAVE_AIR)) {
															world.setBlock(BlockPos.containing(x+dx, y+dy + 1, z+dz), Blocks.WATER.defaultBlockState(), 3);
															itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));
														}
													}
												}
											}
										}
									}
								
			if (!world.isClientSide()) {
				if (Math.random() > 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y+1, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y+1, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y+1, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9);
						} else {
							_level.playLocalSound(x, y+1, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
						}
					}
				}
			}
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (itemstack.getOrCreateTag().getDouble("containing") <  1) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}

					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(JustEnoughtGadgetsModItems.HUGE_BUCKET.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}

				}
			}
		} else if (direction == Direction.NORTH && ((world.getBlockState(BlockPos.containing(x, y, z-1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z-1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y, z-1))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x, y, z-1))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y, z-1))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x, y, z-1), Blocks.WATER.defaultBlockState(), 3);
			itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));

			for (dx = -1; dx<=1; dx++) {
									for (dy = -1; dy<=1; dy++) {
										for (dz = -1; dz<=1; dz++) {
									
											if (!(dx == 0 && dy == 0 && dz == 0)) {
												if (itemstack.getOrCreateTag().getDouble("containing") >0) {
												if (direction == Direction.NORTH && ((world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz-1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz-1))).getBlock() == Blocks.WATER
												|| (world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz-1))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz-1))).getBlock() == Blocks.AIR
												|| (world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz-1))).getBlock() == Blocks.CAVE_AIR)) {
															world.setBlock(BlockPos.containing(x+dx, y+dy, z+dz-1), Blocks.WATER.defaultBlockState(), 3);
															itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));
														}
													}
												}
											}
										}
									}
								
			if (!world.isClientSide()) {
				if (Math.random() > 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z-1), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z-1, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z-1), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9);
						} else {
							_level.playLocalSound(x, y, z-1, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
						}
					}
				}
			}
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (itemstack.getOrCreateTag().getDouble("containing") < 1) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(JustEnoughtGadgetsModItems.HUGE_BUCKET.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		} else if (direction == Direction.SOUTH && ((world.getBlockState(BlockPos.containing(x, y, z+1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z+1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y, z+1))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x, y, z+1))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y, z+1))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x, y, z+1), Blocks.WATER.defaultBlockState(), 3);
			itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));

			for (dx = -1; dx<=1; dx++) {
									for (dy = -1; dy<=1; dy++) {
										for (dz = -1; dz<=1; dz++) {
									
											if (!(dx == 0 && dy == 0 && dz == 0)) {
												if (itemstack.getOrCreateTag().getDouble("containing") >0) {
												if (direction == Direction.SOUTH && ((world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz+1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz+1))).getBlock() == Blocks.WATER
												|| (world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz+1))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz+1))).getBlock() == Blocks.AIR
												|| (world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz+1))).getBlock() == Blocks.CAVE_AIR)) {
															world.setBlock(BlockPos.containing(x+dx, y+dy, z+dz+1), Blocks.WATER.defaultBlockState(), 3);
															itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));
														}
													}
												}
											}
										}
									}
								
			if (!world.isClientSide()) {
				if (Math.random() > 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z+1), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z+1, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z+1), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9);
						} else {
							_level.playLocalSound(x, y, z+1, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
						}
					}
				}
			}
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (itemstack.getOrCreateTag().getDouble("containing") < 1) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(JustEnoughtGadgetsModItems.HUGE_BUCKET.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		} else if (direction == Direction.EAST && ((world.getBlockState(BlockPos.containing(x+1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x+1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x+1, y, z))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x+1, y, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x+1, y, z))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x+1, y, z), Blocks.WATER.defaultBlockState(), 3);
			itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));

			for (dx = -1; dx<=1; dx++) {
									for (dy = -1; dy<=1; dy++) {
										for (dz = -1; dz<=1; dz++) {
									
											if (!(dx == 0 && dy == 0 && dz == 0)) {
												if (itemstack.getOrCreateTag().getDouble("containing") >0) {
												if (direction == Direction.EAST && ((world.getBlockState(BlockPos.containing(x+dx+1, y+dy, z+dz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x+dx+1, y+dy, z+dz))).getBlock() == Blocks.WATER
												|| (world.getBlockState(BlockPos.containing(x+dx+1, y+dy, z+dz))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x+dx+1, y+dy, z+dz))).getBlock() == Blocks.AIR
												|| (world.getBlockState(BlockPos.containing(x+dx+1, y+dy, z+dz))).getBlock() == Blocks.CAVE_AIR)) {
															world.setBlock(BlockPos.containing(x+dx+1, y+dy, z+dz), Blocks.WATER.defaultBlockState(), 3);
															itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));
														}
													}
												}
											}
										}
									}
								
			if (!world.isClientSide()) {
				if (Math.random() > 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x+1, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x+1, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x+1, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9);
						} else {
							_level.playLocalSound(x+1, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
						}
					}
				}
			}
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (itemstack.getOrCreateTag().getDouble("containing") < 1) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(JustEnoughtGadgetsModItems.HUGE_BUCKET.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}

		} else if (direction == Direction.WEST && ((world.getBlockState(BlockPos.containing(x-1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x-1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x-1, y, z))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x-1, y, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x-1, y, z))).getBlock() == Blocks.CAVE_AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			world.setBlock(BlockPos.containing(x-1, y, z), Blocks.WATER.defaultBlockState(), 3);
			itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));

			for (dx = -1; dx<=1; dx++) {
									for (dy = -1; dy<=1; dy++) {
										for (dz = -1; dz<=1; dz++) {
									
											if (!(dx == 0 && dy == 0 && dz == 0)) {
												if (itemstack.getOrCreateTag().getDouble("containing") >0) {
												if (direction == Direction.WEST && ((world.getBlockState(BlockPos.containing(x+dx-1, y+dy, z+dz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x+dx-1, y+dy, z+dz))).getBlock() == Blocks.WATER
												|| (world.getBlockState(BlockPos.containing(x+dx-1, y+dy, z+dz))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x+dx-1, y+dy, z+dz))).getBlock() == Blocks.AIR
												|| (world.getBlockState(BlockPos.containing(x+dx-1, y+dy, z+dz))).getBlock() == Blocks.CAVE_AIR)) {
															world.setBlock(BlockPos.containing(x+dx-1, y+dy, z+dz), Blocks.WATER.defaultBlockState(), 3);
															itemstack.getOrCreateTag().putDouble("containing", (itemstack.getOrCreateTag().getDouble("containing") - 1));
														}
													}
												}
											}
										}
									}
								
			if (!world.isClientSide()) {
				if (Math.random() > 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x-1, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x-1, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x-1, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9);
						} else {
							_level.playLocalSound(x-1, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
						}
					}
				}
			}
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (itemstack.getOrCreateTag().getDouble("containing") < 1) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(JustEnoughtGadgetsModItems.HUGE_BUCKET.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}

	}
	}}
