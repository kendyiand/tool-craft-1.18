package com.eneskey.toolcraft.world.entity.projectile;

import com.eneskey.toolcraft.item.ModItems;
import com.eneskey.toolcraft.world.entity.ModEntityType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TitaniumArrow extends AbstractArrow {
    private final Item referenceItem;
    public TitaniumArrow(EntityType<? extends AbstractArrow> type, Level level) {
        super(type, level);
        this.referenceItem = ModItems.TITANIUM_ARROW.get();
    }

    public TitaniumArrow( LivingEntity shooter, Level level, Item referenceItem) {
        super(ModEntityType.TITANIUM_ARROW.get(), shooter, level);
        this.referenceItem = referenceItem;
    }

    @Override
    public ItemStack getPickupItem() {
        return new ItemStack(this.referenceItem);
    }
}
