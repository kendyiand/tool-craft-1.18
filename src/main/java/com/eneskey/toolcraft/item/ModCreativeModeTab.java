package com.eneskey.toolcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TOOLCRAFT_MATERIAL_TAB = new CreativeModeTab("toolcraftmaterialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };
    public static final CreativeModeTab TOOLCRAFT_TOOLS_TAB = new CreativeModeTab("toolcrafttoolstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_AXE.get());
        }
    };
    public static final CreativeModeTab TOOLCRAFT_COMBAT_TAB = new CreativeModeTab("toolcraftcombattab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_SWORD.get());
        }
    };
}
