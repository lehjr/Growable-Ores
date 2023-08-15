package mods.B0bGary.GrowOres.mods;

import java.util.List;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Thaumcraft
{
	
    public static List<ItemStack> a = OreDictionary.getOres("shardAir");
    public static List<ItemStack> f = OreDictionary.getOres("shardFire");
    public static List<ItemStack> w = OreDictionary.getOres("shardWater");
    public static List<ItemStack> er = OreDictionary.getOres("shardEarth");
    public static List<ItemStack> o = OreDictionary.getOres("shardOrder");
    public static List<ItemStack> en = OreDictionary.getOres("shardEntropy");
    public static List<ItemStack> am = OreDictionary.getOres("gemAmber");
    public static List<ItemStack> qu = OreDictionary.getOres("quicksilver");

	
	
        public static void load()
        {

	    	 for(int i = 0; i < a.size(); i++){
	    		   ItemStack mat=a.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.oreGrowableAir = new BlockOreReed("oreGrowableAir").setBlockName(mod+"oreGrowableAir").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableAir, 0, 2, "oreGrowableAir", mat, mat);
	                if(Base.oreGrowableAir != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 for(int i = 0; i < f.size(); i++){
	    		   ItemStack mat=f.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.oreGrowableFire = new BlockOreReed("oreGrowableFire").setBlockName(mod+"oreGrowableFire").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableFire, 0, 2, "oreGrowableFire", mat, mat);
	                if(Base.oreGrowableFire != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 for(int i = 0; i < w.size(); i++){
	    		   ItemStack mat=w.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.oreGrowableWater = new BlockOreReed("oreGrowableWater").setBlockName(mod+"oreGrowableWater").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableWater, 0, 2, "oreGrowableWater", mat, mat);
	                if(Base.oreGrowableWater != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 for(int i = 0; i < er.size(); i++){
	    		   ItemStack mat=er.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.oreGrowableEarth = new BlockOreReed("oreGrowableEarth").setBlockName(mod+"oreGrowableEarth").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableEarth, 0, 2, "oreGrowableEarth", mat, mat);
	                if(Base.oreGrowableEarth != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < o.size(); i++){
	    		   ItemStack mat=o.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.oreGrowableOrder = new BlockOreReed("oreGrowableOrder").setBlockName(mod+"oreGrowableOrder").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableOrder, 0, 2, "oreGrowableOrder", mat, mat);
	                if(Base.oreGrowableOrder != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 for(int i = 0; i < en.size(); i++){
	    		   ItemStack mat=en.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.oreGrowableEntropy = new BlockOreReed("oreGrowableEntropy").setBlockName(mod+"oreGrowableEntropy").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableEntropy, 0, 2, "oreGrowableEntropy", mat, mat);
	                if(Base.oreGrowableEntropy != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 /*
	    	 
	    	 for(int i = 0; i < am.size(); i++){
	    		   ItemStack mat=am.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.oreGrowableAmber = new BlockOreReed("oreGrowableAmber").setBlockName(mod+"oreGrowableAmber").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableAmber, 2, 2, "oreGrowableAmber", mat, mat);
	                if(Base.oreGrowableAmber != null) {
	                 break;
	                }	
	    	}
	    	 }*/
	    	 
	    	 for(int i = 0; i < qu.size(); i++){
	    		   ItemStack mat=qu.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.oreGrowableCinnibar = new BlockOreReed("oreGrowableCinnibar").setBlockName(mod+"oreGrowableCinnibar").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableCinnibar, 2, 2, "oreGrowableCinnibar", mat, mat);
	                if(Base.oreGrowableCinnibar != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
        }
}