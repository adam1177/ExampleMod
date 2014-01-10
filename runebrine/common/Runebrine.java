package evar678.runebrine.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import evar678.runebrine.common.blocks.StoneBlockVariant;
import evar678.runebrine.common.blocks.StoneSlabVariant;
import evar678.runebrine.common.handlers.RunebrineClientPacketHandler;
import evar678.runebrine.common.handlers.RunebrineServerPacketHandler;

@NetworkMod(clientSideRequired = true, serverSideRequired = true, clientPacketHandlerSpec = @SidedPacketHandler(channels =
{ "Runebrine" }, packetHandler = RunebrineClientPacketHandler.class), serverPacketHandlerSpec = @SidedPacketHandler(channels =
{ "Runebrine" }, packetHandler = RunebrineServerPacketHandler.class))
@Mod(modid = "Runebrine", name = "Example Mod", version = "Release")
public class Runebrine
{
	
	@Instance("Runebrine")
	// The instance, this is very important later on
	public static Runebrine instance = new Runebrine();
	
	@SidedProxy(clientSide = "evar678.runebrine.common.RunebrineClientProxy", serverSide = "evar678.runebrine.common.RunebrineCommonProxy")
	// Tells Forge the location of your proxies
	public static RunebrineCommonProxy proxy;
	
	// Full Blocks - Stone
	public static Block Basalt, Chalk, Chert, Fieldspar, Sandstone, Shale,
			Mouldstone, Claystone, Siltstone, brownSandstone, Marble,
			Limestone, Gneiss, blackMarble, granite;
	
	// Slabs - Stone
	
	 public static Block BasaltSlab;
	 public static Block ChalkSlab; 
	 public static Block ChertSlab; 
	 public static Block FieldsparSlab;
	 public static Block SandstoneSlab;
	 public static Block ShaleSlab; 
	 public static Block MouldstoneSlab; 
	 public static Block ClaystoneSlab; 
	 public static Block SiltstoneSlab;
	 public static Block brownSandstoneSlab;
	 public static Block MarbleSlab;
	 public static Block LimestoneSlab;
	 public static Block GneissSlab;
	 public static Block blackMarbleSlab;
	 public static Block GraniteSlab;
	 
	 public static Block BasaltDoubleSlab;
	
	@PreInit
	public void PreInit(FMLPreInitializationEvent e)
	{
		/*
		 * 33 Variants Per Brick:
		 * Smooth 
		 * Slab 
		 * Double Slab
		 * Broken 
		 * Overgrown 
		 * Sand 
		 * Large Brick 
		 * Large Brick Stairs 
		 * Large Brick Slabs 
		 * Large Brick Wall 
		 * Large Brick Fence 
		 * Rubble  
		 * Cobblestone 
		 * Cobblestone Stairs 
		 * Cobblestone Slabs 
		 * Cobblestone Walls 
		 * Cobblestone Fence 
		 * Brick 
		 * Brick Stairs 
		 * Brick Slabs 
		 * Brick Walls 
		 * Brick Fence 
		 * Road 
		 * Road Stairs 
		 * Road Slabs 
		 * Overgrown Cobblestone 
		 * Overgrown Brick 
		 * Cracked Brick 
		 * Pillar 
		 * Pillar Wall 
		 * Plaster 
		 * Edging 
		 * Carved
		 */
		
		Basalt = new StoneBlockVariant(2700, 2.0F, CreativeTabs.tabBlock, "Basalt").setUnlocalizedName("Basalt");
		BasaltSlab = new StoneSlabVariant(2701, 2.0F, CreativeTabs.tabDecorations, false, "Basalt").setUnlocalizedName("BasaltSlab");
		BasaltDoubleSlab = new StoneSlabVariant(2702, 2.0F, CreativeTabs.tabDecorations, true, "Basalt").setUnlocalizedName("BasaltSlabDouble");
		
		Chalk = new StoneBlockVariant(2734, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Chalk");
		ChalkSlab = new StoneSlabVariant(2735, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("ChalkSlab");
		
		Chert = new StoneBlockVariant(2768, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Chert");
		ChertSlab = new StoneSlabVariant(2769, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("ChertSlab");
		
		Fieldspar = new StoneBlockVariant(2802, 2.0F, CreativeTabs.tabBlock, "Fieldspar").setUnlocalizedName("Fieldspar");
		FieldsparSlab = new StoneSlabVariant(2803, 2.0F, CreativeTabs.tabDecorations, false, "Fieldspar").setUnlocalizedName("FieldsparSlab");
		
		Sandstone = new StoneBlockVariant(2836, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Sandstone");
		SandstoneSlab = new StoneSlabVariant(2837, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("SandstoneSlab");
		
		Shale = new StoneBlockVariant(2870, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Shale");
		ShaleSlab = new StoneSlabVariant(2871, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("ShaleSlab");
		
		Mouldstone = new StoneBlockVariant(2904, 2.0F, CreativeTabs.tabBlock, "Mouldstone").setUnlocalizedName("Mouldstone");
		MouldstoneSlab = new StoneSlabVariant(2905, 2.0F, CreativeTabs.tabDecorations, false, "Mouldstone").setUnlocalizedName("MouldstoneSlab");
		
		Claystone = new StoneBlockVariant(2938, 2.0F, CreativeTabs.tabBlock, "Claystone").setUnlocalizedName("Claystone");
		ClaystoneSlab = new StoneSlabVariant(2939, 2.0F, CreativeTabs.tabDecorations, false, "Claystone").setUnlocalizedName("ClaystoneSlab");
		
		Siltstone = new StoneBlockVariant(2972, 2.0F, CreativeTabs.tabBlock, "Siltstone").setUnlocalizedName("Siltstone");
		SiltstoneSlab = new StoneSlabVariant(2973, 2.0F, CreativeTabs.tabDecorations, false, "Siltstone").setUnlocalizedName("SiltstoneSlab");
		
		brownSandstone = new StoneBlockVariant(3006, 2.0F, CreativeTabs.tabBlock, "Brown Sandstone").setUnlocalizedName("Brown Sandstone");
		brownSandstoneSlab = new StoneSlabVariant(3007, 2.0F, CreativeTabs.tabDecorations, false, "Brown Sandstone").setUnlocalizedName("BrownSandstoneSlab");
		
		Marble = new StoneBlockVariant(3040, 2.0F, CreativeTabs.tabBlock, "Marble").setUnlocalizedName("Marble");
		MarbleSlab = new StoneSlabVariant(3041, 2.0F, CreativeTabs.tabDecorations, false, "Marble").setUnlocalizedName("MarbleSlab");
		
		Limestone = new StoneBlockVariant(3074, 2.0F, CreativeTabs.tabBlock, "Limestone").setUnlocalizedName("Limestone");
		LimestoneSlab = new StoneSlabVariant(3075, 2.0F, CreativeTabs.tabDecorations, false, "Limestone").setUnlocalizedName("LimestoneSlab");
		
		Gneiss = new StoneBlockVariant(3108, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Gneiss");
		GneissSlab = new StoneSlabVariant(3109, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("GneissSlab");
		
		blackMarble = new StoneBlockVariant(3142, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("BlackMarble");
		blackMarbleSlab = new StoneSlabVariant(3143, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("BlackMarbleSlab");
		
		granite = new StoneBlockVariant(3176, 2.0F, CreativeTabs.tabBlock, "Granite").setUnlocalizedName("Granite");
		GraniteSlab = new StoneSlabVariant(3177, 2.0F, CreativeTabs.tabDecorations, false, "Granite").setUnlocalizedName("GraniteSlab");
	}
	
	@Init
	public void InitRunebrine(FMLInitializationEvent event)
	{ // Your main
		// initialization
		// method
		
		// BLOCKS (METHOD)
		proxy.registerBlocks(); // Calls the registerBlocks method -- This
								// wasn't here before, so don't skip over this!
		// ITEMS (METHOD)
		proxy.registerItems(); // DON'T FORGET THIS, ADD IT IN AND THEN DELETE
								// THIS REMINDER COMMENT
		
		// MULTIPLAYER ABILITY
		NetworkRegistry.instance().registerGuiHandler(this, proxy);
		
	}
}
