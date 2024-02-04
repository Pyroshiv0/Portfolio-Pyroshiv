package net.mcreator.stitchedsins.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;

import net.mcreator.stitchedsins.init.StitchedSinsModItems;

public class ReversedOrgansProcedure {
	public static ItemStack execute(ItemStack itemstack) {
		ItemStack returned = ItemStack.EMPTY;
		if (("sons_of_sins:blazing_heart").equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
			returned = new ItemStack(StitchedSinsModItems.ICE_HEART.get());
			returned.getOrCreateTag().putBoolean("warped", true);
		} else if (("sons_of_sins:creeper_ribs").equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
			returned = new ItemStack(StitchedSinsModItems.ROSE_CREEPER_RIBS.get());
			returned.getOrCreateTag().putBoolean("warped", true);
		} else if (("sons_of_sins:golem_cuirass").equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
			returned = new ItemStack(StitchedSinsModItems.WARPED_GOLEM_CUIRASS.get());
			returned.getOrCreateTag().putBoolean("warped", true);
		} else if (("sons_of_sins:enderman_muscle").equals(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString())) {
			returned = new ItemStack(StitchedSinsModItems.PREDATOR_MUSCLE.get());
			returned.getOrCreateTag().putBoolean("warped", true);
		}
		return returned;
	}
}
