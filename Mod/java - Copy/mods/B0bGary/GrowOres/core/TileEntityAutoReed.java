package mods.B0bGary.GrowOres.core;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityAutoReed extends TileEntity {
	
	public int stage=0;
	public String type="test";
	
	public int set(int stage){
		this.stage=stage;
		return stage;
	}
	
	public int get(){
		return stage;
	}
	
	
	public String setType(String type){
		this.type=type;
		return type;
	}
	
	public String getType(){
		return type;
	}

	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
	    super.readFromNBT(nbt);
	    this.stage = nbt.getInteger("stage");
	    this.type=nbt.getString("type");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
	    super.writeToNBT(nbt);
	    nbt.setInteger("stage", stage);
	    nbt.setString("type", type);
	}
	
}
