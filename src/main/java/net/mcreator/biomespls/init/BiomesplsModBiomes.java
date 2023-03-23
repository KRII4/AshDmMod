
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.biomespls.world.biome.RockyHillsBiome;
import net.mcreator.biomespls.world.biome.BiomeScorchedBiome;
import net.mcreator.biomespls.BiomesplsMod;

public class BiomesplsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, BiomesplsMod.MODID);
	public static final RegistryObject<Biome> BIOME_SCORCHED = REGISTRY.register("biome_scorched", BiomeScorchedBiome::createBiome);
	public static final RegistryObject<Biome> ROCKY_HILLS = REGISTRY.register("rocky_hills", RockyHillsBiome::createBiome);
}
