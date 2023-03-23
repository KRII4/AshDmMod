
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.biomespls.world.features.ores.VeryBreakedAshStoneFeature;
import net.mcreator.biomespls.world.features.ores.ScorchedearthFeature;
import net.mcreator.biomespls.world.features.ores.ScorchWoodNoFlameFeature;
import net.mcreator.biomespls.world.features.ores.ElementalOreBlockFeature;
import net.mcreator.biomespls.world.features.ores.BrokenAshStoneFeature;
import net.mcreator.biomespls.world.features.ores.AshCoalFeature;
import net.mcreator.biomespls.world.features.Scws9Feature;
import net.mcreator.biomespls.world.features.Scws7Feature;
import net.mcreator.biomespls.world.features.Scws6Feature;
import net.mcreator.biomespls.world.features.Scws5Feature;
import net.mcreator.biomespls.world.features.Scws4Feature;
import net.mcreator.biomespls.world.features.Scws3Feature;
import net.mcreator.biomespls.world.features.Scws2Feature;
import net.mcreator.biomespls.world.features.Scws1Feature;
import net.mcreator.biomespls.world.features.Scws19Feature;
import net.mcreator.biomespls.world.features.Scws18Feature;
import net.mcreator.biomespls.world.features.Scws17Feature;
import net.mcreator.biomespls.world.features.Scws16Feature;
import net.mcreator.biomespls.world.features.Scws14Feature;
import net.mcreator.biomespls.world.features.Scws13Feature;
import net.mcreator.biomespls.world.features.Scws12Feature;
import net.mcreator.biomespls.world.features.Scws11Feature;
import net.mcreator.biomespls.world.features.Scws10Feature;
import net.mcreator.biomespls.BiomesplsMod;

@Mod.EventBusSubscriber
public class BiomesplsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BiomesplsMod.MODID);
	public static final RegistryObject<Feature<?>> SCORCHEDEARTH = REGISTRY.register("scorchedearth", ScorchedearthFeature::feature);
	public static final RegistryObject<Feature<?>> ELEMENTAL_ORE_BLOCK = REGISTRY.register("elemental_ore_block", ElementalOreBlockFeature::feature);
	public static final RegistryObject<Feature<?>> ASH_COAL = REGISTRY.register("ash_coal", AshCoalFeature::feature);
	public static final RegistryObject<Feature<?>> BROKEN_ASH_STONE = REGISTRY.register("broken_ash_stone", BrokenAshStoneFeature::feature);
	public static final RegistryObject<Feature<?>> VERY_BREAKED_ASH_STONE = REGISTRY.register("very_breaked_ash_stone", VeryBreakedAshStoneFeature::feature);
	public static final RegistryObject<Feature<?>> SCWS_1 = REGISTRY.register("scws_1", Scws1Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_2 = REGISTRY.register("scws_2", Scws2Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_3 = REGISTRY.register("scws_3", Scws3Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_4 = REGISTRY.register("scws_4", Scws4Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_5 = REGISTRY.register("scws_5", Scws5Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_6 = REGISTRY.register("scws_6", Scws6Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_7 = REGISTRY.register("scws_7", Scws7Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_9 = REGISTRY.register("scws_9", Scws9Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_10 = REGISTRY.register("scws_10", Scws10Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_11 = REGISTRY.register("scws_11", Scws11Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_12 = REGISTRY.register("scws_12", Scws12Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_13 = REGISTRY.register("scws_13", Scws13Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_14 = REGISTRY.register("scws_14", Scws14Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_16 = REGISTRY.register("scws_16", Scws16Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_17 = REGISTRY.register("scws_17", Scws17Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_18 = REGISTRY.register("scws_18", Scws18Feature::feature);
	public static final RegistryObject<Feature<?>> SCWS_19 = REGISTRY.register("scws_19", Scws19Feature::feature);
	public static final RegistryObject<Feature<?>> SCORCH_WOOD_NO_FLAME = REGISTRY.register("scorch_wood_no_flame", ScorchWoodNoFlameFeature::feature);
}
