package com.shindoras.lccraft.item;

import java.util.List;

import com.shindoras.lccraft.LCCraft;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemShimmeringWaterBucket extends ItemBucket {

	public ItemShimmeringWaterBucket(Block fluidBlock) {
		super(fluidBlock);
		this.setCreativeTab(LCCraft.LCCraftCreativeTab);
	}
	
    public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    	
    	List<Slot> slots = par3EntityPlayer.openContainer.inventorySlots;
    	for (Slot slot : slots) { 		
	    	if(slot.getStack() != null){	
    			if(slot.getStack().getItem().equals(Items.water_bucket)){
	    			slot.decrStackSize(1);
	    			return;
	    		}
	    	}	    	
    	}
    
    }

}
