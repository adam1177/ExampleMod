package evar678.runebrine.common;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RunebrineCommonProxy implements IGuiHandler
{ // THIS IS
	// IMPORTANT, CANNOT
	// BE A PROXY/GUI
	// HANDLER WITHOUT
	// THIS!!
	public void registerRenderInformation() // Client side texture registering
	{
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z)
	{ // For GUI's
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z)
	{ // For GUI's
		return null;
	}
	
	public void registerTiles()
	{ // For registering TileEntities
	}
	
	public void registerBlocks()
	{ // For registering Blocks
		
		//Stone
		
		//Full Blocks
		GameRegistry.registerBlock(Runebrine.Basalt, "Basalt");
		GameRegistry.registerBlock(Runebrine.Chalk, "Chalk");
		GameRegistry.registerBlock(Runebrine.Chert, "Chert");
		GameRegistry.registerBlock(Runebrine.Fieldspar, "Fieldspar");
		GameRegistry.registerBlock(Runebrine.Sandstone, "Sandstone");
		GameRegistry.registerBlock(Runebrine.Shale, "Shale");
		GameRegistry.registerBlock(Runebrine.Mouldstone, "Mouldstone");
		GameRegistry.registerBlock(Runebrine.Claystone, "Claystone");
		GameRegistry.registerBlock(Runebrine.Siltstone, "Siltstone");
		GameRegistry.registerBlock(Runebrine.brownSandstone, "BrownSandstone");
		GameRegistry.registerBlock(Runebrine.Marble, "Marble");
		GameRegistry.registerBlock(Runebrine.Limestone, "Limestone");
		GameRegistry.registerBlock(Runebrine.Gneiss, "Gneiss");
		GameRegistry.registerBlock(Runebrine.blackMarble, "BlackMarble");
		GameRegistry.registerBlock(Runebrine.granite, "Granite");
		
		//Slabs
		GameRegistry.registerBlock(Runebrine.BasaltSlab, "BasaltSlab");
		GameRegistry.registerBlock(Runebrine.ChalkSlab, "ChalkSlab");
		GameRegistry.registerBlock(Runebrine.ChertSlab, "ChertSlab");
		GameRegistry.registerBlock(Runebrine.FieldsparSlab, "FieldsparSlab");
		GameRegistry.registerBlock(Runebrine.SandstoneSlab, "SandstoneSlab");
		GameRegistry.registerBlock(Runebrine.ShaleSlab, "ShaleSlab");
		GameRegistry.registerBlock(Runebrine.MouldstoneSlab, "MouldstoneSlab");
		GameRegistry.registerBlock(Runebrine.ClaystoneSlab, "ClaystoneSlab");
		GameRegistry.registerBlock(Runebrine.SiltstoneSlab, "SiltstoneSlab");
		GameRegistry.registerBlock(Runebrine.brownSandstoneSlab, "BrownSandstoneSlab");
		GameRegistry.registerBlock(Runebrine.MarbleSlab, "MarbleSlab");
		GameRegistry.registerBlock(Runebrine.LimestoneSlab, "LimestoneSlab");
		GameRegistry.registerBlock(Runebrine.GneissSlab, "GneissSlab");
		GameRegistry.registerBlock(Runebrine.blackMarbleSlab, "BlackMarbleSlab");
		GameRegistry.registerBlock(Runebrine.GraniteSlab, "GraniteSlab");
		
		//Double Slabs
		GameRegistry.registerBlock(Runebrine.BasaltDoubleSlab, "BasaltSlabDouble");
		
		//Stairs
		GameRegistry.registerBlock(Runebrine.BasaltStair, "BasaltStair");
		GameRegistry.registerBlock(Runebrine.ChalkStair, "ChalkStair");
		GameRegistry.registerBlock(Runebrine.ChertStair, "ChertStair");
		GameRegistry.registerBlock(Runebrine.FieldsparStair, "FieldsparStair");
		GameRegistry.registerBlock(Runebrine.SandstoneStair, "SandstoneStair");
		GameRegistry.registerBlock(Runebrine.ShaleStair, "ShaleStair");
		GameRegistry.registerBlock(Runebrine.MouldstoneStair, "MouldstoneStair");
		GameRegistry.registerBlock(Runebrine.ClaystoneStair, "ClaystoneStair");
		GameRegistry.registerBlock(Runebrine.SiltstoneStair, "SiltstoneStair");
		GameRegistry.registerBlock(Runebrine.brownSandstoneStair, "BrownSandstoneStair");
		GameRegistry.registerBlock(Runebrine.MarbleStair, "MarbleStair");
		GameRegistry.registerBlock(Runebrine.LimestoneStair, "LimestoneStair");
		GameRegistry.registerBlock(Runebrine.GneissStair, "GneissStair");
		GameRegistry.registerBlock(Runebrine.blackMarbleStair, "BlackMarbleStair");
		GameRegistry.registerBlock(Runebrine.GraniteStair, "GraniteStair");
		
		//Fences
		GameRegistry.registerBlock(Runebrine.BasaltFence, "BasaltFence");
		GameRegistry.registerBlock(Runebrine.ChalkFence, "ChalkFence");
		GameRegistry.registerBlock(Runebrine.ChertFence, "ChertFence");
		GameRegistry.registerBlock(Runebrine.FieldsparFence, "FieldsparFence");
		GameRegistry.registerBlock(Runebrine.SandstoneFence, "SandstoneFence");
		GameRegistry.registerBlock(Runebrine.ShaleFence, "ShaleFence");
		GameRegistry.registerBlock(Runebrine.MouldstoneFence, "MouldstoneFence");
		GameRegistry.registerBlock(Runebrine.ClaystoneFence, "ClaystoneFence");
		GameRegistry.registerBlock(Runebrine.SiltstoneFence, "SiltstoneFence");
		GameRegistry.registerBlock(Runebrine.brownSandstoneFence, "BrownSandstoneFence");
		GameRegistry.registerBlock(Runebrine.MarbleFence, "MarbleFence");
		GameRegistry.registerBlock(Runebrine.LimestoneFence, "LimestoneFence");
		GameRegistry.registerBlock(Runebrine.GneissFence, "GneissFence");
		GameRegistry.registerBlock(Runebrine.blackMarbleFence, "BlackMarbleFence");
		GameRegistry.registerBlock(Runebrine.GraniteFence, "GraniteFence");
		
		//Walls
		GameRegistry.registerBlock(Runebrine.BasaltWall, "BasaltWall");
		GameRegistry.registerBlock(Runebrine.ChalkWall, "ChalkWall");
		GameRegistry.registerBlock(Runebrine.ChertWall, "ChertWall");
		GameRegistry.registerBlock(Runebrine.FieldsparWall, "FieldsparWall");
		GameRegistry.registerBlock(Runebrine.SandstoneWall, "SandstoneWall");
		GameRegistry.registerBlock(Runebrine.ShaleWall, "ShaleWall");
		GameRegistry.registerBlock(Runebrine.MouldstoneWall, "MouldstoneWall");
		GameRegistry.registerBlock(Runebrine.ClaystoneWall, "ClaystoneWall");
		GameRegistry.registerBlock(Runebrine.SiltstoneWall, "SiltstoneWall");
		GameRegistry.registerBlock(Runebrine.brownSandstoneWall, "BrownSandstoneWall");
		GameRegistry.registerBlock(Runebrine.MarbleWall, "MarbleWall");
		GameRegistry.registerBlock(Runebrine.LimestoneWall, "LimestoneWall");
		GameRegistry.registerBlock(Runebrine.GneissWall, "GneissWall");
		GameRegistry.registerBlock(Runebrine.blackMarbleWall, "BlackMarbleWall");
		GameRegistry.registerBlock(Runebrine.GraniteWall, "GraniteWall");
		
		
		
		
		//Full Blocks
		LanguageRegistry.addName(Runebrine.Basalt, "Basalt Block");
		LanguageRegistry.addName(Runebrine.Chalk, "Chalk Block");
		LanguageRegistry.addName(Runebrine.Chert, "Chert Block");
		LanguageRegistry.addName(Runebrine.Fieldspar, "Fieldspar Block");
		LanguageRegistry.addName(Runebrine.Sandstone, "Sandstone Block");
		LanguageRegistry.addName(Runebrine.Shale, "Shale Block");
		LanguageRegistry.addName(Runebrine.Mouldstone, "Mouldstone Block");
		LanguageRegistry.addName(Runebrine.Claystone, "Claystone Block");
		LanguageRegistry.addName(Runebrine.Siltstone, "Siltstone Block");
		LanguageRegistry.addName(Runebrine.brownSandstone, "Brown Sandstone Block");
		LanguageRegistry.addName(Runebrine.Marble, "Marble Block");
		LanguageRegistry.addName(Runebrine.Limestone, "Limestone Block");
		LanguageRegistry.addName(Runebrine.Gneiss, "Gneiss Block");
		LanguageRegistry.addName(Runebrine.blackMarble, "Black Marble Block");
		LanguageRegistry.addName(Runebrine.granite, "Granite Block");
		
		
		//Slabs
		LanguageRegistry.addName(Runebrine.BasaltSlab, "Basalt Slab");
		LanguageRegistry.addName(Runebrine.ChalkSlab, "Chalk Slab");
		LanguageRegistry.addName(Runebrine.ChertSlab, "Chert Slab");
		LanguageRegistry.addName(Runebrine.FieldsparSlab, "Fieldspar Slab");
		LanguageRegistry.addName(Runebrine.SandstoneSlab, "Sandstone Slab");
		LanguageRegistry.addName(Runebrine.ShaleSlab, "Shale Slab");
		LanguageRegistry.addName(Runebrine.MouldstoneSlab, "Mouldstone Slab");
		LanguageRegistry.addName(Runebrine.ClaystoneSlab, "Claystone Slab");
		LanguageRegistry.addName(Runebrine.SiltstoneSlab, "Siltstone Slab");
		LanguageRegistry.addName(Runebrine.brownSandstoneSlab, "Brown Sandstone Slab");
		LanguageRegistry.addName(Runebrine.MarbleSlab, "Marble Slab");
		LanguageRegistry.addName(Runebrine.LimestoneSlab, "Limestone Slab");
		LanguageRegistry.addName(Runebrine.GneissSlab, "Gneiss Slab");
		LanguageRegistry.addName(Runebrine.blackMarbleSlab, "Black Marble Slab");
		LanguageRegistry.addName(Runebrine.GraniteSlab, "Granite Slab");
		
		//Double Slabs
		LanguageRegistry.addName(Runebrine.BasaltDoubleSlab, "Basalt Double Slab");
		
		//Stairs
		LanguageRegistry.addName(Runebrine.BasaltStair, "Basalt Stair");
		LanguageRegistry.addName(Runebrine.ChalkStair, "Chalk Stair");
		LanguageRegistry.addName(Runebrine.ChertStair, "Chert Stair");
		LanguageRegistry.addName(Runebrine.FieldsparStair, "Fieldspar Stair");
		LanguageRegistry.addName(Runebrine.SandstoneStair, "Sandstone Stair");
		LanguageRegistry.addName(Runebrine.ShaleStair, "Shale Stair");
		LanguageRegistry.addName(Runebrine.MouldstoneStair, "Mouldstone Stair");
		LanguageRegistry.addName(Runebrine.ClaystoneStair, "Claystone Stair");
		LanguageRegistry.addName(Runebrine.SiltstoneStair, "Siltstone Stair");
		LanguageRegistry.addName(Runebrine.brownSandstoneStair, "Brown Sandstone Stair");
		LanguageRegistry.addName(Runebrine.MarbleStair, "Marble Stair");
		LanguageRegistry.addName(Runebrine.LimestoneStair, "Limestone Stair");
		LanguageRegistry.addName(Runebrine.GneissStair, "Gneiss Stair");
		LanguageRegistry.addName(Runebrine.blackMarbleStair, "Black Marble Stair");
		LanguageRegistry.addName(Runebrine.GraniteStair, "Granite Stair");
		
		//Fences
		LanguageRegistry.addName(Runebrine.BasaltFence, "Basalt Fence");
		LanguageRegistry.addName(Runebrine.ChalkFence, "Chalk Fence");
		LanguageRegistry.addName(Runebrine.ChertFence, "Chert Fence");
		LanguageRegistry.addName(Runebrine.FieldsparFence, "Fieldspar Fence");
		LanguageRegistry.addName(Runebrine.SandstoneFence, "Sandstone Fence");
		LanguageRegistry.addName(Runebrine.ShaleFence, "Shale Fence");
		LanguageRegistry.addName(Runebrine.MouldstoneFence, "Mouldstone Fence");
		LanguageRegistry.addName(Runebrine.ClaystoneFence, "Claystone Fence");
		LanguageRegistry.addName(Runebrine.SiltstoneFence, "Siltstone Fence");
		LanguageRegistry.addName(Runebrine.brownSandstoneFence, "Brown Sandstone Fence");
		LanguageRegistry.addName(Runebrine.MarbleFence, "Marble Fence");
		LanguageRegistry.addName(Runebrine.LimestoneFence, "Limestone Fence");
		LanguageRegistry.addName(Runebrine.GneissFence, "Gneiss Fence");
		LanguageRegistry.addName(Runebrine.blackMarbleFence, "Black Marble Fence");
		LanguageRegistry.addName(Runebrine.GraniteFence, "Granite Fence");
		
		//Walls
		LanguageRegistry.addName(Runebrine.BasaltWall, "Basalt Wall");
		LanguageRegistry.addName(Runebrine.ChalkWall, "Chalk Wall");
		LanguageRegistry.addName(Runebrine.ChertWall, "Chert Wall");
		LanguageRegistry.addName(Runebrine.FieldsparWall, "Fieldspar Wall");
		LanguageRegistry.addName(Runebrine.SandstoneWall, "Sandstone Wall");
		LanguageRegistry.addName(Runebrine.ShaleWall, "Shale Wall");
		LanguageRegistry.addName(Runebrine.MouldstoneWall, "Mouldstone Wall");
		LanguageRegistry.addName(Runebrine.ClaystoneWall, "Claystone Wall");
		LanguageRegistry.addName(Runebrine.SiltstoneWall, "Siltstone Wall");
		LanguageRegistry.addName(Runebrine.brownSandstoneWall, "Brown Sandstone Wall");
		LanguageRegistry.addName(Runebrine.MarbleWall, "Marble Wall");
		LanguageRegistry.addName(Runebrine.LimestoneWall, "Limestone Wall");
		LanguageRegistry.addName(Runebrine.GneissWall, "Gneiss Wall");
		LanguageRegistry.addName(Runebrine.blackMarbleWall, "Black Marble Wall");
		LanguageRegistry.addName(Runebrine.GraniteWall, "Granite Wall");

		
		//GameRegistry.addRecipe(new ItemStack(Runebrine.Limestone), "MMM", "ADA", "MDM", Character.valueOf('M'), Block.stone, Character.valueOf('A'), Runebrine.Lime, Character.valueOf('D'), Item.stick);
		//GameRegistry.addSmelting(Runebrine.Limestone.blockID, new ItemStack(Runebrine.Lime), 0.1F);
		
		//GameRegistry.addRecipe(new ItemStack(Runebrine.Limestone), "PPP", "TTT", "SSS", Character.valueOf('P'), Block.pressurePlateStone, Character.valueOf('T'), Block.tnt, Character.valueOf('S'), Block.stoneSingleSlab);
	}
	
	public void registerItems()
	{ // For registering Items
		//Lime
		//LanguageRegistry.addName(Runebrine.Lime, "Lime");
		//GameRegistry.addRecipe(new ItemStack(Runebrine.Lime), "M M", " M ", "MMM", Character.valueOf('M'), Block.planks);
	}
}