
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scorcheddimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.scorcheddimension.potion.ElemDeathMobEffect;
import net.mcreator.scorcheddimension.ScorcheddimensionMod;

public class ScorcheddimensionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ScorcheddimensionMod.MODID);
	public static final RegistryObject<MobEffect> ELEM_DEATH = REGISTRY.register("elem_death", () -> new ElemDeathMobEffect());
}
