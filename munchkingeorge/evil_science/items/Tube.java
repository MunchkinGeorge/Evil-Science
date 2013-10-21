package munchkingeorge.evil_science.items;

import munchkingeorge.evil_science.Evil_Science;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.network.FMLNetworkHandler;

public class Tube extends Items{
String Name = this.getClass().getSimpleName();
	public Tube(int id) {
		super(id);		
	}
}
