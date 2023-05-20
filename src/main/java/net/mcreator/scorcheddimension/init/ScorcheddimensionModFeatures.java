
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scorcheddimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.scorcheddimension.world.features.ores.VoidOreBlockFeature;
import net.mcreator.scorcheddimension.world.features.ores.VeryBreakedAshStoneFeature;
import net.mcreator.scorcheddimension.world.features.ores.ScorchedearthFeature;
import net.mcreator.scorcheddimension.world.features.ores.ScorchWoodNoFlameFeature;
import net.mcreator.scorcheddimension.world.features.ores.BrokenAshStoneFeature;
import net.mcreator.scorcheddimension.world.features.ores.AshCoalFeature;
import net.mcreator.scorcheddimension.world.features.Scws9Feature;
import net.mcreator.scorcheddimension.world.features.Scws7Feature;
import net.mcreator.scorcheddimension.world.features.Scws6Feature;
import net.mcreator.scorcheddimension.world.features.Scws5Feature;
import net.mcreator.scorcheddimension.world.features.Scws4Feature;
import net.mcreator.scorcheddimension.world.features.Scws3Feature;
import net.mcreator.scorcheddimension.world.features.Scws2Feature;
import net.mcreator.scorcheddimension.world.features.Scws1Feature;
import net.mcreator.scorcheddimension.world.features.Scws19Feature;
import net.mcreator.scorcheddimension.world.features.Scws18Feature;
import net.mcreator.scorcheddimension.world.features.Scws17Feature;
import net.mcreator.scorcheddimension.world.features.Scws16Feature;
import net.mcreator.scorcheddimension.world.features.Scws14Feature;
import net.mcreator.scorcheddimension.world.features.Scws13Feature;
import net.mcreator.scorcheddimension.world.features.Scws12Feature;
import net.mcreator.scorcheddimension.world.features.Scws11Feature;
import net.mcreator.scorcheddimension.world.features.Scws10Feature;
import net.mcreator.scorcheddimension.world.features.ScrHouse9Feature;
import net.mcreator.scorcheddimension.world.features.ScrHouse8Feature;
import net.mcreator.scorcheddimension.world.features.ScrHouse7Feature;
import net.mcreator.scorcheddimension.world.features.ScrHouse6Feature;
import net.mcreator.scorcheddimension.world.features.ScrHouse5Feature;
import net.mcreator.scorcheddimension.world.features.ScrHouse4Feature;
import net.mcreator.scorcheddimension.world.features.ScrHouse3Feature;
import net.mcreator.scorcheddimension.world.features.ScrHouse2Feature;
import net.mcreator.scorcheddimension.world.features.ScorchedHouse1Feature;
import net.mcreator.scorcheddimension.ScorcheddimensionMod;

@Mod.EventBusSubscriber
public class ScorcheddimensionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ScorcheddimensionMod.MODID);
	public static final RegistryObject<Feature<?>> SCORCHEDEARTH = REGISTRY.register("scorchedearth", ScorchedearthFeature::feature);
	public static final RegistryObject<Feature<?>> BROKEN_ASH_STONE = REGISTRY.register("broken_ash_stone", BrokenAshStoneFeature::feature);
	public static final RegistryObject<Feature<?>> VERY_BREAKED_ASH_STONE = REGISTRY.register("very_breaked_ash_stone", VeryBreakedAshStoneFeature::feature);
	public static final RegistryObject<Feature<?>> VOID_ORE_BLOCK = REGISTRY.register("void_ore_block", VoidOreBlockFeature::feature);
	public static final RegistryObject<Feature<?>> SCORCH_WOOD_NO_FLAME = REGISTRY.register("scorch_wood_no_flame", ScorchWoodNoFlameFeature::feature);
	public static final RegistryObject<Feature<?>> ASH_COAL = REGISTRY.register("ash_coal", AshCoalFeature::feature);
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
	public static final RegistryObject<Feature<?>> SCORCHED_HOUSE_1 = REGISTRY.register("scorched_house_1", ScorchedHouse1Feature::feature);
	public static final RegistryObject<Feature<?>> SCR_HOUSE_2 = REGISTRY.register("scr_house_2", ScrHouse2Feature::feature);
	public static final RegistryObject<Feature<?>> SCR_HOUSE_3 = REGISTRY.register("scr_house_3", ScrHouse3Feature::feature);
	public static final RegistryObject<Feature<?>> SCR_HOUSE_4 = REGISTRY.register("scr_house_4", ScrHouse4Feature::feature);
	public static final RegistryObject<Feature<?>> SCR_HOUSE_5 = REGISTRY.register("scr_house_5", ScrHouse5Feature::feature);
	public static final RegistryObject<Feature<?>> SCR_HOUSE_6 = REGISTRY.register("scr_house_6", ScrHouse6Feature::feature);
	public static final RegistryObject<Feature<?>> SCR_HOUSE_7 = REGISTRY.register("scr_house_7", ScrHouse7Feature::feature);
	public static final RegistryObject<Feature<?>> SCR_HOUSE_8 = REGISTRY.register("scr_house_8", ScrHouse8Feature::feature);
	public static final RegistryObject<Feature<?>> SCR_HOUSE_9 = REGISTRY.register("scr_house_9", ScrHouse9Feature::feature);
}
