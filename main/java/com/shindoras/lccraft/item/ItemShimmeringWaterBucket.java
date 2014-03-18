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
<<<<<<< Updated upstream
=======
	/** 
	 * TODO 
	 * Weg finden den Eimer beim abschliessen des rezeptes verschwinden zu lassen
	 * **/
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    	Container test = par3EntityPlayer.openContainer;
    	this.doesContainerItemLeaveCraftingGrid(par1ItemStack);
    	for(int i = 0; i <= test.inventoryItemStacks.size(); i++){
    		if(test.getSlot(i).getStack().getItem() == Items.water_bucket){
   			test.getSlot(i).decrStackSize(1);
 			return;
    		}
    	}
    }
>>>>>>> Stashed changes

}
