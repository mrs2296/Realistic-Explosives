package realexplosives.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=RealisticExplosives.ID, name=RealisticExplosives.NAME, version=RealisticExplosives.VER)

public class RealisticExplosives {

	public static final String ID = "realisticexplosives";
	public static final String NAME = "Realistic Explosives";
	public static final String VER = "0.0.1";
	
	@Instance(value = RealisticExplosives.ID)
	public static RealisticExplosives instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
