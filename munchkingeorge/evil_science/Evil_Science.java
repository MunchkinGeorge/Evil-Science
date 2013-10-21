package munchkingeorge.evil_science;

import munchkingeorge.evil_science.*;
import munchkingeorge.evil_science.blocks.Stand;
import munchkingeorge.evil_science.gui.GuiHandler;
import munchkingeorge.evil_science.items.*;
import munchkingeorge.evil_science.items.notebook.NoteBook;
import munchkingeorge.evil_science.proxy.CommonProxy;
import munchkingeorge.evil_science.renderer.RenderRobot;
import munchkingeorge.evil_science.robot.EntityRobot;
import munchkingeorge.evil_science.robot.EntityRobotBlock;
import munchkingeorge.evil_science.tileentity.StandEntity;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Evil_Science.modid, name = Evil_Science.modname, version = "0.1")
@NetworkMod(clientSideRequired = true)
public class Evil_Science 
{
	@SidedProxy(clientSide="munchkingeorge.evil_science.proxy.ClientProxy", serverSide="munchkingeorge.evil_science.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String modid = "evilscience";

	public static final String modname = "Evil Science Mod";
	
	@Instance(Evil_Science.modname)
	public static Evil_Science instance;
	
	public static Item Tube;
	public static Item NoteBook;
	public static Item Battery;
	public static Item Battery_Empty;
	public static Item FighterRobotSpawner;
	public static Item RobotCore;
	
	public static Block Stand;
	
	static int startEntityId = 300;
	
	public static CreativeTabs frankenstein = new CreativeTabs(modid) {
        public ItemStack getIconItemStack() {
                return new ItemStack(NoteBook, 1, 0);
        }
	};

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
        proxy.registerRenderers();
        GameRegistry.registerTileEntity(StandEntity.class, "ResearchTable");
        GameRegistry.registerTileEntity(EntityRobotBlock.class, "RobotBlock");
        
        NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
		
		//items
        int ItemId = 5000;
		Tube = new Items(ItemId).setUnlocalizedName("Tube");
		ItemId++;
		NoteBook = new NoteBook(ItemId).setUnlocalizedName("NoteBook");
		ItemId++;
		Battery = new Battery_Full(ItemId).setUnlocalizedName("Battery");
		ItemId++;
		Battery_Empty = new Battery_Empty(ItemId).setUnlocalizedName("Battery_Empty");
		ItemId++;
		FighterRobotSpawner = new FighterRobotSpawner(ItemId).setUnlocalizedName("Melee-Robot-Spawner");
		ItemId++;
		RobotCore = new Items(ItemId).setUnlocalizedName("RobotCore");
		ItemId++;
		
		//blocks
		Stand = new Stand(507).setUnlocalizedName("ResearchTable");		
		
		//GameRegistry
		GameRegistry.registerBlock(Stand, Stand.getUnlocalizedName().substring(5));
		
		//Robot
		EntityRegistry.registerModEntity(EntityRobot.class, "robot", 1, this, 80, 3, true);
		 
		//LanguageRegistry
		LanguageRegistry.addName(Tube, "Tube");
		LanguageRegistry.addName(NoteBook, "Note Book");
		LanguageRegistry.addName(Battery, "Battery");
		LanguageRegistry.addName(Battery_Empty, "Empty Battery");
		LanguageRegistry.addName(FighterRobotSpawner, "Melee-Robot");;
		LanguageRegistry.addName(RobotCore, "Robot Core");
		LanguageRegistry.addName(Stand, "Research Table");
		LanguageRegistry.instance().addStringLocalization("itemGroup.evilscience", "en_US", "Evil Science");
		LanguageRegistry.instance().addStringLocalization("entity.evilscience.robot.name", "en_US", "Melee-Robot");
		
		//Crafting Recipes
				GameRegistry.addShapelessRecipe(new ItemStack(Evil_Science.NoteBook), new ItemStack(Item.book), new ItemStack(Block.pumpkin));
				GameRegistry.addShapelessRecipe(new ItemStack(Evil_Science.Battery), new ItemStack(Item.redstone), new ItemStack(Evil_Science.Battery_Empty));
				GameRegistry.addRecipe(new ItemStack(Evil_Science.Stand), new Object[]{
		            "   ",
		            " Z ",
		            "XXX",
		            'X', new ItemStack(Block.cloth, 42, 3), 'Z', Evil_Science.NoteBook
				});
				GameRegistry.addRecipe(new ItemStack(Evil_Science.FighterRobotSpawner), new Object[]{
		            "XXX",
		            "XZX",
		            "XXX",
		            'X', new ItemStack(Block.blockIron), 'Z', Evil_Science.RobotCore
				});
				GameRegistry.addRecipe(new ItemStack(Evil_Science.RobotCore), new Object[]{
		            "DDD",
		            "DZD",
		            "DDD",
		            'Z', Evil_Science.Battery, 'D', new ItemStack(Item.redstone)
				});
		}
}