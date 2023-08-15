package mods.B0bGary.GrowOres.mods;

import java.util.List;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Metallurgy
{
    public static List<ItemStack> ada = OreDictionary.getOres("ingotAdamantine");
    public static List<ItemStack> ald = OreDictionary.getOres("ingotAlduorite");
    public static List<ItemStack> ast = OreDictionary.getOres("ingotAstralSilver");
    public static List<ItemStack> atl = OreDictionary.getOres("ingotAtlarus");
    public static List<ItemStack> bit = OreDictionary.getOres("dustBitumen");
    public static List<ItemStack> car = OreDictionary.getOres("ingotCarmot");
    public static List<ItemStack> cer = OreDictionary.getOres("ingotCeruclase");
    public static List<ItemStack> dee = OreDictionary.getOres("ingotDeepIron");
    public static List<ItemStack> exi = OreDictionary.getOres("ingotEximite");
    public static List<ItemStack> ign = OreDictionary.getOres("ingotIgnatius");
    public static List<ItemStack> inf = OreDictionary.getOres("ingotInfuscolium");
    public static List<ItemStack> kal = OreDictionary.getOres("ingotKalendrite");
    public static List<ItemStack> lem = OreDictionary.getOres("ingotLemurite");
    public static List<ItemStack> mag = OreDictionary.getOres("dustMagnesium");
    public static List<ItemStack> man = OreDictionary.getOres("ingotManganese");
    public static List<ItemStack> meu = OreDictionary.getOres("ingotMeutoite");
    public static List<ItemStack> mid = OreDictionary.getOres("ingotMidasium");
    public static List<ItemStack> mit = OreDictionary.getOres("ingotMithril");
    public static List<ItemStack> ori = OreDictionary.getOres("ingotOrichalcum");
    public static List<ItemStack> our = OreDictionary.getOres("ingotOureclase");
    public static List<ItemStack> pho = OreDictionary.getOres("dustPhosphorus");
    public static List<ItemStack> pla = OreDictionary.getOres("ingotPlatinum");
    public static List<ItemStack> pot = OreDictionary.getOres("dustPotash");
    public static List<ItemStack> pro = OreDictionary.getOres("ingotPrometheum");
    public static List<ItemStack> rub = OreDictionary.getOres("ingotRubracium");
    public static List<ItemStack> sal = OreDictionary.getOres("dustSaltpeter");
    public static List<ItemStack> san = OreDictionary.getOres("ingotSanguinite");
    public static List<ItemStack> sha = OreDictionary.getOres("ingotShadowIron");
    public static List<ItemStack> sul = OreDictionary.getOres("dustSulfur");
    public static List<ItemStack> vul = OreDictionary.getOres("ingotVulcanite");
    public static List<ItemStack> vyr = OreDictionary.getOres("ingotVyroxeres");
    public static List<ItemStack> zin = OreDictionary.getOres("ingotZinc");
    
    


	    public static void load()
	    {
	    	
	    	 for(int i = 0; i < ada.size(); i++){
	    		   ItemStack sulphur=ada.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableAdamantine = new BlockOreReed("oreGrowableAdamantine").setBlockName(mod+"oreGrowableAdamantine").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableAdamantine, 1, 1, "oreGrowableAdamantine", sulphur, "ingotAdamantine");
	                 
	                if(Base.oreGrowableAdamantine != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < ald.size(); i++){
	    		   ItemStack sulphur=ald.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableAlduorite = new BlockOreReed("oreGrowableAlduorite").setBlockName(mod+"oreGrowableAlduorite").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableAlduorite, 2, 1, "oreGrowableAlduorite", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableAlduorite != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < ast.size(); i++){
	    		   ItemStack sulphur=ast.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableAstralSilver = new BlockOreReed("oreGrowableAstralSilver").setBlockName(mod+"oreGrowableAstralSilver").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableAstralSilver, 2, 1, "oreGrowableAstralSilver", sulphur, sulphur);
	                 
	                if(Base.oreGrowableAstralSilver != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < atl.size(); i++){
	    		   ItemStack sulphur=atl.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableAtlarus = new BlockOreReed("oreGrowableAtlarus").setBlockName(mod+"oreGrowableAtlarus").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableAtlarus, 2, 1, "oreGrowableAtlarus", sulphur, sulphur);
	                 
	                if(Base.oreGrowableAtlarus != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < bit.size(); i++){
	    		   ItemStack sulphur=bit.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableBitumen = new BlockOreReed("oreGrowableBitumen").setBlockName(mod+"oreGrowableBitumen").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableBitumen, 2, 1, "oreGrowableBitumen", sulphur, sulphur);
	                 
	                if(Base.oreGrowableBitumen != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < car.size(); i++){
	    		   ItemStack sulphur=car.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableCarmot = new BlockOreReed("oreGrowableCarmot").setBlockName(mod+"oreGrowableCarmot").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableCarmot, 2, 1, "oreGrowableCarmot", sulphur, sulphur);
	                 
	                if(Base.oreGrowableCarmot != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < cer.size(); i++){
	    		   ItemStack sulphur=cer.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableCeruclase = new BlockOreReed("oreGrowableCeruclase").setBlockName(mod+"oreGrowableCeruclase").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableCeruclase, 2, 1, "oreGrowableCeruclase", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableCeruclase != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < dee.size(); i++){
	    		   ItemStack sulphur=dee.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableDeepIron = new BlockOreReed("oreGrowableDeepIron").setBlockName(mod+"oreGrowableDeepIron").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableDeepIron, 2, 1, "oreGrowableDeepIron", sulphur, sulphur);
	                 
	                if(Base.oreGrowableCarmot != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < exi.size(); i++){
	    		   ItemStack sulphur=exi.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableEximite = new BlockOreReed("oreGrowableEximite").setBlockName(mod+"oreGrowableEximite").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableEximite, 2, 1, "oreGrowableEximite", sulphur, sulphur, Blocks.end_stone);
	                 
	                if(Base.oreGrowableEximite != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < ign.size(); i++){
	    		   ItemStack sulphur=ign.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableIgnatius = new BlockOreReed("oreGrowableIgnatius").setBlockName(mod+"oreGrowableIgnatius").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableIgnatius, 2, 1, "oreGrowableIgnatius", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableIgnatius != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < inf.size(); i++){
	    		   ItemStack sulphur=inf.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableInfuscolium = new BlockOreReed("oreGrowableInfuscolium").setBlockName(mod+"oreGrowableInfuscolium").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableInfuscolium, 2, 1, "oreGrowableInfuscolium", sulphur, sulphur);
	                 
	                if(Base.oreGrowableInfuscolium != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < kal.size(); i++){
	    		   ItemStack sulphur=kal.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableKalendrite = new BlockOreReed("oreGrowableKalendrite").setBlockName(mod+"oreGrowableKalendrite").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableKalendrite, 2, 1, "oreGrowableKalendrite", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableKalendrite != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 
	    	 for(int i = 0; i < lem.size(); i++){
	    		   ItemStack sulphur=lem.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableLemurite = new BlockOreReed("oreGrowableLemurite").setBlockName(mod+"oreGrowableLemurite").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableLemurite, 2, 1, "oreGrowableLemurite", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableLemurite != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < mag.size(); i++){
	    		   ItemStack sulphur=mag.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableMagnesium = new BlockOreReed("oreGrowableMagnesium").setBlockName(mod+"oreGrowableMagnesium").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableMagnesium, 2, 1, "oreGrowableMagnesium", sulphur, "dustMagnesium");
	                 
	                if(Base.oreGrowableMagnesium != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < man.size(); i++){
	    		   ItemStack sulphur=man.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableManganese = new BlockOreReed("oreGrowableManganese").setBlockName(mod+"oreGrowableManganese").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableManganese, 2, 1, "oreGrowableManganese", sulphur, "ingotManganese");
	                 
	                if(Base.oreGrowableManganese != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < meu.size(); i++){
	    		   ItemStack sulphur=meu.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableMeutoite = new BlockOreReed("oreGrowableMeutoite").setBlockName(mod+"oreGrowableMeutoite").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableMeutoite, 2, 1, "oreGrowableMeutoite", sulphur, sulphur, Blocks.end_stone);
	                 
	                if(Base.oreGrowableMeutoite != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < mid.size(); i++){
	    		   ItemStack sulphur=mid.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableMidasium = new BlockOreReed("oreGrowableMidasium").setBlockName(mod+"oreGrowableMidasium").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableMidasium, 2, 1, "oreGrowableMidasium", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableMidasium != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < mit.size(); i++){
	    		   ItemStack sulphur=mit.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableMithril = new BlockOreReed("oreGrowableMithril").setBlockName(mod+"oreGrowableMithril").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableMithril, 2, 1, "oreGrowableMithril", sulphur, "ingotMithril");
	                 
	                if(Base.oreGrowableMithril != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < ori.size(); i++){
	    		   ItemStack sulphur=ori.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableOrichalcum = new BlockOreReed("oreGrowableOrichalcum").setBlockName(mod+"oreGrowableOrichalcum").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableOrichalcum, 2, 1, "oreGrowableOrichalcum", sulphur, sulphur);
	                 
	                if(Base.oreGrowableOrichalcum != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < our.size(); i++){
	    		   ItemStack sulphur=our.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableOureclase = new BlockOreReed("oreGrowableOureclase").setBlockName(mod+"oreGrowableOureclase").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableOureclase, 2, 1, "oreGrowableOureclase", sulphur, sulphur);
	                 
	                if(Base.oreGrowableOureclase != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < pho.size(); i++){
	    		   ItemStack sulphur=pho.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowablePhosphorus = new BlockOreReed("oreGrowablePhosphorus").setBlockName(mod+"oreGrowablePhosphorus").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowablePhosphorus, 2, 1, "oreGrowablePhosphorus", sulphur, "dustPhosphorus");
	                 
	                if(Base.oreGrowablePhosphorus != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < pla.size(); i++){
	    		   ItemStack sulphur=pla.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowablePlatinum = new BlockOreReed("oreGrowablePlatinum").setBlockName(mod+"oreGrowablePlatinum").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowablePlatinum, 2, 1, "oreGrowablePlatinum", sulphur, "ingotPlatinum");
	                 
	                if(Base.oreGrowablePlatinum != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < pot.size(); i++){
	    		   ItemStack sulphur=pot.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowablePotash = new BlockOreReed("oreGrowablePotash").setBlockName(mod+"oreGrowablePotash").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowablePotash, 2, 1, "oreGrowablePotash", sulphur, sulphur);
	                 
	                if(Base.oreGrowablePotash != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < pro.size(); i++){
	    		   ItemStack sulphur=pro.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowablePrometheum = new BlockOreReed("oreGrowablePrometheum").setBlockName(mod+"oreGrowablePrometheum").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowablePrometheum, 2, 1, "oreGrowablePrometheum", sulphur, sulphur);
	                 
	                if(Base.oreGrowablePrometheum != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < rub.size(); i++){
	    		   ItemStack sulphur=rub.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableRubracium = new BlockOreReed("oreGrowableRubracium").setBlockName(mod+"oreGrowableRubracium").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableRubracium, 2, 1, "oreGrowableRubracium", sulphur, sulphur);
	                 
	                if(Base.oreGrowableRubracium != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < sal.size(); i++){
	    		   ItemStack sulphur=sal.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableSaltpeterM = new BlockOreReed("oreGrowableSaltpeterM").setBlockName(mod+"oreGrowableSaltpeterM").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableSaltpeterM, 2, 2, "oreGrowableSaltpeterM", sulphur, "dustSaltpeter");
	                 
	                if(Base.oreGrowableSaltpeterM != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < san.size(); i++){
	    		   ItemStack sulphur=san.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableSanguinite = new BlockOreReed("oreGrowableSanguinite").setBlockName(mod+"oreGrowableSanguinite").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableSanguinite, 2, 1, "oreGrowableSanguinite", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableSanguinite != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < sha.size(); i++){
	    		   ItemStack sulphur=sha.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableShadowIron = new BlockOreReed("oreGrowableShadowIron").setBlockName(mod+"oreGrowableShadowIron").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableShadowIron, 2, 1, "oreGrowableShadowIron", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableShadowIron != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 for(int i = 0; i < sul.size(); i++){
	    		   ItemStack sulphur=sul.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableSulfur = new BlockOreReed("oreGrowableSulfur").setBlockName(mod+"oreGrowableSulfur").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableSulfur, 2, 1, "oreGrowableSulfur", sulphur, "dustSulfur");
	                 
	                if(Base.oreGrowableSulfur != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 for(int i = 0; i < vul.size(); i++){
	    		   ItemStack sulphur=vul.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableVulcanite = new BlockOreReed("oreGrowableVulcanite").setBlockName(mod+"oreGrowableVulcanite").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableVulcanite, 2, 1, "oreGrowableVulcanite", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableVulcanite != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 for(int i = 0; i < vyr.size(); i++){
	    		   ItemStack sulphur=vyr.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableVyroxeres = new BlockOreReed("oreGrowableVyroxeres").setBlockName(mod+"oreGrowableVyroxeres").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableVyroxeres, 2, 1, "oreGrowableVyroxeres", sulphur, sulphur, Blocks.netherrack);
	                 
	                if(Base.oreGrowableVyroxeres != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 for(int i = 0; i < zin.size(); i++){
	    		   ItemStack sulphur=zin.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableZinc = new BlockOreReed("oreGrowableZinc").setBlockName(mod+"oreGrowableZinc").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableZinc, 2, 1, "oreGrowableZinc", sulphur, "ingotZinc");
	                 
	                if(Base.oreGrowableZinc != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	
        }
}