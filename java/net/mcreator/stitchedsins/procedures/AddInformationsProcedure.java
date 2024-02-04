package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.item.ItemStack;

public class AddInformationsProcedure {
	public static String execute(ItemStack itemstack) {
		String desc = "";
		desc = "";
		if (itemstack.getOrCreateTag().getBoolean("creeper_ribs")) {
			desc = desc + "\n" + "\u00A72" + "-Creeper Ribs";
		}
		if (itemstack.getOrCreateTag().getBoolean("enderman_muscles")) {
			desc = desc + "\n" + "\u00A72" + "-Enderman Muscles";
		}
		if (itemstack.getOrCreateTag().getBoolean("blazing_heart")) {
			desc = desc + "\n" + "\u00A72" + "-Blazing Heart";
		}
		if (itemstack.getOrCreateTag().getBoolean("golem_cuirass")) {
			desc = desc + "\n" + "\u00A72" + "-Golem Cuirass";
		}
		if (itemstack.getOrCreateTag().getBoolean("wolf_ribs")) {
			desc = desc + "\n" + "\u00A72" + "-Wolf Ribs";
		}
		if (itemstack.getOrCreateTag().getBoolean("enderman_heart")) {
			desc = desc + "\n" + "\u00A72" + "-Enderman Heart";
		}
		if (itemstack.getOrCreateTag().getBoolean("dragon_heart")) {
			desc = desc + "\n" + "\u00A72" + "-Dragon Heart";
		}
		if (itemstack.getOrCreateTag().getDouble("slowness") < 0) {
			desc = desc + "\n" + "\u00A74" + "-Slowness " + itemstack.getOrCreateTag().getDouble("slowness") * (-1);
		} else if (itemstack.getOrCreateTag().getDouble("slowness") > 0) {
			desc = desc + "\n" + "\u00A72" + "-Speed";
		}
		if (itemstack.getOrCreateTag().getDouble("healthboost") == 1) {
			desc = desc + "\n" + "\u00A72" + "-Health Boost";
		}
		if (itemstack.getOrCreateTag().getDouble("weakness") < 0) {
			desc = desc + "\n" + "\u00A74" + "-Weakness " + itemstack.getOrCreateTag().getDouble("weakness") * (-1);
		} else if (itemstack.getOrCreateTag().getDouble("weakness") > 0) {
			desc = desc + "\n" + "\u00A72" + "-Strength";
		}
		if (itemstack.getOrCreateTag().getDouble("poison") < 0) {
			desc = desc + "\n" + "\u00A74" + "-Poison " + itemstack.getOrCreateTag().getDouble("poison") * (-1);
		} else if (itemstack.getOrCreateTag().getDouble("poison") > 0) {
			desc = desc + "\n" + "\u00A72" + "-Regeneration";
		}
		return desc;
	}
}
