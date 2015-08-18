package mods.B0bGary.GrowOres.mods;

import java.util.List;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class TinkersConstruct
{
    public static List<ItemStack> c = OreDictionary.getOres("ingotCobalt");
    public static List<ItemStack> a = OreDictionary.getOres("ingotArdite");
    public static List<ItemStack> al = OreDictionary.getOres("ingotAluminum");



        public static void load()
        {

        	 for(int i = 0; i < c.size(); i++){
	    		   ItemStack mat=c.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.cobaltReed = new BlockOreReed("oreGrowableCobalt").setBlockName(mod+"oreGrowableCobalt").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.cobaltReed, 4,1, "oreGrowableCobalt", mat, mat);
	                if(Base.cobaltReed != null) {
	                 break;
	                }	
	    	}
	    	 }
        	 
        	 for(int i = 0; i < a.size(); i++){
	    		   ItemStack mat=a.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.arditeReed = new BlockOreReed("oreGrowableArdite").setBlockName(mod+"oreGrowableArdite").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.arditeReed, 4,1, "oreGrowableArdite", mat, mat);
	                if(Base.arditeReed != null) {
	                 break;
	                }	
	    	}
	    	 }
        	 
        	 for(int i = 0; i < al.size(); i++){
	    		   ItemStack mat=al.get(i);
	    		   if(mat != null) {
	    			   mat = mat.copy();
	    			   mat.stackSize = 1;

	    		        String mod=Base.modid.toLowerCase()+":";
	    		        
	                	Base.aluminiumReed = new BlockOreReed("oreGrowableAluminium").setBlockName(mod+"oreGrowableAluminium").setCreativeTab(Base.tabGrowableOre);
	             		 AReedMakerClass.addReed(Base.aluminiumReed, 2,1, "oreGrowableAluminium", mat, "ingotAluminum");
	                if(Base.aluminiumReed != null) {
	                 break;
	                }	
	    	}
	    	 }
     
        }
}