
package net.mcreator.biomespls.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.biomespls.init.BiomesplsModItems;
import net.mcreator.biomespls.init.BiomesplsModFluids;
import net.mcreator.biomespls.init.BiomesplsModFluidTypes;
import net.mcreator.biomespls.init.BiomesplsModBlocks;

public abstract class AshwaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> BiomesplsModFluidTypes.ASHWATER_TYPE.get(), () -> BiomesplsModFluids.ASHWATER.get(), () -> BiomesplsModFluids.FLOWING_ASHWATER.get())
			.explosionResistance(100f).tickRate(3).bucket(() -> BiomesplsModItems.ASHWATER_BUCKET.get()).block(() -> (LiquidBlock) BiomesplsModBlocks.ASHWATER.get());

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
