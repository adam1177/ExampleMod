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