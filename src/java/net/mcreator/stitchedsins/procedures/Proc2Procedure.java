package net.mcreator.stitchedsins.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.stitchedsins.init.StitchedSinsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Proc2Procedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double nb = 0;
		boolean found = false;
		ItemStack current = ItemStack.EMPTY;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("sons_of_sins:is_a_flesh_creature")))) {
			nb = 0;
			for (int index0 = 0; index0 < 4; index0++) {
				current = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) nb)) : ItemStack.EMPTY);
				if (current.getItem() == StitchedSinsModItems.ENDERMAN_HEART.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set((int) nb, new ItemStack(StitchedSinsModItems.ENDERMAN_HEART_CONFIRMED.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) nb), new ItemStack(StitchedSinsModItems.ENDERMAN_HEART_CONFIRMED.get()));
						}
					}
					entity.getPersistentData().putDouble("enderhearttimer", 0);
				} else if (current.getItem() == StitchedSinsModItems.ENDERMAN_HEART_CONFIRMED.get()) {
					if (entity.getPersistentData().getDouble("enderhearttimer") > 0) {
						entity.getPersistentData().putDouble("enderhearttimer", (entity.getPersistentData().getDouble("enderhearttimer") - 1));
					} else {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, x, y, z, 10, 3, 3, 3, 1);
						EndermanHeartEatenProcedure.execute(world, x, (y + 0.5), z);
						entity.getPersistentData().putDouble("enderhearttimer", 50);
					}
				} else if (current.getItem() == StitchedSinsModItems.WOLF_RIBS.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set((int) nb, new ItemStack(StitchedSinsModItems.WOLF_RIBS_CONFIRMED.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) nb), new ItemStack(StitchedSinsModItems.WOLF_RIBS_CONFIRMED.get()));
						}
					}
					entity.getPersistentData().putDouble("ragetimer", 0);
				} else if (current.getItem() == StitchedSinsModItems.WOLF_RIBS_CONFIRMED.get()) {
					if (entity.getPersistentData().getDouble("ragetimer") > 0) {
						entity.getPersistentData().putDouble("ragetimer", (entity.getPersistentData().getDouble("ragetimer") - 1));
					} else {
						WolfRibsTriggerProcedure.execute(world, x, y, z, entity);
						entity.getPersistentData().putDouble("ragetimer", 30);
					}
				} else if (current.getItem() == StitchedSinsModItems.DRAGON_HEART.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set((int) nb, new ItemStack(StitchedSinsModItems.DRAGON_HEART_CONFIRMED.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) nb), new ItemStack(StitchedSinsModItems.DRAGON_HEART_CONFIRMED.get()));
						}
					}
					entity.getPersistentData().putDouble("dragontimer", 0);
				} else if (current.getItem() == StitchedSinsModItems.DRAGON_HEART_CONFIRMED.get()) {
					if (entity.getPersistentData().getDouble("dragontimer") > 0) {
						entity.getPersistentData().putDouble("dragontimer", (entity.getPersistentData().getDouble("dragontimer") - 1));
					} else {
						DragonheartShootFIREBallProcedure.execute(world, x, y, z, entity);
						entity.getPersistentData().putDouble("dragontimer", 600);
					}
				} else if (current.getItem() == StitchedSinsModItems.ICE_HEART.get()) {
					IceHeartEffectProcedure.execute(entity);
				} else if (current.getItem() == StitchedSinsModItems.WARPED_GOLEM_CUIRASS.get()) {
					WarpedGolemCuirassEffectProcedure.execute(entity);
				} else if (current.getItem() == StitchedSinsModItems.ROSE_CREEPER_RIBS.get()) {
					RoseCreeperRibsEffectProcedure.execute(entity);
				} else if (current.getItem() == StitchedSinsModItems.PREDATOR_MUSCLE.get()) {
					PredatorMuscleEffectProcedure.execute(entity);
				} else if (current.getItem() == StitchedSinsModItems.STITCHED_HEART.get()) {
					StitchedOrganEffectProcedure.execute(world, x, y, z, entity, current);
				} else if (current.getItem() == StitchedSinsModItems.STITCHED_RIBS.get()) {
					StitchedOrganEffectProcedure.execute(world, x, y, z, entity, current);
				} else if (current.getItem() == StitchedSinsModItems.STITCHED_MUSCLES.get()) {
					StitchedOrganEffectProcedure.execute(world, x, y, z, entity, current);
				}
				nb = nb + 1;
			}
		}
	}
}
