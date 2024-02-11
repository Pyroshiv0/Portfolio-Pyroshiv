
package net.mcreator.justenoughtgadgets.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.justenoughtgadgets.procedures.LavaHugeBucketUseProcedure;
import net.mcreator.justenoughtgadgets.procedures.HugeBucketSpecialInformationProcedure;

import java.util.List;

public class LavaHugeBucketItem extends Item {
	public LavaHugeBucketItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		double x = entity != null ? entity.getX() : 0.0;
		double y = entity != null ? entity.getY() : 0.0;
		double z = entity != null ? entity.getZ() : 0.0;
		list.add(Component.literal(HugeBucketSpecialInformationProcedure.execute(itemstack)));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		LavaHugeBucketUseProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getClickedFace(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
