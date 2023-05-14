package com.eneskey.toolcraft.util;

import com.eneskey.toolcraft.world.entity.ModEntityType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RegistryHandler {
    public static void init() {
        ModEntityType.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
