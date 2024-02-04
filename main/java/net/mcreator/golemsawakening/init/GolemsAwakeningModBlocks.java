
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.golemsawakening.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.golemsawakening.block.TimerTestBlockBlock;
import net.mcreator.golemsawakening.block.BlockTestPlacageBlock;
import net.mcreator.golemsawakening.GolemsAwakeningMod;

public class GolemsAwakeningModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GolemsAwakeningMod.MODID);
	public static final RegistryObject<Block> BLOCK_TEST_PLACAGE = REGISTRY.register("block_test_placage", () -> new BlockTestPlacageBlock());
	public static final RegistryObject<Block> TIMER_TEST_BLOCK = REGISTRY.register("timer_test_block", () -> new TimerTestBlockBlock());
}
