package com.shindoras.lccraft;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

import com.shindoras.lccraft.block.*;
import com.shindoras.lccraft.entity.TileEntityHook;
import com.shindoras.lccraft.fluid.BlockShimmeringWater;
import com.shindoras.lccraft.item.*;
import com.shindoras.lccraft.renderer.RenderBlockHook;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends ServerProxy 
{
	public void registerRendererThings()
	{
		//Blocks
		
    	
		LCCraft.CrystalOre = new BlockCrystalOre().setBlockName("CrystalOre").setBlockTextureName(LCCraft.MODID + ":" + "CrystalOre").setHardness(3.5F);
    	GameRegistry.registerBlock(LCCraft.CrystalOre, LCCraft.MODID + LCCraft.CrystalOre.getUnlocalizedName());
    	LCCraft.LightCrystal = new BlockLightCrystal().setBlockName("LightCrystal"); //.setBlockTextureName(LCCraft.MODID + ":" + "LightCrystal");
    	GameRegistry.registerBlock(LCCraft.LightCrystal, BlockMultiLightCrystal.class, LCCraft.MODID + LCCraft.LightCrystal.getUnlocalizedName());
    	LCCraft.LUProducer = new BlockLUProducer().setBlockName("LUProducer");  //.setBlockTextureName(LCCraft.MODID + ":" + "CrystalOre").setHardness(3.5F);
    	GameRegistry.registerBlock(LCCraft.LUProducer, LCCraft.MODID + LCCraft.LUProducer.getUnlocalizedName());    	
    	LCCraft.Hook = new BlockHook().setBlockName("Hook");//.setBlockTextureName(LCCraft.MODID + ":" + "Hook").setHardness(3.5F);
    	GameRegistry.registerBlock(LCCraft.Hook, LCCraft.MODID + LCCraft.Hook.getUnlocalizedName());
    	LCCraft.Line = new BlockLine().setBlockName("Line").setBlockTextureName(LCCraft.MODID + ":" + "Line").setHardness(1.0F);
    	GameRegistry.registerBlock(LCCraft.Line, LCCraft.MODID + LCCraft.Line.getUnlocalizedName());
    	    	
    	//Fluids
    	Fluid FluidShimmeringWater = new Fluid("fluidshimmeringwater");    	
    	FluidRegistry.registerFluid(FluidShimmeringWater);    	
    	LCCraft.BlockShimmeringWater = new BlockShimmeringWater(FluidShimmeringWater, Material.water).setBlockName("ShimmeringWater");
    	GameRegistry.registerBlock(LCCraft.BlockShimmeringWater, LCCraft.MODID + LCCraft.BlockShimmeringWater.getUnlocalizedName());
    	
    	//Items    	
    	LCCraft.CrystallinePowder = new ItemCrystallinePowder().setUnlocalizedName("CrystallinePowder").setTextureName(LCCraft.MODID + ":" + "CrystallinePowder");
    	GameRegistry.registerItem(LCCraft.CrystallinePowder, LCCraft.MODID + LCCraft.CrystallinePowder.getUnlocalizedName());

    	LCCraft.ShimmeringWaterBucket = new ItemShimmeringWaterBucket(LCCraft.BlockShimmeringWater).setUnlocalizedName("ShimmeringWaterBucket").setContainerItem(Items.bucket).setTextureName(LCCraft.MODID + ":" + "bucket_shimmeringWater");
		GameRegistry.registerItem(LCCraft.ShimmeringWaterBucket, LCCraft.MODID + LCCraft.ShimmeringWaterBucket.getUnlocalizedName());
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("fluidshimmeringwater", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(LCCraft.ShimmeringWaterBucket), new ItemStack(Items.bucket));
		
		//Renderers
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHook.class, new RenderBlockHook());
		
		//Handlers
		LCCraftBucketHandler.INSTANCE.buckets.put(LCCraft.BlockShimmeringWater, LCCraft.ShimmeringWaterBucket);
		MinecraftForge.EVENT_BUS.register(LCCraftBucketHandler.INSTANCE);
		
		//Recipies
		GameRegistry.addRecipe(new ItemStack(LCCraft.ShimmeringWaterBucket, 1), new Object[]{
			"C",
			"W", 
			'C', LCCraft.CrystallinePowder, 
			'W', Items.water_bucket
		});
	}
	
	

}
