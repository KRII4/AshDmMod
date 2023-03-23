package net.mcreator.biomespls.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.biomespls.init.BiomesplsModMobEffects;

public class ElementItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(BiomesplsModMobEffects.ELEM_DEATH.get(), 200, 1));
	}
}
