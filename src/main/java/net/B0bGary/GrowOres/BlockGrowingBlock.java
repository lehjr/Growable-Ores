package mods.B0bGary.GrowOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGrowingBlock extends Block{

	public BlockGrowingBlock(Material par2Material) {
		super(par2Material);
		this.setStepSound(Block.soundTypeGravel);
		setBlockTextureName(Base.modid+":"+"growingBlock");

	}

}
