package realexplosives.core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import realexplosives.block.REBaseBlock;
import realexplosives.block.REBaseTile;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=RealisticExplosives.ID, name=RealisticExplosives.NAME, version=RealisticExplosives.VER)

public class RealisticExplosives {

	public static final String ID = "realisticexplosives";
	public static final String NAME = "Realistic Explosives";
	public static final String VER = "0.0.1";
	
	public static final String TEXTURE_PATH = "textures/";
	
	public static Block blockRE;
	public static Block Aluminium;
	public static Block Copper;
	public static Block Wax;
	public static Block RDX;
	public static Block CompositionB;
	public static Block H6;
	public static Block CompositionA;
	public static Block Semtex;
	public static Block Torpex;
	public static Block Dynamite;
	public static Block AntiPersonalMine;
	
	public static Item NitricAcid;
	public static Item Hexamine;
	public static Item Ammonia;
	public static Item PowderedAluminium;
	public static Item Pentaerythritol;
	public static Item PentaerythritolTetranitrate;
	public static Item Glycerol;
	public static Item Nitroglycerin;
	public static Item Formaldehyde;
	public static Item Acetylaldehyde;
	public static Item SodiumCarbonate;
	public static Item IRDX;
	
	@Instance(value = RealisticExplosives.ID)
	public static RealisticExplosives instance;
	
	@SidedProxy(clientSide="realexplosives.core.REClientProxy", serverSide="realexplosives.core.RECommonProxy")
	public static RECommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		blockRE = new REBaseBlock(Material.ground);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerTileEntities();
		GameRegistry.registerTileEntity(REBaseTile.class, "RETileEntity");
		
		GameRegistry.registerBlock(blockRE, "blockRE");
		//blocks
				GameRegistry.registerBlock(Aluminium, "Aluminium");
				GameRegistry.registerBlock(Copper, "Copper");
				GameRegistry.registerBlock(Wax , "Wax");
				GameRegistry.registerBlock(RDX, "RDX");
				GameRegistry.registerBlock(CompositionB, "CompositionB");
				GameRegistry.registerBlock(H6, "H6");
				GameRegistry.registerBlock(CompositionA, "CompositionA");
				GameRegistry.registerBlock(Semtex, "Semtex");
				GameRegistry.registerBlock(Torpex, "Torpex");
				GameRegistry.registerBlock(Dynamite, "Dynamite");
				GameRegistry.registerBlock(AntiPersonalMine, "AntiPersonalMine");
				
				//Items
				GameRegistry.registerItem(NitricAcid, "NitricAcid");
				GameRegistry.registerItem(Hexamine, "Hexamine");
				GameRegistry.registerItem(Ammonia, "Ammonia");
				GameRegistry.registerItem(PowderedAluminium, "PowderedAluminium");
				GameRegistry.registerItem(Pentaerythritol, "Pentaerythritol");
				GameRegistry.registerItem(PentaerythritolTetranitrate, "PentaerythritolTetranitrate");
				GameRegistry.registerItem(Glycerol, "Glycerol");
				GameRegistry.registerItem(Nitroglycerin, "Nitroglycerin");
				GameRegistry.registerItem(Formaldehyde, "Formaldehyde");
				GameRegistry.registerItem(Acetylaldehyde, "Acetylaldehyde");
				GameRegistry.registerItem(SodiumCarbonate, "SodiumCarbonate");
				GameRegistry.registerItem(IRDX, "IRDX");
				
				//ItemStack Block 64
				ItemStack RDXStack = new ItemStack(Block.RDX,64);
				ItemStack CopperStack = new ItemStack(Block.Copper,64);
				ItemStack WaxStack = new ItemStack(Block.Wax,64);
				ItemStack AluminiumStack = new ItemStack(Block.Aluminium,64);
				ItemStack CompositionBStack = new ItemStack(Block.CompositionB,64);
				ItemStack H6Stack = new ItemStack(Block.H6,64);
				ItemStack CompositionAStack = new ItemStack(Block.Composition,64);
				ItemStack SemtexStack = new ItemStack(Block.Semtex,64);
				ItemStack TorpexStack = new ItemStack(Block.Torpex,64);
				ItemStack DynamiteStack = new ItemStack(Block.Dynamite,64);
				ItemStack AntiPersonalMineStack = new ItemStack(Block.AntiPersonalMine,64);
				
				//ItemStack Item 64
				ItemStack NitricAcidStack = new ItemStack(Item.NitricAcid,64);
				ItemStack HexamineStack = new ItemStack(Item.Hexamine,64);
				ItemStack AmmoniaStack = new ItemStack(Item.Ammonia,64);
				ItemStack PowderedAluminiumStack = new ItemStack(Item.PowderedAluminium,64);
				ItemStack PentaerythritolStack = new ItemStack(Item.Pentaerythritol,64);
				ItemStack GlycerolStack = new ItemStack(Item.Glycerol,64);
				ItemStack NitroglycerinStack = new ItemStack(Item.Nitroglycerin,64);
				ItemStack FormaldehydeStack = new ItemStack(Item.Formaldehyde,64);
				ItemStack NitricAcidStack = new ItemStack(Item.NitricAcid,64);
				ItemStack NitricAcidStack = new ItemStack(Item.NitricAcid,64);
				ItemStack NitricAcidStack = new ItemStack(Item.NitricAcid,64);
				ItemStack NitricAcidStack = new ItemStack(Item.NitricAcid,64);
				ItemStack NitricAcidStack = new ItemStack(Item.NitricAcid,64);
				
				//crafting Blocks
				GameRegistry.addShapelessRecipe( ItemStack(Block.RDX), (Item.IRDX));
				
				
				//crafting Items
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
