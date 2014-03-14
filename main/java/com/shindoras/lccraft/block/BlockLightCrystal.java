package com.shindoras.lccraft.block;

import java.util.List;
import java.util.Random;









import com.shindoras.lccraft.LCCraft;
import com.shindoras.lccraft.MyTileEntity;
import com.shindoras.lccraft.item.*;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IModelCustom;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLightCrystal extends Block
{

	public BlockLightCrystal() 
	{
		super(Material.ground);
		this.setCreativeTab(LCCraft.LCCraftCreativeTab);
		
	
	}
	
	/*public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(LCCraft.MODID + ":" + "LightCrystal");        	
    }*/
	
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
		
	@SideOnly(Side.CLIENT)
	@Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        icons = new IIcon[2];
        
        for(int i = 0; i<2; i++)
        {
        	icons[i] = par1IconRegister.registerIcon(LCCraft.MODID + ":" + "LightCrystal" + i);
        	System.out.println("THIS IS THE BLOCK: " + icons[i]);
        	
        }	
    }
	
	 @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int par1, int par2)
	    {
	        switch(par2)
	        {
	            case 0:
	            	return icons[0];
	            case 1:
	            	return icons[1];       
	            default:
	            {
	              System.out.println("Invalid metadata for"  + this.getUnlocalizedName());
	                return icons[0];
	            }
	        }
	    }
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2, List par3)
	{
		for(int i=0; i<2; i++)
		{
			par3.add(new ItemStack(par1, 1, i));
		}
	}
	
	//This will tell minecraft not to render any side of our cube.
	/*public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
	   return false;
	}

	//And this tell it that you can see through this block, and neighbor blocks should be rendered.
	public boolean isOpaqueCube()
	{
	   return false;
	}
	
	//binds tile entity to exact block
	public TileEntity createTileEntity(World world, int metadata)
	{
	   return new MyTileEntity();
	}*/
	
}