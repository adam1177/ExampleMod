package evar678.ExampleMod.common;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ExampleModCommonProxy implements IGuiHandler
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
		// Limestone
		GameRegistry.registerBlock(ExampleMod.Limestone, "Limestone");// Needed for all blocks
		LanguageRegistry.addName(ExampleMod.Limestone, "Limestone Block");// In-game name
		
		GameRegistry.addRecipe(new ItemStack(ExampleMod.Limestone), "MMM", "ADA", "MDM", Character.valueOf('M'), Block.stone, Character.valueOf('A'), ExampleMod.Lime, Character.valueOf('D'), Item.stick);
		GameRegistry.addSmelting(ExampleMod.Limestone.blockID, new ItemStack(ExampleMod.Lime), 0.1F);
		
		GameRegistry.registerBlock(ExampleMod.LandMine, "LandMine");
		LanguageRegistry.addName(ExampleMod.LandMine, "LandMine");
		
		GameRegistry.addRecipe(new ItemStack(ExampleMod.Limestone), "PPP", "TTT", "SSS", Character.valueOf('P'), Block.pressurePlateStone, Character.valueOf('T'), Block.tnt, Character.valueOf('S'), Block.stoneSingleSlab);
	}
	
	public void registerItems()
	{ // For registering Items
		//Lime
		LanguageRegistry.addName(ExampleMod.Lime, "Lime");
		GameRegistry.addRecipe(new ItemStack(ExampleMod.Lime), "M M", " M ", "MMM", Character.valueOf('M'), Block.planks);
	}
}