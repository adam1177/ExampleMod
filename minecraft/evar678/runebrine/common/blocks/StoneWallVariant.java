package evar678.runebrine.common.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class StoneWallVariant extends BlockWall
{
	private String texture;
	
	public StoneWallVariant(int par1, float hardness, CreativeTabs tab, String tex)
	{
		super(par1, Block.stone);
		
		texture = tex;

		this.setHardness(hardness);
		this.setResistance(hardness * 2);
	}
	
	public Icon getIcon(int par1, int par2)
    {
        return this.blockIcon;
    }
	
	public void registerIcons(IconRegister iconRegister)
	{
		if (texture == "null")
			return;
		blockIcon = iconRegister.registerIcon("runebrine:stone\\" + texture);
	}
	
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }
}
