package net.mcreator.stitchedsins.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

public class WolfRibsTriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double nb = 0;
		if (!(entity instanceof Player)) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!found) {
						if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:spider")) {
							found = true;
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							entity.getPersistentData().putDouble("ragetimer", 80);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
						} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:zombie")) {
							found = true;
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							entity.getPersistentData().putDouble("ragetimer", 80);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
						} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:creeper")) {
							found = true;
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							entity.getPersistentData().putDouble("ragetimer", 80);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
						} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:enderman")) {
							found = true;
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							entity.getPersistentData().putDouble("ragetimer", 80);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
						} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:endermite")) {
							found = true;
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							entity.getPersistentData().putDouble("ragetimer", 80);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
						} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:skeletons")))) {
							found = true;
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							entity.getPersistentData().putDouble("ragetimer", 80);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
						} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:raiders")))) {
							found = true;
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							entity.getPersistentData().putDouble("ragetimer", 80);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
						} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:blaze")) {
							found = true;
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							entity.getPersistentData().putDouble("ragetimer", 80);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
						} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:sheep")) {
							found = true;
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							entity.getPersistentData().putDouble("ragetimer", 80);
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
						}
					}
				}
			}
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 0, false, false));
		}
	}
}
