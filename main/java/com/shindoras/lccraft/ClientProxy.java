package com.shindoras.lccraft;

import com.shindoras.lccraft.block.*;
import com.shindoras.lccraft.item.*;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends ServerProxy{
	public void registerRendererThings()
	{
		//Blocks
    	LCCraft.CrystalOre = new BlockCrystalOre().setBlockName("CrystalOre").setBlockTextureName(LCCraft.MODID + ":" + "CrystalOre").setHardness(3.5F);
    	GameRegistry.registerBlock(LCCraft.CrystalOre, LCCraft.MODID + LCCraft.CrystalOre.getUnlocalizedName());
    	LCCraft.LightCrystal = new BlockLightCrystal().setBlockName("LightCrystal"); //.setBlockTextureName(LCCraft.MODID + ":" + "LightCrystal");
    	GameRegistry.registerBlock(LCCraft.LightCrystal, BlockMultiLightCrystal.class, LCCraft.MODID + LCCraft.LightCrystal.getUnlocalizedName());
    	LCCraft.LUProducer = new BlockLUProducer().setBlockName("LUProducer");  //.setBlockTextureName(LCCraft.MODID + ":" + "CrystalOre").setHardness(3.5F);
    	GameRegistry.registerBlock(LCCraft.LUProducer, LCCraft.MODID + LCCraft.LUProducer.getUnlocalizedName());
    	//LanguageRegistry.addName(CrystalOre, "Crystal Ore");
    	
    	//Items    	
    	LCCraft.CrystallinePowder = new ItemCrystallinePowder().setUnlocalizedName("CrystallinePowder").setTextureName(LCCraft.MODID + ":" + "CrystallinePowder");
    	GameRegistry.registerItem(LCCraft.CrystallinePowder, LCCraft.MODID + LCCraft.CrystallinePowder.getUnlocalizedName());
	}
	
	

}
