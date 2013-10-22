package munchkingeorge.evil_science.items;

import munchkingeorge.evil_science.robot.EntityRangedFighterRobot;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RangedFighterRobotSpawner extends Items{


	public static EntityPlayer OwnerPlayer;

	public RangedFighterRobotSpawner(int par1) {
		super(par1);
		this.setMaxStackSize(1);
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }
        System.out.println("yay");

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
        	OwnerPlayer = par3EntityPlayer;
        	EntityRangedFighterRobot entityrangedfighterrobot = new EntityRangedFighterRobot(par2World);
        	entityrangedfighterrobot.setLocationAndAngles(par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, par3EntityPlayer.rotationYaw, 0.0F);
            par2World.spawnEntityInWorld(entityrangedfighterrobot);
        }

        return par1ItemStack;
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("evil_science" + ":" + this.getUnlocalizedName().substring(5).toLowerCase());
		
	}
}
