package realexplosives.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class REBaseBlock extends BlockContainer {

	public REBaseBlock(Material mat) {
		super(mat);
		setCreativeTab(CreativeTabs.tabBlock);
		//setUnlocalizedName("blockRE");
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
