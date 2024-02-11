package net.mcreator.justenoughtgadgets.procedures;

import net.minecraft.world.item.ItemStack;

public class GiganticBucketSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		return "Content: " + itemstack.getOrCreateTag().getDouble("containing") + "/125";
	}
}
