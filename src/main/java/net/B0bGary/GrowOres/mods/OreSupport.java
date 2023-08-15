package mods.B0bGary.GrowOres.mods;

import java.util.List;

import mods.B0bGary.GrowOres.Base;
import mods.B0bGary.GrowOres.BlockOreReed;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreSupport {

	//Basic
    public static List<ItemStack> copper = OreDictionary.getOres("ingotCopper");
    public static List<ItemStack> tin = OreDictionary.getOres("ingotTin");
    public static List<ItemStack> silver = OreDictionary.getOres("ingotSilver");
    //Thermal Expansion
    public static List<ItemStack> ingotLead = OreDictionary.getOres("ingotLead");
    public static List<ItemStack> ingotFerrous = OreDictionary.getOres("ingotNickel");
    //Applied Energistics
    public static List<ItemStack> q = OreDictionary.getOres("crystalCertusQuartz");
    //Ars Magica
    public static List<ItemStack> vinteum = OreDictionary.getOres("dustVinteum");
    public static List<ItemStack> gemChimerite = OreDictionary.getOres("gemChimerite");
    public static List<ItemStack> gemBlueTopaz = OreDictionary.getOres("gemBlueTopaz");
    public static List<ItemStack> sunstone = OreDictionary.getOres("gemSunstone");
    public static List<ItemStack> moonstone = OreDictionary.getOres("gemMoonstone");
    //BOP
    public static List<ItemStack> r = OreDictionary.getOres("gemRuby");
    public static List<ItemStack> p = OreDictionary.getOres("gemPeridot");
    public static List<ItemStack> t = OreDictionary.getOres("gemTopaz");
    public static List<ItemStack> ta = OreDictionary.getOres("gemTanzanite");
    public static List<ItemStack> m = OreDictionary.getOres("gemMalachite");
    public static List<ItemStack> s = OreDictionary.getOres("gemSapphire");
    public static List<ItemStack> a = OreDictionary.getOres("gemAmber");
    //Forestry
    public static List<ItemStack> gemApatite = OreDictionary.getOres("gemApatite");


    
	
	public static void modsup(){
		 for(int i = 0; i < copper.size(); i++){
  		   ItemStack stack=copper.get(i);
  		   if(stack != null) {
  			 stack = stack.copy();
  			stack.stackSize = 1;
  		        String mod=Base.modid.toLowerCase()+":";
              	Base.copperReed = new BlockOreReed("oreGrowableCopper").setBlockName(mod+"oreGrowableCopper").setCreativeTab(Base.tabGrowableOre);
           		 AReedMakerClass.addReed(Base.copperReed, 1, 1, "copperReed", stack, "ingotCopper");
                if(Base.copperReed != null) {
               break;}}}	 
		 for(int i = 0; i < tin.size(); i++){
	  		   ItemStack stack=tin.get(i);
	  		   if(stack != null) {
	  			 stack = stack.copy();
	  			stack.stackSize = 1;
	  		        String mod=Base.modid.toLowerCase()+":";
	              	Base.tinReed = new BlockOreReed("oreGrowableTin").setBlockName(mod+"oreGrowableTin").setCreativeTab(Base.tabGrowableOre);
	           	 AReedMakerClass.addReed(Base.tinReed, 1, 1, "tinReed", stack, "ingotTin");
	              if(Base.tinReed != null) {
	               break;
	              }	}}
		
		 for(int i = 0; i < silver.size(); i++){
	  		   ItemStack stack=silver.get(i);
	  		   if(stack != null) {
	  			 stack = stack.copy();
	  			stack.stackSize = 1;

	  		        String mod=Base.modid.toLowerCase()+":";
	              	Base.silverReed = new BlockOreReed("oreGrowableSilver").setBlockName(mod+"oreGrowableSilver").setCreativeTab(Base.tabGrowableOre);
	           		 AReedMakerClass.addReed(Base.silverReed, 2, 1, "silverReed", stack, "ingotSilver");
	               
	              if(Base.tinReed != null) {
	               break;
	              }	
	  	}
	  	 }

		 for(int i = 0; i < ingotLead.size(); i++){
    		   ItemStack l=ingotLead.get(i);
    		   if(l != null) {
    		        // Create a copy from the sulphur stack to keep the original one untouched.
    		        l = l.copy();
    		        l.stackSize = 1;
    		        
    				String mod=Base.modid.toLowerCase()+":";
    				
    		      Base.oreGrowableLead=new BlockOreReed("oreGrowableLead").setBlockName(mod+"oreGrowableLead").setCreativeTab(Base.tabGrowableOre);
    		      AReedMakerClass.addReed(Base.oreGrowableLead, 2, 1, "oreGrowableLead", l, "ingotLead");

                if(Base.oreGrowableLead != null) {
                 break;
                }	
    	}
    	 }                       		     
          for(int ai = 0; ai < ingotFerrous.size(); ai++){
              ItemStack fer=ingotFerrous.get(ai);
              if(fer != null) {
                        		        // Create a copy from the sulphur stack to keep the original one untouched.
            	  fer = fer.copy();
            	  fer.stackSize = 1;
                        			
            	  String mod=Base.modid.toLowerCase()+":";
                  Base.oreGrowableFerrous=new BlockOreReed("oreGrowableFerrous").setBlockName(mod+"oreGrowableFerrous").setCreativeTab(Base.tabGrowableOre);
                  AReedMakerClass.addReed(Base.oreGrowableFerrous, 2, 1, "oreGrowableFerrous", fer, "ingotNickel");
                  if(Base.oreGrowableFerrous != null) {
                	  break;
                  }	

                      }
              }
		 
          for(int i = 0; i < q.size(); i++){
   		   ItemStack l=q.get(i);
   		   if(l != null) {
   		        // Create a copy from the sulphur stack to keep the original one untouched.
   		        l = l.copy();
   		        l.stackSize = 1;
   		        
   				String mod=Base.modid.toLowerCase()+":";
   				
   		      Base.quartzReed=new BlockOreReed("oreGrowableQuartz").setBlockName(mod+"oreGrowableQuartz").setCreativeTab(Base.tabGrowableOre);
   		      AReedMakerClass.addReed(Base.quartzReed, 0, 2, "oreGrowableQuartz", l, "crystalCertusQuartz");

               if(Base.quartzReed != null) {
                break;
               }	
   	}
   	 }
          
          for(int i = 0; i < vinteum.size(); i++){
      		   ItemStack l=vinteum.get(i);
      		   if(l != null) {
      		        // Create a copy from the sulphur stack to keep the original one untouched.
      		        l = l.copy();
      		        l.stackSize = 1;
      		        
      				String mod=Base.modid.toLowerCase()+":";
      				
      		      Base.vinteumReed=new BlockOreReed("oreGrowableVinteum").setBlockName(mod+"oreGrowableVinteum").setCreativeTab(Base.tabGrowableOre);
      		      AReedMakerClass.addReed(Base.vinteumReed, 2, 3, "oreGrowableVinteum", l,"dustVinteum");

                  if(Base.vinteumReed != null) {
                   break;
                  }	
      	}
      	 }
          
          for(int i = 0; i < sunstone.size(); i++){
     		   ItemStack l=sunstone.get(i);
     		   if(l != null) {
     		        // Create a copy from the sulphur stack to keep the original one untouched.
     		        l = l.copy();
     		        l.stackSize = 1;
     		        
     				String mod=Base.modid.toLowerCase()+":";
     				
     		      Base.sunstoneReed=new BlockOreReed("oreGrowableSunstone").setBlockName(mod+"oreGrowableSunstone").setCreativeTab(Base.tabGrowableOre);
     		      AReedMakerClass.addReed(Base.sunstoneReed, 2, 2, "oreGrowableSunstone", l, "gemSunstone");

                 if(Base.sunstoneReed != null) {
                  break;
                 }	
     	}
     	 }
          
          for(int i = 0; i < moonstone.size(); i++){
    		   ItemStack l=moonstone.get(i);
    		   if(l != null) {
    		        // Create a copy from the sulphur stack to keep the original one untouched.
    		        l = l.copy();
    		        l.stackSize = 1;
    		        
    				String mod=Base.modid.toLowerCase()+":";
    				
    		      Base.moonstoneReed=new BlockOreReed("oreGrowableMoonstone").setBlockName(mod+"oreGrowableMoonstone").setCreativeTab(Base.tabGrowableOre);
    		      AReedMakerClass.addReed(Base.moonstoneReed, 2, 2, "oreGrowableMoonstone", l,"gemMoonstone");

                if(Base.moonstoneReed != null) {
                 break;
                }	
    	}
    	 }
          
          for(int i = 0; i < gemBlueTopaz.size(); i++){
   		   ItemStack l=gemBlueTopaz.get(i);
   		   if(l != null) {
   		        // Create a copy from the sulphur stack to keep the original one untouched.
   		        l = l.copy();
   		        l.stackSize = 1;
   		        
   				String mod=Base.modid.toLowerCase()+":";
   				
   		      Base.blueTopazReed=new BlockOreReed("oreGrowableBlueTopaz").setBlockName(mod+"oreGrowableBlueTopaz").setCreativeTab(Base.tabGrowableOre);
   		      AReedMakerClass.addReed(Base.blueTopazReed, 2, 2, "oreGrowableBlueTopaz", l, "gemBlueTopaz");

               if(Base.blueTopazReed != null) {
                break;
               }	
   	}
   	 }
          
          for(int i = 0; i < gemChimerite.size(); i++){
      		   ItemStack l=gemChimerite.get(i);
      		   if(l != null) {
      		        l = l.copy();
      		        l.stackSize = 1;
      		        
      				String mod=Base.modid.toLowerCase()+":";
      				
      		      Base.chimeriteReed=new BlockOreReed("oreGrowableChimerite").setBlockName(mod+"oreGrowableChimerite").setCreativeTab(Base.tabGrowableOre);
      		      AReedMakerClass.addReed(Base.chimeriteReed, 2, 2, "oreGrowableChimerite", l,"gemChimerite");

                  if(Base.chimeriteReed != null) {
                   break;
                  }	
      	}
      	 }
          
          
          try
          {
        	  Class<?> bop = Class.forName("biomesoplenty.api.content.BOPCItems");
        	  if(bop != null){
              	Item gems = (Item)bop.getField("gems").get(null);

              	String mod=Base.modid.toLowerCase()+":";
     				
     		      Base.oreGrowableAmethyst=new BlockOreReed("oreGrowableAmethyst").setBlockName(mod+"oreGrowableAmethyst").setCreativeTab(Base.tabGrowableOre);
     		      AReedMakerClass.addReed(Base.oreGrowableAmethyst, 3, 1, "oreGrowableAmethyst", new ItemStack(gems,1,0), new ItemStack(gems,1,0), Blocks.end_stone);

        	  }
          }
     	
     	  catch(Exception x)
         {
             x.printStackTrace();
     }
        	   
          
         
          for(int i = 0; i < r.size(); i++){
    		   ItemStack l=r.get(i);
    		   if(l != null) {
    		        l = l.copy();
    		        l.stackSize = 1;
    		        
    				String mod=Base.modid.toLowerCase()+":";
    				
    		      Base.oreGrowableRuby=new BlockOreReed("oreGrowableRuby").setBlockName(mod+"oreGrowableRuby").setCreativeTab(Base.tabGrowableOre);
    		      AReedMakerClass.addReed(Base.oreGrowableRuby, 2, 1, "oreGrowableRuby", l, "gemRuby");

                if(Base.oreGrowableRuby != null) {
                 break;
                }	
    	}
    	 }
          for(int i = 0; i < p.size(); i++){
   		   ItemStack l=p.get(i);
   		   if(l != null) {
   		        l = l.copy();
   		        l.stackSize = 1;
   		        
   				String mod=Base.modid.toLowerCase()+":";
   				
   		      Base.oreGrowablePeridot=new BlockOreReed("oreGrowablePeridot").setBlockName(mod+"oreGrowablePeridot").setCreativeTab(Base.tabGrowableOre);
   		      AReedMakerClass.addReed(Base.oreGrowablePeridot, 2, 1, "oreGrowablePeridot", l, "gemPeridot");

               if(Base.oreGrowablePeridot != null) {
                break;
               }	
   	}
   	 }
          
          for(int i = 0; i < t.size(); i++){
      		   ItemStack l=t.get(i);
      		   if(l != null) {
      		        l = l.copy();
      		        l.stackSize = 1;
      		        
      				String mod=Base.modid.toLowerCase()+":";
      				
      		      Base.oreGrowableTopaz=new BlockOreReed("oreGrowableTopaz").setBlockName(mod+"oreGrowableTopaz").setCreativeTab(Base.tabGrowableOre);
      		      AReedMakerClass.addReed(Base.oreGrowableTopaz, 2, 1, "oreGrowableTopaz", l, "gemTopaz");

                  if(Base.oreGrowableTopaz != null) {
                   break;
                  }	
      	}
      	 }
          
          for(int i = 0; i < ta.size(); i++){
     		   ItemStack l=ta.get(i);
     		   if(l != null) {
     		        l = l.copy();
     		        l.stackSize = 1;
     		        
     				String mod=Base.modid.toLowerCase()+":";
     				
     		      Base.oreGrowableTanzanite=new BlockOreReed("oreGrowableTanzanite").setBlockName(mod+"oreGrowableTanzanite").setCreativeTab(Base.tabGrowableOre);
     		      AReedMakerClass.addReed(Base.oreGrowableTanzanite, 2, 1, "oreGrowableTanzanite", l, "gemTanzanite");

                 if(Base.oreGrowableTopaz != null) {
                  break;
                 }	
     	}
     	 }
          
          for(int i = 0; i < m.size(); i++){
     		   ItemStack l=m.get(i);
     		   if(l != null) {
     		        l = l.copy();
     		        l.stackSize = 1;
     		        
     				String mod=Base.modid.toLowerCase()+":";
     				
     		      Base.oreGrowableMalachite=new BlockOreReed("oreGrowableMalachite").setBlockName(mod+"oreGrowableMalachite").setCreativeTab(Base.tabGrowableOre);
     		      AReedMakerClass.addReed(Base.oreGrowableMalachite, 2, 1, "oreGrowableMalachite", l, "gemMalachite");

                 if(Base.oreGrowableMalachite != null) {
                  break;
                 }	
     	}
     	 }
          
          for(int i = 0; i < s.size(); i++){
     		   ItemStack l=s.get(i);
     		   if(l != null) {
     		        l = l.copy();
     		        l.stackSize = 1;
     		        
     				String mod=Base.modid.toLowerCase()+":";
     				
     		      Base.oreGrowableSapphire=new BlockOreReed("oreGrowableSapphire").setBlockName(mod+"oreGrowableSapphire").setCreativeTab(Base.tabGrowableOre);
     		      AReedMakerClass.addReed(Base.oreGrowableSapphire, 2, 1, "oreGrowableSapphire", l, "gemSapphire");

                 if(Base.oreGrowableSapphire != null) {
                  break;
                 }	
     	}
     	 }
          
          for(int i = 0; i < a.size(); i++){
    		   ItemStack l=a.get(i);
    		   if(l != null) {
    		        l = l.copy();
    		        l.stackSize = 1;
    		        
    				String mod=Base.modid.toLowerCase()+":";
    				
    		      Base.oreGrowableAmberBop=new BlockOreReed("oreGrowableAmberBop").setBlockName(mod+"oreGrowableAmberBop").setCreativeTab(Base.tabGrowableOre);
    		      AReedMakerClass.addReed(Base.oreGrowableAmberBop, 2, 1, "oreGrowableAmberBop", l, "gemAmber");

                if(Base.oreGrowableAmberBop != null) {
                 break;
                }	
    	}
    	 }
		 
          for(int i = 0; i < gemApatite.size(); i++){
   		   ItemStack apatite=gemApatite.get(i);
   		   if(apatite != null) {
   		        // Create a copy from the sulphur stack to keep the original one untouched.
   			   apatite = apatite.copy();
   			   apatite.stackSize = 1;
   		        
                       
   				String mod=Base.modid.toLowerCase()+":";
   				
   				Base.apatiteReed=new BlockOreReed("oreGrowableApatite").setBlockName(mod+"oreGrowableApatite").setCreativeTab(Base.tabGrowableOre);
  		      AReedMakerClass.addReed(Base.apatiteReed, 1, 3, "oreGrowableApatite", apatite, apatite);

              if(Base.apatiteReed != null) {
               break;
              }	
  	}
  	 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	}	
	
	
	
	
	
	
	
}
