package munchkingeorge.evil_science.items;

import munchkingeorge.evil_science.Evil_Science;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.Class;

public class Items extends Item{

	public Items(int par1) {
		super(par1);
		this.setCreativeTab(Evil_Science.frankenstein);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("evil_science" + ":" + (this.getUnlocalizedName().substring(5).toLowerCase()));
		
	}
	
}
