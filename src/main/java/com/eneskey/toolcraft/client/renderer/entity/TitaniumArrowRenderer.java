package com.eneskey.toolcraft.client.renderer.entity;

import com.eneskey.toolcraft.ToolCraft;
import com.eneskey.toolcraft.world.entity.projectile.TitaniumArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TitaniumArrowRenderer extends ArrowRenderer<TitaniumArrow> {
    public TitaniumArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(TitaniumArrow pEntity) {
        Item referenceItem = pEntity.getPickupItem().getItem();
        return new ResourceLocation(ToolCraft.MOD_ID, "textures/entity/projectiles" + referenceItem.getRegistryName().getPath() + ".png");
    }
}
