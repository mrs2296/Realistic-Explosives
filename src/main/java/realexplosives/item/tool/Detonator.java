package realexplosives.item.tool;

import java.lang.reflect.Array;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
//import net.minecraft.world.IBlockAccess;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import realexplosives.util.XORRandom;
import realexplosives.block.REBaseTile;

public class Detonator extends Item {

	private static int craftNumber;
	public long detonatorKey;
	
	public Detonator()
	{
		this.detonatorKey = XORRandom.random(System.nanoTime() * craftNumber);
		this.setMaxStackSize(1);
	}
	
	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer p, World w, int x, int y, int z, int p7, float p8, float p9, float p10)
	{
		TileEntity tile = w.getTileEntity(x, y, z);
		int[] pos = {x, y, z};
		
		if (this.isRE(tile))
		{
			this.setCoords(item, pos);
			if (w.isRemote)
			{
				p.addChatComponentMessage(new ChatComponentText("test")); 
			}
			return true;
		}
		return false;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World w, EntityPlayer p)
	{
		if (!w.isRemote)
		{
			int[] pos = this.getCoords(item);
			int x = pos[0], y = pos[1], z = pos[2]; 
			
			TileEntity tile = w.getTileEntity(x, y, z);
			
			if (tile instanceof REBaseTile)
			{
				((REBaseTile)tile).detonate();
				return item;
			}
		}
		
		return item;
	}
	
	public void setCoords(ItemStack item, int[] pos)
	{
		if (item.stackTagCompound == null)
		{
			item.setTagCompound(new NBTTagCompound());
		}
		
		item.stackTagCompound.setIntArray("pos", pos);
	}
	
	public int[] getCoords(ItemStack item)
	{
		
		if (item.stackTagCompound == null)
		{
			return new int[3];
		}
		
		return item.stackTagCompound.getIntArray("pos");
	}
	
	public boolean isRE(TileEntity tile)
	{
		if (tile != null && tile instanceof REBaseTile)
		{
			return true;
		}
		
		return false;
	}
	
}
