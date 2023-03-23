
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.biomespls.BiomesplsMod;

public class BiomesplsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BiomesplsMod.MODID);
	public static final RegistryObject<SoundEvent> ASHAMBIENT = REGISTRY.register("ashambient", () -> new SoundEvent(new ResourceLocation("biomespls", "ashambient")));
	public static final RegistryObject<SoundEvent> OKONIGHTHURT = REGISTRY.register("okonighthurt", () -> new SoundEvent(new ResourceLocation("biomespls", "okonighthurt")));
	public static final RegistryObject<SoundEvent> OKONIGHTIDLE = REGISTRY.register("okonightidle", () -> new SoundEvent(new ResourceLocation("biomespls", "okonightidle")));
	public static final RegistryObject<SoundEvent> SLIMEJUMP4 = REGISTRY.register("slimejump4", () -> new SoundEvent(new ResourceLocation("biomespls", "slimejump4")));
	public static final RegistryObject<SoundEvent> OKONIGHTDEATH = REGISTRY.register("okonightdeath", () -> new SoundEvent(new ResourceLocation("biomespls", "okonightdeath")));
	public static final RegistryObject<SoundEvent> OKONIGHTSTEPS = REGISTRY.register("okonightsteps", () -> new SoundEvent(new ResourceLocation("biomespls", "okonightsteps")));
	public static final RegistryObject<SoundEvent> OKONIGHTATTACK = REGISTRY.register("okonightattack", () -> new SoundEvent(new ResourceLocation("biomespls", "okonightattack")));
}
