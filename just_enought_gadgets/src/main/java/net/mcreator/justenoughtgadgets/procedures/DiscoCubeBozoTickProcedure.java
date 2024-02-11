package net.mcreator.justenoughtgadgets.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.justenoughtgadgets.JustEnoughtGadgetsMod;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import net.minecraft.tags.BlockTags;


public class DiscoCubeBozoTickProcedure {

	public static void execute(LevelAccessor world, double x, double y, double z) {
		
		double dx=-5.0;
		double dy=-5.0;
		double dz=-5.0;
		final double range=1.0;
		List<String> blockNames=new ArrayList<String>();
		for (dx=-1*range;dx<=range;dx++){
			for (dy=-1*range;dy<=range;dy++){
				for (dz=-1*range;dz<=range;dz++){
					if (!((world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz))).getBlock() == Blocks.AIR)) {
					if (!(dx==0 && dy==0 && dz==0)){
					if(!(world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz))).is(BlockTags.create(new ResourceLocation("minecraft:beacon_base_blocks")))){
					if (28 >= world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz)).getDestroySpeed(world, BlockPos.containing(x+dx, y+dy, z+dz))) {

				 	blockNames.add(ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz))).getBlock()).toString());
					}}}
					}
				}
			}
		}
		/*
		Iterator<String> bcname=blockNames.iterator();
		System.out.print("[");
		while (bcname.hasNext()){
			System.out.print(bcname.next()+" ,");
		}
		System.out.println("]\n");*/
		int temp;
		for (dx=-1*range;dx<=range;dx++){
			for (dy=-1*range;dy<=range;dy++){
				for (dz=-1*range;dz<=range;dz++){
					if (!((world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz))).getBlock() == Blocks.AIR)) {
						if (!(dx==0 && dy==0 && dz==0)){
						if(!(world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz))).is(BlockTags.create(new ResourceLocation("minecraft:beacon_base_blocks")))){
						if (28 >= world.getBlockState(BlockPos.containing(x+dx, y+dy, z+dz)).getDestroySpeed(world, BlockPos.containing(x+dx, y+dy, z+dz))) {

						world.setBlock(BlockPos.containing(x+dx, y+dy, z+dz), ForgeRegistries.BLOCKS.getValue(new ResourceLocation(blockNames.get((int) (Math.random()*(blockNames.size()-1))))).defaultBlockState(), 3);
						}}
					}}
				}
			}
		}
	}
}
