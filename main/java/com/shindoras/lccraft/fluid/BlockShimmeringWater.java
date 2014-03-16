package com.shindoras.lccraft.fluid;

import java.util.Random;

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
    
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {
        super.randomDisplayTick(p_149734_1_, p_149734_2_, p_149734_3_, p_149734_4_, p_149734_5_);

        for (int l = p_149734_2_ - 2; l <= p_149734_2_ + 2; ++l)
        {
            for (int i1 = p_149734_4_ - 2; i1 <= p_149734_4_ + 2; ++i1)
            {
                if (l > p_149734_2_ - 2 && l < p_149734_2_ + 2 && i1 == p_149734_4_ - 1)
                {
                    i1 = p_149734_4_ + 2;
                }

                if (p_149734_5_.nextInt(16) == 0)
                {
                    for (int j1 = p_149734_3_; j1 <= p_149734_3_ + 1; ++j1)
                    {
                        if (p_149734_1_.getBlock(l, j1, i1) == Blocks.air)
                        {
                            if (!p_149734_1_.isAirBlock((l - p_149734_2_) / 2 + p_149734_2_, j1, (i1 - p_149734_4_) / 2 + p_149734_4_))
                            {
                                break;
                            }

                            p_149734_1_.spawnParticle("enchantmenttable", (double)p_149734_2_ + 0.5D, (double)p_149734_3_ + 2.0D, (double)p_149734_4_ + 0.5D, (double)((float)(l - p_149734_2_) + p_149734_5_.nextFloat()) - 0.5D, (double)((float)(j1 - p_149734_3_) - p_149734_5_.nextFloat() - 1.0F), (double)((float)(i1 - p_149734_4_) + p_149734_5_.nextFloat()) - 0.5D);
                        }
                    }
                }
            }
        }
    }
    
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
