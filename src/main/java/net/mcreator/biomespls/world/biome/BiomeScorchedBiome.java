
package net.mcreator.biomespls.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.biomespls.init.BiomesplsModEntities;

public class BiomeScorchedBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-15395563).waterColor(-14211289).waterFogColor(-13224394).skyColor(-15395563).foliageColorOverride(-13682652).grassColorOverride(-13088986)
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("biomespls:ashambient")), 12000, 24000, true)).ambientParticle(new AmbientParticleSettings(ParticleTypes.SMOKE, 0.02f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(BiomesplsModEntities.GHOST.get(), 17, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(BiomesplsModEntities.ASHEN_SKELETON.get(), 17, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(BiomesplsModEntities.LAVA_SLIME.get(), 17, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(BiomesplsModEntities.ASHEN_SOUL.get(), 15, 1, 1));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).temperature(1.4f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
