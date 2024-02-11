package net.mcreator.justenoughtgadgets.procedures;

import net.minecraft.world.item.ItemStack;

public class HugeBucketPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		double value = 0;
		if (itemstack.getOrCreateTag().getBoolean("iswater")) {
			value = 1;
		} else if (itemstack.getOrCreateTag().getBoolean("islava")) {
			value = 2;
		} else {
			value = 0;
		}
		return value;
	}
}
