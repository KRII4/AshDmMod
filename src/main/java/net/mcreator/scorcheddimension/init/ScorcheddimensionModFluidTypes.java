
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scorcheddimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.scorcheddimension.fluid.types.AshwaterFluidType;
import net.mcreator.scorcheddimension.ScorcheddimensionMod;

public class ScorcheddimensionModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ScorcheddimensionMod.MODID);
	public static final RegistryObject<FluidType> ASHWATER_TYPE = REGISTRY.register("ashwater", () -> new AshwaterFluidType());
}
