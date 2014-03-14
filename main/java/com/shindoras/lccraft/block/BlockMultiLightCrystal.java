package com.shindoras.lccraft.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockMultiLightCrystal extends ItemBlock
{

	public BlockMultiLightCrystal(Block par1) 
	{
		super(par1);
		setHasSubtypes(true);
	}	
	
	public int getMetadata(int par1)
	{
	      return par1;
	}

	 public String getUnlocalizedName(ItemStack itemstack)
     {
           String name = "";
           switch(itemstack.getItemDamage())
           {
                  case 0:
                  {
                         name = "Original";
                         break;
                  }
                  case 1:
                  {
                         name = "Another";
                         break;
                  }
                  default: name = "broken";
           }
           return getUnlocalizedName() + "." + name;
     }
    
     

}
