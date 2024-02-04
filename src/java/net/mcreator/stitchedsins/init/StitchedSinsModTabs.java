
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stitchedsins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.stitchedsins.StitchedSinsMod;

public class StitchedSinsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StitchedSinsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOD_OBJECTS = REGISTRY.register("mod_objects",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.stitched_sins.mod_objects")).icon(() -> new ItemStack(StitchedSinsModItems.ETHER_STRING.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StitchedSinsModBlocks.SEWING_TABLE.get().asItem());
				tabData.accept(StitchedSinsModItems.BONE_NEEDLE.get());
				tabData.accept(StitchedSinsModItems.ETHER_STRING.get());
				tabData.accept(StitchedSinsModItems.DRAGON_HEART.get());
				tabData.accept(StitchedSinsModItems.ICE_HEART.get());
				tabData.accept(StitchedSinsModItems.ENDERMAN_HEART.get());
				tabData.accept(StitchedSinsModItems.WOLF_RIBS.get());
				tabData.accept(StitchedSinsModItems.ROSE_CREEPER_RIBS.get());
				tabData.accept(StitchedSinsModItems.WARPED_GOLEM_CUIRASS.get());
				tabData.accept(StitchedSinsModItems.PREDATOR_MUSCLE.get());
				tabData.accept(StitchedSinsModItems.WARPED_CHIP.get());
				tabData.accept(StitchedSinsModBlocks.ICE_HEART_BLOCK.get().asItem());
				tabData.accept(StitchedSinsModBlocks.ROSE_CREEPER_RIBS_BLOCK.get().asItem());
				tabData.accept(StitchedSinsModBlocks.WARPED_CUIRASS_BLOCK.get().asItem());
				tabData.accept(StitchedSinsModBlocks.PREDATOR_MUSCLE_BLOCK.get().asItem());
			})

					.build());
}
