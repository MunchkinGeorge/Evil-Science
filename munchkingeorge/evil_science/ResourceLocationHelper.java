package munchkingeorge.evil_science;

import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper {

    public static ResourceLocation getResourceLocation(String modId, String path) {

        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path) {

        return getResourceLocation(Evil_Science.modid.toLowerCase(), path);
    }
}