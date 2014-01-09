package evar678.ExampleMod.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockLandMine extends Block
{
	public BlockLandMine(int par1)
	{
		super(par1, Material.rock); // You can set different materials, check
									// them out!
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon("ExampleMod:LandMine");// Telling
																		// Forge
																		// where
																		// our
																		// texture
																		// is
	}
	
	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.motionX *= 0.4D;
        par5Entity.motionZ *= 0.4D;
		
		net.minecraft.world.Explosion thing = new net.minecraft.world.Explosion(par1World, par5Entity, -103, 84, 262, 4.0F);
		thing.doExplosionA();
	}
	
	//private void explode()
    //{
    //    float f = 4.0F;
    //    this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, f, true);
    //}
}
