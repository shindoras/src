package com.shindoras.lccraft;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MyTileEntity extends TileEntity{
	
    public int customField;
    
    @Override
    public void writeToNBT(NBTTagCompound par1)
    {
       super.writeToNBT(par1);
       par1.setInteger("customField", customField);
    }

    @Override
    public void readFromNBT(NBTTagCompound par1)
    {
       super.readFromNBT(par1);
       this.customField = par1.getInteger("customField");
    } 
   
   
}