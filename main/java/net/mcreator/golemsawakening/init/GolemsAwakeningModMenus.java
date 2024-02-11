
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.golemsawakening.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.golemsawakening.world.inventory.InventoryGolemComposterMenu;
import net.mcreator.golemsawakening.GolemsAwakeningMod;

public class GolemsAwakeningModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GolemsAwakeningMod.MODID);
	public static final RegistryObject<MenuType<InventoryGolemComposterMenu>> INVENTORY_GOLEM_COMPOSTER = REGISTRY.register("inventory_golem_composter", () -> IForgeMenuType.create(InventoryGolemComposterMenu::new));
}
