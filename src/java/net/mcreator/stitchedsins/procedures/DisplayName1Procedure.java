package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.item.ItemStack;

public class DisplayName1Procedure {
	public static String execute(ItemStack itemstack) {
		String useless = "";
		useless = itemstack.getOrCreateTag().getString("n1organ");
		useless = useless.replace("[", "");
		useless = useless.replace("]", "");
		return "\u00A72" + "-" + useless;
	}
}
