package com.shindoras.lccraft.block;

import com.shindoras.lccraft.LCCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockLine extends Block {

	public BlockLine() {
		super(Material.cloth);
		this.setCreativeTab(LCCraft.LCCraftCreativeTab);
		// TODO Auto-generated constructor stub
	}
	
	public boolean renderAsNormalBlock()
    {
        return true;
    }
	
	public boolean isOpaqueCube()
    {
        return true;
    }
	
	public void onNeighborChange(IBlockAccess world, int x, int y, int z, int tileX, int tileY, int tileZ)
    {
    }

}
