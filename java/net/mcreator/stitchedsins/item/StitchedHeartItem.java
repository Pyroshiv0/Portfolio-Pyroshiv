
package net.mcreator.stitchedsins.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.stitchedsins.procedures.UseStitchedOrganProcedure;
import net.mcreator.stitchedsins.procedures.DisplayName1Procedure;
import net.mcreator.stitchedsins.procedures.DisplayName2Procedure;
import net.mcreator.stitchedsins.procedures.AddInformationsNegativeEffectsProcedure;


import java.util.List;

public class StitchedHeartItem extends Item {
	public StitchedHeartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Two hearts linked for eternity"));
		list.add(Component.literal("\u00A72"+"Stitched organs:"));
		list.add(Component.literal(DisplayName1Procedure.execute(itemstack)));
		list.add(Component.literal(DisplayName2Procedure.execute(itemstack)));
		
		String textToAdd=AddInformationsNegativeEffectsProcedure.execute(itemstack);
		String[] effects=textToAdd.split("/");
		if (effects.length>1)
			list.add(Component.literal("\u00A74"+"Stitched effects:"));
		 
		for (int bc=1;bc<effects.length;bc++){
			list.add(Component.literal(effects[bc]));
		}
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		UseStitchedOrganProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}
