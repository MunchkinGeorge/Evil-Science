package munchkingeorge.evil_science.gui;

import munchkingeorge.evil_science.tileentity.StandEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerStand extends Container {
	private StandEntity deployer;

	public ContainerStand(InventoryPlayer invPlayer, StandEntity entity) {
	this.deployer = entity;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
	return deployer.isUseableByPlayer(player);
	}
}