
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stitchedsins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.stitchedsins.world.inventory.SewingTableGUIMenu;
import net.mcreator.stitchedsins.StitchedSinsMod;

public class StitchedSinsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StitchedSinsMod.MODID);
	public static final RegistryObject<MenuType<SewingTableGUIMenu>> SEWING_TABLE_GUI = REGISTRY.register("sewing_table_gui", () -> IForgeMenuType.create(SewingTableGUIMenu::new));
}
