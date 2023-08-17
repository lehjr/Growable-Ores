package net.kc.growores.datagen;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GrowOres.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {


        blockWithItem(ModBlocks.GROWING_BLOCK);
        //Add the following to the above *once* after adding new blocks, then move and replace generated block models
        blockWithItem(ModBlocks.COAL_REED);
        blockWithItem(ModBlocks.IRON_REED);
        blockWithItem(ModBlocks.COPPER_REED);
        blockWithItem(ModBlocks.GOLD_REED);
        blockWithItem(ModBlocks.REDSTONE_REED);
        blockWithItem(ModBlocks.LAPIS_REED);
        blockWithItem(ModBlocks.DIAMOND_REED);
        blockWithItem(ModBlocks.EMERALD_REED);
        blockWithItem(ModBlocks.DEEPSLATE_COAL_REED);
        blockWithItem(ModBlocks.DEEPSLATE_IRON_REED);
        blockWithItem(ModBlocks.DEEPSLATE_COPPER_REED);
        blockWithItem(ModBlocks.DEEPSLATE_GOLD_REED);
        blockWithItem(ModBlocks.DEEPSLATE_REDSTONE_REED);
        blockWithItem(ModBlocks.DEEPSLATE_LAPIS_REED);
        blockWithItem(ModBlocks.DEEPSLATE_DIAMOND_REED);
        blockWithItem(ModBlocks.DEEPSLATE_EMERALD_REED);
        blockWithItem(ModBlocks.NETHER_QUARTZ_REED);
        blockWithItem(ModBlocks.NETHER_GOLD_REED);
        blockWithItem(ModBlocks.OBSIDIAN_REED);
        blockWithItem(ModBlocks.GLOWSTONE_REED);
        blockWithItem(ModBlocks.CLAY_REED);
        blockWithItem(ModBlocks.BLAZE_REED);
        blockWithItem(ModBlocks.ENDER_REED);
        blockWithItem(ModBlocks.AMETHYST_REED);
        blockWithItem(ModBlocks.ANCIENT_DEBRIS_REED);

        //MODS
        //Applied Energistics 2
        blockWithItem(ModBlocks.CERTUS_QUARTZ_REED);

        //Mystical Agriculture & Mystical Agradditions
        blockWithoutItem(ModBlocks.SOULIUM_REED);
        blockWithoutItem(ModBlocks.PROSPERITY_REED);
        blockWithoutItem(ModBlocks.DEEPSLATE_PROSPERITY_REED);
        blockWithoutItem(ModBlocks.NETHER_PROSPERITY_REED);
        blockWithoutItem(ModBlocks.END_PROSPERITY_REED);
        blockWithoutItem(ModBlocks.INFERIUM_REED);
        blockWithoutItem(ModBlocks.DEEPSLATE_INFERIUM_REED);
        blockWithoutItem(ModBlocks.NETHER_INFERIUM_REED);
        blockWithoutItem(ModBlocks.END_INFERIUM_REED);
    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockWithoutItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
