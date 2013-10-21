package munchkingeorge.evil_science.items.notebook;

import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import munchkingeorge.evil_science.Evil_Science;
import munchkingeorge.evil_science.items.Items;
import munchkingeorge.evil_science.items.notebook.gui.GuiNotebook;
import munchkingeorge.evil_science.tileentity.StandEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;

public class NoteBook extends Items
{
	public NoteBook(int par1)
    {
        super(par1);
        this.setMaxStackSize(1);
    }
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World world, EntityPlayer entityPlayer, int x, int y, int z)
    {
		int id = 0;
		entityPlayer.openGui(Evil_Science.instance, id, world, x, y, z);
		return par1ItemStack;
    }
	
	@Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int sideHit, float hitVecX, float hitVecY, float hitVecZ) {
		int id = 1;
        if (world.isRemote) {
            
        }
        return true;
    }
}