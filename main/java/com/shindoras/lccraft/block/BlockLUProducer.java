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
	public static int playerDirection;
	
	@SideOnly(Side.CLIENT)
	@Override
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
	@Override
	public IIcon getIcon(int side, int metadata)
	{
		/*switch(metadata)
		{
			case 0: return sideIcon;
			case 1: */		
		System.out.println(side);
				switch(side)
				{
					case 0: return downIcon;
					case 1: return topIcon;
					case 2: return frontIcon;
					case 3: return backIcon;
					case 4: return rightIcon;
					case 5: return leftIcon;
					default: return frontIcon;
						
							
				}
		//}		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
	{
	    int metadata = world.getBlockMetadata(x, y, z);
	    playerDirection = MathHelper.floor_double((double)((p_149689_5_.rotationYaw * 4F) / 360F) + 0.5D) & 3;	    
	    System.out.println(playerDirection);
	}
	
	 
	
	
	
	
	/*@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public void registerIIcon(IIconRegister par1)
	{
		icons = new Icon[6];
		
		for(int i = 0; i<icons.length; i++)
		{
			icons[i] = par1.registerIcon(LCCraft.MODID + ":" + "CrystalOre");
		}	
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIIcon(int par1, int par2)
	{
		return icons[par2];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for(int i=0; i<6; i++)
		{
			par3List.add(new ItemStack());
		}	
	}*/
	
	

}
