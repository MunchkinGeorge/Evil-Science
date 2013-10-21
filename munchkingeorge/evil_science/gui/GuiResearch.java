package munchkingeorge.evil_science.gui;

import munchkingeorge.evil_science.Evil_Science;
import munchkingeorge.evil_science.FileWriter;
import munchkingeorge.evil_science.tileentity.StandEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GuiResearch extends GuiContainer {
	public GuiResearch(Container par1Container) {
		super(par1Container);
		// TODO Auto-generated constructor stub
	}

	public static final ResourceLocation texture = new ResourceLocation(Evil_Science.modid.toLowerCase(), "textures/gui/notebook.png");
	
	public GuiResearch(InventoryPlayer invPlayer, StandEntity entity) {
		super(new ContainerStand(invPlayer, entity));

		xSize = 256;
		ySize = 182;
	}
	
	{
		String FileName = "wub";
		String Text = "wub wub wub";
		FileWriter.Write(null, FileName, Text);
		FileWriter.Read(null, FileName);
	}

	@Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
		
		fontRenderer.drawString("Hello", 44, 10, 4210752);
        
    }
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int j, int i) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
        this.mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);		
	}
}