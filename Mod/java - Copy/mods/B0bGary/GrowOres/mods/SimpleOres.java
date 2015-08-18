package mods.B0bGary.GrowOres.mods;

import java.util.List;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class SimpleOres
{
    public static List<ItemStack> my = OreDictionary.getOres("ingotMythril");
    public static List<ItemStack> ad = OreDictionary.getOres("ingotAdamantium");


	    public static void load()
	    {
	    	/*
	    	 for(int i = 0; i < my.size(); i++){
	    		   ItemStack sulphur=my.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.mythrilSReed = new BlockOreReed("oreGrowableSMythril").setBlockName(mod+"oreGrowableSMythril").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.mythrilSReed, 2, 1, "oreGrowableSMythril", sulphur, "ingotMythril");
	                 
	                if(Base.mythrilSReed != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 */
	    	 
	    	 for(int i = 0; i < ad.size(); i++){
	    		   ItemStack sulphur=ad.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.adamantiumSReed = new BlockOreReed("oreGrowableSAdamantium").setBlockName(mod+"oreGrowableSAdamantium").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.adamantiumSReed, 2, 1, "oreGrowableSAdamantium", sulphur, "ingotAdamantium");
	                 
	                if(Base.adamantiumSReed != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	
        }
}