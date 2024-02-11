
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justenoughtgadgets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.justenoughtgadgets.block.DiscoCubeBlock;
import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;

public class JustEnoughtGadgetsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JustEnoughtGadgetsMod.MODID);
	public static final RegistryObject<Block> DISCO_CUBE = REGISTRY.register("disco_cube", () -> new DiscoCubeBlock());
}
