
package net.mcreator.scorcheddimension.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.scorcheddimension.init.ScorcheddimensionModItems;
import net.mcreator.scorcheddimension.init.ScorcheddimensionModFluids;
import net.mcreator.scorcheddimension.init.ScorcheddimensionModFluidTypes;
import net.mcreator.scorcheddimension.init.ScorcheddimensionModBlocks;

public abstract class AshwaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ScorcheddimensionModFluidTypes.ASHWATER_TYPE.get(), () -> ScorcheddimensionModFluids.ASHWATER.get(),
			() -> ScorcheddimensionModFluids.FLOWING_ASHWATER.get()).explosionResistance(100f).tickRate(3).bucket(() -> ScorcheddimensionModItems.ASHWATER_BUCKET.get()).block(() -> (LiquidBlock) ScorcheddimensionModBlocks.ASHWATER.get());

	private AshwaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AshwaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AshwaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
