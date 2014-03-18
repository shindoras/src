package com.shindoras.lccraft.block;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import com.shindoras.lccraft.LCCraft;
import com.shindoras.lccraft.entity.TileEntityHook;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockHook extends BlockContainer {

	public BlockHook() {
		super(Material.iron);
		this.setBlockBounds(1F/16F*6, 1F/16F*3, 0F, 1F-1F/16F*6, 1F-1F/16F*3.5F, 1F);
		this.setCreativeTab(LCCraft.LCCraftCreativeTab);
		// TODO Auto-generated constructor stub
	}
	
	public static IIcon ICON;
	
	@Override
	public void registerBlockIcons(IIconRegister register){
		this.ICON = register.registerIcon(LCCraft.MODID + ":" + "Hook");
	}
	
	@Override
	public IIcon getIcon(int side, int meta){
		return ICON;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
		
	public int getRenderType(){
		return -1;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return new TileEntityHook();
	}
}
