package realexplosives.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import realexplosives.block.REBaseTile;
import realexplosives.core.RECommonProxy;
import realexplosives.render.RETileRender;

public class REClientProxy extends RECommonProxy
{
	@Override
	public void registerTileEntities()
	{
		super.registerTileEntities();
		ClientRegistry.bindTileEntitySpecialRenderer(REBaseTile.class, new RETileRender());
	}
}
