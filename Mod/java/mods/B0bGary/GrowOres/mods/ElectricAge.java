package mods.B0bGary.GrowOres.mods;

import java.util.List;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ElectricAge
{
    public static List<ItemStack> cinna = OreDictionary.getOres("dustCinnabar");
    public static List<ItemStack> tung = OreDictionary.getOres("ingotElnTungsten");


	    public static void load()
	    {
	    	
	    	 for(int i = 0; i < cinna.size(); i++){
	    		   ItemStack sulphur=cinna.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableCinnabar = new BlockOreReed("oreGrowableCinnabar").setBlockName(mod+"oreGrowableCinnabar").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableCinnabar, 2, 2, "oreGrowableCinnabar", sulphur, "dustCinnabar");
	                 
	                if(Base.oreGrowableCinnabar != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    	 for(int i = 0; i < tung.size(); i++){
	    		   ItemStack sulphur=tung.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableTungsten = new BlockOreReed("oreGrowableTungsten").setBlockName(mod+"oreGrowableTungsten").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableTungsten, 2, 1, "oreGrowableTungsten", sulphur, "ingotElnTungsten");
	                 
	                if(Base.oreGrowableTungsten != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    }
}