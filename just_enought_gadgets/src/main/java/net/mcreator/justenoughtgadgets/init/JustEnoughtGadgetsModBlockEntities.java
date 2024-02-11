
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justenoughtgadgets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.justenoughtgadgets.block.entity.DiscoCubeBlockEntity;
import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;

public class JustEnoughtGadgetsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, JustEnoughtGadgetsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DISCO_CUBE = register("disco_cube", JustEnoughtGadgetsModBlocks.DISCO_CUBE, DiscoCubeBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
