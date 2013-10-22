package munchkingeorge.evil_science.proxy;

import munchkingeorge.evil_science.models.ModelRobot;
import munchkingeorge.evil_science.models.StandModel;
import munchkingeorge.evil_science.renderer.RenderRobot;
import munchkingeorge.evil_science.renderer.StandRenderer;
import munchkingeorge.evil_science.robot.EntityFighterRobot;
import munchkingeorge.evil_science.robot.EntityRangedFighterRobot;
import munchkingeorge.evil_science.tileentity.StandEntity;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers()
    {
//        RenderingRegistry.registerEntityRenderingHandler(EntityRaven.class, new RenderRaven(new ModelRaven(), 0.5F));
        ClientRegistry.bindTileEntitySpecialRenderer(StandEntity.class, new StandRenderer());
        RenderingRegistry.registerEntityRenderingHandler(EntityFighterRobot.class, new RenderRobot(new ModelRobot(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRangedFighterRobot.class, new RenderRobot(new ModelRobot(), 0.5F));
    }
}
