package net.kc.growores.item;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.custom.FuelItem;
import net.kc.growores.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrowOres.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COAL_REED_ITEM = ITEMS.register("coal_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.COAL_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_REED_ITEM = ITEMS.register("iron_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.IRON_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_REED_ITEM = ITEMS.register("copper_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.COPPER_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_REED_ITEM = ITEMS.register("gold_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.GOLD_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_REED_ITEM = ITEMS.register("redstone_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.REDSTONE_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_REED_ITEM = ITEMS.register("lapis_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.LAPIS_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_REED_ITEM = ITEMS.register("diamond_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.DIAMOND_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_REED_ITEM = ITEMS.register("emerald_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.EMERALD_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> NETHER_QUARTZ_REED_ITEM = ITEMS.register("nether_quartz_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.NETHER_QUARTZ_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_REED_ITEM = ITEMS.register("obsidian_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.OBSIDIAN_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> GLOWSTONE_REED_ITEM = ITEMS.register("glowstone_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.GLOWSTONE_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> CLAY_REED_ITEM = ITEMS.register("clay_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.CLAY_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_REED_ITEM = ITEMS.register("blaze_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.BLAZE_REED.get(), new Item.Properties()));
    public static final RegistryObject<Item> ENDER_REED_ITEM = ITEMS.register("ender_reed_item",
            () -> new ItemNameBlockItem(ModBlocks.ENDER_REED.get(), new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
