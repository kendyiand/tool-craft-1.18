package com.eneskey.toolcraft.client;

import com.eneskey.toolcraft.ToolCraft;
import com.eneskey.toolcraft.client.renderer.entity.TitaniumArrowRenderer;
import com.eneskey.toolcraft.world.entity.ModEntityType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ToolCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

    @SubscribeEvent
    public static void  onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityType.TITANIUM_ARROW.get(), TitaniumArrowRenderer::new);
    }
}
