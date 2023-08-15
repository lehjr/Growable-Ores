package mods.B0bGary.GrowOres;

import java.io.File;

import mods.B0bGary.GrowOres.core.AutoAdder;
import mods.B0bGary.GrowOres.core.ModIDs;
import mods.B0bGary.GrowOres.core.Reference;
import mods.B0bGary.GrowOres.mods.BigReactors;
import mods.B0bGary.GrowOres.mods.DraconicEvolution;
import mods.B0bGary.GrowOres.mods.ElectricAge;
import mods.B0bGary.GrowOres.mods.Galacticraft;
import mods.B0bGary.GrowOres.mods.IC2;
import mods.B0bGary.GrowOres.mods.Metallurgy;
import mods.B0bGary.GrowOres.mods.OreSupport;
import mods.B0bGary.GrowOres.mods.SimpleOres;
import mods.B0bGary.GrowOres.mods.Thaumcraft;
import mods.B0bGary.GrowOres.mods.TinkersConstruct;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="B0bGrowsOre", name="B0bGary's Growable Ores!", version=Reference.VERSION_NUMBER,dependencies = Reference.DEPENDENCIES)


public class Base{

public static String version = Reference.VERSION_NUMBER;

	@Instance("B0bGary's Growable Ores!")
	public static Base instance;
	
	public static String modid = "B0bGrowsOre";
	
	public static int growTexture;
	
	public static Block growingBlock;
	public static Block coalReed;
	public static Block ironReed;
	public static Block goldReed;
	public static Block redstoneReed;
	public static Block lapisReed;
	public static Block diamondReed;
	public static Block emeraldReed;
	public static Block nquartzReed;
	public static Block glowReed;
	public static Block obsidReed;
	public static Block clayReed;
	public static Block enderReed;
	public static Block blazeReed;
	
	
	
	public static Block copperReed;
	public static Block tinReed;
	public static Block silverReed;
	
	
	
	public static Block quartzReed;	
	public static Block vinteumReed;
	public static Block sunstoneReed;
	public static Block moonstoneReed;
	public static Block blueTopazReed;
	public static Block chimeriteReed;
	
	public static Block oreGrowableRuby;
	public static Block oreGrowableSapphire;
	public static Block oreGrowablePeridot;
	public static Block oreGrowableTanzanite;
	public static Block oreGrowableTopaz;
	public static Block oreGrowableAmethyst;
	public static Block oreGrowableAmberBop;
	public static Block oreGrowableMalachite;
	
	public static Block oreGrowableTungsten;
	public static Block oreGrowableCinnabar;

	
	//public static Block forceReed;
	
	public static Block apatiteReed;
	
	/*
	public static Block oreGrowableRubyGP;
	public static Block oreGrowableSapphireGP;
	public static Block oreGrowableAmethystGP;
	public static Block oreGrowableTopazGP;
	public static Block oreGrowablePhoenixite;
	public static Block oreGrowableJade;
	public static Block oreGrowableCitrine;
	public static Block oreGrowableGarnet;
	public static Block oreGrowableSpinel;
	public static Block oreGrowableOnyx;
	public static Block oreGrowableAgate;
	public static Block oreGrowableMalachite;
	public static Block oreGrowableTourmaline;
	public static Block oreGrowableChrysocolla;
	public static Block oreGrowableJasper;
	public static Block oreGrowableSugilite;
	public static Block oreGrowableBlack;
	public static Block oreGrowableMarble;
	*/
	/*
	public static Block oreGrowableOpal;
	public static Block oreGrowableTurquoise;
	public static Block oreGrowableGranite;
	public static Block oreGrowablePewter;
	public static Block oreGrowableMoonstoneGP;
	
	public static Block oreGrowableHematite;
	public static Block oreGrowableMawsitsit;
	public static Block oreGrowableSunstoneGP;
	public static Block oreGrowablePainite;
	
	public static Block oreGrowableCoral;
	public static Block oreGrowableBlood;
	public static Block oreGrowablePeanut;
	*/
	
	public static Block uraniumReed;
	
	public static Block mythrilSReed;
	public static Block adamantiumSReed;

	public static Block oreGrowableFire;
	public static Block oreGrowableWater;
	public static Block oreGrowableEarth;
	public static Block oreGrowableAir;
	public static Block oreGrowableOrder;
	public static Block oreGrowableEntropy;
	public static Block oreGrowableAmber;
	public static Block oreGrowableCinnibar;

	public static Block arditeReed;
	public static Block cobaltReed;
	public static Block aluminiumReed;
	
	//public static Block miniumReed;
	
	public static Block oreGrowableLead;
	public static Block oreGrowableFerrous;
	
	public static boolean doReedsGenerate;
	
	public static Block oreGrowableSulphur;
	public static Block oreGrowableSaltpeter;



	public static Block oreGrowableAdamantine;
	public static Block oreGrowableAlduorite;
	public static Block oreGrowableAstralSilver;
	public static Block oreGrowableAtlarus;
	public static Block oreGrowableBitumen;
	public static Block oreGrowableCarmot;
	public static Block oreGrowableCeruclase;
	public static Block oreGrowableDeepIron;
	public static Block oreGrowableEximite;
	public static Block oreGrowableIgnatius;
	public static Block oreGrowableInfuscolium;
	public static Block oreGrowableKalendrite;
	public static Block oreGrowableLemurite;
	public static Block oreGrowableMagnesium;
	public static Block oreGrowableManganese;
	public static Block oreGrowableMeutoite;
	public static Block oreGrowableMidasium;
	public static Block oreGrowableMithril;
	public static Block oreGrowableOrichalcum;
	public static Block oreGrowableOureclase;
	public static Block oreGrowablePhosphorus;
	public static Block oreGrowablePlatinum;
	public static Block oreGrowablePotash;
	public static Block oreGrowablePrometheum;
	public static Block oreGrowableRubracium;
	public static Block oreGrowableSaltpeterM;
	public static Block oreGrowableSanguinite;
	public static Block oreGrowableShadowIron;
	public static Block oreGrowableSulfur;
	public static Block oreGrowableVulcanite;
	public static Block oreGrowableVyroxeres;
	public static Block oreGrowableZinc;

	public static Block oreGrowableCheese;

	public static Block oreGrowableSilicon;

	public static Block oreGrowableDesh;

	public static Block oreGrowableIlmenite;

	public static Block oreGrowableYellorium;

	public static Block oreGrowableDraco;
	
	public static int growTime=32;
	
	public static int growthTime=growTime-1;
	


	
	
	public void initConfiguration(FMLInitializationEvent event){
		Configuration config = new Configuration(new File("config/Growable Ores.cfg"));
		config.load();
		
	
		config.addCustomCategoryComment("Textures", "Here you can change the growing block texture. 0 is the default texture,"
				+ "1 is the orange texture and 2 is the original texture.");
		growTexture=config.get("Textures", "Growing Block Texture Type", 0).getInt();
		
	config.addCustomCategoryComment("Growth Time", "Change the growth time of the reed. Minecraft reeds are 16, default for the mod"
			+" is 32.");
	growTime=config.get("Growth Time", "Reed Growth Time", 32).getInt();

	growthTime=growTime-1;
	
		
		
		config.save();
	}
	

	
	//Init
    @EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
    
    @EventHandler
	public void load(FMLInitializationEvent event) {
		
			this.initConfiguration(event);
			
			GameRegistry.registerTileEntity(TileEntityReed.class, "Ore Reed");			
			items();
				
			FMLLog.info("Growable Ores Mod Support now loading...");
				
		 //IC2
			if(Loader.isModLoaded(ModIDs.IC2_ID)){
				IC2.load();
			}
				
			SimpleOres.load();
			Thaumcraft.load();
			TinkersConstruct.load();
			Metallurgy.load();
			BigReactors.load();
			DraconicEvolution.load();
			ElectricAge.load();
			
	        OreSupport.modsup();
	        
	        Reference.addHardcoded();
	        
	        AutoAdder.addSupport();
	        
			
			 //IC2
				if(Loader.isModLoaded(ModIDs.GC_id)&&Loader.isModLoaded(ModIDs.GP_id)){
					Galacticraft.load();
				}
				
	}
    @EventHandler
	public void postInit(FMLPostInitializationEvent event){
  	}
    

	public void items(){
		
		growingBlock = new BlockGrowingBlock(Material.clay).setBlockName(modid.toLowerCase()+":"+"growingBlock").setCreativeTab(tabGrowableOre).setHardness(0.8F).setResistance(8F);
		growingBlock.setHarvestLevel("shovel", 2);
		GameRegistry.registerBlock(growingBlock, "growingBlock");
		//LanguageRegistry.addName(growingBlock, "Growing Block");
		GameRegistry.addShapelessRecipe(new ItemStack(growingBlock, 8), new ItemStack(Items.dye, 1, 15), Items.coal, Items.reeds, Items.iron_ingot, Items.diamond, Items.gold_ingot, Blocks.dirt, Items.redstone, new ItemStack(Items.dye, 1, 4));;
		GameRegistry.addShapelessRecipe(new ItemStack(growingBlock, 8),  new ItemStack(Items.dye, 1, 15), new ItemStack(Items.coal, 1, 1), Items.reeds, Items.iron_ingot, Items.diamond, Items.gold_ingot, Blocks.dirt, Items.redstone, new ItemStack(Items.dye, 1, 4));;

			coalReed = new BlockOreReed("oreGrowableCoal").setBlockName(modid.toLowerCase()+":"+"oreGrowableCoal").setCreativeTab(tabGrowableOre);
			coalReed.setHarvestLevel("pickaxe", 0);
			GameRegistry.registerBlock(coalReed, "coalReed");
			//LanguageRegistry.addName(coalReed, "Coal Ore Reed");
			GameRegistry.addRecipe(new ItemStack(coalReed), new Object[] { "rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Items.coal, Character.valueOf('s'), Blocks.stone});
			GameRegistry.addRecipe(new ItemStack(Items.coal), new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), coalReed});
		
				ironReed = new BlockOreReed("oreGrowableIron").setBlockName(modid.toLowerCase()+":"+"oreGrowableIron").setCreativeTab(tabGrowableOre);
			ironReed.setHarvestLevel("pickaxe", 1);
			GameRegistry.registerBlock(ironReed, "ironReed");
			//LanguageRegistry.addName(ironReed, "Iron Ore Reed");
			GameRegistry.addRecipe(new ItemStack(ironReed), new Object[] { "rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Items.iron_ingot, Character.valueOf('s'), Blocks.stone});
			GameRegistry.addRecipe(new ItemStack(Items.iron_ingot), new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), ironReed});

		

			goldReed = new BlockOreReed("oreGrowableGold").setBlockName(modid.toLowerCase()+":"+"oreGrowableGold").setCreativeTab(tabGrowableOre);
			goldReed.setHarvestLevel("pickaxe", 2);
			GameRegistry.registerBlock(goldReed, "goldReed");
			//LanguageRegistry.addName(goldReed, "Gold Ore Reed");
			GameRegistry.addRecipe(new ItemStack(goldReed), new Object[] { "rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Items.gold_ingot, Character.valueOf('s'), Blocks.stone});
			GameRegistry.addRecipe(new ItemStack(Items.gold_ingot), new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), goldReed});
	

		
			redstoneReed = new BlockOreReed("oreGrowableRedstone").setBlockName(modid.toLowerCase()+":"+"oreGrowableRedstone").setCreativeTab(tabGrowableOre);
			redstoneReed.setHarvestLevel("pickaxe", 2);
			GameRegistry.registerBlock(redstoneReed,"oreGrowableRedstone");
			//LanguageRegistry.addName(redstoneReed, "Redstone Ore Reed");
			GameRegistry.addRecipe(new ItemStack(redstoneReed), new Object[] { "rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Items.redstone, Character.valueOf('s'), Blocks.stone});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone), redstoneReed);
		
					lapisReed = new BlockOreReed("oreGrowableLapis").setBlockName(modid.toLowerCase()+":"+"oreGrowableLapis").setCreativeTab(tabGrowableOre);
					lapisReed.setHarvestLevel("pickaxe", 1);
			GameRegistry.registerBlock(lapisReed,"oreGrowableLapis");
			//LanguageRegistry.addName(lapisReed, "Lapis Ore Reed");
			GameRegistry.addRecipe(new ItemStack(lapisReed), new Object[] { "rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), new ItemStack(Items.dye, 1, 4), Character.valueOf('s'), Blocks.stone});
			GameRegistry.addRecipe(new ItemStack(Items.dye, 1, 4), new Object[] { "rr","rr", Character.valueOf('r'), lapisReed});		
		
		diamondReed = new BlockOreReed("oreGrowableDiamond").setBlockName(modid.toLowerCase()+":"+"oreGrowableDiamond").setCreativeTab(tabGrowableOre);
		diamondReed.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(diamondReed,"oreGrowableDiamond");
		//LanguageRegistry.addName(diamondReed, "Diamond Ore Reed");
		GameRegistry.addRecipe(new ItemStack(diamondReed), new Object[] { "rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Items.diamond, Character.valueOf('s'), Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(Items.diamond), new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), diamondReed});
		
				emeraldReed = new BlockOreReed("oreGrowableEmerald").setBlockName(modid.toLowerCase()+":"+"oreGrowableEmerald").setCreativeTab(tabGrowableOre);
				emeraldReed.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(emeraldReed,"oreGrowableEmerald");
		//LanguageRegistry.addName(emeraldReed, "Emerald Ore Reed");
		GameRegistry.addRecipe(new ItemStack(emeraldReed), new Object[] { "rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Items.emerald, Character.valueOf('s'), Blocks.stone});

		GameRegistry.addRecipe(new ItemStack(Items.emerald), new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), emeraldReed});
		
		
		nquartzReed = new BlockOreReed("oreGrowableNQuartz").setBlockName(modid.toLowerCase()+":"+"oreGrowableNQuartz").setCreativeTab(tabGrowableOre);
		nquartzReed.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(nquartzReed,"oreGrowableNQuartz");
		//LanguageRegistry.addName(nquartzReed, "Nether Quartz Ore Reed");
		GameRegistry.addRecipe(new ItemStack(nquartzReed), new Object[] { "rnr", "rxr", "rnr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Items.quartz, Character.valueOf('n'), Blocks.netherrack});
		GameRegistry.addRecipe(new ItemStack(Items.quartz), new Object[] { "rr", "rr", Character.valueOf('r'), nquartzReed});
		
		
		glowReed = new BlockOreReed("oreGrowableGlowstone").setBlockName(modid.toLowerCase()+":"+"oreGrowableGlowstone").setCreativeTab(tabGrowableOre);
		glowReed.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(glowReed,"oreGrowableGlowstone");
		//LanguageRegistry.addName(glowReed, "Glowstone Reed");
		GameRegistry.addRecipe(new ItemStack(glowReed), new Object[] { "rxr", "rdr", "rxr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Blocks.glowstone, Character.valueOf('d'), Items.glowstone_dust});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust), glowReed);
		
		
		obsidReed = new BlockOreReed("oreGrowableObsidian").setBlockName(modid.toLowerCase()+":"+"oreGrowableObsidian").setCreativeTab(tabGrowableOre).setHardness(0.5F);
		obsidReed.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(obsidReed,"oreGrowableObsidian");
		//LanguageRegistry.addName(obsidReed, "Obsidian Reed");
		GameRegistry.addRecipe(new ItemStack(obsidReed), new Object[] { "rsr", "rsr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('s'), Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[] { "rr", "rr", Character.valueOf('r'), obsidReed});
		
		
		clayReed = new BlockOreReed("oreGrowableClay").setBlockName(modid.toLowerCase()+":"+"oreGrowableClay").setCreativeTab(tabGrowableOre).setHardness(0.5F);
		clayReed.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(clayReed,"oreGrowableClay");
		//LanguageRegistry.addName(clayReed, "Clay Reed");
		GameRegistry.addRecipe(new ItemStack(clayReed), new Object[] { "rxr", "rdr", "rxr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Blocks.clay, Character.valueOf('d'), Items.clay_ball});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball), clayReed);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(clayReed), new ItemStack(Items.brick, 1, 0), 0.1F);
		GameRegistry.addRecipe(new ItemStack(Blocks.clay), new Object[] { "rr", "rr", Character.valueOf('r'), clayReed});
		
		enderReed = new BlockOreReed("oreGrowableEnder").setBlockName(modid.toLowerCase()+":"+"oreGrowableEnder").setCreativeTab(tabGrowableOre).setHardness(0.5F);
		enderReed.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(enderReed,"oreGrowableEnder");
		GameRegistry.addRecipe(new ItemStack(enderReed), new Object[] { "rdr", "rdr", "rdr", Character.valueOf('r'), Items.reeds, Character.valueOf('d'), Items.ender_pearl});
		GameRegistry.addRecipe(new ItemStack(Items.ender_pearl), new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), enderReed});
		
		blazeReed = new BlockOreReed("oreGrowableBlaze").setBlockName(modid.toLowerCase()+":"+"oreGrowableBlaze").setCreativeTab(tabGrowableOre).setHardness(0.5F);
		blazeReed.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(blazeReed, "oreGrowableBlaze");
		GameRegistry.addRecipe(new ItemStack(blazeReed), new Object[] { "rxr", "rdr", "rxr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), Items.blaze_powder, Character.valueOf('d'), Items.blaze_powder});
		GameRegistry.addRecipe(new ItemStack(Items.blaze_powder), new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), blazeReed});	
	
}
	
	
	public  static final CreativeTabs tabGrowableOre = new TabGrowOre("growableOres");

}
