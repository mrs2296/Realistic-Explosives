package realexplosives.core;

import realexplosives.block.REBaseTile;
import realexplosives.render.RETileRender;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class RECommonProxy 
{
	public void registerTileEntities()
	{
		GameRegistry.registerTileEntity(REBaseTile.class, "tileRE");
	}
}
