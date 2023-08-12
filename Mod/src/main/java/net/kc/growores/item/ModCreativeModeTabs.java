package net.kc.growores.item;

import net.kc.growores.GrowOres;
import net.kc.growores.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GrowOres.MOD_ID);
    public static final RegistryObject<CreativeModeTab> EDUCRAFT_TAB= CREATIVE_MODE_TABS.register("growores_tab", () -> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.growores_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.RUBY.get());

                pOutput.accept(ModBlocks.GROWING_BLOCK.get());

                pOutput.accept(ModItems.COAL_REED_ITEM.get());
                pOutput.accept(ModItems.IRON_REED_ITEM.get());
                pOutput.accept(ModItems.COPPER_REED_ITEM.get());
                pOutput.accept(ModItems.GOLD_REED_ITEM.get());
                pOutput.accept(ModItems.REDSTONE_REED_ITEM.get());
                pOutput.accept(ModItems.LAPIS_REED_ITEM.get());
                pOutput.accept(ModItems.DIAMOND_REED_ITEM.get());
                pOutput.accept(ModItems.EMERALD_REED_ITEM.get());
                pOutput.accept(ModItems.NETHER_QUARTZ_REED_ITEM.get());
                pOutput.accept(ModItems.OBSIDIAN_REED_ITEM.get());
                pOutput.accept(ModItems.GLOWSTONE_REED_ITEM.get());
                pOutput.accept(ModItems.CLAY_REED_ITEM.get());
                pOutput.accept(ModItems.ENDER_REED_ITEM.get());
                pOutput.accept(ModItems.BLAZE_REED_ITEM.get());

            })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
