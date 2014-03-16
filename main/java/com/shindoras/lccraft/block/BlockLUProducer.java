package com.shindoras.lccraft.block;

import java.util.List;

import com.shindoras.lccraft.LCCraft;
import com.shindoras.lccraft.LCCraftCreativeTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLUProducer extends Block
{
	public BlockLUProducer()
	{
		super(Material.piston);
		this.setCreativeTab(LCCraft.LCCraftCreativeTab);
		
	}
	
	public static IIcon topIcon;
	public static IIcon downIcon;
	public static IIcon frontIcon;
	public static IIcon backIcon;
	public static IIcon leftIcon;
	public static IIcon rightIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.topIcon = par1IconRegister.registerIcon(LCCraft.MODID + ":" + "LUProducer" +"_top");
        this.downIcon = par1IconRegister.registerIcon(LCCraft.MODID + ":" + "LUProducer" +"_down");
        this.frontIcon = par1IconRegister.registerIcon(LCCraft.MODID + ":" + "LUProducer" +"_front");
        this.backIcon = par1IconRegister.registerIcon(LCCraft.MODID + ":" + "LUProducer" +"_back");
        this.leftIcon = par1IconRegister.registerIcon(LCCraft.MODID + ":" + "LUProducer" +"_left");
        this.rightIcon = par1IconRegister.registerIcon(LCCraft.MODID + ":" + "LUProducer" +"_right");
    }
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
	{	
		//System.out.println(metadata);
		
		if(metadata == 0)
		{
			switch(side)
			{
				case 0: return downIcon;
				case 1: return topIcon;
				case 2: return frontIcon;
				case 3: return backIcon;
				case 4: return rightIcon;
				case 5: return leftIcon;
			}
		}
		if(metadata == 1)
		{
			switch(side)
			{
				case 0: return downIcon;
				case 1: return topIcon;
				case 2: return rightIcon;
				case 3: return leftIcon;
				case 4: return backIcon;
				case 5: return frontIcon;
			}
		}
		if(metadata == 2)
		{
			switch(side)
			{
				case 0: return downIcon;
				case 1: return topIcon;
				case 2: return backIcon;
				case 3: return frontIcon;
				case 4: return leftIcon;
				case 5: return rightIcon;
			}
		}
		if(metadata == 3)
		{
			switch(side)
			{
				
				case 0: return downIcon;
				case 1: return topIcon;
				case 2: return leftIcon;
				case 3: return rightIcon;
				case 4: return frontIcon;
				case 5: return backIcon;
			}
		}

			return frontIcon;
											
	}
	
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack is)
    {
        int l = MathHelper.floor_double((double)(elb.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

//        int k = MathHelper.floor_double((double)(elb.rotationPitch) ) ;
//        System.out.println(k);
        if (l == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 0, 2);
            
        }

        if (l == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 1, 2);
           
        }

        if (l == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
           
        }

        if (l == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
           
        }
	
    }
	

}
