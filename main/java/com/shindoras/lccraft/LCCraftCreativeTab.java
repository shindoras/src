package com.shindoras.lccraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class LCCraftCreativeTab extends CreativeTabs
{
	public LCCraftCreativeTab(String tabID)
	{
		super(tabID);
	}

	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(LCCraft.CrystalOre);
	}
	
	public String getTranslatedTabLabel()
	{
		return "Light Crystal Craft";
	}
}
