package mods.B0bGary.GrowOres.mods;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.item.ItemStack;


public class IC2
{
	    public static void load()
	    {

                try
                {
                        Class<?> ic2Items = Class.forName("ic2.core.Ic2Items");
                        if(ic2Items != null)
                        {
                        	ItemStack uran = (ItemStack)ic2Items.getField("Uran238").get(null);
                        	String mod=Base.modid.toLowerCase()+":";
                        	Base.uraniumReed = new BlockOreReed("oreGrowableUranium").setBlockName(mod+"oreGrowableUranium").setCreativeTab(Base.tabGrowableOre);
                     		 AReedMakerClass.addReed(Base.uraniumReed, 2, 2, "oreGrowableUranium", uran, uran);
                          
                        	
                            
                                         }
                        }	

                
                catch(Exception x)
                {
                        x.printStackTrace();
                }
	    	}
}