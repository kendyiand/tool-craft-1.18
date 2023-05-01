package com.eneskey.toolcraft.block;

import com.eneskey.toolcraft.ToolCraft;
import com.eneskey.toolcraft.item.ModCreativeModeTab;
import com.eneskey.toolcraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ToolCraft.MOD_ID);

    public static final RegistryObject<Block> BLOCK_OF_TITANIUM = registerBlock("block_of_titanium",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.15f)
                    .requiresCorrectToolForDrops()
                    .explosionResistance(5)), ModCreativeModeTab.TOOLCRAFT_TAB);

    public static final RegistryObject<Block> BLOCK_OF_RAW_TITANIUM = registerBlock("block_of_raw_titanium",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0.2f)
                    .requiresCorrectToolForDrops()
                    .explosionResistance(8)), ModCreativeModeTab.TOOLCRAFT_TAB);

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.15f)
                    .requiresCorrectToolForDrops()
                    .explosionResistance(3)), ModCreativeModeTab.TOOLCRAFT_TAB);

    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.15f)
                    .requiresCorrectToolForDrops()
                    .explosionResistance(3)), ModCreativeModeTab.TOOLCRAFT_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
