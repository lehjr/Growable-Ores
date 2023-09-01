package net.kc.growores;

import com.mojang.logging.LogUtils;
import net.kc.growores.block.ModBlocks;
import net.kc.growores.item.ModCreativeModeTab;
import net.kc.growores.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GrowOres.MOD_ID)
public class GrowOres
{
    public static final String MOD_ID = "growores";
    private static final Logger LOGGER = LogUtils.getLogger();

    public GrowOres()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTab.GROWORES_TAB){
            event.accept(ModBlocks.GROWING_BLOCK);
            event.accept(ModItems.COAL_REED_ITEM);
            event.accept(ModItems.IRON_REED_ITEM);
            event.accept(ModItems.COPPER_REED_ITEM);
            event.accept(ModItems.GOLD_REED_ITEM);
            event.accept(ModItems.REDSTONE_REED_ITEM);
            event.accept(ModItems.LAPIS_REED_ITEM);
            event.accept(ModItems.DIAMOND_REED_ITEM);
            event.accept(ModItems.EMERALD_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_COAL_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_IRON_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_COPPER_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_GOLD_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_REDSTONE_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_LAPIS_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_DIAMOND_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_EMERALD_REED_ITEM);
            event.accept(ModItems.NETHER_QUARTZ_REED_ITEM);
            event.accept(ModItems.NETHER_GOLD_REED_ITEM);
            event.accept(ModItems.OBSIDIAN_REED_ITEM);
            event.accept(ModItems.GLOWSTONE_REED_ITEM);
            event.accept(ModItems.CLAY_REED_ITEM);
            event.accept(ModItems.ENDER_REED_ITEM);
            event.accept(ModItems.BLAZE_REED_ITEM);
            event.accept(ModItems.AMETHYST_REED_ITEM);
            event.accept(ModItems.ANCIENT_DEBRIS_REED_ITEM);

            //Mods
            //Applied Energistics 2
            event.accept(ModItems.CERTUS_QUARTZ_REED_ITEM);

            //Mystical Agriculture & Mystical Agradditions
            event.accept(ModItems.SOULIUM_REED_ITEM);
            event.accept(ModItems.PROSPERITY_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_PROSPERITY_REED_ITEM);
            event.accept(ModItems.NETHER_PROSPERITY_REED_ITEM);
            event.accept(ModItems.END_PROSPERITY_REED_ITEM);
            event.accept(ModItems.INFERIUM_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_INFERIUM_REED_ITEM);
            event.accept(ModItems.NETHER_INFERIUM_REED_ITEM);
            event.accept(ModItems.END_INFERIUM_REED_ITEM);

            //Extreme Reactors
            event.accept(ModItems.ANGLESITE_REED_ITEM);
            event.accept(ModItems.BENITOITE_REED_ITEM);
            event.accept(ModItems.YELLORITE_REED_ITEM);

            //RFTools
            event.accept(ModItems.DIMENSIONALSHARD_REED_ITEM);
            event.accept(ModItems.NETHER_DIMENSIONALSHARD_REED_ITEM);
            event.accept(ModItems.END_DIMENSIONALSHARD_REED_ITEM);

            //Powah! Rearchitected
            event.accept(ModItems.URANITITE_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_URANITITE_REED_ITEM);

            //Create
            event.accept(ModItems.ZINC_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_ZINC_REED_ITEM);

            //Galosphere
            event.accept(ModItems.ALLURITE_REED_ITEM);
            event.accept(ModItems.LUMIERE_REED_ITEM);
            event.accept(ModItems.SILVER_REED_ITEM);
            event.accept(ModItems.DEEPSLATE_SILVER_REED_ITEM);
        }
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
