package mods.B0bGary.GrowOres;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityReed extends TileEntity {
	
	public int stage=0;
	
	public int set(int stage){
		this.stage=stage;
		return stage;
	}
	
	public int get(){
		return stage;
	}

	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
	    super.readFromNBT(nbt);
	    this.stage = nbt.getInteger("stage");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
	    super.writeToNBT(nbt);
	    nbt.setInteger("stage", stage);
	}
	
}
