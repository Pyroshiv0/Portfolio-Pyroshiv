package net.mcreator.justenoughtgadgets.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;

public class HugeBucketItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		ItemStack jjj = ItemStack.EMPTY;
		itemstack.getOrCreateTag().putBoolean("isfilled", false);
		itemstack.getOrCreateTag().putBoolean("iswater", false);
		itemstack.getOrCreateTag().putBoolean("islava", false);
		itemstack.getOrCreateTag().putDouble("containing", 0);
		JustEnoughtGadgetsMod.LOGGER.info("");
	}
}
