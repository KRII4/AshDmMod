
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scorcheddimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.scorcheddimension.ScorcheddimensionMod;

public class ScorcheddimensionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ScorcheddimensionMod.MODID);
	public static final RegistryObject<SoundEvent> ASHAMBIENT = REGISTRY.register("ashambient", () -> new SoundEvent(new ResourceLocation("scorcheddimension", "ashambient")));
	public static final RegistryObject<SoundEvent> OKONIGHTHURT = REGISTRY.register("okonighthurt", () -> new SoundEvent(new ResourceLocation("scorcheddimension", "okonighthurt")));
	public static final RegistryObject<SoundEvent> OKONIGHTIDLE = REGISTRY.register("okonightidle", () -> new SoundEvent(new ResourceLocation("scorcheddimension", "okonightidle")));
	public static final RegistryObject<SoundEvent> SLIMEJUMP4 = REGISTRY.register("slimejump4", () -> new SoundEvent(new ResourceLocation("scorcheddimension", "slimejump4")));
	public static final RegistryObject<SoundEvent> OKONIGHTDEATH = REGISTRY.register("okonightdeath", () -> new SoundEvent(new ResourceLocation("scorcheddimension", "okonightdeath")));
	public static final RegistryObject<SoundEvent> OKONIGHTSTEPS = REGISTRY.register("okonightsteps", () -> new SoundEvent(new ResourceLocation("scorcheddimension", "okonightsteps")));
	public static final RegistryObject<SoundEvent> OKONIGHTATTACK = REGISTRY.register("okonightattack", () -> new SoundEvent(new ResourceLocation("scorcheddimension", "okonightattack")));
}
