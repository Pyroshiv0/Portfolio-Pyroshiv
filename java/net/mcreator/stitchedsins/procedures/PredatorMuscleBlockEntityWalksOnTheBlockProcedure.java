package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import java.lang.Math;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;


import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;


public class PredatorMuscleBlockEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world,double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			
			double rayon = 0;
			int dx=0;
			int dz=0;
			boolean found=false;
			int cpt=0;
			while (!found && cpt<30){
				dx=Mth.nextInt(RandomSource.create(), -10, 10);
				dz=Mth.nextInt(RandomSource.create(), -10, 10);
				for (int dy=-10;dy<=10;dy++){
						rayon=Math.sqrt((double) dx*dx+dy*dy+dz*dz);
						if (rayon>1.0f){
								if ((world.getBlockState(BlockPos.containing(x+dx, y+dy + 1, z+dz))).getBlock() == Blocks.AIR) {
									if ((world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz))).getBlock() == Blocks.AIR) {
										if (world.getBlockState(BlockPos.containing(x+dx, y+dy - 1, z+dz)).canOcclude()) {
												found=true;
												_ent.teleportTo(x+dx, y+dy, z+dz);
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport(x+dx, y+dy, z+dz, _ent.getYRot(), _ent.getXRot());
													_ent.fallDistance = 0;

									}
								}
								}
						
					}
				}
			cpt++;
			}
		}
	}
}
