package net.mcreator.stitchedsins.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.stitchedsins.init.StitchedSinsModEntities;

import java.util.List;
import java.util.Comparator;

public class DragonheartShootFIREBallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		boolean delay = false;
		double dy = 0;
		double etapes = 0;
		double tempsmontee = 0;
		double distancemontee = 0;
		double dt = 0;
		double ex = 0;
		double ey = 0;
		double ez = 0;
		double temps = 0;
		double temps2 = 0;
		double temps3 = 0;
		double ecart = 0;
		double sact = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!found) {
					if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:spider")) {
						found = true;
						ex = entityiterator.getX();
						ey = entityiterator.getY();
						ez = entityiterator.getZ();
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:zombie")) {
						found = true;
						ex = entityiterator.getX();
						ey = entityiterator.getY();
						ez = entityiterator.getZ();
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:creeper")) {
						found = true;
						ex = entityiterator.getX();
						ey = entityiterator.getY();
						ez = entityiterator.getZ();
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:enderman")) {
						found = true;
						ex = entityiterator.getX();
						ey = entityiterator.getY();
						ez = entityiterator.getZ();
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:endermite")) {
						found = true;
						ex = entityiterator.getX();
						ey = entityiterator.getY();
						ez = entityiterator.getZ();
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:skeletons")))) {
						found = true;
						ex = entityiterator.getX();
						ey = entityiterator.getY();
						ez = entityiterator.getZ();
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:raiders")))) {
						found = true;
						ex = entityiterator.getX();
						ey = entityiterator.getY();
						ez = entityiterator.getZ();
					} else if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals("minecraft:blaze")) {
						found = true;
						ex = entityiterator.getX();
						ey = entityiterator.getY();
						ez = entityiterator.getZ();
					}
				}
			}
		}
		if (found) {
			if (entity instanceof Player) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 0, false, true));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0, false, true));
			}
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (entity.getY() + 10), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (entity.getY() + 10), z, _ent.getYRot(), _ent.getXRot());
			}
			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(ex, ey, ez));
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
							AbstractHurtingProjectile entityToSpawn = new DragonFireball(EntityType.DRAGON_FIREBALL, level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.xPower = ax;
							entityToSpawn.yPower = ay;
							entityToSpawn.zPower = az;
							return entityToSpawn;
						}
					}.getFireball(projectileLevel, entity, (entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z));
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 120, 1, false, false));
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = StitchedSinsModEntities.EXPLOSIVETOKEN.get().spawn(_level, BlockPos.containing(ex, ey, ez), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
	}
}
