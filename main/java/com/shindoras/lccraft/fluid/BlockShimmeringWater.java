package com.shindoras.lccraft.fluid;

import javax.swing.Icon;

import com.shindoras.lccraft.LCCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockShimmeringWater extends BlockFluidClassic
{
	public BlockShimmeringWater(Fluid fluid, Material material) 
	{
		super(fluid, material);
		this.setCreativeTab(LCCraft.LCCraftCreativeTab);
	}
	
	@SideOnly(Side.CLIENT)
    protected IIcon stillIcon;
    @SideOnly(Side.CLIENT)
    protected IIcon flowingIcon;
    
    @Override
    public IIcon getIcon(int side, int meta) 
    {
            return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) 
    {
            stillIcon = register.registerIcon("LCCraft:BlockShimmeringWater_still");
            flowingIcon = register.registerIcon("LCCraft:BlockShimmeringWater_flow");
    }
    
      
    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) 
    {
    	Block block = world.getBlock(x, y, z);
    	Material material = block.getMaterial();
        
        
        if (material.blocksMovement() || material == Material.water || material == Material.lava)
        {
            return false;
        }
            return super.canDisplace(world, x, y, z);
            
    }
   
    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) 
    {
    	Block block = world.getBlock(x, y, z);
    	Material material = block.getMaterial();
        
        
        if (material.blocksMovement() || material == Material.water || material == Material.lava)
        {
            return false;
        }
            return super.displaceIfPossible(world, x, y, z);
    }
    
}
