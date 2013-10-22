package munchkingeorge.evil_science.renderer;

import munchkingeorge.evil_science.Evil_Science;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.io.*;

@SideOnly(Side.CLIENT)
public class RenderRangedFighterRobot extends RenderLiving
{
    private static final ResourceLocation Your_Texture = new ResourceLocation("evil_science", "textures/models/rangedfighterrobot.png");  //refers to:assets/yourmod/models/optionalfile/yourtexture.png

    public RenderRangedFighterRobot(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

//    @Override
//    protected ResourceLocation func_110775_a(Entity par1Entity)
//    {
//        return Your_Texture;
//    }

	@Override
	protected ResourceLocation getEntityTexture(Entity par1entity) {
		return Your_Texture;
	}
}