package io.github.sleepy_evelyn.block;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class PumpkinPeteBlock extends Block {
	public PumpkinPeteBlock() {
		super(QuiltBlockSettings.copyOf(Blocks.PUMPKIN));
	}

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.cuboid(0.25, 0, 0.25, 0.75, 0.5, 0.75);
	}
}
