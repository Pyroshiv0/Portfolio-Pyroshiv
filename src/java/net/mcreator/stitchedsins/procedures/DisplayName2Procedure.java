package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.item.ItemStack;

public class DisplayName2Procedure {
	public static String execute(ItemStack itemstack) {
		String useless = "";
		useless = itemstack.getOrCreateTag().getString("n2organ");
		useless = useless.replace("[", "");
		useless = useless.replace("]", "");
		return "\u00A72" + "-" + useless;
	}
}
