
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stitchedsins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.stitchedsins.block.WarpedCuirassBlockBlock;
import net.mcreator.stitchedsins.block.SewingTableBlock;
import net.mcreator.stitchedsins.block.RoseCreeperRibsBlockBlock;
import net.mcreator.stitchedsins.block.PredatorMuscleBlockBlock;
import net.mcreator.stitchedsins.block.IceHeartBlockBlock;
import net.mcreator.stitchedsins.StitchedSinsMod;

public class StitchedSinsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StitchedSinsMod.MODID);
	public static final RegistryObject<Block> SEWING_TABLE = REGISTRY.register("sewing_table", () -> new SewingTableBlock());
	public static final RegistryObject<Block> ICE_HEART_BLOCK = REGISTRY.register("ice_heart_block", () -> new IceHeartBlockBlock());
	public static final RegistryObject<Block> ROSE_CREEPER_RIBS_BLOCK = REGISTRY.register("rose_creeper_ribs_block", () -> new RoseCreeperRibsBlockBlock());
	public static final RegistryObject<Block> WARPED_CUIRASS_BLOCK = REGISTRY.register("warped_cuirass_block", () -> new WarpedCuirassBlockBlock());
	public static final RegistryObject<Block> PREDATOR_MUSCLE_BLOCK = REGISTRY.register("predator_muscle_block", () -> new PredatorMuscleBlockBlock());
}
