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
import evar678.runebrine.common.blocks.StoneFenceVariant;
import evar678.runebrine.common.blocks.StoneSlabVariant;
import evar678.runebrine.common.blocks.StoneStairVariant;
import evar678.runebrine.common.blocks.StoneWallVariant;
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
	 
	 //Double slabs - Stone
	 public static Block BasaltDoubleSlab;
	 
	 //Stairs - Stone
	 public static Block BasaltStair;
	 public static Block ChalkStair; 
	 public static Block ChertStair; 
	 public static Block FieldsparStair;
	 public static Block SandstoneStair;
	 public static Block ShaleStair; 
	 public static Block MouldstoneStair; 
	 public static Block ClaystoneStair; 
	 public static Block SiltstoneStair;
	 public static Block brownSandstoneStair;
	 public static Block MarbleStair;
	 public static Block LimestoneStair;
	 public static Block GneissStair;
	 public static Block blackMarbleStair;
	 public static Block GraniteStair;
	 
	 //Fences - Stone
	 public static Block BasaltFence;
	 public static Block ChalkFence; 
	 public static Block ChertFence; 
	 public static Block FieldsparFence;
	 public static Block SandstoneFence;
	 public static Block ShaleFence; 
	 public static Block MouldstoneFence; 
	 public static Block ClaystoneFence; 
	 public static Block SiltstoneFence;
	 public static Block brownSandstoneFence;
	 public static Block MarbleFence;
	 public static Block LimestoneFence;
	 public static Block GneissFence;
	 public static Block blackMarbleFence;
	 public static Block GraniteFence;
	 
	 //Walls - Stone
	 public static Block BasaltWall;
	 public static Block ChalkWall; 
	 public static Block ChertWall; 
	 public static Block FieldsparWall;
	 public static Block SandstoneWall;
	 public static Block ShaleWall; 
	 public static Block MouldstoneWall; 
	 public static Block ClaystoneWall; 
	 public static Block SiltstoneWall;
	 public static Block brownSandstoneWall;
	 public static Block MarbleWall;
	 public static Block LimestoneWall;
	 public static Block GneissWall;
	 public static Block blackMarbleWall;
	 public static Block GraniteWall;
	 
	
	@PreInit
	public void PreInit(FMLPreInitializationEvent e)
	{
		/* 15 Block types
		 * 33 Variants Per Type:
		 * Smooth [x]
		 * Slab [x]
		 * Double Slab [.]
		 * Broken [ ]
		 * Overgrown [ ]
		 * Sand [ ]
		 * Large Brick [ ]
		 * Large Brick Stairs [ ]
		 * Large Brick Slabs [ ]
		 * Large Brick Wall [ ]
		 * Large Brick Fence [ ]
		 * Rubble [ ]
		 * Cobblestone [ ]
		 * Cobblestone Stairs [ ]
		 * Cobblestone Slabs [ ]
		 * Cobblestone Walls [ ]
		 * Cobblestone Fence [ ]
		 * Brick [ ]
		 * Brick Stairs [ ]
		 * Brick Slabs [ ]
		 * Brick Walls [ ]
		 * Brick Fence [ ]
		 * Road [ ]
		 * Road Stairs [ ]
		 * Road Slabs [ ]
		 * Overgrown Cobblestone [ ]
		 * Overgrown Brick [ ]
		 * Cracked Brick [ ]
		 * Pillar [ ]
		 * Pillar Wall [ ]
		 * Plaster [ ]
		 * Edging [ ]
		 * Carved [ ]
		 */
		
		Basalt = new StoneBlockVariant(2700, 2.0F, CreativeTabs.tabBlock, "Basalt").setUnlocalizedName("Basalt");
		BasaltSlab = new StoneSlabVariant(2701, 2.0F, CreativeTabs.tabDecorations, false, "Basalt").setUnlocalizedName("BasaltSlab");
		BasaltDoubleSlab = new StoneSlabVariant(2702, 2.0F, CreativeTabs.tabDecorations, true, "Basalt").setUnlocalizedName("BasaltDoubleSlab");
		BasaltStair = new StoneStairVariant(2703, 2.0F, CreativeTabs.tabDecorations, Basalt, "Basalt").setUnlocalizedName("BasaltStair");
		BasaltFence = new StoneFenceVariant(2704, 2.0F, CreativeTabs.tabDecorations, "Basalt").setUnlocalizedName("BasaltFence");
		BasaltWall = new StoneWallVariant(2705, 2.0F, CreativeTabs.tabDecorations, "Basalt").setUnlocalizedName("BasaltWall");
		
		Chalk = new StoneBlockVariant(2734, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Chalk");
		ChalkSlab = new StoneSlabVariant(2735, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("ChalkSlab");
		//ChalkDoubleSlab = new StoneSlabVariant(2736, 2.0F, CreativeTabs.tabDecorations, true, "null").setUnlocalizedName("ChalkDoubleSlab");
		ChalkStair = new StoneStairVariant(2737, 2.0F, CreativeTabs.tabDecorations, Chalk, "null").setUnlocalizedName("ChalkStair");
		ChalkFence = new StoneFenceVariant(2738, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("ChalkFence");
		ChalkWall = new StoneWallVariant(2739, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("ChalkWall");
		
		Chert = new StoneBlockVariant(2768, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Chert");
		ChertSlab = new StoneSlabVariant(2769, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("ChertSlab");
		//ChertDoubleSlab = new StoneSlabVariant(2770, 2.0F, CreativeTabs.tabDecorations, true, "null").setUnlocalizedName("ChertDoubleSlab");
		ChertStair = new StoneStairVariant(2771, 2.0F, CreativeTabs.tabDecorations, Chert, "null").setUnlocalizedName("ChertStair");
		ChertFence = new StoneFenceVariant(2772, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("ChertFence");
		ChertWall = new StoneWallVariant(2773, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("ChertWall");
		
		
		Fieldspar = new StoneBlockVariant(2802, 2.0F, CreativeTabs.tabBlock, "Fieldspar").setUnlocalizedName("Fieldspar");
		FieldsparSlab = new StoneSlabVariant(2803, 2.0F, CreativeTabs.tabDecorations, false, "Fieldspar").setUnlocalizedName("FieldsparSlab");
		//FieldsparDoubleSlab = new StoneSlabVariant(2804, 2.0F, CreativeTabs.tabDecorations, true, "Fieldspar").setUnlocalizedName("FieldsparDoubleSlab");
		FieldsparStair = new StoneStairVariant(2805, 2.0F, CreativeTabs.tabDecorations, Fieldspar, "Fieldspar").setUnlocalizedName("FieldsparStair");
		FieldsparFence = new StoneFenceVariant(2806, 2.0F, CreativeTabs.tabDecorations, "Fieldspar").setUnlocalizedName("FieldsparFence");
		FieldsparWall = new StoneWallVariant(2807, 2.0F, CreativeTabs.tabDecorations, "Fieldspar").setUnlocalizedName("FieldsparWall");
		
		Sandstone = new StoneBlockVariant(2836, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Sandstone");
		SandstoneSlab = new StoneSlabVariant(2837, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("SandstoneSlab");
		//SandstoneDoubleSlab = new StoneSlabVariant(2838, 2.0F, CreativeTabs.tabDecorations, true, "null").setUnlocalizedName("SanddstoneDoubleSlab");
		SandstoneStair = new StoneStairVariant(2839, 2.0F, CreativeTabs.tabDecorations, Sandstone, "null").setUnlocalizedName("SandstoneStair");
		SandstoneFence = new StoneFenceVariant(2840, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("SandstoneFence");
		SandstoneWall = new StoneWallVariant(2841, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("SandstoneWall");
		
		Shale = new StoneBlockVariant(2870, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Shale");
		ShaleSlab = new StoneSlabVariant(2871, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("ShaleSlab");
		//ShaleDoubleSlab = new StoneSlabVariant(2872, 2.0F, CreativeTabs.tabDecorations, true, "null").setUnlocalizedName("ShaleDoubleSlab");
		ShaleStair = new StoneStairVariant(2873, 2.0F, CreativeTabs.tabDecorations, Shale, "null").setUnlocalizedName("ShaleStair");
		ShaleFence = new StoneFenceVariant(2874, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("ShaleFence");
		ShaleWall = new StoneWallVariant(2875, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("ShaleWall");
		
		Mouldstone = new StoneBlockVariant(2904, 2.0F, CreativeTabs.tabBlock, "Mouldstone").setUnlocalizedName("Mouldstone");
		MouldstoneSlab = new StoneSlabVariant(2905, 2.0F, CreativeTabs.tabDecorations, false, "Mouldstone").setUnlocalizedName("MouldstoneSlab");
		//MouldstoneDoubleSlab = new StoneSlabVariant(2906, 2.0F, CreativeTabs.tabDecorations, true, "Mouldstone").setUnlocalizedName("MouldstoneDoubleSlab");
		MouldstoneStair = new StoneStairVariant(2907, 2.0F, CreativeTabs.tabDecorations, Mouldstone, "Mouldstone").setUnlocalizedName("MouldstoneStair");
		MouldstoneFence = new StoneFenceVariant(2908, 2.0F, CreativeTabs.tabDecorations, "Mouldstone").setUnlocalizedName("MouldstoneFence");
		MouldstoneWall = new StoneWallVariant(2909, 2.0F, CreativeTabs.tabDecorations, "Mouldstone").setUnlocalizedName("MouldstoneWall");
		
		Claystone = new StoneBlockVariant(2938, 2.0F, CreativeTabs.tabBlock, "Claystone").setUnlocalizedName("Claystone");
		ClaystoneSlab = new StoneSlabVariant(2939, 2.0F, CreativeTabs.tabDecorations, false, "Claystone").setUnlocalizedName("ClaystoneSlab");
		//ClaystoneDoubleSlab = new StoneSlabVariant(2940, 2.0F, CreativeTabs.tabDecorations, true, "Claystone").setUnlocalizedName("ClaystoneDoubleSlab");
		ClaystoneStair = new StoneStairVariant(2941, 2.0F, CreativeTabs.tabDecorations, Claystone, "Claystone").setUnlocalizedName("ClaystoneStair");
		ClaystoneFence = new StoneFenceVariant(2942, 2.0F, CreativeTabs.tabDecorations, "Claystone").setUnlocalizedName("ClaystoneFence");
		ClaystoneWall = new StoneWallVariant(2943, 2.0F, CreativeTabs.tabDecorations, "Claystone").setUnlocalizedName("ClaystoneWall");
		
		Siltstone = new StoneBlockVariant(2972, 2.0F, CreativeTabs.tabBlock, "Siltstone").setUnlocalizedName("Siltstone");
		SiltstoneSlab = new StoneSlabVariant(2973, 2.0F, CreativeTabs.tabDecorations, false, "Siltstone").setUnlocalizedName("SiltstoneSlab");
		//SiltstoneDoubleSlab = new StoneSlabVariant(2974, 2.0F, CreativeTabs.tabDecorations, true, "Siltstone").setUnlocalizedName("SiltstoneDoubleSlab");
		SiltstoneStair = new StoneStairVariant(2975, 2.0F, CreativeTabs.tabDecorations, Siltstone, "Siltstone").setUnlocalizedName("SiltstoneStair");
		SiltstoneFence = new StoneFenceVariant(2976, 2.0F, CreativeTabs.tabDecorations, "Siltstone").setUnlocalizedName("SiltstoneFence");
		SiltstoneWall = new StoneWallVariant(2977, 2.0F, CreativeTabs.tabDecorations, "Siltstone").setUnlocalizedName("SiltstoneWall");
		
		brownSandstone = new StoneBlockVariant(3006, 2.0F, CreativeTabs.tabBlock, "Brown Sandstone").setUnlocalizedName("Brown Sandstone");
		brownSandstoneSlab = new StoneSlabVariant(3007, 2.0F, CreativeTabs.tabDecorations, false, "Brown Sandstone").setUnlocalizedName("BrownSandstoneSlab");
		//brownSandstoneDoubleSlab = new StoneSlabVariant(3008, 2.0F, CreativeTabs.tabDecorations, true, "Brown Sandstone").setUnlocalizedName("BrownSandstoneDoubleSlab");
		brownSandstoneStair = new StoneStairVariant(3009, 2.0F, CreativeTabs.tabDecorations, brownSandstone, "Brown Sandstone").setUnlocalizedName("BrownSandstoneStair");
		brownSandstoneFence = new StoneFenceVariant(3010, 2.0F, CreativeTabs.tabDecorations, "Brown Sandstone").setUnlocalizedName("BrownSandstoneFence");
		brownSandstoneWall = new StoneWallVariant(3011, 2.0F, CreativeTabs.tabDecorations, "Brown Sandstone").setUnlocalizedName("BrownSandstoneWall");
		
		Marble = new StoneBlockVariant(3040, 2.0F, CreativeTabs.tabBlock, "Marble").setUnlocalizedName("Marble");
		MarbleSlab = new StoneSlabVariant(3041, 2.0F, CreativeTabs.tabDecorations, false, "Marble").setUnlocalizedName("MarbleSlab");
		//MarbleDoubleSlab = new StoneSlabVariant(3042, 2.0F, CreativeTabs.tabDecorations, true, "Marble").setUnlocalizedName("MarbleDoubleSlab");
		MarbleStair = new StoneStairVariant(3043, 2.0F, CreativeTabs.tabDecorations, Marble, "Marble").setUnlocalizedName("MarbleStair");
		MarbleFence = new StoneFenceVariant(3044, 2.0F, CreativeTabs.tabDecorations, "Marble").setUnlocalizedName("MarbleFence");
		MarbleWall = new StoneWallVariant(3045, 2.0F, CreativeTabs.tabDecorations, "Marble").setUnlocalizedName("MarbleWall");
		
		Limestone = new StoneBlockVariant(3074, 2.0F, CreativeTabs.tabBlock, "Limestone").setUnlocalizedName("Limestone");
		LimestoneSlab = new StoneSlabVariant(3075, 2.0F, CreativeTabs.tabDecorations, false, "Limestone").setUnlocalizedName("LimestoneSlab");
		//LimestoneDoubleSlab = new StoneSlabVariant(3076, 2.0F, CreativeTabs.tabDecorations, true, "Limestone").setUnlocalizedName("LimestoneDoubleSlab");
		LimestoneStair = new StoneStairVariant(3077, 2.0F, CreativeTabs.tabDecorations, Limestone, "Limestone").setUnlocalizedName("LimestoneStair");
		LimestoneFence = new StoneFenceVariant(3078, 2.0F, CreativeTabs.tabDecorations, "Limestone").setUnlocalizedName("LimestoneFence");
		LimestoneWall = new StoneWallVariant(3079, 2.0F, CreativeTabs.tabDecorations, "Limestone").setUnlocalizedName("LimestoneWall");
		
		Gneiss = new StoneBlockVariant(3108, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("Gneiss");
		GneissSlab = new StoneSlabVariant(3109, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("GneissSlab");
		//GneissDoubleSlab = new StoneSlabVariant(3110, 2.0F, CreativeTabs.tabDecorations, true, "null").setUnlocalizedName("GneissDoubleSlab");
		GneissStair = new StoneStairVariant(3111, 2.0F, CreativeTabs.tabDecorations, Gneiss, "null").setUnlocalizedName("GneissStair");
		GneissFence = new StoneFenceVariant(3112, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("GneissFence");
		GneissWall = new StoneWallVariant(3113, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("GneissWall");
		
		blackMarble = new StoneBlockVariant(3142, 2.0F, CreativeTabs.tabBlock, "null").setUnlocalizedName("BlackMarble");
		blackMarbleSlab = new StoneSlabVariant(3143, 2.0F, CreativeTabs.tabDecorations, false, "null").setUnlocalizedName("blackMarbleSlab");
		//blackMarbleDoubleSlab = new StoneSlabVariant(3144, 2.0F, CreativeTabs.tabDecorations, true, "null").setUnlocalizedName("blackMarbleDoubleSlab");
		blackMarbleStair = new StoneStairVariant(3145, 2.0F, CreativeTabs.tabDecorations, blackMarble, "null").setUnlocalizedName("blackMarbleStair");
		blackMarbleFence = new StoneFenceVariant(3146, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("blackMarbleFence");
		blackMarbleWall = new StoneWallVariant(3147, 2.0F, CreativeTabs.tabDecorations, "null").setUnlocalizedName("blackMarbleWall");
		
		granite = new StoneBlockVariant(3176, 2.0F, CreativeTabs.tabBlock, "Granite").setUnlocalizedName("Granite");
		GraniteSlab = new StoneSlabVariant(3177, 2.0F, CreativeTabs.tabDecorations, false, "Granite").setUnlocalizedName("GraniteSlab");
		//GraniteDoubleSlab = new StoneSlabVariant(3178, 2.0F, CreativeTabs.tabDecorations, true, "Granite").setUnlocalizedName("GraniteDoubleSlab");
		GraniteStair = new StoneStairVariant(3179, 2.0F, CreativeTabs.tabDecorations, granite, "Granite").setUnlocalizedName("GraniteStair");
		GraniteFence = new StoneFenceVariant(3180, 2.0F, CreativeTabs.tabDecorations, "Granite").setUnlocalizedName("GraniteFence");
		GraniteWall = new StoneWallVariant(3181, 2.0F, CreativeTabs.tabDecorations, "Granite").setUnlocalizedName("GraniteWall");
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
