package net.kc.growores.datagen.loot;

import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.GROWING_BLOCK.get());
        this.dropSelf(ModBlocks.COAL_REED.get());
        this.dropSelf(ModBlocks.IRON_REED.get());
        this.dropSelf(ModBlocks.COPPER_REED.get());
        this.dropSelf(ModBlocks.GOLD_REED.get());
        this.dropSelf(ModBlocks.REDSTONE_REED.get());
        this.dropSelf(ModBlocks.LAPIS_REED.get());
        this.dropSelf(ModBlocks.DIAMOND_REED.get());
        this.dropSelf(ModBlocks.EMERALD_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COAL_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_IRON_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COPPER_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_GOLD_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_REDSTONE_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_LAPIS_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_DIAMOND_REED.get());
        this.dropSelf(ModBlocks.DEEPSLATE_EMERALD_REED.get());
        this.dropSelf(ModBlocks.NETHER_QUARTZ_REED.get());
        this.dropSelf(ModBlocks.NETHER_GOLD_REED.get());
        this.dropSelf(ModBlocks.OBSIDIAN_REED.get());
        this.dropSelf(ModBlocks.GLOWSTONE_REED.get());
        this.dropSelf(ModBlocks.CLAY_REED.get());
        this.dropSelf(ModBlocks.BLAZE_REED.get());
        this.dropSelf(ModBlocks.ENDER_REED.get());
        this.dropSelf(ModBlocks.AMETHYST_REED.get());
        this.dropSelf(ModBlocks.ANCIENT_DEBRIS_REED.get());
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
            this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}