package realexplosives.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class REBaseTile extends TileEntity {

	public long key;
	
	public REBaseTile()
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
	
}
