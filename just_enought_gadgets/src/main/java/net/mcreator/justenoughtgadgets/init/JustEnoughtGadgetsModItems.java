
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justenoughtgadgets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.justenoughtgadgets.procedures.HugeBucketPropertyValueProviderProcedure;
import net.mcreator.justenoughtgadgets.item.WaterHugeBucketItemItem;
import net.mcreator.justenoughtgadgets.item.WaterGiganticBucketItem;
import net.mcreator.justenoughtgadgets.item.LavaHugeBucketItem;
import net.mcreator.justenoughtgadgets.item.LavaGiganticBucketItem;
import net.mcreator.justenoughtgadgets.item.HugeBucketItem;
import net.mcreator.justenoughtgadgets.item.GiganticBucketItem;
import net.mcreator.justenoughtgadgets.item.BucketGunItem;
import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JustEnoughtGadgetsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JustEnoughtGadgetsMod.MODID);
	public static final RegistryObject<Item> DISCO_CUBE = block(JustEnoughtGadgetsModBlocks.DISCO_CUBE);
	public static final RegistryObject<Item> HUGE_BUCKET = REGISTRY.register("huge_bucket", () -> new HugeBucketItem());
	public static final RegistryObject<Item> WATER_HUGE_BUCKET_ITEM = REGISTRY.register("water_huge_bucket_item", () -> new WaterHugeBucketItemItem());
	public static final RegistryObject<Item> LAVA_HUGE_BUCKET = REGISTRY.register("lava_huge_bucket", () -> new LavaHugeBucketItem());
	public static final RegistryObject<Item> GIGANTIC_BUCKET = REGISTRY.register("gigantic_bucket", () -> new GiganticBucketItem());
	public static final RegistryObject<Item> LAVA_GIGANTIC_BUCKET = REGISTRY.register("lava_gigantic_bucket", () -> new LavaGiganticBucketItem());
	public static final RegistryObject<Item> WATER_GIGANTIC_BUCKET = REGISTRY.register("water_gigantic_bucket", () -> new WaterGiganticBucketItem());
	public static final RegistryObject<Item> BUCKET_GUN = REGISTRY.register("bucket_gun", () -> new BucketGunItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(HUGE_BUCKET.get(), new ResourceLocation("just_enought_gadgets:huge_bucket_liquid"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) HugeBucketPropertyValueProviderProcedure.execute(itemStackToRender));
		});
	}
}
