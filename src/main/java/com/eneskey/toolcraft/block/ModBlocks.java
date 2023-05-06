package com.eneskey.toolcraft.block;

import com.eneskey.toolcraft.ToolCraft;
import com.eneskey.toolcraft.item.ModCreativeModeTab;
import com.eneskey.toolcraft.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ToolCraft.MOD_ID);

    public static final RegistryObject<Block> BLOCK_OF_TITANIUM = registerBlock("block_of_titanium",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f)
                    .requiresCorrectToolForDrops()
                    .explosionResistance(5)), ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB, "tooltip.toolcraft.block.block_of_titanium");

    public static final RegistryObject<Block> BLOCK_OF_RAW_TITANIUM = registerBlock("block_of_raw_titanium",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f)
                    .requiresCorrectToolForDrops()
                    .explosionResistance(8)), ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .explosionResistance(3)), ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .explosionResistance(3)), ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);

    public static final RegistryObject<Block> SAKURA_LOG = registerBlock("sakura_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .requiresCorrectToolForDrops()
                    .explosionResistance(1)), ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }



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
