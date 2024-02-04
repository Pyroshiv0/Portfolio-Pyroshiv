
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stitchedsins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.stitchedsins.block.entity.SewingTableBlockEntity;
import net.mcreator.stitchedsins.block.entity.RoseCreeperRibsBlockBlockEntity;
import net.mcreator.stitchedsins.StitchedSinsMod;

public class StitchedSinsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StitchedSinsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SEWING_TABLE = register("sewing_table", StitchedSinsModBlocks.SEWING_TABLE, SewingTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROSE_CREEPER_RIBS_BLOCK = register("rose_creeper_ribs_block", StitchedSinsModBlocks.ROSE_CREEPER_RIBS_BLOCK, RoseCreeperRibsBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
