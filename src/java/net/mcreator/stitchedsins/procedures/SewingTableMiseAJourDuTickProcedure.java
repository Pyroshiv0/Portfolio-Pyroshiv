package net.mcreator.stitchedsins.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.stitchedsins.init.StitchedSinsModItems;
import net.mcreator.stitchedsins.StitchedSinsMod;

import java.util.concurrent.atomic.AtomicReference;

public class SewingTableMiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack needle = ItemStack.EMPTY;
		ItemStack organ1 = ItemStack.EMPTY;
		ItemStack organ2 = ItemStack.EMPTY;
		ItemStack finalorgan = ItemStack.EMPTY;
		String type = "";
		String type2 = "";
		String nom1 = "";
		String nom2 = "";
		double nbrmaled = 0;
		double malusstrenght = 0;
		double posmal = 0;
		double alea = 0;
		boolean stitch = false;
		boolean stitch2 = false;
		boolean done = false;
		needle = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 2));
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
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 4)).getCount() == 0) {
			if (needle.getItem() == StitchedSinsModItems.BONE_NEEDLE.get()) {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == StitchedSinsModItems.ETHER_STRING.get()) {
					if (!(organ1.getItem() == ItemStack.EMPTY.getItem())) {
						if (organ1.getItem() == organ2.getItem()) {
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = 4;
									final ItemStack _setstack = new ItemStack(StitchedSinsModItems.WASTES.get());
									_setstack.setCount(1);
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							{
								ItemStack _ist = needle;
								if (_ist.hurt(1, RandomSource.create(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							if (needle.getDamageValue() != needle.getMaxDamage()) {
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = 2;
										final ItemStack _setstack = needle;
										_setstack.setCount(1);
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
							} else {
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = 2;
										final ItemStack _setstack = new ItemStack(StitchedSinsModItems.WASTES.get());
										_setstack.setCount(0);
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = 3;
									final ItemStack _setstack = new ItemStack(StitchedSinsModItems.ETHER_STRING.get());
									_setstack.setCount((int) ((new Object() {
										public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											BlockEntity _ent = world.getBlockEntity(pos);
											if (_ent != null)
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
											return _retval.get();
										}
									}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getCount() - 1));
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							organ1.shrink(1);
							organ2.shrink(1);
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = 0;
									final ItemStack _setstack = organ1;
									_setstack.setCount(organ1.getCount());
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
							{
								BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
								if (_ent != null) {
									final int _slotid = 1;
									final ItemStack _setstack = organ2;
									_setstack.setCount(organ2.getCount());
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable)
											((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
									});
								}
							}
						} else {
							finalorgan = ExecuteWarpedAnalyseProcedure.execute(world, x, y, z);
							if (finalorgan.getOrCreateTag().getBoolean("warped")) {
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = 4;
										final ItemStack _setstack = finalorgan;
										_setstack.setCount(1);
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
								{
									ItemStack _ist = needle;
									if (_ist.hurt(1, RandomSource.create(), null)) {
										_ist.shrink(1);
										_ist.setDamageValue(0);
									}
								}
								if (needle.getDamageValue() != needle.getMaxDamage()) {
									{
										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
										if (_ent != null) {
											final int _slotid = 2;
											final ItemStack _setstack = needle;
											_setstack.setCount(1);
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
								} else {
									{
										BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
										if (_ent != null) {
											final int _slotid = 2;
											final ItemStack _setstack = new ItemStack(StitchedSinsModItems.WASTES.get());
											_setstack.setCount(0);
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable)
													((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
											});
										}
									}
								}
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = 3;
										final ItemStack _setstack = new ItemStack(StitchedSinsModItems.ETHER_STRING.get());
										_setstack.setCount((int) ((new Object() {
											public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												BlockEntity _ent = world.getBlockEntity(pos);
												if (_ent != null)
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
												return _retval.get();
											}
										}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getCount() - 1));
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
								organ1.shrink(1);
								organ2.shrink(1);
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = 0;
										final ItemStack _setstack = organ1;
										_setstack.setCount(organ1.getCount());
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
								{
									BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
									if (_ent != null) {
										final int _slotid = 1;
										final ItemStack _setstack = organ2;
										_setstack.setCount(organ2.getCount());
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable)
												((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
										});
									}
								}
								done = true;
							}
							if (!done) {
								if (organ1.is(ItemTags.create(new ResourceLocation("sons_of_sins:hearts")))) {
									if (!organ1.is(ItemTags.create(new ResourceLocation("stitched_sins:stitched_organs")))) {
										stitch = true;
										type = "hearts";
									}
								} else if (organ1.is(ItemTags.create(new ResourceLocation("sons_of_sins:muscles")))) {
									if (!organ1.is(ItemTags.create(new ResourceLocation("stitched_sins:stitched_organs")))) {
										stitch = true;
										type = "muscles";
									}
								} else if (organ1.is(ItemTags.create(new ResourceLocation("sons_of_sins:ribs")))) {
									if (!organ1.is(ItemTags.create(new ResourceLocation("stitched_sins:stitched_organs")))) {
										stitch = true;
										type = "ribs";
									}
								}
								if (organ2.is(ItemTags.create(new ResourceLocation("sons_of_sins:hearts")))) {
									if (!organ1.is(ItemTags.create(new ResourceLocation("stitched_sins:stitched_organs")))) {
										stitch2 = true;
										type2 = "hearts";
									}
								} else if (organ2.is(ItemTags.create(new ResourceLocation("sons_of_sins:muscles")))) {
									if (!organ1.is(ItemTags.create(new ResourceLocation("stitched_sins:stitched_organs")))) {
										stitch2 = true;
										type2 = "muscles";
									}
								} else if (organ2.is(ItemTags.create(new ResourceLocation("sons_of_sins:ribs")))) {
									if (!organ1.is(ItemTags.create(new ResourceLocation("stitched_sins:stitched_organs")))) {
										stitch2 = true;
										type2 = "ribs";
									}
								}
								if (stitch) {
									if (stitch2) {
										alea = Mth.nextInt(RandomSource.create(), 1, 2);
										StitchedSinsMod.LOGGER.info(alea);
										if (alea == 1) {
											if ((type).equals("hearts")) {
												finalorgan = new ItemStack(StitchedSinsModItems.STITCHED_HEART.get());
											} else if ((type).equals("muscles")) {
												finalorgan = new ItemStack(StitchedSinsModItems.STITCHED_MUSCLES.get());
											} else if ((type).equals("ribs")) {
												finalorgan = new ItemStack(StitchedSinsModItems.STITCHED_RIBS.get());
											}
										} else {
											if ((type2).equals("hearts")) {
												finalorgan = new ItemStack(StitchedSinsModItems.STITCHED_HEART.get());
											} else if ((type2).equals("muscles")) {
												finalorgan = new ItemStack(StitchedSinsModItems.STITCHED_MUSCLES.get());
											} else if ((type2).equals("ribs")) {
												finalorgan = new ItemStack(StitchedSinsModItems.STITCHED_RIBS.get());
											}
										}
										finalorgan.getOrCreateTag().putBoolean("creeper_ribs", false);
										finalorgan.getOrCreateTag().putBoolean("enderman_muscles", false);
										finalorgan.getOrCreateTag().putBoolean("blazing_heart", false);
										finalorgan.getOrCreateTag().putBoolean("golem_cuirass", false);
										finalorgan.getOrCreateTag().putBoolean("enderman_heart", false);
										finalorgan.getOrCreateTag().putBoolean("enderman_heart_triggered", false);
										finalorgan.getOrCreateTag().putBoolean("wolf_ribs", false);
										finalorgan.getOrCreateTag().putBoolean("wolf_ribs_triggered", false);
										finalorgan.getOrCreateTag().putBoolean("dragon_heart", false);
										finalorgan.getOrCreateTag().putBoolean("dragon_heart_triggered", false);
										nom1 = ForgeRegistries.ITEMS.getKey(organ1.getItem()).toString();
										nom2 = ForgeRegistries.ITEMS.getKey(organ2.getItem()).toString();
										if (StitchedSinsModItems.ENDERMAN_HEART.get() == organ1.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("enderman_heart", true);
										} else if (StitchedSinsModItems.ICE_HEART.get() == organ1.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("ice_heart", true);
										} else if (StitchedSinsModItems.PREDATOR_MUSCLE.get() == organ1.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("predator_muscle", true);
										} else if (StitchedSinsModItems.WARPED_GOLEM_CUIRASS.get() == organ1.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("warped_golem_cuirass", true);
										} else if (StitchedSinsModItems.ROSE_CREEPER_RIBS.get() == organ1.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("rose_creeper_ribs", true);
										} else if (StitchedSinsModItems.WOLF_RIBS.get() == organ1.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("wolf_ribs", true);
										} else if (StitchedSinsModItems.DRAGON_HEART.get() == organ1.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("dragon_heart", true);
										} else if ((nom1).equals("sons_of_sins:creeper_ribs")) {
											finalorgan.getOrCreateTag().putBoolean("creeper_ribs", true);
										} else if ((nom1).equals("sons_of_sins:blazing_heart")) {
											finalorgan.getOrCreateTag().putBoolean("blazing_heart", true);
										} else if ((nom1).equals("sons_of_sins:golem_cuirass")) {
											finalorgan.getOrCreateTag().putBoolean("golem_cuirass", true);
										} else if ((nom1).equals("sons_of_sins:enderman_muscle")) {
											finalorgan.getOrCreateTag().putBoolean("enderman_muscles", true);
										}
										if (StitchedSinsModItems.ENDERMAN_HEART.get() == organ2.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("enderman_heart", true);
										} else if (StitchedSinsModItems.ICE_HEART.get() == organ2.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("ice_heart", true);
										} else if (StitchedSinsModItems.PREDATOR_MUSCLE.get() == organ2.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("predator_muscle", true);
										} else if (StitchedSinsModItems.WARPED_GOLEM_CUIRASS.get() == organ2.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("warped_golem_cuirass", true);
										} else if (StitchedSinsModItems.ROSE_CREEPER_RIBS.get() == organ2.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("rose_creeper_ribs", true);
										} else if (StitchedSinsModItems.WOLF_RIBS.get() == organ2.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("wolf_ribs", true);
										} else if (StitchedSinsModItems.DRAGON_HEART.get() == organ2.getItem()) {
											finalorgan.getOrCreateTag().putBoolean("dragon_heart", true);
										} else if ((nom2).equals("sons_of_sins:creeper_ribs")) {
											finalorgan.getOrCreateTag().putBoolean("creeper_ribs", true);
										} else if ((nom2).equals("sons_of_sins:blazing_heart")) {
											finalorgan.getOrCreateTag().putBoolean("blazing_heart", true);
										} else if ((nom2).equals("sons_of_sins:golem_cuirass")) {
											finalorgan.getOrCreateTag().putBoolean("golem_cuirass", true);
										} else if ((nom2).equals("sons_of_sins:enderman_muscle")) {
											finalorgan.getOrCreateTag().putBoolean("enderman_muscles", true);
										}
										nbrmaled = Mth.nextInt(RandomSource.create(), 1, 3);
										finalorgan.getOrCreateTag().putDouble("nbrmaled", nbrmaled);
										finalorgan.getOrCreateTag().putDouble("slowness", 123);
										finalorgan.getOrCreateTag().putDouble("healthboost", 123);
										finalorgan.getOrCreateTag().putDouble("weakness", 123);
										finalorgan.getOrCreateTag().putDouble("poison", 123);
										for (int index0 = 0; index0 < (int) nbrmaled; index0++) {
											posmal = Mth.nextInt(RandomSource.create(), 0, 2);
											if (posmal == 0) {
												malusstrenght = Mth.nextInt(RandomSource.create(), -2, 1);
												if (finalorgan.getOrCreateTag().getDouble("slowness") > malusstrenght) {
													finalorgan.getOrCreateTag().putDouble("slowness", malusstrenght);
												}
											} else if (posmal == 1) {
												malusstrenght = Mth.nextInt(RandomSource.create(), 0, 1);
												if (finalorgan.getOrCreateTag().getDouble("healthboost") > malusstrenght) {
													finalorgan.getOrCreateTag().putDouble("healthboost", malusstrenght);
												}
											} else if (posmal == 2) {
												malusstrenght = Mth.nextInt(RandomSource.create(), -2, 1);
												if (finalorgan.getOrCreateTag().getDouble("weakness") > malusstrenght) {
													finalorgan.getOrCreateTag().putDouble("weakness", malusstrenght);
												}
											} else if (posmal == 3) {
												malusstrenght = Mth.nextInt(RandomSource.create(), -2, 1);
												if (finalorgan.getOrCreateTag().getDouble("poison") > malusstrenght) {
													finalorgan.getOrCreateTag().putDouble("poison", malusstrenght);
												}
											}
										}
										if (finalorgan.getOrCreateTag().getDouble("poison") == 123) {
											finalorgan.getOrCreateTag().putDouble("poison", 0);
										}
										if (finalorgan.getOrCreateTag().getDouble("healthboost") == 123) {
											finalorgan.getOrCreateTag().putDouble("healthboost", 0);
										}
										if (finalorgan.getOrCreateTag().getDouble("weakness") == 123) {
											finalorgan.getOrCreateTag().putDouble("weakness", 0);
										}
										if (finalorgan.getOrCreateTag().getDouble("slowness") == 123) {
											finalorgan.getOrCreateTag().putDouble("slowness", 0);
										}
										finalorgan.getOrCreateTag().putString("n1organ", (organ1.getDisplayName().getString()));
										finalorgan.getOrCreateTag().putString("n2organ", (organ2.getDisplayName().getString()));
										StitchedSinsMod.LOGGER.info(organ1.getDisplayName().getString() + "" + organ2.getDisplayName().getString());
										{
											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
											if (_ent != null) {
												final int _slotid = 4;
												final ItemStack _setstack = finalorgan;
												_setstack.setCount(1);
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
										{
											ItemStack _ist = needle;
											if (_ist.hurt(1, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
										if (needle.getDamageValue() != needle.getMaxDamage()) {
											{
												BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
												if (_ent != null) {
													final int _slotid = 2;
													final ItemStack _setstack = needle;
													_setstack.setCount(1);
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable)
															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
													});
												}
											}
										} else {
											{
												BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
												if (_ent != null) {
													final int _slotid = 2;
													final ItemStack _setstack = new ItemStack(StitchedSinsModItems.WASTES.get());
													_setstack.setCount(0);
													_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
														if (capability instanceof IItemHandlerModifiable)
															((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
													});
												}
											}
										}
										{
											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
											if (_ent != null) {
												final int _slotid = 3;
												final ItemStack _setstack = new ItemStack(StitchedSinsModItems.ETHER_STRING.get());
												_setstack.setCount((int) ((new Object() {
													public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
														return _retval.get();
													}
												}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getCount() - 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
										organ1.shrink(1);
										organ2.shrink(1);
										{
											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
											if (_ent != null) {
												final int _slotid = 0;
												final ItemStack _setstack = organ1;
												_setstack.setCount(organ1.getCount());
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
										{
											BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
											if (_ent != null) {
												final int _slotid = 1;
												final ItemStack _setstack = organ2;
												_setstack.setCount(organ2.getCount());
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
												});
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
