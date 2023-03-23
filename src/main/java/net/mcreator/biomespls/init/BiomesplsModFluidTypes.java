
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.biomespls.fluid.types.AshwaterFluidType;
import net.mcreator.biomespls.BiomesplsMod;

public class BiomesplsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, BiomesplsMod.MODID);
	public static final RegistryObject<FluidType> ASHWATER_TYPE = REGISTRY.register("ashwater", () -> new AshwaterFluidType());
}