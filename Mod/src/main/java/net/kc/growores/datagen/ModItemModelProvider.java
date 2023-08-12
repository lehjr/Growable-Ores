package net.kc.growores.datagen;

import net.kc.growores.GrowOres;
import net.kc.growores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GrowOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.COAL_REED_ITEM);
        simpleItem(ModItems.IRON_REED_ITEM);
        simpleItem(ModItems.COPPER_REED_ITEM);
        simpleItem(ModItems.GOLD_REED_ITEM);
        simpleItem(ModItems.REDSTONE_REED_ITEM);
        simpleItem(ModItems.LAPIS_REED_ITEM);
        simpleItem(ModItems.DIAMOND_REED_ITEM);
        simpleItem(ModItems.EMERALD_REED_ITEM);
        simpleItem(ModItems.NETHER_QUARTZ_REED_ITEM);
        simpleItem(ModItems.OBSIDIAN_REED_ITEM);
        simpleItem(ModItems.GLOWSTONE_REED_ITEM);
        simpleItem(ModItems.CLAY_REED_ITEM);
        simpleItem(ModItems.BLAZE_REED_ITEM);
        simpleItem(ModItems.ENDER_REED_ITEM);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
            new ResourceLocation(GrowOres.MOD_ID,"item/" + item.getId().getPath()));
    }
}