package net.mcreator.stitchedsins.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;



import net.mcreator.stitchedsins.init.StitchedSinsModMobEffects;

import javax.annotation.Nullable;
import java.lang.Math;

import net.mcreator.stitchedsins.init.StitchedSinsModMobEffects;

import javax.annotation.Nullable;



@Mod.EventBusSubscriber
public class EffectsOnAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(),event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity,Entity sourceentity) {
		execute(null, world, x, y, z, entity,sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity,Entity sourceentity) {
		if (entity == null || sourceentity ==null)
			return;
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(StitchedSinsModMobEffects.MISSILE_FIST.get())) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 1.2, (entity.getDeltaMovement().z())));
		}
		if (sourceentity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(StitchedSinsModMobEffects.FREEZING.get())) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FREEZE)), 2);
			entity.setTicksFrozen(300);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, false, true));
		}
		
		if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(StitchedSinsModMobEffects.PREDATOR_GROWL.get())) {
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
						if (rayon>7.0f){
							
								if ((world.getBlockState(BlockPos.containing(x+dx, y+dy + 1, z+dz))).getBlock() == Blocks.AIR) {
									if ((world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz))).getBlock() == Blocks.AIR) {
										if (world.getBlockState(BlockPos.containing(x+dx, y+dy - 1, z+dz)).canOcclude()) {
												found=true;
												Entity _ent = sourceentity;
												_ent.teleportTo(x+dx, y+dy, z+dz);
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport(x+dx, y+dy, z+dz, _ent.getYRot(), _ent.getXRot());
										
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