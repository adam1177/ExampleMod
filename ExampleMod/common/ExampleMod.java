package evar678.ExampleMod.common;

import net.minecraft.block.Block;
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
import evar678.ExampleMod.common.blocks.BlockLimestone;
import evar678.ExampleMod.common.blocks.BlockLandMine;
import evar678.ExampleMod.common.handlers.ExampleModClientPacketHandler;
import evar678.ExampleMod.common.handlers.ExampleModServerPacketHandler;
import evar678.ExampleMod.common.handlers.ExampleModServerPacketHandler;
import evar678.ExampleMod.common.handlers.ExampleModClientPacketHandler;
import evar678.ExampleMod.common.items.ItemLime;

@NetworkMod(clientSideRequired = true, serverSideRequired = true, clientPacketHandlerSpec = @SidedPacketHandler(channels = { "ExampleMod" }, packetHandler = ExampleModClientPacketHandler.class), serverPacketHandlerSpec = @SidedPacketHandler(channels = { "ExampleMod" }, packetHandler = ExampleModServerPacketHandler.class))

@Mod(modid = "ExampleMod", name = "Example Mod", version = "Release")
public class ExampleMod
{
	
	@Instance("ExampleMod")
	// The instance, this is very important later on
	public static ExampleMod instance = new ExampleMod();
	
	@SidedProxy(clientSide = "evar678.ExampleMod.common.ExampleModClientProxy", serverSide = "evar678.ExampleMod.common.ExampleModCommonProxy")
	// Tells Forge the location of your proxies
	public static ExampleModCommonProxy proxy;
	
	//ITEMS
	public static Item Lime;
	
	// BLOCKS
	public static Block Limestone;
	public static Block LandMine;
	
	@PreInit
	public void PreInit(FMLPreInitializationEvent e)
	{
		
		// BLOCKS
		Limestone = new BlockLimestone(3000).setUnlocalizedName("Limestone"); // 3000 is its ID
		LandMine = new BlockLandMine(3001).setUnlocalizedName("LandMine");
		
		//ITEMS
		Lime = new ItemLime(5000).setUnlocalizedName("Lime");
	}
	
	@Init
	public void InitExampleMod(FMLInitializationEvent event)
	{ // Your main
		// initialization
		// method
		
		// BLOCKS (METHOD)
		proxy.registerBlocks(); // Calls the registerBlocks method -- This
								// wasn't here before, so don't skip over this!
		//ITEMS (METHOD)
		proxy.registerItems(); //DON'T FORGET THIS, ADD IT IN AND THEN DELETE THIS REMINDER COMMENT

		// MULTIPLAYER ABILITY
		NetworkRegistry.instance().registerGuiHandler(this, proxy); // Registers
																	// the class
																	// that
																	// deals
																	// with GUI
																	// data
		
	}
}
