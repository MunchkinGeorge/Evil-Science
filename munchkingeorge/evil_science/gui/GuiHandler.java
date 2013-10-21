package munchkingeorge.evil_science.gui;

import munchkingeorge.evil_science.Evil_Science;
import munchkingeorge.evil_science.tileentity.StandEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {
	public GuiHandler() {
		NetworkRegistry.instance().registerGuiHandler(Evil_Science.instance, this);
		}

		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		switch(id) {
		case 0:
		if(entity != null && entity instanceof StandEntity) {
		return new ContainerStand(player.inventory, (StandEntity) entity);
		} else {
		return null;
		}
		default:
		return null;
		}
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		switch(id) {
		case 0:
		if(entity != null && entity instanceof StandEntity) {
		return new GuiResearch(player.inventory, (StandEntity) entity);
		} else {
		return null;
		}
		default:
		return null;
		}
		}
}