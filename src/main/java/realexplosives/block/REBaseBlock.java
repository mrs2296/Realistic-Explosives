package realexplosives.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import static net.minecraftforge.common.util.ForgeDirection.*;

public class REBaseBlock extends BlockContainer {

	public REBaseBlock(Material mat) {
		super(mat);
		setCreativeTab(CreativeTabs.tabBlock);
		//setUnlocalizedName("blockRE");
	}
	
	public boolean topSolid(World w, int x, int y, int z)
	{
		if(w.doesBlockHaveSolidTopSurface(w, x, y - 1, z))
		{
			return true;
		}
		
		return false;
	}
	
	public boolean canPlaceBlockAt(World w, int x, int y, int z)
	{
		return  w.isSideSolid(x, y, z + 1, NORTH) ||
				w.isSideSolid(x, y, z - 1, SOUTH) ||
				w.isSideSolid(x + 1, y, z, WEST)  ||
				w.isSideSolid(x - 1, y, z, EAST)  ||
				this.topSolid(w, x, y, z);
	}
	
	//@Override
	public int onBlockPlaced(World w, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata)
	{
		int m = metadata;
		
		if(side == 2 && w.isSideSolid(x, y, z + 1, NORTH))
		{
			m = 1;
		}
		
		if(side == 3 && w.isSideSolid(x, y, z - 1, SOUTH))
		{
			m = 2;
		}
		
		if(side == 4 && w.isSideSolid(x + 1, y, z, WEST))
		{
			m = 3;
		}
		
		if(side == 5 && w.isSideSolid(x - 1, y, z, EAST))
		{
			m = 4;
		}
		
		if(side == 1 && this.topSolid(w, x, y - 1, z))
		{
			m = 5;
		}
		
		return m;
	}
	
	//@Override
	public void onBlockAdded(World w, int x, int y, int z)
	{
		if(w.getBlockMetadata(x, y, z) == 0)
		{
			if(w.isSideSolid(x, y, z + 1, NORTH))
			{
				w.setBlockMetadataWithNotify(x, y, z, 1, 2);
			}
			
			else if(w.isSideSolid(x, y, z + 1, SOUTH))
			{
				w.setBlockMetadataWithNotify(x, y, z, 2, 2);
			}
			
			else if(w.isSideSolid(x, y, z + 1, WEST))
			{
				w.setBlockMetadataWithNotify(x, y, z, 3, 2);
			}
			
			else if(w.isSideSolid(x, y, z + 1, EAST))
			{
				w.setBlockMetadataWithNotify(x, y, z, 4, 2);
			}
			
			else if(this.topSolid(w, x, y, z))
			{
				w.setBlockMetadataWithNotify(x, y, z, 5, 2);
			}
		}
		
		this.blockPlaced(w, x, y, z);
	}
	
	public boolean blockPlaced(World w, int x, int y, int z)
	{
		if(!this.canPlaceBlockAt(w, x, y, z))
		{
			if(w.getBlock(x, y, z) == this)
			{
				this.dropBlockAsItem(w, x, y, z, w.getBlockMetadata(x, y, z), 0);
				w.setBlockToAir(x, y, z);
			}
			
			return false;
		}
		
		else
		{
			return true;
		}
	}

	@Override
	public TileEntity createNewTileEntity(World w, int metadata) 
	{
		return new REBaseTile();
	}
	
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	@Override
	public int getRenderType()
	{
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

}
