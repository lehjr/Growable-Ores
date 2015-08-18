package mods.B0bGary.GrowOres.core;

import java.util.List;

import scala.actors.threadpool.Arrays;
import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import mods.B0bGary.GrowOres.mods.AReedMakerClass;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class AutoAdder {
	
	public static Block oreGrowableCustom;

	public static void addSupport(){
		
		System.out.println("B0b starting support");
		
		String[] dic=OreDictionary.getOreNames();
		List<ItemStack> stack;
		List<ItemStack> ore;
		
		
		for(int i=0;i<dic.length;i++){
			if(dic[i].startsWith("ore")){//Makes sure its an ore
				
			
				 String mat=dic[i].replace("ore", "");
										
				    		   //Makes sure it's not already added
				    		   if(!Reference.hardcoded.contains(mat)){
							
				    				ore=OreDictionary.getOres(dic[i]);
				    				stack=OreDictionary.getOres("ingot"+mat);
									
				    				
				    				
				    				//Makes sure its an ingot
									if(!(stack.size()<1)){
									
										System.out.println(mat);
										System.out.println("Looks good cap");
							
				    		   
				    		
				    		/*   for(int i4 = 0; i4 < stack.size(); i4++){
					    		   ItemStack material=stack.get(i4);
					    		   if(material != null) {
					    			   material = material.copy();
					    			   material.stackSize = 1; */

					    			 //WRITE TO NBT
						    		   //WRITE THE MATERIAL
						    		   //USE THE MATERIAL TO DETERMINE EVERYTHING
										ItemStack stack2 =ore.get(0);
										String y=stack2.getDisplayName();
										//Block block= Block.getBlockFromItem(stack2.getItem());
										//block
										 String mod=Base.modid.toLowerCase()+":";
					             		oreGrowableCustom= new BlockAutoOreReed(mat).setCreativeTab(Base.tabGrowableOre)
					             				.setBlockName("oreGrowableCustom");
					             		AutoReedMaker.addReed(oreGrowableCustom, mat);
					    		   }
						}
				    		   
						
						}
						
						
				}
		
	
			//}
		//}
	}
}

