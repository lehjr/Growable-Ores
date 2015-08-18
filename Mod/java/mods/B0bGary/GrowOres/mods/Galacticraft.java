package mods.B0bGary.GrowOres.mods;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Galacticraft {

	public static void load()
    {

            try
            {
                    Class<?> ic2Items = Class.forName("micdoodle8.mods.galacticraft.core.blocks.GCBlocks");
                    if(ic2Items != null)
                    {
                    	
                    	Block uran = (Block)ic2Items.getField("blockMoon").get(null);
                    	
                    	
                    	
                    	try
                        {
                                Class<?> ic2Itemss = Class.forName("micdoodle8.mods.galacticraft.core.items.GCItems");
                                if(ic2Itemss != null)
                                {
                    	
                                	Item c = (Item)ic2Itemss.getField("cheeseCurd").get(null);
                                	Item s = (Item)ic2Itemss.getField("basicItem").get(null);//2
                    	
                    	
                    	String mod=Base.modid.toLowerCase()+":";
                    	Base.oreGrowableCheese = new BlockOreReed("oreGrowableCheese").setBlockName(mod+"oreGrowableCheese").setCreativeTab(Base.tabGrowableOre);
                 		AReedMakerClass.addReed(Base.oreGrowableCheese, 1, 3, "oreGrowableCheese", new ItemStack(c), new ItemStack(c), new ItemStack(uran,1,4));
                      
                    	Base.oreGrowableSilicon = new BlockOreReed("oreGrowableSilicon").setBlockName(mod+"oreGrowableSilicon").setCreativeTab(Base.tabGrowableOre);
                    	AReedMakerClass.addReed(Base.oreGrowableSilicon, 1, 2, "oreGrowableSilicon", new ItemStack(s,1,2), new ItemStack(s,1,2));
                        
                                     } 
            }catch(Exception x)
            {
                x.printStackTrace();
        }
                    }
            }
            
            catch(Exception x)
            {
                    x.printStackTrace();
            }
    	
            
            
            
            

	 try
     {
             Class<?> ic2Items = Class.forName("micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks");
             if(ic2Items != null)
             {
             	
             	Block uran = (Block)ic2Items.getField("marsBlock").get(null);//9             	
             	
             	try
                 {
                         Class<?> ic2Itemss = Class.forName("micdoodle8.mods.galacticraft.planets.mars.items.MarsItems");
                         if(ic2Itemss != null)
                         {
             	
                         	Item c = (Item)ic2Itemss.getField("marsItemBasic").get(null);//2 desh, 
         
                         	String mod=Base.modid.toLowerCase()+":";
             	Base.oreGrowableDesh = new BlockOreReed("oreGrowableDesh").setBlockName(mod+"oreGrowableDesh").setCreativeTab(Base.tabGrowableOre);
             	AReedMakerClass.addReed(Base.oreGrowableDesh, 3, 1, "oreGrowableDesh", new ItemStack(c,1,2), new ItemStack(c,1,2), new ItemStack(uran,1,9));
                 
                              }
             	  	
     }catch(Exception x)
     {
         x.printStackTrace();
 }
             }
     }
     
     catch(Exception x)
     {
             x.printStackTrace();
     }
	
            
            
            
            
            
	
	 try
     {
             Class<?> ic2Items = Class.forName("micdoodle8.mods.galacticraft.planets.asteroids.blocks.AsteroidBlocks");
             if(ic2Items != null)
             {
             	
             	Block uran = (Block)ic2Items.getField("blockBasic").get(null);//2            	
             	
             	try
                 {
                         Class<?> ic2Itemss = Class.forName("micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems");
                         if(ic2Itemss != null)
                         {
             	
                         	Item c = (Item)ic2Itemss.getField("basicItem").get(null);//5 ill, 
         
                         	String mod=Base.modid.toLowerCase()+":";
             	Base.oreGrowableIlmenite = new BlockOreReed("oreGrowableIlmenite").setBlockName(mod+"oreGrowableIlmenite").setCreativeTab(Base.tabGrowableOre);
             	AReedMakerClass.addReed(Base.oreGrowableIlmenite, 3, 1, "oreGrowableIlmenite", new ItemStack(c,1,5), new ItemStack(c,1,5), new ItemStack(uran,1,2));
                 
                              }
             	  	
     }catch(Exception x)
     {
         x.printStackTrace();
 }
             }
     }
     
     catch(Exception x)
     {
             x.printStackTrace();
     }
	}
	
	
}
