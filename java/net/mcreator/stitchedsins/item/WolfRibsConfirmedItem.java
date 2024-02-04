
package net.mcreator.stitchedsins.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.stitchedsins.procedures.ConfirmedHeartInventoryProcedure;

import java.util.List;

public class WolfRibsConfirmedItem extends Item {
	public WolfRibsConfirmedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("AGAIN?YOU SHOULDN'T SEE THIS !DROP IT !"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ConfirmedHeartInventoryProcedure.execute(entity);
	}
}
