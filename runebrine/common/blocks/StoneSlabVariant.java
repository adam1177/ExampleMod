package evar678.runebrine.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class StoneSlabVariant extends BlockHalfSlab
{
	private String texture;
	
	public StoneSlabVariant(int par1, float hardness, CreativeTabs tab, Boolean isHalfSlab, String texPath)
	{
		super(par1, isHalfSlab, Material.rock);
		
		this.setHardness(hardness);
		this.setCreativeTab(tab);
		texture = texPath;
	}
	
	@Override
	public String getFullSlabName(int i)
	{
		// TODO Auto-generated method stub
		return this.getUnlocalizedName() + "Double";
	}
	
	@Override
	protected ItemStack createStackedBlock(int meta)
	{
		return new ItemStack(this.blockID + 1, 2, meta & 7);
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
		if (texture == "null")
			return;
		blockIcon = iconRegister.registerIcon("runebrine:stone\\" + texture);
	}
	
	@SideOnly(Side.CLIENT)
	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return this.blockID;
	}
}
