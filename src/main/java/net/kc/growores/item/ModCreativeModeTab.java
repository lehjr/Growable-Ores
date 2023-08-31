package net.kc.growores.item;

import net.kc.growores.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GROWORES_TAB = new CreativeModeTab("growores_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.GROWING_BLOCK.get());
        }
    };
}
