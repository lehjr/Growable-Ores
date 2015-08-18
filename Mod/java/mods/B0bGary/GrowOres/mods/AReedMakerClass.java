package mods.B0bGary.GrowOres.mods;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;


public class AReedMakerClass {
	
	/**@param tier 1 for 8 items, 2 for 4 items, 3 for 1 item.
	 * */
	public static void addReed(Block b, int harvest, int tier, String name, Item output, String oredictmat){
		
		//String mod=Base.modid.toLowerCase()+":";
		//b=new BlockOreReed(name).setBlockName(mod+name).setCreativeTab(Base.tabGrowableOre);
		GameRegistry.registerBlock(b, name);
		GameRegistry.addRecipe(new ShapedOreRecipe(b, true, new Object[]{"rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), oredictmat, Character.valueOf('s'), Blocks.stone}));
		b.setHarvestLevel("pickaxe", harvest);
		
		if(tier==1){
			  GameRegistry.addRecipe(new ItemStack(output), new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), b});
          	
		}else if(tier==2){
			 GameRegistry.addRecipe(new ItemStack(output), new Object[] { "rr", "rr", Character.valueOf('r'), b});
		      
		}else if(tier==3){
			 GameRegistry.addRecipe(new ItemStack(output), new Object[] { "r", Character.valueOf('r'), b});
		      
		}
		}
	
	/**@param tier 1 for 8 items, 2 for 4 items, 3 for 1 item.
	 * */
		
public static void addReed(Block b, int harvest, int tier, String name, ItemStack output, ItemStack oredictmat){
		
		//String mod=Base.modid.toLowerCase()+":";
		//b=new BlockOreReed(name).setBlockName(mod+name).setCreativeTab(Base.tabGrowableOre);
		GameRegistry.registerBlock(b, name);
		GameRegistry.addRecipe(new ShapedOreRecipe(b, true, new Object[]{"rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), oredictmat, Character.valueOf('s'), Blocks.stone}));
		b.setHarvestLevel("pickaxe", harvest);
		
		if(tier==1){
			  GameRegistry.addRecipe(output, new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), b});
          	
		}else if(tier==2){
			 GameRegistry.addRecipe(output, new Object[] { "rr", "rr", Character.valueOf('r'), b});
		      
		}else if(tier==3){
			 GameRegistry.addRecipe(output, new Object[] { "r", Character.valueOf('r'), b});
		      
		}
		}
	
	
/**@param tier 1 for 8 items, 2 for 4 items, 3 for 1 item.
 * */
	public static void addReed(Block b, int harvest, int tier, String name, ItemStack output, String oredictmat){
		
		
		//String mod=Base.modid.toLowerCase()+":";
		//b=new BlockOreReed(name).setBlockName(mod+name).setCreativeTab(Base.tabGrowableOre);
		GameRegistry.registerBlock(b, name);
	
		
		GameRegistry.addRecipe(new ShapedOreRecipe(b, true, new Object[]{"rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), oredictmat, Character.valueOf('s'), Blocks.stone}));
		b.setHarvestLevel("pickaxe", harvest);
		
		if(tier==1){
			  GameRegistry.addRecipe(output, new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), b});
          	
		}else if(tier==2){
			 GameRegistry.addRecipe(output, new Object[] { "rr", "rr", Character.valueOf('r'), b});
		      
		}else if(tier==3){
			 GameRegistry.addRecipe(output, new Object[] { "r", Character.valueOf('r'), b});
		      
		}
		}


	/**@param tier 1 for 8 items, 2 for 4 items, 3 for 1 item.
	 * */


	public static void addReed(Block b, int harvest, int tier, String name, ItemStack output, String oredictmat, Block altmat) {
		

		GameRegistry.registerBlock(b, name);
	
		
		GameRegistry.addRecipe(new ShapedOreRecipe(b, true, new Object[]{"rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), oredictmat, Character.valueOf('s'), altmat}));
		b.setHarvestLevel("pickaxe", harvest);
		
		if(tier==1){
			  GameRegistry.addRecipe(output, new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), b});
          	
		}else if(tier==2){
			 GameRegistry.addRecipe(output, new Object[] { "rr", "rr", Character.valueOf('r'), b});
		      
		}else if(tier==3){
			 GameRegistry.addRecipe(output, new Object[] { "r", Character.valueOf('r'), b});
		      
		}
		}
	/**@param tier 1 for 8 items, 2 for 4 items, 3 for 1 item.
	 * */

	public static void addReed(Block b, int harvest, int tier, String name, ItemStack output, ItemStack oredictmat, Block altmat) {
		

		GameRegistry.registerBlock(b, name);
	
		
		GameRegistry.addRecipe(new ShapedOreRecipe(b, true, new Object[]{"rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), oredictmat, Character.valueOf('s'), altmat}));
		b.setHarvestLevel("pickaxe", harvest);
		
		if(tier==1){
			  GameRegistry.addRecipe(output, new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), b});
          	
		}else if(tier==2){
			 GameRegistry.addRecipe(output, new Object[] { "rr", "rr", Character.valueOf('r'), b});
		      
		}else if(tier==3){
			 GameRegistry.addRecipe(output, new Object[] { "r", Character.valueOf('r'), b});
		      
		}
		}
	/**@param tier 1 for 8 items, 2 for 4 items, 3 for 1 item.
	 * */
	
	public static void addReed(Block b, int harvest, int tier, String name, ItemStack output, ItemStack oredictmat, ItemStack altmat) {
		

		GameRegistry.registerBlock(b, name);
	
		
		GameRegistry.addRecipe(new ShapedOreRecipe(b, true, new Object[]{"rsr", "rxr", "rsr", Character.valueOf('r'), Items.reeds, Character.valueOf('x'), oredictmat, Character.valueOf('s'), altmat}));
		b.setHarvestLevel("pickaxe", harvest);
		
		if(tier==1){
			  GameRegistry.addRecipe(output, new Object[] { "rrr", "r r", "rrr", Character.valueOf('r'), b});
          	
		}else if(tier==2){
			 GameRegistry.addRecipe(output, new Object[] { "rr", "rr", Character.valueOf('r'), b});
		      
		}else if(tier==3){
			 GameRegistry.addRecipe(output, new Object[] { "r", Character.valueOf('r'), b});
		      
		}
		}
		
		
	}
	



