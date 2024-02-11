
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justenoughtgadgets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.justenoughtgadgets.entity.WaterBuckEntity;
import net.mcreator.justenoughtgadgets.entity.LavaHugeBucEntity;
import net.mcreator.justenoughtgadgets.entity.LavaBuckEntity;
import net.mcreator.justenoughtgadgets.entity.HugeBucketEmpEntity;
import net.mcreator.justenoughtgadgets.entity.EmpBuckEntity;
import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JustEnoughtGadgetsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JustEnoughtGadgetsMod.MODID);
	public static final RegistryObject<EntityType<HugeBucketEmpEntity>> HUGE_BUCKET_EMP = register("projectile_huge_bucket_emp",
			EntityType.Builder.<HugeBucketEmpEntity>of(HugeBucketEmpEntity::new, MobCategory.MISC).setCustomClientFactory(HugeBucketEmpEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LavaHugeBucEntity>> LAVA_HUGE_BUC = register("projectile_lava_huge_buc",
			EntityType.Builder.<LavaHugeBucEntity>of(LavaHugeBucEntity::new, MobCategory.MISC).setCustomClientFactory(LavaHugeBucEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EmpBuckEntity>> EMP_BUCK = register("projectile_emp_buck",
			EntityType.Builder.<EmpBuckEntity>of(EmpBuckEntity::new, MobCategory.MISC).setCustomClientFactory(EmpBuckEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LavaBuckEntity>> LAVA_BUCK = register("projectile_lava_buck",
			EntityType.Builder.<LavaBuckEntity>of(LavaBuckEntity::new, MobCategory.MISC).setCustomClientFactory(LavaBuckEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterBuckEntity>> WATER_BUCK = register("projectile_water_buck",
			EntityType.Builder.<WaterBuckEntity>of(WaterBuckEntity::new, MobCategory.MISC).setCustomClientFactory(WaterBuckEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
