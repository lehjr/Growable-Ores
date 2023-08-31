package net.kc.growores.block;

import net.kc.growores.GrowOres;
import net.kc.growores.block.custom.OreReedBlock;
import net.kc.growores.item.ModCreativeModeTab;
import net.kc.growores.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GrowOres.MOD_ID);


    public static final RegistryObject<Block> GROWING_BLOCK = registerBlock("growing_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL)), ModCreativeModeTab.GROWORES_TAB);

    //Reeds
    public static final RegistryObject<Block> COAL_REED = BLOCKS.register("coal_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 3.0F), 5));
    public static final RegistryObject<Block> IRON_REED = BLOCKS.register("iron_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 3.0F), 4));
    public static final RegistryObject<Block> COPPER_REED = BLOCKS.register("copper_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 3.0F), 4));
    public static final RegistryObject<Block> GOLD_REED = BLOCKS.register("gold_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(4.5F, 3.0F), 4));
    public static final RegistryObject<Block> REDSTONE_REED = BLOCKS.register("redstone_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 3.0F), 5));
    public static final RegistryObject<Block> LAPIS_REED = BLOCKS.register("lapis_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 3.0F), 5));
    public static final RegistryObject<Block> DIAMOND_REED = BLOCKS.register("diamond_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 3.0F), 3));
    public static final RegistryObject<Block> EMERALD_REED = BLOCKS.register("emerald_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 3.0F), 3));
    public static final RegistryObject<Block> DEEPSLATE_COAL_REED = BLOCKS.register("deepslate_coal_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.DEEPSLATE).strength(4.5F, 3.0F), 4));
    public static final RegistryObject<Block> DEEPSLATE_IRON_REED = BLOCKS.register("deepslate_iron_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.DEEPSLATE).strength(4.5F, 3.0F), 3));
    public static final RegistryObject<Block> DEEPSLATE_COPPER_REED = BLOCKS.register("deepslate_copper_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.DEEPSLATE).strength(4.5F, 3.0F), 3));
    public static final RegistryObject<Block> DEEPSLATE_GOLD_REED = BLOCKS.register("deepslate_gold_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.DEEPSLATE).strength(4.5F, 3.0F), 3));
    public static final RegistryObject<Block> DEEPSLATE_REDSTONE_REED = BLOCKS.register("deepslate_redstone_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.DEEPSLATE).strength(4.5F, 3.0F), 4));
    public static final RegistryObject<Block> DEEPSLATE_LAPIS_REED = BLOCKS.register("deepslate_lapis_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.DEEPSLATE).strength(4.5F, 3.0F), 4));
    public static final RegistryObject<Block> DEEPSLATE_DIAMOND_REED = BLOCKS.register("deepslate_diamond_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.DEEPSLATE).strength(4.5F, 3.0F), 2));
    public static final RegistryObject<Block> DEEPSLATE_EMERALD_REED = BLOCKS.register("deepslate_emerald_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.DEEPSLATE).strength(4.5F, 3.0F), 2));
    public static final RegistryObject<Block>NETHER_QUARTZ_REED = BLOCKS.register("nether_quartz_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.NETHER_ORE).strength(3.0F, 3.0F), 4));
    public static final RegistryObject<Block>NETHER_GOLD_REED = BLOCKS.register("nether_gold_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.NETHER_GOLD_ORE).strength(3.0F, 3.0F), 5));
    public static final RegistryObject<Block> OBSIDIAN_REED = BLOCKS.register("obsidian_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(50.0F, 1200.0F), 3));
    public static final RegistryObject<Block> GLOWSTONE_REED = BLOCKS.register("glowstone_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_50872_) -> {return 15;}), 5));
    public static final RegistryObject<Block>CLAY_REED = BLOCKS.register("clay_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).strength(0.6F).sound(SoundType.GRAVEL), 5));
    public static final RegistryObject<Block> BLAZE_REED = BLOCKS.register("blaze_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE), 3));
    public static final RegistryObject<Block> ENDER_REED = BLOCKS.register("ender_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE), 3));
    public static final RegistryObject<Block> AMETHYST_REED = BLOCKS.register("amethyst_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.AMETHYST).strength(1.5F), 4));
    public static final RegistryObject<Block> ANCIENT_DEBRIS_REED = BLOCKS.register("ancient_debris_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.ANCIENT_DEBRIS).strength(30.0F, 1200.0F), 3));

    //MODS
    //Applied Energistics 2
    public static final RegistryObject<Block> CERTUS_QUARTZ_REED = BLOCKS.register("certus_quartz_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.AMETHYST_REED.get()), 4));

    //Mystical Agriculture & Mystical Agradditions
    public static final RegistryObject<Block> SOULIUM_REED = BLOCKS.register("soulium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_QUARTZ_REED.get()), 4));
    public static final RegistryObject<Block> PROSPERITY_REED = BLOCKS.register("prosperity_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.IRON_REED.get()), 4));
    public static final RegistryObject<Block> DEEPSLATE_PROSPERITY_REED = BLOCKS.register("deepslate_prosperity_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.DEEPSLATE_IRON_REED.get()), 3));
    public static final RegistryObject<Block> NETHER_PROSPERITY_REED = BLOCKS.register("nether_prosperity_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_QUARTZ_REED.get()), 4));
    public static final RegistryObject<Block> END_PROSPERITY_REED = BLOCKS.register("end_prosperity_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 9.0F), 4));
    public static final RegistryObject<Block> INFERIUM_REED = BLOCKS.register("inferium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.IRON_REED.get()), 4));
    public static final RegistryObject<Block> DEEPSLATE_INFERIUM_REED = BLOCKS.register("deepslate_inferium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.DEEPSLATE_IRON_REED.get()), 3));
    public static final RegistryObject<Block> NETHER_INFERIUM_REED = BLOCKS.register("nether_inferium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_QUARTZ_REED.get()), 4));
    public static final RegistryObject<Block> END_INFERIUM_REED = BLOCKS.register("end_inferium_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 9.0F), 4));

    //Extreme Reactors
    public static final RegistryObject<Block> ANGLESITE_REED = BLOCKS.register("anglesite_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 9.0F), 4));
    public static final RegistryObject<Block> BENITOITE_REED = BLOCKS.register("benitoite_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_QUARTZ_REED.get()), 4));
    public static final RegistryObject<Block> YELLORITE_REED = BLOCKS.register("yellorite_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.DIAMOND_REED.get()), 4));

    //RFTools
    public static final RegistryObject<Block> DIMENSIONALSHARD_REED = registerReedBlock("dimensionalshard_reed", SoundType.STONE, 3.0F, 3.0F, 4);
    public static final RegistryObject<Block> NETHER_DIMENSIONALSHARD_REED = BLOCKS.register("nether_dimensionalshard_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(ModBlocks.NETHER_QUARTZ_REED.get()), 5));
    public static final RegistryObject<Block> END_DIMENSIONALSHARD_REED = BLOCKS.register("end_dimensionalshard_reed",
            ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(SoundType.STONE).strength(3.0F, 9.0F), 5));

    //Powah! Rearchitected
    public static final RegistryObject<Block> URANINITE_REED = registerReedBlock("uraninite_reed", SoundType.STONE, 3.0F, 3.0F, 4);
    public static final RegistryObject<Block> DEEPSLATE_URANINITE_REED = registerReedBlock("deepslate_uraninite_reed", SoundType.DEEPSLATE, 4.5F, 3.0F, 3);

    //Create
    public static final RegistryObject<Block> ZINC_REED = registerReedBlock("zinc_reed", SoundType.STONE, 3.0F, 3.0F, 4);
    public static final RegistryObject<Block> DEEPSLATE_ZINC_REED = registerReedBlock("deepslate_zinc_reed", SoundType.DEEPSLATE, 4.5F, 3.0F, 3);

    //Galosphere
    public static final RegistryObject<Block> ALLURITE_REED = registerReedBlock("allurite_reed", SoundType.AMETHYST, 1.5F, 4);
    public static final RegistryObject<Block> LUMIERE_REED = registerReedBlock("lumiere_reed", SoundType.AMETHYST, 1.5F, 4);
    public static final RegistryObject<Block> SILVER_REED = registerReedBlock("silver_reed", SoundType.STONE, 3.0F, 3.0F, 4);
    public static final RegistryObject<Block> DEEPSLATE_SILVER_REED = registerReedBlock("deepslate_silver_reed", SoundType.DEEPSLATE, 4.5F, 3.0F, 3);

    private static <T extends Block> RegistryObject<T> registerReedBlock(String name, SoundType soundType, float strength1, float strength2, int maxHeight){
        return (RegistryObject<T>) BLOCKS.register(name, ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(soundType).strength(strength1, strength2), maxHeight));
    }
    private static <T extends Block> RegistryObject<T> registerReedBlock(String name, SoundType soundType, float strength, int maxHeight){
        return (RegistryObject<T>) BLOCKS.register(name, ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(soundType).strength(strength), maxHeight));
    }
    private static <T extends Block> RegistryObject<T> registerReedBlock(String name, float strength1, float strength2, int maxHeight){
        return (RegistryObject<T>) BLOCKS.register(name, ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).strength(strength1, strength2), maxHeight));
    }
    private static <T extends Block> RegistryObject<T> registerReedBlock(String name, float strength, int maxHeight){
        return (RegistryObject<T>) BLOCKS.register(name, ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).strength(strength), maxHeight));
    }
    private static <T extends Block> RegistryObject<T> registerReedBlock(String name, SoundType soundType, int maxHeight){
        return (RegistryObject<T>) BLOCKS.register(name, ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).sound(soundType), maxHeight));
    }
    private static <T extends Block> RegistryObject<T> registerReedBlock(String name, int maxHeight){
        return (RegistryObject<T>) BLOCKS.register(name, ()-> new OreReedBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE), maxHeight));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrowOres.MOD_ID);


}
