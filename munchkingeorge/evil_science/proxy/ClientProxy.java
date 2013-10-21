package munchkingeorge.evil_science.proxy;

import munchkingeorge.evil_science.models.ModelRobot;
import munchkingeorge.evil_science.models.StandModel;
import munchkingeorge.evil_science.renderer.RenderRobot;
import munchkingeorge.evil_science.renderer.RenderRobotBlock;
import munchkingeorge.evil_science.renderer.StandRenderer;
import munchkingeorge.evil_science.robot.EntityRobot;
import munchkingeorge.evil_science.robot.EntityRobotBlock;
import munchkingeorge.evil_science.tileentity.StandEntity;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers()
    {
//        RenderingRegistry.registerEntityRenderingHandler(EntityRaven.class, new RenderRaven(new ModelRaven(), 0.5F));
        ClientRegistry.bindTileEntitySpecialRenderer(StandEntity.class, new StandRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(EntityRobotBlock.class, new RenderRobotBlock());
        RenderingRegistry.registerEntityRenderingHandler(EntityRobot.class, new RenderRobot(new ModelRobot(), 0.5F));
    }
}
