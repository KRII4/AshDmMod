
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.biomespls.fluid.AshwaterFluid;
import net.mcreator.biomespls.BiomesplsMod;

public class BiomesplsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, BiomesplsMod.MODID);
	public static final RegistryObject<FlowingFluid> ASHWATER = REGISTRY.register("ashwater", () -> new AshwaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ASHWATER = REGISTRY.register("flowing_ashwater", () -> new AshwaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ASHWATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ASHWATER.get(), RenderType.translucent());
		}
	}
}
