package com.eneskey.toolcraft.item;

import com.eneskey.toolcraft.ToolCraft;
import com.eneskey.toolcraft.item.custom.*;
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
            () -> new CustomSwordItem(ModTiers.TITANIUM_INGOT, 6, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB)));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new CustomShovelItem(ModTiers.TITANIUM_INGOT, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_TOOLS_TAB)));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new CustomPickaxeItem(ModTiers.TITANIUM_INGOT, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_TOOLS_TAB)));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new CustomAxeItem(ModTiers.TITANIUM_INGOT, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_TOOLS_TAB)));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new CustomHoeItem(ModTiers.TITANIUM_INGOT, 0, 0f,
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

    public static final RegistryObject<Item> TITANIUM_BOW = ITEMS.register("titanium_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB).durability(500)));

    public static final RegistryObject<Item> TITANIUM_ARROW = ITEMS.register("titanium_arrow",
            () -> new ArrowItem(new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB).stacksTo(64)));

//    public static final RegistryObject<Item> TITANIUM_ELYTRA = ITEMS.register("titanium_elytra",
//            () -> new ElytraItem(ModArmorMaterials.TITANIUM_INGOT, EquipmentSlot.CHEST,
//                    new Item.Properties().tab(ModCreativeModeTab.TOOLCRAFT_COMBAT_TAB).durability(432).rarity(Rarity.EPIC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
