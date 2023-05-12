package com.eneskey.toolcraft.block;

import com.eneskey.toolcraft.ToolCraft;
import com.eneskey.toolcraft.block.custom.ModFlammableRotatedPillarBlock;
import com.eneskey.toolcraft.item.ModCreativeModeTab;
import com.eneskey.toolcraft.item.ModItems;
import com.eneskey.toolcraft.world.feature.tree.SakuraTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG)),
            ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);
    public static final RegistryObject<Block> SAKURA_WOOD = registerBlock("sakura_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)),
            ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);
    public static final RegistryObject<Block> STRIPPED_SAKURA_LOG = registerBlock("stripped_sakura_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG)),
            ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);
    public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD = registerBlock("stripped_sakura_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD)),
            ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);
    public static final RegistryObject<Block> SAKURA_PLANKS = registerBlock("sakura_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);

    public static final RegistryObject<Block> SAKURA_SLAB = registerBlock("sakura_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);

    public static final RegistryObject<Block> SAKURA_STAIRS = registerBlock("sakura_stairs",
            () -> new StairBlock(() -> ModBlocks.SAKURA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BIRCH_STAIRS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            } ,ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);

    public static final RegistryObject<Block> SAKURA_LEAVES = registerBlock("sakura_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);

    public static final RegistryObject<Block> SAKURA_SAPLING = registerBlock("sakura_sapling",
            () -> new SaplingBlock(new SakuraTreeGrower(), BlockBehaviour.Properties.copy(Blocks.BIRCH_SAPLING)),
            ModCreativeModeTab.TOOLCRAFT_MATERIAL_TAB);


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
