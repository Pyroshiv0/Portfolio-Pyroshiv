package net.mcreator.justenoughtgadgets.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.items.ItemHandlerHelper;

import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;

import net.mcreator.justenoughtgadgets.init.JustEnoughtGadgetsModItems;



public class GiganticBucketRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean taken = false;
		BlockState looked = Blocks.AIR.defaultBlockState();
		double dx = 0;
		double dy = 0;
		double dz = 0;
		double raytrace = 0;
		double tempx = 0;
		double tempy = 0;
		double tempz = 0;
		ItemStack returned=ItemStack.EMPTY;
		raytrace = 0.5;
		for (int index0 = 0; index0 < 5; index0++) {
			tempx = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace)), ClipContext.Block.COLLIDER, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX();
			tempy = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace)), ClipContext.Block.COLLIDER, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY();
			tempz = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace)), ClipContext.Block.COLLIDER, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ();
			looked = (world.getBlockState(BlockPos.containing(tempx, tempy, tempz)));
			/*if (mode==1){

			switch (direction) {
				case DOWN:
					tempy--;JustEnoughtGadgetsMod.LOGGER.info("DOWN");
					break;
				case  UP:
					tempy++;JustEnoughtGadgetsMod.LOGGER.info("UP");
					break;
				case  SOUTH:
					tempz++;
					break;
				case  NORTH:
					tempz--;
					break;
				case  EAST:
					tempx++;
					break;
				case  WEST:
					tempx--;
					break;
				default:
					break;
			}}
			else {
				;
			}*/
			JustEnoughtGadgetsMod.LOGGER.info("selected block:" + ForgeRegistries.BLOCKS.getKey(looked.getBlock()).toString());
			if (looked.getFluidState().isSource()) {
					if (looked.getBlock() == Blocks.LAVA) {
						taken = true;
						world.setBlock(BlockPos.containing(tempx, tempy, tempz), Blocks.AIR.defaultBlockState(), 3);
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						
						returned = new ItemStack(JustEnoughtGadgetsModItems.LAVA_GIGANTIC_BUCKET.get());
						returned.getOrCreateTag().putBoolean("isfilled", true);
						returned.getOrCreateTag().putDouble("containing", 1);
						returned.getOrCreateTag().putBoolean("islava", true);

						for (dx = -2; dx<=2; dx++) {
							for (dy = -2; dy<=2; dy++) {
								for (dz = -2; dz<=2; dz++) {
									
									if (!(dx == 0 && dy == 0 && dz == 0)) {
										if (returned.getOrCreateTag().getDouble("containing") <= 124) {

										if ((world.getBlockState(BlockPos.containing(tempx + dx, tempy + dy, tempz + dz))).getFluidState().isSource()) {
											if ((world.getBlockState(BlockPos.containing(tempx + dx, tempy + dy, tempz + dz))).getBlock() == Blocks.LAVA) {
												world.setBlock(BlockPos.containing(tempx + dx, tempy + dy, tempz + dz), Blocks.AIR.defaultBlockState(), 3);
												returned.getOrCreateTag().putDouble("containing", (returned.getOrCreateTag().getDouble("containing") + 1));
											}}
										}
									}
								}
							}
						}
					} else if (looked.getBlock() == Blocks.WATER) {
						
						taken = true;
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.setBlock(BlockPos.containing(tempx, tempy, tempz), Blocks.AIR.defaultBlockState(), 3);
						returned = new ItemStack(JustEnoughtGadgetsModItems.WATER_GIGANTIC_BUCKET.get());
						returned.getOrCreateTag().putBoolean("isfilled", true);
						returned.getOrCreateTag().putDouble("containing", 1);
						returned.getOrCreateTag().putBoolean("iswater", true);
						for (dx = -2; dx<=2; dx++) {
							for (dy = -2; dy<=2; dy++) {
								for (dz = -2; dz<=2; dz++) {
									
									if (!(dx == 0 && dy == 0 && dz == 0)) {
										if (returned.getOrCreateTag().getDouble("containing") <= 124) {

										if ((world.getBlockState(BlockPos.containing(tempx + dx, tempy + dy, tempz + dz))).getFluidState().isSource()) {
											if ((world.getBlockState(BlockPos.containing(tempx + dx, tempy + dy, tempz + dz))).getBlock() == Blocks.WATER) {
												world.setBlock(BlockPos.containing(tempx + dx, tempy + dy, tempz + dz), Blocks.AIR.defaultBlockState(), 3);
												returned.getOrCreateTag().putDouble("containing", (returned.getOrCreateTag().getDouble("containing") + 1));
											}}
										}
									}
								}
							}
						}

					}
				
			}
			if (!taken) {
				
				if (!(looked.getBlock() == Blocks.AIR) && itemstack.getOrCreateTag().getBoolean("isfilled")) {JustEnoughtGadgetsMod.LOGGER.info("nottaken and filled");

				}
				if (taken) {
					break;
				}
			} else {
				break;
			}
			raytrace = raytrace + 1;
		}
		
		if (returned.getOrCreateTag().getBoolean("isfilled")){
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof LivingEntity _entity) {
				returned.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, returned);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else {
			if (entity instanceof Player _player) {
				returned.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, returned);
			}
		}

	}}
}
