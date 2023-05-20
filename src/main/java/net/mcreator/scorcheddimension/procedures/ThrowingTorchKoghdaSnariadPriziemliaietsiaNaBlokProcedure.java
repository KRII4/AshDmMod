package net.mcreator.scorcheddimension.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.scorcheddimension.init.ScorcheddimensionModItems;

public class ThrowingTorchKoghdaSnariadPriziemliaietsiaNaBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.VOID_AIR) {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.TORCH.defaultBlockState(), 3);
		} else {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.CAVE_AIR
					|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.VOID_AIR) {
				world.setBlock(new BlockPos(x + 1, y, z), Blocks.WALL_TORCH.defaultBlockState(), 3);
				{
					Direction _dir = Direction.EAST;
					BlockPos _pos = new BlockPos(x + 1, y, z);
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
				if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.CAVE_AIR
						|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.VOID_AIR) {
					world.setBlock(new BlockPos(x - 1, y, z), Blocks.WALL_TORCH.defaultBlockState(), 3);
					{
						Direction _dir = Direction.WEST;
						BlockPos _pos = new BlockPos(x - 1, y, z);
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
					if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.VOID_AIR) {
						world.setBlock(new BlockPos(x, y, z + 1), Blocks.WALL_TORCH.defaultBlockState(), 3);
						{
							Direction _dir = Direction.SOUTH;
							BlockPos _pos = new BlockPos(x, y, z + 1);
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
						if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.CAVE_AIR
								|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.VOID_AIR) {
							world.setBlock(new BlockPos(x, y, z - 1), Blocks.WALL_TORCH.defaultBlockState(), 3);
							{
								Direction _dir = Direction.NORTH;
								BlockPos _pos = new BlockPos(x, y, z - 1);
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
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ScorcheddimensionModItems.THROWING_TORCH.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		}
	}
}
