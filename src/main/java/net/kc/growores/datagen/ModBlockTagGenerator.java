package net.kc.growores.datagen;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GrowOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
            .add(ModBlocks.GROWING_BLOCK.get())
            .add(ModBlocks.CLAY_REED.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.COAL_REED.get())
                .add(ModBlocks.IRON_REED.get())
                .add(ModBlocks.COPPER_REED.get())
                .add(ModBlocks.GOLD_REED.get())
                .add(ModBlocks.REDSTONE_REED.get())
                .add(ModBlocks.LAPIS_REED.get())
                .add(ModBlocks.DIAMOND_REED.get())
                .add(ModBlocks.EMERALD_REED.get())
                .add(ModBlocks.DEEPSLATE_COAL_REED.get())
                .add(ModBlocks.DEEPSLATE_IRON_REED.get())
                .add(ModBlocks.DEEPSLATE_COPPER_REED.get())
                .add(ModBlocks.DEEPSLATE_GOLD_REED.get())
                .add(ModBlocks.DEEPSLATE_REDSTONE_REED.get())
                .add(ModBlocks.DEEPSLATE_LAPIS_REED.get())
                .add(ModBlocks.DEEPSLATE_DIAMOND_REED.get())
                .add(ModBlocks.DEEPSLATE_EMERALD_REED.get())
                .add(ModBlocks.NETHER_QUARTZ_REED.get())
                .add(ModBlocks.NETHER_GOLD_REED.get())
                .add(ModBlocks.OBSIDIAN_REED.get())
                .add(ModBlocks.GLOWSTONE_REED.get())
                .add(ModBlocks.BLAZE_REED.get())
                .add(ModBlocks.ENDER_REED.get())
                .add(ModBlocks.AMETHYST_REED.get())
                .add(ModBlocks.ANCIENT_DEBRIS_REED.get())
                .add(ModBlocks.CERTUS_QUARTZ_REED.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GROWING_BLOCK.get())
                .add(ModBlocks.COAL_REED.get())
                .add(ModBlocks.IRON_REED.get())
                .add(ModBlocks.COPPER_REED.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GOLD_REED.get())
                .add(ModBlocks.REDSTONE_REED.get())
                .add(ModBlocks.LAPIS_REED.get())
                .add(ModBlocks.DIAMOND_REED.get())
                .add(ModBlocks.EMERALD_REED.get())
                .add(ModBlocks.DEEPSLATE_COAL_REED.get())
                .add(ModBlocks.DEEPSLATE_IRON_REED.get())
                .add(ModBlocks.DEEPSLATE_COPPER_REED.get())
                .add(ModBlocks.DEEPSLATE_GOLD_REED.get())
                .add(ModBlocks.DEEPSLATE_REDSTONE_REED.get())
                .add(ModBlocks.DEEPSLATE_LAPIS_REED.get())
                .add(ModBlocks.DEEPSLATE_DIAMOND_REED.get())
                .add(ModBlocks.DEEPSLATE_EMERALD_REED.get())
                .add(ModBlocks.NETHER_QUARTZ_REED.get())
                .add(ModBlocks.NETHER_GOLD_REED.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OBSIDIAN_REED.get())
                .add(ModBlocks.BLAZE_REED.get())
                .add(ModBlocks.ENDER_REED.get())
                .add(ModBlocks.ANCIENT_DEBRIS_REED.get());

        this.tag(ModTags.Blocks.GROWING_BLOCKS)
                .add(ModBlocks.GROWING_BLOCK.get());


    }
}
