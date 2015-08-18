package mods.B0bGary.GrowOres.mods;

import java.util.List;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BigReactors
{
    public static List<ItemStack> br = OreDictionary.getOres("ingotYellorium");

	    public static void load()
	    {
	    	
	    	 for(int i = 0; i < br.size(); i++){
	    		   ItemStack sulphur=br.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	                	Base.oreGrowableYellorium = new BlockOreReed("oreGrowableYellorium").setBlockName(mod+"oreGrowableYellorium").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.oreGrowableYellorium, 2, 1, "oreGrowableYellorium", sulphur, "ingotYellorium");
	                 
	                if(Base.oreGrowableYellorium != null) {
	                 break;
	                }	
	    	}
	    	 }
	    	 
	    }
}