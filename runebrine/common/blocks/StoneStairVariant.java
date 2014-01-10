package evar678.runebrine.common.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class StoneStairVariant extends BlockStairs
{
	private String texture;
	
	public StoneStairVariant(int par1, float hardness, CreativeTabs tab, Block model, String tex)
	{
		super(par1, model, 0);
		texture = tex;
		this.setHardness(hardness);
		this.blockResistance = hardness * 2;
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
		if (texture == "null")
			return;
		blockIcon = iconRegister.registerIcon("runebrine:stone\\" + texture);
	}
}
