package realexplosives.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class REBaseBlock extends BlockContainer {

	protected REBaseBlock(Material mat) {
		super(mat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TileEntity createNewTileEntity(World w, int metadata) 
	{
		return new REBaseTile();
	}

}
