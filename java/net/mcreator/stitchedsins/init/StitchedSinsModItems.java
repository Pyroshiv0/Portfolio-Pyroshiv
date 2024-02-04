
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stitchedsins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.stitchedsins.item.WolfRibsItem;
import net.mcreator.stitchedsins.item.WolfRibsConfirmedItem;
import net.mcreator.stitchedsins.item.WastesItem;
import net.mcreator.stitchedsins.item.WarpedGolemCuirassItem;
import net.mcreator.stitchedsins.item.WarpedChipItem;
import net.mcreator.stitchedsins.item.StitchedRibsItem;
import net.mcreator.stitchedsins.item.StitchedMusclesItem;
import net.mcreator.stitchedsins.item.StitchedHeartItem;
import net.mcreator.stitchedsins.item.RoseCreeperRibsItem;
import net.mcreator.stitchedsins.item.PredatorMuscleItem;
import net.mcreator.stitchedsins.item.IceHeartItem;
import net.mcreator.stitchedsins.item.EtherStringItem;
import net.mcreator.stitchedsins.item.EndermanHeartItem;
import net.mcreator.stitchedsins.item.EndermanHeartConfirmedItem;
import net.mcreator.stitchedsins.item.DragonHeartItem;
import net.mcreator.stitchedsins.item.DragonHeartConfirmedItem;
import net.mcreator.stitchedsins.item.BoneNeedleItem;
import net.mcreator.stitchedsins.StitchedSinsMod;

public class StitchedSinsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StitchedSinsMod.MODID);
	public static final RegistryObject<Item> SEWING_TABLE = block(StitchedSinsModBlocks.SEWING_TABLE);
	public static final RegistryObject<Item> BONE_NEEDLE = REGISTRY.register("bone_needle", () -> new BoneNeedleItem());
	public static final RegistryObject<Item> ETHER_STRING = REGISTRY.register("ether_string", () -> new EtherStringItem());
	public static final RegistryObject<Item> DRAGON_HEART = REGISTRY.register("dragon_heart", () -> new DragonHeartItem());
	public static final RegistryObject<Item> ICE_HEART = REGISTRY.register("ice_heart", () -> new IceHeartItem());
	public static final RegistryObject<Item> ENDERMAN_HEART = REGISTRY.register("enderman_heart", () -> new EndermanHeartItem());
	public static final RegistryObject<Item> WOLF_RIBS = REGISTRY.register("wolf_ribs", () -> new WolfRibsItem());
	public static final RegistryObject<Item> ROSE_CREEPER_RIBS = REGISTRY.register("rose_creeper_ribs", () -> new RoseCreeperRibsItem());
	public static final RegistryObject<Item> WARPED_GOLEM_CUIRASS = REGISTRY.register("warped_golem_cuirass", () -> new WarpedGolemCuirassItem());
	public static final RegistryObject<Item> PREDATOR_MUSCLE = REGISTRY.register("predator_muscle", () -> new PredatorMuscleItem());
	public static final RegistryObject<Item> WARPED_CHIP = REGISTRY.register("warped_chip", () -> new WarpedChipItem());
	public static final RegistryObject<Item> ICE_HEART_BLOCK = block(StitchedSinsModBlocks.ICE_HEART_BLOCK);
	public static final RegistryObject<Item> ROSE_CREEPER_RIBS_BLOCK = block(StitchedSinsModBlocks.ROSE_CREEPER_RIBS_BLOCK);
	public static final RegistryObject<Item> WARPED_CUIRASS_BLOCK = block(StitchedSinsModBlocks.WARPED_CUIRASS_BLOCK);
	public static final RegistryObject<Item> PREDATOR_MUSCLE_BLOCK = block(StitchedSinsModBlocks.PREDATOR_MUSCLE_BLOCK);
	public static final RegistryObject<Item> ENDERMAN_HEART_CONFIRMED = REGISTRY.register("enderman_heart_confirmed", () -> new EndermanHeartConfirmedItem());
	public static final RegistryObject<Item> WOLF_RIBS_CONFIRMED = REGISTRY.register("wolf_ribs_confirmed", () -> new WolfRibsConfirmedItem());
	public static final RegistryObject<Item> DRAGON_HEART_CONFIRMED = REGISTRY.register("dragon_heart_confirmed", () -> new DragonHeartConfirmedItem());
	public static final RegistryObject<Item> STITCHED_HEART = REGISTRY.register("stitched_heart", () -> new StitchedHeartItem());
	public static final RegistryObject<Item> STITCHED_RIBS = REGISTRY.register("stitched_ribs", () -> new StitchedRibsItem());
	public static final RegistryObject<Item> STITCHED_MUSCLES = REGISTRY.register("stitched_muscles", () -> new StitchedMusclesItem());
	public static final RegistryObject<Item> WASTES = REGISTRY.register("wastes", () -> new WastesItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
