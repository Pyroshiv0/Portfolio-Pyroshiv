
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.golemsawakening.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.golemsawakening.GolemsAwakeningMod;

public class GolemsAwakeningModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GolemsAwakeningMod.MODID);
	public static final RegistryObject<Item> COMPOSTER_GOLEM_SPAWN_EGG = REGISTRY.register("composter_golem_spawn_egg", () -> new ForgeSpawnEggItem(GolemsAwakeningModEntities.COMPOSTER_GOLEM, -6724096, -3381760, new Item.Properties()));
	public static final RegistryObject<Item> BLOCK_TEST_PLACAGE = block(GolemsAwakeningModBlocks.BLOCK_TEST_PLACAGE);
	public static final RegistryObject<Item> TIMER_TEST_BLOCK = block(GolemsAwakeningModBlocks.TIMER_TEST_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
