package net.mcreator.biomespls.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class ThrowingTorchKoghdaSnariadPriziemliaietsiaNaBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos(x, y - 1, z)).isFaceSturdy(world, new BlockPos(x, y - 1, z), Direction.UP)) {
			world.setBlock(new BlockPos(x, y, z), Blocks.TORCH.defaultBlockState(), 3);
		} else {
			if (world.getBlockState(new BlockPos(x + 1, y, z)).isFaceSturdy(world, new BlockPos(x + 1, y, z), Direction.WEST)) {
				world.setBlock(new BlockPos(x, y, z), Blocks.WALL_TORCH.defaultBlockState(), 3);
				{
					Direction _dir = Direction.WEST;
					BlockPos _pos = new BlockPos(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			} else {
				if (world.getBlockState(new BlockPos(x - 1, y, z)).isFaceSturdy(world, new BlockPos(x - 1, y, z), Direction.EAST)) {
					world.setBlock(new BlockPos(x, y, z), Blocks.WALL_TORCH.defaultBlockState(), 3);
					{
						Direction _dir = Direction.EAST;
						BlockPos _pos = new BlockPos(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
							world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
						} else {
							_property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
								world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
						}
					}
				} else {
					if (world.getBlockState(new BlockPos(x, y, z + 1)).isFaceSturdy(world, new BlockPos(x, y, z + 1), Direction.NORTH)) {
						world.setBlock(new BlockPos(x, y, z), Blocks.WALL_TORCH.defaultBlockState(), 3);
						{
							Direction _dir = Direction.NORTH;
							BlockPos _pos = new BlockPos(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					} else {
						if (world.getBlockState(new BlockPos(x, y, z - 1)).isFaceSturdy(world, new BlockPos(x, y, z - 1), Direction.SOUTH)) {
							world.setBlock(new BlockPos(x, y, z), Blocks.WALL_TORCH.defaultBlockState(), 3);
							{
								Direction _dir = Direction.SOUTH;
								BlockPos _pos = new BlockPos(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
									world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
								} else {
									_property = _bs.getBlock().getStateDefinition().getProperty("axis");
									if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
										world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
