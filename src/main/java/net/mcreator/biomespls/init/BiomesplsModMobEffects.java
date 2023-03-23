
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.biomespls.potion.ElemDeathMobEffect;
import net.mcreator.biomespls.BiomesplsMod;

public class BiomesplsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BiomesplsMod.MODID);
	public static final RegistryObject<MobEffect> ELEM_DEATH = REGISTRY.register("elem_death", () -> new ElemDeathMobEffect());
}
