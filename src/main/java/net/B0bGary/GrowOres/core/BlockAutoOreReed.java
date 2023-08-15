package mods.B0bGary.GrowOres.core;

import java.util.Random;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.TileEntityReed;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class BlockAutoOreReed extends BlockContainer implements IPlantable
{
	public TileEntityReed t2= new TileEntityReed();
    public BlockAutoOreReed(String mat)
    {
        super(Material.plants);
        float f = 0.375F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
        this.setTickRandomly(true);
		setBlockTextureName(Base.modid+":"+"oreGrowableIron"); //need to fix textures
		setHardness(1.5f);
    }
   
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return new TileEntityReed();
	}
    
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    
    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random rand)
    {
		//System.out.println("Tile entity check");
        
    	TileEntityReed t = (TileEntityReed) world.getTileEntity(x, y, z);
    	if (t != null)
    	{
    		//System.out.println("Tile entity is not null");
    	   
    	 
        if (world.getBlock(x, y - 1, z) == this || this.func_150170_e(world, x, y, z))
        {
            if (world.isAirBlock(x, y + 1, z))
            {
                int l;

                for (l = 1; world.getBlock(x, y - l, z) == this; ++l)
                {
                    ;
                }

                if (l < 3)
                {
            		//System.out.println("l<3");
                    if (t.get() >= Base.growthTime)
                    {
                    	//System.out.println("l<3");
                        world.setBlock(x, y + 1, z, this);
                        world.setBlockMetadataWithNotify(x, y, z, t.set(0), 4);
                        //System.out.println("Growing Done");
                    }
                    else
                    {
                        world.setBlockMetadataWithNotify(x, y, z, t.set(t.get()+1), 4);
                		//System.out.println("meta increased");

                    }
                }
            }
            }
        }
    }


    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
    {
        Block block = p_149742_1_.getBlock(p_149742_2_, p_149742_3_ - 1, p_149742_4_);
        return block==Base.growingBlock||block==this;
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        this.func_150170_e(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
    }

    protected final boolean func_150170_e(World p_150170_1_, int p_150170_2_, int p_150170_3_, int p_150170_4_)
    {
        if (!this.canBlockStay(p_150170_1_, p_150170_2_, p_150170_3_, p_150170_4_))
        {
            this.dropBlockAsItem(p_150170_1_, p_150170_2_, p_150170_3_, p_150170_4_, p_150170_1_.getBlockMetadata(p_150170_2_, p_150170_3_, p_150170_4_), 0);
            p_150170_1_.setBlockToAir(p_150170_2_, p_150170_3_, p_150170_4_);
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World p_149718_1_, int p_149718_2_, int p_149718_3_, int p_149718_4_)
    {
        return this.canPlaceBlockAt(p_149718_1_, p_149718_2_, p_149718_3_, p_149718_4_);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }


    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
    {
        return EnumPlantType.Cave;
    }

    @Override
    public Block getPlant(IBlockAccess world, int x, int y, int z)
    {
        return this;
    }

    @Override
    public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z);
    }


}
