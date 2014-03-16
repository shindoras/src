package com.shindoras.lccraft.item;

import org.lwjgl.input.Keyboard;

import com.shindoras.lccraft.LCCraft;






import net.minecraft.block.*;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMagnifier extends Item
{
	public ItemMagnifier()
	{
		maxStackSize = 1;
		this.setCreativeTab(LCCraft.LCCraftCreativeTab);
	}
	
	public Item lense;

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        return true;
    }
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			
			
			
			
		}
		
		return null;
	}
	
	
}	
	