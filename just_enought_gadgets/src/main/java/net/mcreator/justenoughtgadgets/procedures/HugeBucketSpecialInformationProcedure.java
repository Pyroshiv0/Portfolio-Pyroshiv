package net.mcreator.justenoughtgadgets.procedures;

import net.minecraft.world.item.ItemStack;

public class HugeBucketSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return "Content: " + itemstack.getOrCreateTag().getDouble("containing") + "/27";
	}
}
