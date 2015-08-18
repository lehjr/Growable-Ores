package mods.B0bGary.GrowOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class TabGrowOre extends CreativeTabs
{
        public TabGrowOre(String par2Str)
        {
                super( par2Str);
        }

                

   
        public String getTranslatedTabLabel()
        {
         return "Growable Ores";
        }
        
		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return Item.getItemFromBlock(Base.ironReed);
			
		}
}