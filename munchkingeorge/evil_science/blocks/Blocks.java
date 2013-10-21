package munchkingeorge.evil_science.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import munchkingeorge.evil_science.Evil_Science;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Blocks extends Block{
	
	public Blocks(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(Evil_Science.frankenstein);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("evil_science" + ":" + (this.getUnlocalizedName().substring(5).toLowerCase()));
		
	}
}
