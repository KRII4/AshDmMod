package net.mcreator.biomespls.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.biomespls.init.BiomesplsModParticleTypes;

public class GhostOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.2) {
			world.addParticle((SimpleParticleType) (BiomesplsModParticleTypes.GHOSTPARTICLES.get()), x, (y + 1), z, 0, 0, 0);
		}
	}
}
