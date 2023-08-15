package net.kc.growores.block;

import net.kc.growores.GrowOres;
import net.kc.growores.block.custom.OreReedBlock;
import net.kc.growores.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GrowOres.MOD_ID);

    public static final RegistryObject<Block> GROWING_BLOCK = registerBlock("growing_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)));

    //Reeds
    public static final RegistryObject<Block> COAL_REED = BLOCKS.register("coal_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), 5));
    public static final RegistryObject<Block> IRON_REED = BLOCKS.register("iron_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE), 4));
    public static final RegistryObject<Block> COPPER_REED = BLOCKS.register("copper_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE), 4));
    public static final RegistryObject<Block> GOLD_REED = BLOCKS.register("gold_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE), 4));
    public static final RegistryObject<Block> REDSTONE_REED = BLOCKS.register("redstone_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3.0F, 3.0F), 5));
    public static final RegistryObject<Block> LAPIS_REED = BLOCKS.register("lapis_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE), 5));
    public static final RegistryObject<Block> DIAMOND_REED = BLOCKS.register("diamond_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE), 3));
    public static final RegistryObject<Block> EMERALD_REED = BLOCKS.register("emerald_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE), 3));
    public static final RegistryObject<Block> DEEPSLATE_COAL_REED = BLOCKS.register("deepslate_coal_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE), 4));
    public static final RegistryObject<Block> DEEPSLATE_IRON_REED = BLOCKS.register("deepslate_iron_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE), 3));
    public static final RegistryObject<Block> DEEPSLATE_COPPER_REED = BLOCKS.register("deepslate_copper_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE), 3));
    public static final RegistryObject<Block> DEEPSLATE_GOLD_REED = BLOCKS.register("deepslate_gold_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE), 3));
    public static final RegistryObject<Block> DEEPSLATE_REDSTONE_REED = BLOCKS.register("deepslate_redstone_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(4.5F, 3.0F), 4));
    public static final RegistryObject<Block> DEEPSLATE_LAPIS_REED = BLOCKS.register("deepslate_lapis_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE), 4));
    public static final RegistryObject<Block> DEEPSLATE_DIAMOND_REED = BLOCKS.register("deepslate_diamond_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE), 2));
    public static final RegistryObject<Block> DEEPSLATE_EMERALD_REED = BLOCKS.register("deepslate_emerald_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE), 2));
    public static final RegistryObject<Block>NETHER_QUARTZ_REED = BLOCKS.register("nether_quartz_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE), 4));
    public static final RegistryObject<Block>NETHER_GOLD_REED = BLOCKS.register("nether_gold_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE), 5));
    public static final RegistryObject<Block> OBSIDIAN_REED = BLOCKS.register("obsidian_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).pushReaction(PushReaction.BLOCK), 3));
    public static final RegistryObject<Block> GLOWSTONE_REED = BLOCKS.register("glowstone_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE), 5));
    public static final RegistryObject<Block>CLAY_REED = BLOCKS.register("clay_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.CLAY), 5));
    public static final RegistryObject<Block> BLAZE_REED = BLOCKS.register("blaze_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE), 3));
    public static final RegistryObject<Block> ENDER_REED = BLOCKS.register("ender_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE), 3));
    public static final RegistryObject<Block> AMETHYST_REED = BLOCKS.register("amethyst_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK), 4));
    public static final RegistryObject<Block> ANCIENT_DEBRIS_REED = BLOCKS.register("ancient_debris_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS), 3));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
