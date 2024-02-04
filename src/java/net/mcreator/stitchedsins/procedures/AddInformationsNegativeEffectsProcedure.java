package net.mcreator.stitchedsins.procedures;

import net.minecraft.world.item.ItemStack;

public class AddInformationsNegativeEffectsProcedure {
	public static String execute(ItemStack itemstack) {
		String desc = "";
		if (itemstack.getOrCreateTag().getDouble("slowness") < 0) {
			desc = desc + "/\u00A74" + "-Slowness " + itemstack.getOrCreateTag().getDouble("slowness") * (-1);
		} else if (itemstack.getOrCreateTag().getDouble("slowness") > 0) {
			desc = desc + "/\u00A72" + "-Speed";
		}
		if (itemstack.getOrCreateTag().getDouble("healthboost") == 1) {
			desc = desc + "/\u00A72" + "-Health Boost";
		}
		if (itemstack.getOrCreateTag().getDouble("weakness") < 0) {
			desc = desc + "/\u00A74" + "-Weakness " + itemstack.getOrCreateTag().getDouble("weakness") * (-1);
		} else if (itemstack.getOrCreateTag().getDouble("weakness") > 0) {
			desc = desc + "/\u00A72" + "-Strength";
		}
		if (itemstack.getOrCreateTag().getDouble("poison") < 0) {
			desc = desc + "/\u00A74" + "-Poison " + itemstack.getOrCreateTag().getDouble("poison") * (-1);
		} else if (itemstack.getOrCreateTag().getDouble("poison") > 0) {
			desc = desc + "/\u00A72" + "-Regeneration";
		}
		return desc;
	}
}
