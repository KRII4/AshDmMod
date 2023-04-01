
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.biomespls.entity.VoidSpearEntity;
import net.mcreator.biomespls.entity.ThrowingTorchEntity;
import net.mcreator.biomespls.entity.QuaddyEntity;
import net.mcreator.biomespls.entity.NightOkoAggressiveEntity;
import net.mcreator.biomespls.entity.LavaSlimeEntity;
import net.mcreator.biomespls.entity.GhostEntity;
import net.mcreator.biomespls.entity.AshenSoulEntity;
import net.mcreator.biomespls.entity.AshenSkeletonEntity;
import net.mcreator.biomespls.entity.AshSlimeEntity;
import net.mcreator.biomespls.BiomesplsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BiomesplsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BiomesplsMod.MODID);
	public static final RegistryObject<EntityType<ThrowingTorchEntity>> THROWING_TORCH = register("projectile_throwing_torch",
			EntityType.Builder.<ThrowingTorchEntity>of(ThrowingTorchEntity::new, MobCategory.MISC).setCustomClientFactory(ThrowingTorchEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LavaSlimeEntity>> LAVA_SLIME = register("lava_slime", EntityType.Builder.<LavaSlimeEntity>of(LavaSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(LavaSlimeEntity::new).fireImmune().sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<AshenSoulEntity>> ASHEN_SOUL = register("ashen_soul", EntityType.Builder.<AshenSoulEntity>of(AshenSoulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(AshenSoulEntity::new).fireImmune().sized(0.7999999999999999f, 2f));
	public static final RegistryObject<EntityType<GhostEntity>> GHOST = register("ghost",
			EntityType.Builder.<GhostEntity>of(GhostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhostEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AshenSkeletonEntity>> ASHEN_SKELETON = register("ashen_skeleton", EntityType.Builder.<AshenSkeletonEntity>of(AshenSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AshenSkeletonEntity::new).fireImmune().sized(0.7f, 2f));
	public static final RegistryObject<EntityType<QuaddyEntity>> QUADDY = register("quaddy",
			EntityType.Builder.<QuaddyEntity>of(QuaddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuaddyEntity::new)

					.sized(0.8f, 0.7000000000000001f));
	public static final RegistryObject<EntityType<NightOkoAggressiveEntity>> NIGHT_OKO_AGGRESSIVE = register("night_oko_aggressive", EntityType.Builder.<NightOkoAggressiveEntity>of(NightOkoAggressiveEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightOkoAggressiveEntity::new).fireImmune().sized(2f, 3f));
	public static final RegistryObject<EntityType<AshSlimeEntity>> ASH_SLIME = register("ash_slime",
			EntityType.Builder.<AshSlimeEntity>of(AshSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AshSlimeEntity::new).fireImmune().sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<VoidSpearEntity>> VOID_SPEAR = register("projectile_void_spear",
			EntityType.Builder.<VoidSpearEntity>of(VoidSpearEntity::new, MobCategory.MISC).setCustomClientFactory(VoidSpearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LavaSlimeEntity.init();
			AshenSoulEntity.init();
			GhostEntity.init();
			AshenSkeletonEntity.init();
			QuaddyEntity.init();
			NightOkoAggressiveEntity.init();
			AshSlimeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LAVA_SLIME.get(), LavaSlimeEntity.createAttributes().build());
		event.put(ASHEN_SOUL.get(), AshenSoulEntity.createAttributes().build());
		event.put(GHOST.get(), GhostEntity.createAttributes().build());
		event.put(ASHEN_SKELETON.get(), AshenSkeletonEntity.createAttributes().build());
		event.put(QUADDY.get(), QuaddyEntity.createAttributes().build());
		event.put(NIGHT_OKO_AGGRESSIVE.get(), NightOkoAggressiveEntity.createAttributes().build());
		event.put(ASH_SLIME.get(), AshSlimeEntity.createAttributes().build());
	}
}
