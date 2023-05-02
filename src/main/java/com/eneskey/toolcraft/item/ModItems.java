package com.eneskey.toolcraft.item;

import com.eneskey.toolcraft.ToolCraft;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ToolCraft.MOD_ID);

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item (new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB)));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModTiers.TITANIUM_INGOT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB)));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModTiers.TITANIUM_INGOT, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_TOOLS_TAB)));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModTiers.TITANIUM_INGOT, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_TOOLS_TAB)));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModTiers.TITANIUM_INGOT, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_TOOLS_TAB)));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModTiers.TITANIUM_INGOT, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_INGOT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB)));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_INGOT, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB)));
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_INGOT, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB)));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_INGOT, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB)));

    public static final RegistryObject<Item> TITANIUM_ELYTRA = ITEMS.register("titanium_boots",
            () -> new ElytraItem(EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
