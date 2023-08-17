package net.kc.growores.datagen;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GrowOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.COAL_REED_ITEM);
        simpleItem(ModItems.IRON_REED_ITEM);
        simpleItem(ModItems.COPPER_REED_ITEM);
        simpleItem(ModItems.GOLD_REED_ITEM);
        simpleItem(ModItems.REDSTONE_REED_ITEM);
        simpleItem(ModItems.LAPIS_REED_ITEM);
        simpleItem(ModItems.DIAMOND_REED_ITEM);
        simpleItem(ModItems.EMERALD_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_COAL_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_IRON_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_COPPER_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_GOLD_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_REDSTONE_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_LAPIS_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_DIAMOND_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_EMERALD_REED_ITEM);
        simpleItem(ModItems.NETHER_QUARTZ_REED_ITEM);
        simpleItem(ModItems.NETHER_GOLD_REED_ITEM);
        simpleItem(ModItems.OBSIDIAN_REED_ITEM);
        simpleItem(ModItems.GLOWSTONE_REED_ITEM);
        simpleItem(ModItems.CLAY_REED_ITEM);
        simpleItem(ModItems.BLAZE_REED_ITEM);
        simpleItem(ModItems.ENDER_REED_ITEM);
        simpleItem(ModItems.AMETHYST_REED_ITEM);
        simpleItem(ModItems.ANCIENT_DEBRIS_REED_ITEM);

        reedBlock(ModBlocks.COAL_REED);
        reedBlock(ModBlocks.IRON_REED);
        reedBlock(ModBlocks.COPPER_REED);
        reedBlock(ModBlocks.GOLD_REED);
        reedBlock(ModBlocks.REDSTONE_REED);
        reedBlock(ModBlocks.LAPIS_REED);
        reedBlock(ModBlocks.DIAMOND_REED);
        reedBlock(ModBlocks.EMERALD_REED);
        reedBlock(ModBlocks.DEEPSLATE_COAL_REED);
        reedBlock(ModBlocks.DEEPSLATE_IRON_REED);
        reedBlock(ModBlocks.DEEPSLATE_COPPER_REED);
        reedBlock(ModBlocks.DEEPSLATE_GOLD_REED);
        reedBlock(ModBlocks.DEEPSLATE_REDSTONE_REED);
        reedBlock(ModBlocks.DEEPSLATE_LAPIS_REED);
        reedBlock(ModBlocks.DEEPSLATE_DIAMOND_REED);
        reedBlock(ModBlocks.DEEPSLATE_EMERALD_REED);
        reedBlock(ModBlocks.NETHER_QUARTZ_REED);
        reedBlock(ModBlocks.NETHER_GOLD_REED);
        reedBlock(ModBlocks.OBSIDIAN_REED);
        reedBlock(ModBlocks.GLOWSTONE_REED);
        reedBlock(ModBlocks.CLAY_REED);
        reedBlock(ModBlocks.BLAZE_REED);
        reedBlock(ModBlocks.ENDER_REED);
        reedBlock(ModBlocks.AMETHYST_REED);
        reedBlock(ModBlocks.ANCIENT_DEBRIS_REED);

        //MODS
        //Applied Energistics 2
        simpleItem(ModItems.CERTUS_QUARTZ_REED_ITEM);

        reedBlock(ModBlocks.CERTUS_QUARTZ_REED);

        //Mystical Agriculture & Mystical Agradditions
        simpleItem(ModItems.SOULIUM_REED_ITEM);
        simpleItem(ModItems.PROSPERITY_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_PROSPERITY_REED_ITEM);
        simpleItem(ModItems.NETHER_PROSPERITY_REED_ITEM);
        simpleItem(ModItems.END_PROSPERITY_REED_ITEM);
        simpleItem(ModItems.INFERIUM_REED_ITEM);
        simpleItem(ModItems.DEEPSLATE_INFERIUM_REED_ITEM);
        simpleItem(ModItems.NETHER_INFERIUM_REED_ITEM);
        simpleItem(ModItems.END_INFERIUM_REED_ITEM);

        reedBlock(ModBlocks.SOULIUM_REED);
        reedBlock(ModBlocks.PROSPERITY_REED);
        reedBlock(ModBlocks.DEEPSLATE_PROSPERITY_REED);
        reedBlock(ModBlocks.NETHER_PROSPERITY_REED);
        reedBlock(ModBlocks.END_PROSPERITY_REED);
        reedBlock(ModBlocks.INFERIUM_REED);
        reedBlock(ModBlocks.DEEPSLATE_INFERIUM_REED);
        reedBlock(ModBlocks.NETHER_INFERIUM_REED);
        reedBlock(ModBlocks.END_INFERIUM_REED);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
            new ResourceLocation(GrowOres.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void reedBlock(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/cross"))
                .texture("cross",  new ResourceLocation(GrowOres.MOD_ID, "block/" + block.getId().getPath()))
                .renderType("cutout");
    }
}