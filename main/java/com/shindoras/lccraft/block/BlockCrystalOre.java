package com.shindoras.lccraft.block;

import java.util.Random;

import com.shindoras.lccraft.LCCraft;
import com.shindoras.lccraft.item.*;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCrystalOre extends BlockOre 
{

	public BlockCrystalOre() 
	{
		this.setCreativeTab(LCCraft.LCCraftCreativeTab);
		System.out.println("test");
	}	
	
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == LCCraft.CrystalOre ? LCCraft.CrystallinePowder : Item.getItemFromBlock(this);
    }
	
	public int quantityDropped(Random p_149745_1_)
    {
		//drops between 1 and 3 CrystallinePowder
		return this == LCCraft.CrystalOre ? 1 + p_149745_1_.nextInt(3) : 1;
    }
	
	
	
}

	
