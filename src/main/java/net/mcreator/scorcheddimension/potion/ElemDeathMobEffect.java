
package net.mcreator.scorcheddimension.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.scorcheddimension.procedures.ElemDeathOnEffectActiveTickProcedure;

public class ElemDeathMobEffect extends MobEffect {
	public ElemDeathMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092391);
	}

	@Override
	public String getDescriptionId() {
		return "effect.scorcheddimension.elem_death";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ElemDeathOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
