package evar678.runebrine.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class StoneBlockVariant extends Block
{
	private String texture;
	
	public StoneBlockVariant(int par1, float hardness, CreativeTabs tab, String texPath)
	{
		super(par1, Material.rock);
		
		this.setHardness(hardness);
		this.setCreativeTab(tab);
		
		texture = texPath;
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
		if(texture == "null")
			return;
		blockIcon = iconRegister.registerIcon("runebrine:stone\\" + texture);
	}
}
