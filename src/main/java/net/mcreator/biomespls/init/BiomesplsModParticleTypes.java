
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.biomespls.BiomesplsMod;

public class BiomesplsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BiomesplsMod.MODID);
	public static final RegistryObject<SimpleParticleType> GHOSTPARTICLES = REGISTRY.register("ghostparticles", () -> new SimpleParticleType(false));
}
