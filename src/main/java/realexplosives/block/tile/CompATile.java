package realexplosives.block.tile;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import realexplosives.block.REBaseTile;

public class CompATile extends REBaseTile
{
	public CompATile()
	{
		
	}
	
	public TileEntity getTile()
	{
		return this;
	}
	
	public void detonate()
	{
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound data)
	{
		super.writeToNBT(data);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound data)
	{
		super.readFromNBT(data);
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId,
			RenderBlocks renderer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRenderId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
