
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justenoughtgadgets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;

public class JustEnoughtGadgetsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JustEnoughtGadgetsMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATIVE_MOD_TAB = REGISTRY.register("creative_mod_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.just_enought_gadgets.creative_mod_tab")).icon(() -> new ItemStack(JustEnoughtGadgetsModBlocks.DISCO_CUBE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JustEnoughtGadgetsModBlocks.DISCO_CUBE.get().asItem());
				tabData.accept(JustEnoughtGadgetsModItems.HUGE_BUCKET.get());
				tabData.accept(JustEnoughtGadgetsModItems.WATER_HUGE_BUCKET_ITEM.get());
				tabData.accept(JustEnoughtGadgetsModItems.LAVA_HUGE_BUCKET.get());
				tabData.accept(JustEnoughtGadgetsModItems.GIGANTIC_BUCKET.get());
				tabData.accept(JustEnoughtGadgetsModItems.LAVA_GIGANTIC_BUCKET.get());
				tabData.accept(JustEnoughtGadgetsModItems.WATER_GIGANTIC_BUCKET.get());
			})

					.build());
}
