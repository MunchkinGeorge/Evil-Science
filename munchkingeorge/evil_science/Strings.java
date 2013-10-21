package munchkingeorge.evil_science;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

public class Strings {

// Base file paths
public static final String MODEL_SHEET_LOCATION = "textures/models/";
public static final String GUI_SHEET_LOCATION = "textures/gui/";

// Item/Block sprite sheets
public static final ResourceLocation VANILLA_BLOCK_TEXTURE_SHEET = TextureMap.locationBlocksTexture;
public static final ResourceLocation VANILLA_ITEM_TEXTURE_SHEET = TextureMap.locationItemsTexture;

// Armor sprite sheets

// GUI textures
public static final ResourceLocation GUI_RESEARCH = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "research.png");

// Model textures
public static final ResourceLocation MODEL_STAND = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "stand.png");
public static final ResourceLocation MODEL_ROBOT = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION+ "robot.png");

}
