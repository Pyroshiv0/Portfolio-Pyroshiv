package net.mcreator.golemsawakening.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Container;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.golemsawakening.world.inventory.InventoryGolemComposterMenu;
import net.mcreator.golemsawakening.network.GolemsAwakeningModVariables;

import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;

public class TestComposterGolemOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack itemToTake = ItemStack.EMPTY;
		ItemStack itemToTake2 = ItemStack.EMPTY;
		ItemStack itemToTake3 = ItemStack.EMPTY;
		ItemStack itemToTake4 = ItemStack.EMPTY;
		ItemStack itemToTake5 = ItemStack.EMPTY;
		Entity player = null;
		String uuidgolem = "";
		BlockState blocktocheck = Blocks.AIR.defaultBlockState();
		double ComposterMaxLevel = 0;
		double previousRecipe = 0;
		double compLevel = 0;
		double useless = 0;
		double sxf = 0;
		double syf = 0;
		double szf = 0;
		double bonemealemp = 0;
		double age = 0;
		boolean found = false;
		boolean feedtree = false;
		ComposterMaxLevel = 7;
		itemToTake = (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, entity));
		itemToTake2 = (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(1, entity));
		itemToTake3 = (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(2, entity));
		itemToTake4 = (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(3, entity));
		itemToTake5 = (new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(4, entity));
		uuidgolem = entity.getUUID().toString();
		if (entity.getPersistentData().getDouble("timer") < 32) {
			entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 1));
		}
		if (entity.getPersistentData().getBoolean("isFilled") == false) {
			if (ComposterBlock.COMPOSTABLES.containsKey(itemToTake.getItem())) {
				{
					final int _slotid = 0;
					final ItemStack _setstack = itemToTake;
					_setstack.setCount((int) (itemToTake.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				if (Math.random() <= 0.6) {
					entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 1));
				}
			} else if (ComposterBlock.COMPOSTABLES.containsKey(itemToTake2.getItem())) {
				{
					final int _slotid = 1;
					final ItemStack _setstack = itemToTake2;
					_setstack.setCount((int) (itemToTake2.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				if (Math.random() <= 0.6) {
					entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 1));
				}
			} else if (ComposterBlock.COMPOSTABLES.containsKey(itemToTake3.getItem())) {
				{
					final int _slotid = 2;
					final ItemStack _setstack = itemToTake3;
					_setstack.setCount((int) (itemToTake3.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				if (Math.random() <= 0.6) {
					entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 1));
				}
			} else if (ComposterBlock.COMPOSTABLES.containsKey(itemToTake4.getItem())) {
				{
					final int _slotid = 3;
					final ItemStack _setstack = itemToTake4;
					_setstack.setCount((int) (itemToTake4.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				if (Math.random() <= 0.6) {
					entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 1));
				}
			} else if (ComposterBlock.COMPOSTABLES.containsKey(itemToTake5.getItem())) {
				{
					final int _slotid = 4;
					final ItemStack _setstack = itemToTake5;
					_setstack.setCount((int) (itemToTake5.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				if (Math.random() <= 0.6) {
					entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 1));
				}
			}
			if (itemToTake.getItem() == Items.BONE_MEAL) {
				{
					final int _slotid = 0;
					final ItemStack _setstack = itemToTake;
					_setstack.setCount((int) (itemToTake.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 7));
			} else if (itemToTake2.getItem() == Items.BONE_MEAL) {
				{
					final int _slotid = 1;
					final ItemStack _setstack = itemToTake2;
					_setstack.setCount((int) (itemToTake2.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 7));
			} else if (itemToTake3.getItem() == Items.BONE_MEAL) {
				{
					final int _slotid = 2;
					final ItemStack _setstack = itemToTake3;
					_setstack.setCount((int) (itemToTake3.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 7));
			} else if (itemToTake4.getItem() == Items.BONE_MEAL) {
				{
					final int _slotid = 3;
					final ItemStack _setstack = itemToTake4;
					_setstack.setCount((int) (itemToTake4.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 7));
			} else if (itemToTake5.getItem() == Items.BONE_MEAL) {
				{
					final int _slotid = 4;
					final ItemStack _setstack = itemToTake5;
					_setstack.setCount((int) (itemToTake5.getCount() - 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") + 7));
			}
		}
		if (entity.getPersistentData().getDouble("composterLevel") >= ComposterMaxLevel) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(5, entity)).getCount() <= 63) {
				entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") - ComposterMaxLevel));
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
					}.getItemStack(5, entity)).getCount() + 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				entity.getPersistentData().putBoolean("isFilled", false);
			} else if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(6, entity)).getCount() <= 63) {
				entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") - ComposterMaxLevel));
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
					}.getItemStack(6, entity)).getCount() + 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				entity.getPersistentData().putBoolean("isFilled", false);
			} else if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(7, entity)).getCount() <= 63) {
				entity.getPersistentData().putDouble("composterLevel", (entity.getPersistentData().getDouble("composterLevel") - ComposterMaxLevel));
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
					}.getItemStack(7, entity)).getCount() + 1));
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				entity.getPersistentData().putBoolean("isFilled", false);
			} else {
				entity.getPersistentData().putBoolean("isFilled", true);
			}
		}
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (entityiterator instanceof Player _plr80 && _plr80.containerMenu instanceof InventoryGolemComposterMenu) {
				if ((entity.getUUID().toString()).equals((entityiterator.getCapability(GolemsAwakeningModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GolemsAwakeningModVariables.PlayerVariables())).LastgolemP)) {
					{
						double _setval = entity.getPersistentData().getDouble("composterLevel");
						entityiterator.getCapability(GolemsAwakeningModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.cLevel = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(5, entity)).getItem() == Items.BONE_MEAL) {
			bonemealemp = 5;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(6, entity)).getItem() == Items.BONE_MEAL) {
			bonemealemp = 6;
		} else if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(7, entity)).getItem() == Items.BONE_MEAL) {
			bonemealemp = 7;
		}
		if (bonemealemp != 0) {
			for (int range = 0; range < 7; range++) {
				for (int sx = range * (-1); sx <= range; sx++) {
					for (int sy = range * (-1); sy <= range; sy++) {
						for (int sz = range * (-1); sz <= range; sz++) {
							if (!found) {
								if (Math.abs(sx) >= range || Math.abs(sy) >= range || Math.abs(sz) >= range) {
									blocktocheck = (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)));
									if (blocktocheck.getBlock() instanceof BonemealableBlock) {
										if (blocktocheck.getBlock() == Blocks.GRASS_BLOCK) {
											if (entity.getPersistentData().getBoolean("grassBonemealable")) {
												found = true;
												sxf = sx;
												syf = sy;
												szf = sz;
											}
										} else if ((age = blocktocheck.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip69 ? blocktocheck.getValue(_getip69) : -1) >= 0) {
											if (blocktocheck.getBlock() == Blocks.BEETROOTS) {
												if (age < 3) {
													found = true;
													sxf = sx;
													syf = sy;
													szf = sz;
												}
											} else {
												if (age < 7) {
													found = true;
													sxf = sx;
													syf = sy;
													szf = sz;
												}
											}
										} else {
											found = true;
											sxf = sx;
											syf = sy;
											szf = sz;
											feedtree = true;
										}
									}
								}
							}
						}
					}
				}
			}
			if (found) {
				if (Math.abs(sxf) < 2 && Math.abs(syf) < 2 && Math.abs(szf) < 2) {
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((x + sxf), (y + syf), (z + szf)));
					if (entity.getPersistentData().getDouble("timer") >= 15) {
						if (world instanceof Level _level) {
							BlockPos _bp = BlockPos.containing(x + sxf, y + syf, z + szf);
							if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
								if (!_level.isClientSide())
									_level.levelEvent(2005, _bp, 0);
							}
						}
						{
							final int _slotid = (int) bonemealemp;
							final ItemStack _setstack = new ItemStack(Items.BONE_MEAL);
							_setstack.setCount((int) ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) bonemealemp, entity)).getCount() - 1));
							entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable _modHandler)
									_modHandler.setStackInSlot(_slotid, _setstack);
							});
						}
						entity.getPersistentData().putDouble("timer", 0);
					}
				} else {
					if (feedtree) {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo((x + sxf), (y + syf), (z + szf), 1);
					} else {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo((x + sxf + 1), (y + syf), (z + szf), 1);
					}
				}
			}
		} else {
			BlockEntity blocktoopen;
			int slot = -1;
			ItemStack stack;
			int numb;
			int slotpf = -1;
			for (int range = 0; range < 7; range++) {
				for (int sx = range * (-1); sx <= range; sx++) {
					for (int sy = range * (-1); sy <= range; sy++) {
						for (int sz = range * (-1); sz <= range; sz++) {
							if (!found) {
								if (Math.abs(sx) >= range || Math.abs(sy) >= range || Math.abs(sz) >= range) {
									blocktoopen = (world.getBlockEntity(BlockPos.containing(x + sx, y + sy, z + sz)));
									if (blocktoopen instanceof Container) {
										numb = (((Container) blocktoopen).getContainerSize()) - 1;
									} else
										numb = -1;
									slot = -1;
									while (slot < numb && !found) {
										slot++;
										stack = (new Object() {
											public ItemStack getItemStackcont(LevelAccessor world, BlockEntity _ent, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}).getItemStackcont(world, blocktoopen, slot);
										if ((ComposterBlock.COMPOSTABLES.containsKey(stack.getItem())) || (stack.getItem() == Items.BONE_MEAL)) {
											slotpf = slot;
											found = true;
											sxf = sx;
											syf = sy;
											szf = sz;
										}
									}
								}
							}
						}
					}
				}
			}
			if (found) {
				blocktoopen = (world.getBlockEntity(BlockPos.containing(x + sxf, y + syf, z + szf)));
				final int slotf = slotpf;
				if (Math.abs(sxf) < 2 && Math.abs(syf) < 2 && Math.abs(szf) < 2) {
					entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((x + sxf), (y + syf), (z + szf)));
					final ItemStack stack2 = ((new Object() {
						public ItemStack getItemStackcont(LevelAccessor world, BlockEntity _ent, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}).getItemStackcont(world, blocktoopen, slotf));//.getItem();
					if (itemToTake == ItemStack.EMPTY) {
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandler)
								_modHandler.setStackInSlot(0, stack2);
						});
						blocktoopen.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(slotf, ItemStack.EMPTY);
						});
					} else if (itemToTake2 == ItemStack.EMPTY) {
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandler)
								_modHandler.setStackInSlot(1, stack2);
						});
						blocktoopen.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(slotf, ItemStack.EMPTY);
						});
					} else if (itemToTake3 == ItemStack.EMPTY) {
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandler)
								_modHandler.setStackInSlot(2, stack2);
						});
						blocktoopen.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(slotf, ItemStack.EMPTY);
						});
					} else if (itemToTake4 == ItemStack.EMPTY) {
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandler)
								_modHandler.setStackInSlot(3, stack2);
						});
						blocktoopen.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(slotf, ItemStack.EMPTY);
						});
					} else if (itemToTake5 == ItemStack.EMPTY) {
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandler)
								_modHandler.setStackInSlot(4, stack2);
						});
						blocktoopen.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(slotf, ItemStack.EMPTY);
						});
					}
				} else {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((x + sxf), (y + syf), (z + szf), 1);
				}
			}
		}
	}
}
