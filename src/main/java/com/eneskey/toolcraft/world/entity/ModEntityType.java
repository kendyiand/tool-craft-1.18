package com.eneskey.toolcraft.world.entity;

import com.eneskey.toolcraft.ToolCraft;
import com.eneskey.toolcraft.world.entity.projectile.TitaniumArrow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.tools.Tool;

public class ModEntityType {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, ToolCraft.MOD_ID);

    public static final RegistryObject<EntityType<TitaniumArrow>> TITANIUM_ARROW = ENTITIES.register("titanium_arrow", () -> EntityType.Builder.<TitaniumArrow>of(TitaniumArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(ToolCraft.MOD_ID, "titanium_arrow").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

}
