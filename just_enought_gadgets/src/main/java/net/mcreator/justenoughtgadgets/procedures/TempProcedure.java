package net.mcreator.justenoughtgadgets.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;

public class TempProcedure {
	public static void execute() {
		String temp = "";
		if (!ForgeRegistries.BLOCKS.getValue(new ResourceLocation((temp).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState().is(BlockTags.create(new ResourceLocation("minecraft:beacon_base_blocks")))) {
			JustEnoughtGadgetsMod.LOGGER.info("bozo");
		}
	}
}
