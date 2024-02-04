package net.mcreator.stitchedsins.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;
import java.util.Comparator;

public class EndermanHeartEatenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!found) {
					if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:spider")) {
						found = true;
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), 2);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 3, 3, 3, 1);
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:zombie")) {
						found = true;
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), 2);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 3, 3, 3, 1);
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:creeper")) {
						found = true;
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), 2);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 3, 3, 3, 1);
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:enderman")) {
						found = true;
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), 2);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 3, 3, 3, 1);
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:endermite")) {
						found = true;
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), 2);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 3, 3, 3, 1);
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:skeletons")))) {
						found = true;
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), 2);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 3, 3, 3, 1);
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:axolotl_always_hostiles")))) {
						found = true;
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), 2);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 3, 3, 3, 1);
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:raiders")))) {
						found = true;
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), 2);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 3, 3, 3, 1);
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:blaze")) {
						found = true;
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), 2);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 10, 3, 3, 3, 1);
					}
				}
			}
		}
	}
}
