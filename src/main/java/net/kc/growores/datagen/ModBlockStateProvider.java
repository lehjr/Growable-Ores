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

        /*
        //Add the following to the above *once* after adding new blocks, then replace generated block models and move block states
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
        */

        blockWithItem(ModBlocks.GROWING_BLOCK);
    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
