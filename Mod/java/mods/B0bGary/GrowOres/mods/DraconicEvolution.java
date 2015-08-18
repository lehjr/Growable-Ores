package mods.B0bGary.GrowOres.mods;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class DraconicEvolution
{
	    public static void load()
	    {

                try
                {
                        Class<?> ic2Items = Class.forName("com.brandon3055.draconicevolution.common.ModItems");
                        if(ic2Items != null)
                        {
                        	Item uran = (Item)ic2Items.getField("draconiumDust").get(null);
                        	String mod=Base.modid.toLowerCase()+":";
                        	Base.oreGrowableDraco = new BlockOreReed("oreGrowableDraco").setBlockName(mod+"oreGrowableDraco").setCreativeTab(Base.tabGrowableOre);
                     		 AReedMakerClass.addReed(Base.oreGrowableDraco, 4, 2, "oreGrowableDraco", new ItemStack(uran), new ItemStack(uran));
                          
                        	
                            
                                         }
                        }	

                
                catch(Exception x)
                {
                        x.printStackTrace();
                }
	    	}
}

