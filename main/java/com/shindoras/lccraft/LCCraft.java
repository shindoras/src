package com.shindoras.lccraft;


import com.shindoras.lccraft.block.*;
import com.shindoras.lccraft.item.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = LCCraft.MODID, version = LCCraft.VERSION, name = LCCraft.NAME)
public class LCCraft
{
    public static final String MODID = "LCCraft";
    public static final String NAME = "LightCrystalCraft";
    public static final String VERSION = "0.0.1";
    
   
    
    @SidedProxy(clientSide = "com.shindoras.lccraft.ClientProxy", serverSide = "com.shindoras.lccraft.ServerProxy")
    public static ServerProxy proxy;
    public static CreativeTabs LCCraftCreativeTab = new LCCraftCreativeTab("LCCraft");
    
   


    //Blocks
    public static Block CrystalOre;
    public static Block LightCrystal;
    public static Block LUProducer;
    
    //Items
    public static Item CrystallinePowder;
    
    //Fluids    
    public static Block BlockShimmeringWater;
    
    //loads before event
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	proxy.registerRendererThings();
    	//GameRegistry.registerTileEntity(MyTileEntity.class, "stringID");
    	
    	
    	
		    	
    }
    
    //loads during event
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	
    	
        
    }
}
