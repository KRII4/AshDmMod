
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.biomespls.item.VoidSpearItem;
import net.mcreator.biomespls.item.ThrowingTorchItem;
import net.mcreator.biomespls.item.ScorchedDimensionItem;
import net.mcreator.biomespls.item.PilentiumItem;
import net.mcreator.biomespls.item.LavaShardItem;
import net.mcreator.biomespls.item.ElementalShardItem;
import net.mcreator.biomespls.item.ElementalPicaxeItem;
import net.mcreator.biomespls.item.ElementItem;
import net.mcreator.biomespls.item.ClotoflavaItem;
import net.mcreator.biomespls.item.BoneStickItem;
import net.mcreator.biomespls.item.AshwaterItem;
import net.mcreator.biomespls.item.AshboneItem;
import net.mcreator.biomespls.item.AshSoulHeartItem;
import net.mcreator.biomespls.BiomesplsMod;

public class BiomesplsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BiomesplsMod.MODID);
	public static final RegistryObject<Item> ASHGRASS = block(BiomesplsModBlocks.ASHGRASS, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> SCORCHEDEARTH = block(BiomesplsModBlocks.SCORCHEDEARTH, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_ROCK = block(BiomesplsModBlocks.ASH_ROCK, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> SCORCHED_DIMENSION = REGISTRY.register("scorched_dimension", () -> new ScorchedDimensionItem());
	public static final RegistryObject<Item> ASHWATER_BUCKET = REGISTRY.register("ashwater_bucket", () -> new AshwaterItem());
	public static final RegistryObject<Item> SCORCHED_WOOD = block(BiomesplsModBlocks.SCORCHED_WOOD, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ELEMENTAL_ORE_BLOCK = block(BiomesplsModBlocks.ELEMENTAL_ORE_BLOCK, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_COAL = block(BiomesplsModBlocks.ASH_COAL, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ELEMENT = REGISTRY.register("element", () -> new ElementItem());
	public static final RegistryObject<Item> BROKEN_ASH_STONE = block(BiomesplsModBlocks.BROKEN_ASH_STONE, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ELEMENTAL_SHARD = REGISTRY.register("elemental_shard", () -> new ElementalShardItem());
	public static final RegistryObject<Item> VERY_BREAKED_ASH_STONE = block(BiomesplsModBlocks.VERY_BREAKED_ASH_STONE, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> THROWING_TORCH = REGISTRY.register("throwing_torch", () -> new ThrowingTorchItem());
	public static final RegistryObject<Item> PILENTIUM_ORE = block(BiomesplsModBlocks.PILENTIUM_ORE, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> PILENTIUM = REGISTRY.register("pilentium", () -> new PilentiumItem());
	public static final RegistryObject<Item> SCORCH_WOOD_NO_FLAME = block(BiomesplsModBlocks.SCORCH_WOOD_NO_FLAME, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_SOUL_HEART = REGISTRY.register("ash_soul_heart", () -> new AshSoulHeartItem());
	public static final RegistryObject<Item> ROCKY_ROCK = block(BiomesplsModBlocks.ROCKY_ROCK, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> LAVA_SLIME_SPAWN_EGG = REGISTRY.register("lava_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(BiomesplsModEntities.LAVA_SLIME, -34812, -4509183, new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME)));
	public static final RegistryObject<Item> ASHEN_SOUL_SPAWN_EGG = REGISTRY.register("ashen_soul_spawn_egg",
			() -> new ForgeSpawnEggItem(BiomesplsModEntities.ASHEN_SOUL, -15329770, -3307776, new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME)));
	public static final RegistryObject<Item> GHOST_SPAWN_EGG = REGISTRY.register("ghost_spawn_egg", () -> new ForgeSpawnEggItem(BiomesplsModEntities.GHOST, -16777216, -65536, new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME)));
	public static final RegistryObject<Item> ASHEN_SKELETON_SPAWN_EGG = REGISTRY.register("ashen_skeleton_spawn_egg",
			() -> new ForgeSpawnEggItem(BiomesplsModEntities.ASHEN_SKELETON, -13553359, -611064, new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME)));
	public static final RegistryObject<Item> QUADDY_SPAWN_EGG = REGISTRY.register("quaddy_spawn_egg", () -> new ForgeSpawnEggItem(BiomesplsModEntities.QUADDY, -12040120, -1620992, new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME)));
	public static final RegistryObject<Item> ASHBONE = REGISTRY.register("ashbone", () -> new AshboneItem());
	public static final RegistryObject<Item> CLOTOFLAVA = REGISTRY.register("clotoflava", () -> new ClotoflavaItem());
	public static final RegistryObject<Item> ASH_WOOD_PLANKS = block(BiomesplsModBlocks.ASH_WOOD_PLANKS, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> NIGHT_OKO_AGGRESSIVE_SPAWN_EGG = REGISTRY.register("night_oko_aggressive_spawn_egg",
			() -> new ForgeSpawnEggItem(BiomesplsModEntities.NIGHT_OKO_AGGRESSIVE, -16777216, -52736, new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME)));
	public static final RegistryObject<Item> ASHBONEBLOCK = block(BiomesplsModBlocks.ASHBONEBLOCK, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> BONE_STICK = REGISTRY.register("bone_stick", () -> new BoneStickItem());
	public static final RegistryObject<Item> ASHEN_BRICKS = block(BiomesplsModBlocks.ASHEN_BRICKS, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> DAMAGED_ASHEN_BRICKS = block(BiomesplsModBlocks.DAMAGED_ASHEN_BRICKS, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ZAROS_ASHEN_STONE = block(BiomesplsModBlocks.ZAROS_ASHEN_STONE, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_1 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_1, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_2 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_2, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_3 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_3, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_4 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_4, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_5 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_5, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_6 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_6, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_CRAFT_BLOCK_11 = block(BiomesplsModBlocks.ASH_CRAFT_BLOCK_11, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_CRAFT_BLOCK_12 = block(BiomesplsModBlocks.ASH_CRAFT_BLOCK_12, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_21 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_21, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_22 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_22, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_23 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_23, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_HISTORY_BLOCK_24 = block(BiomesplsModBlocks.ASH_HISTORY_BLOCK_24, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_CRAFTB_BLOCK_21 = block(BiomesplsModBlocks.ASH_CRAFTB_BLOCK_21, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_CRAFTB_BLOCK_22 = block(BiomesplsModBlocks.ASH_CRAFTB_BLOCK_22, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_CRAFTB_BLOCK_23 = block(BiomesplsModBlocks.ASH_CRAFTB_BLOCK_23, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_CRAFTB_BLOCK_24 = block(BiomesplsModBlocks.ASH_CRAFTB_BLOCK_24, BiomesplsModTabs.TAB_SCORCHED_BIOME);
	public static final RegistryObject<Item> ASH_SLIME_SPAWN_EGG = REGISTRY.register("ash_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(BiomesplsModEntities.ASH_SLIME, -14803426, -1094912, new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME)));
	public static final RegistryObject<Item> LAVA_SHARD = REGISTRY.register("lava_shard", () -> new LavaShardItem());
	public static final RegistryObject<Item> ELEMENTAL_PICAXE = REGISTRY.register("elemental_picaxe", () -> new ElementalPicaxeItem());
	public static final RegistryObject<Item> VOID_SPEAR = REGISTRY.register("void_spear", () -> new VoidSpearItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
