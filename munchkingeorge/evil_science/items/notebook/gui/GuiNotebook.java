package munchkingeorge.evil_science.items.notebook.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiNotebook extends GuiScreen
{
private World worldMC;
private EntityPlayer entityP;
private Minecraft mineC;

public GuiNotebook(World world, EntityPlayer entityplayer, Minecraft minecraft)
{
worldMC = world;
entityP = entityplayer;
mineC = minecraft;
}

public void initGui()
{
buttonList.add(new GuiButton(0, width / 2 - 50, height / 2 - 50, 100, 20, "This is a Button!"));
}
protected void actionPerformed(GuiButton guiButton)
{
if(guiButton.id == 0)
{
this.drawCenteredString(fontRenderer, "This is a String!", width / 2 - 80, height / 2 - 80, 0xffffff);
}
}

public void drawScreen(int i, int j, float f)
{
this.drawDefaultBackground();
this.drawCenteredString(fontRenderer, "This is a String!", width / 2 - 80, height / 2 - 20, 0xffffff);
super.drawScreen(i, j, f);
}
public void actionRPerformed(GuiButton guiButton)
{
if(guiButton.id == 0)
{
this.drawCenteredString(fontRenderer, "This is a String!, Right", width / 2 - 80, height / 2 - 80, 0xffffff);
}
}
}