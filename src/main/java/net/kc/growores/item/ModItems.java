package net.kc.growores.item;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrowOres.MOD_ID);

    public static final RegistryObject<Item> COAL_REED_ITEM = ITEMS.register("coal_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.COAL_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> IRON_REED_ITEM = ITEMS.register("iron_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.IRON_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> COPPER_REED_ITEM = ITEMS.register("copper_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.COPPER_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> GOLD_REED_ITEM = ITEMS.register("gold_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.GOLD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> REDSTONE_REED_ITEM = ITEMS.register("redstone_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.REDSTONE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> LAPIS_REED_ITEM = ITEMS.register("lapis_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.LAPIS_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DIAMOND_REED_ITEM = ITEMS.register("diamond_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DIAMOND_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> EMERALD_REED_ITEM = ITEMS.register("emerald_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.EMERALD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_COAL_REED_ITEM = ITEMS.register("deepslate_coal_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_COAL_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_IRON_REED_ITEM = ITEMS.register("deepslate_iron_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_IRON_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_COPPER_REED_ITEM = ITEMS.register("deepslate_copper_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_COPPER_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_GOLD_REED_ITEM = ITEMS.register("deepslate_gold_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_GOLD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_REDSTONE_REED_ITEM = ITEMS.register("deepslate_redstone_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_REDSTONE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_LAPIS_REED_ITEM = ITEMS.register("deepslate_lapis_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_LAPIS_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_DIAMOND_REED_ITEM = ITEMS.register("deepslate_diamond_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_DIAMOND_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_EMERALD_REED_ITEM = ITEMS.register("deepslate_emerald_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_EMERALD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> NETHER_QUARTZ_REED_ITEM = ITEMS.register("nether_quartz_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.NETHER_QUARTZ_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> NETHER_GOLD_REED_ITEM = ITEMS.register("nether_gold_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.NETHER_GOLD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_REED_ITEM = ITEMS.register("obsidian_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.OBSIDIAN_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> GLOWSTONE_REED_ITEM = ITEMS.register("glowstone_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.GLOWSTONE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> CLAY_REED_ITEM = ITEMS.register("clay_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.CLAY_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> BLAZE_REED_ITEM = ITEMS.register("blaze_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.BLAZE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> ENDER_REED_ITEM = ITEMS.register("ender_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.ENDER_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> AMETHYST_REED_ITEM = ITEMS.register("amethyst_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.AMETHYST_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> ANCIENT_DEBRIS_REED_ITEM = ITEMS.register("ancient_debris_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.ANCIENT_DEBRIS_REED.get(), new Item.Properties().fireResistant().tab(ModCreativeModeTab.GROWORES_TAB)));

    //MODS
    //Applied Energistics 2
    public static final RegistryObject<Item> CERTUS_QUARTZ_REED_ITEM = ITEMS.register("certus_quartz_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.CERTUS_QUARTZ_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));

    //Mystical Agriculture & Mystical Agradditions
    public static final RegistryObject<Item> SOULIUM_REED_ITEM = ITEMS.register("soulium_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.SOULIUM_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> PROSPERITY_REED_ITEM = ITEMS.register("prosperity_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.PROSPERITY_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_PROSPERITY_REED_ITEM = ITEMS.register("deepslate_prosperity_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_PROSPERITY_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> NETHER_PROSPERITY_REED_ITEM = ITEMS.register("nether_prosperity_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.NETHER_PROSPERITY_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> END_PROSPERITY_REED_ITEM = ITEMS.register("end_prosperity_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.END_PROSPERITY_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> INFERIUM_REED_ITEM = ITEMS.register("inferium_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.INFERIUM_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_INFERIUM_REED_ITEM = ITEMS.register("deepslate_inferium_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_INFERIUM_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> NETHER_INFERIUM_REED_ITEM = ITEMS.register("nether_inferium_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.NETHER_INFERIUM_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> END_INFERIUM_REED_ITEM = ITEMS.register("end_inferium_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.END_INFERIUM_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));

    //Extreme Reactors
    public static final RegistryObject<Item> ANGLESITE_REED_ITEM = ITEMS.register("anglesite_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.ANGLESITE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> BENITOITE_REED_ITEM = ITEMS.register("benitoite_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.BENITOITE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> YELLORITE_REED_ITEM = ITEMS.register("yellorite_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.YELLORITE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));

    //RFTools
    public static final RegistryObject<Item> DIMENSIONALSHARD_REED_ITEM = ITEMS.register("dimensionalshard_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DIMENSIONALSHARD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> NETHER_DIMENSIONALSHARD_REED_ITEM = ITEMS.register("nether_dimensionalshard_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.NETHER_DIMENSIONALSHARD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> END_DIMENSIONALSHARD_REED_ITEM = ITEMS.register("end_dimensionalshard_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.END_DIMENSIONALSHARD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));

    //Powah! Rearchitected
    public static final RegistryObject<Item> URANITITE_REED_ITEM = ITEMS.register("uraninite_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.URANINITE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_URANITITE_REED_ITEM = ITEMS.register("deepslate_uraninite_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_URANINITE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));

    //Create
    public static final RegistryObject<Item> ZINC_REED_ITEM = ITEMS.register("zinc_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.ZINC_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_ZINC_REED_ITEM = ITEMS.register("deepslate_zinc_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_ZINC_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));

    //Galosphere
    public static final RegistryObject<Item> ALLURITE_REED_ITEM = ITEMS.register("allurite_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.ALLURITE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> LUMIERE_REED_ITEM = ITEMS.register("lumiere_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.LUMIERE_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> SILVER_REED_ITEM = ITEMS.register("silver_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.SILVER_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_SILVER_REED_ITEM = ITEMS.register("deepslate_silver_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_SILVER_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));

    // Mekanism
    public static final RegistryObject<Item> OSMIUM_REED_ITEM = ITEMS.register("osmium_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.OSMIUM_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_OSMIUM_REED_ITEM = ITEMS.register("deepslate_osmium_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_OSMIUM_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> URANIUM_REED_ITEM = ITEMS.register("uranium_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.URANIUM_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_URANIUM_REED_ITEM = ITEMS.register("deepslate_uranium_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_URANIUM_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> TIN_REED_ITEM = ITEMS.register("tin_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.TIN_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_TIN_REED_ITEM = ITEMS.register("deepslate_tin_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_TIN_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> SALT_REED = ITEMS.register("salt_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.SALT_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> LEAD_REED_ITEM = ITEMS.register("lead_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.LEAD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));
    public static final RegistryObject<Item> DEEPSLATE_LEAD_REED_ITEM = ITEMS.register("deepslate_lead_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DEEPSLATE_LEAD_REED.get(), new Item.Properties().tab(ModCreativeModeTab.GROWORES_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
