package mods.B0bGary.GrowOres.core;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class AutoReedMaker {
	
public static void addReed(Block b, String mat){
		
	
	List<ItemStack> stack;
	
	/**@param tier 1 for 8 items, 2 for 4 items, 3 for 1 item.
	 **/
		
		GameRegistry.registerBlock(b, "oreGrowable"+mat);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(b, true, new Object[]{"rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), "ingot"+mat, Character.valueOf('s'), Blocks.stone}));
		
		
		List<ItemStack> ore;
		ore=OreDictionary.getOres("ore"+mat);
		ItemStack stack2 =ore.get(0);
		String y=stack2.getDisplayName();
		
		
		Item a=stack2.getItem();
		Block g=Block.getBlockFromItem(a);
	

		
	  LanguageRegistry.addName(b, "Growable "+y+"Reed");
		
		b.setHarvestLevel("pickaxe", 1);

			stack=OreDictionary.getOres("ingot"+mat);
			for(int i = 0; i < stack.size(); i++){
	    		   ItemStack sulphur=stack.get(i);
	    		   if(sulphur != null) {
	    		        sulphur = sulphur.copy();
	    		        sulphur.stackSize = 1;
			  GameRegistry.addRecipe(sulphur, new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), b});
          	
			  
	    		   }
			}
		      
		}
		
	
		
		
	}
	
	



