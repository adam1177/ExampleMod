package evar678.ExampleMod.common; //The package your mod is in

import net.minecraft.block.Block;
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
import evar678.ExampleMod.common.handlers.ExampleModClientPacketHandler;
import evar678.ExampleMod.common.handlers.ExampleModServerPacketHandler;
import evar678.ExampleMod.common.handlers.ExampleModServerPacketHandler;
import evar678.ExampleMod.common.handlers.ExampleModClientPacketHandler;

@NetworkMod(clientSideRequired = true, serverSideRequired = true, // Whether
																	// client
																	// side and
																	// server
																	// side are
																	// needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = { "ExampleMod" }, packetHandler = ExampleModClientPacketHandler.class), // For
																																	// clientside
																																	// packet
																																	// handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = { "ExampleMod" }, packetHandler = ExampleModServerPacketHandler.class))
// For serverside packet handling
// MOD BASICS
@Mod(modid = "ExampleMod", name = "Example Mod", version = "Release")
public class ExampleMod {

	@Instance("ExampleMod")
	// The instance, this is very important later on
	public static ExampleMod instance = new ExampleMod();

	@SidedProxy(clientSide = "evar678.ExampleMod.common.ExampleModClientProxy", serverSide = "evar678.ExampleMod.common.ExampleModCommonProxy")
	// Tells Forge the location of your proxies
	public static ExampleModCommonProxy proxy;

	// BLOCKS
	public static Block Limestone;

	@PreInit
	public void PreInit(FMLPreInitializationEvent e) {

		// BLOCKS
		Limestone = new BlockLimestone(3000).setUnlocalizedName("Limestone"); // 3000
																				// is
																				// its
																				// ID

	}

	@Init
	public void InitExampleMod(FMLInitializationEvent event) { // Your main
																// initialization
																// method

		// BLOCKS (METHOD)
		proxy.registerBlocks(); // Calls the registerBlocks method -- This
								// wasn't here before, so don't skip over this!

		// MULTIPLAYER ABILITY
		NetworkRegistry.instance().registerGuiHandler(this, proxy); // Registers
																	// the class
																	// that
																	// deals
																	// with GUI
																	// data

	}
}
