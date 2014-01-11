package evar678.runebrine.common.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class StoneFenceVariant extends BlockFence
{
	private String texture;
	
	public StoneFenceVariant(int par1, float hardness, CreativeTabs tab, String tex)
	{
		super(par1, tex, Material.rock);
		texture = tex;
		
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setResistance(hardness * 2);
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
		if (texture == "null")
			return;
		blockIcon = iconRegister.registerIcon("runebrine:stone\\" + texture);
	}
}
