package mods.B0bGary.GrowOres.core;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class AutoReedMaker {
	
public static void addReed(Block b, String mat){
		
	
	List<ItemStack> stack;
	
	/**@param tier 1 for 8 items, 2 for 4 items, 3 for 1 item.
	 **/
		
		
		ItemStack blnbt = new ItemStack(b);
		blnbt.setTagCompound(new NBTTagCompound());
		NBTTagCompound tags = blnbt.stackTagCompound;
		tags.setString("type", mat);
		GameRegistry.registerBlock(b, "oreGrowable"+mat);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(blnbt, true, new Object[]{"rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), "ingot"+mat, Character.valueOf('s'), Blocks.stone}));
		
		
		List<ItemStack> ore;
		ore=OreDictionary.getOres("ore"+mat);
		ItemStack stack2 =ore.get(0);
		String y=stack2.getDisplayName();
		
	  LanguageRegistry.addName(blnbt, y);
		
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
	
	



