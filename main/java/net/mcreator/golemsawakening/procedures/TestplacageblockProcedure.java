package net.mcreator.golemsawakening.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.golemsawakening.world.inventory.InventoryGolemComposterMenu;
import net.mcreator.golemsawakening.network.GolemsAwakeningModVariables;
import net.mcreator.golemsawakening.GolemsAwakeningMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;



public class TestplacageblockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		boolean found = false;
		double sxf =0;
		double syf =0;
		double szf =0;
		double age=0;
		BlockState blocktocheck = Blocks.AIR.defaultBlockState();
		found = false;
		for (int range = 0; range < 4; range++) {
			for (int sx = range * (-1); sx <= range; sx++) {
				for (int sy = range * (-1); sy <= range; sy++) {
					for (int sz = range * (-1); sz <= range; sz++) {
					if (!found){
						if (Math.abs(sx) >= range || Math.abs(sy) >= range || Math.abs(sz) >= range) {
							blocktocheck = (world.getBlockState(BlockPos.containing(x,y,z)));
							if (blocktocheck.getBlock() instanceof BonemealableBlock) {
								if (blocktocheck.getBlock() == Blocks.GRASS_BLOCK) {
									if (entity.getPersistentData().getBoolean("grassBonemealable")) {
										GolemsAwakeningMod.LOGGER.info("found nearest block at x:" + (x + sx) + ",y:" + (y + sy) + ",z:" + (z + sz)+"of max age:"+age);
										found=true;
										sxf=sx;
										syf=sy;
										szf=sz;
									}

								}
								else{
								age = blocktocheck.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip69 ? blocktocheck.getValue(_getip69) : -1;
								if (age>=0) {
								if (blocktocheck.getBlock() == Blocks.BEETROOTS) {
									if (age<3) {
										GolemsAwakeningMod.LOGGER.info("found nearest block at x:" + (x + sx) + ",y:" + (y + sy) + ",z:" + (z + sz)+"of max age:"+age);
										found=true;
										sxf=sx;
										syf=sy;
										szf=sz;
										}
										}
								else{
									if (age<7) {
										GolemsAwakeningMod.LOGGER.info("found nearest block at x:" + (x + sx) + ",y:" + (y + sy) + ",z:" + (z + sz)+"of max age:"+age);
										found=true;
										sxf=sx;
										syf=sy;
										szf=sz;
									}
									}
									}
							else{
								GolemsAwakeningMod.LOGGER.info("found nearest block at x:" + (x + sx) + ",y:" + (y + sy) + ",z:" + (z + sz)+"of max age:"+age);
								found=true;
								sxf=sx;
								syf=sy;
								szf=sz;
							}}
							}
							


							}
						}
						
					}
					
				}
				
			}
		
		}
	}
}
