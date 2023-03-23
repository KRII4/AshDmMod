
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.biomespls.client.renderer.QuaddyRenderer;
import net.mcreator.biomespls.client.renderer.NightOkoAggressiveRenderer;
import net.mcreator.biomespls.client.renderer.LavaSlimeRenderer;
import net.mcreator.biomespls.client.renderer.GhostRenderer;
import net.mcreator.biomespls.client.renderer.AshenSoulRenderer;
import net.mcreator.biomespls.client.renderer.AshenSlimeRenderer;
import net.mcreator.biomespls.client.renderer.AshenSkeletonRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BiomesplsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BiomesplsModEntities.THROWING_TORCH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BiomesplsModEntities.LAVA_SLIME.get(), LavaSlimeRenderer::new);
		event.registerEntityRenderer(BiomesplsModEntities.ASHEN_SLIME.get(), AshenSlimeRenderer::new);
		event.registerEntityRenderer(BiomesplsModEntities.ASHEN_SOUL.get(), AshenSoulRenderer::new);
		event.registerEntityRenderer(BiomesplsModEntities.GHOST.get(), GhostRenderer::new);
		event.registerEntityRenderer(BiomesplsModEntities.ASHEN_SKELETON.get(), AshenSkeletonRenderer::new);
		event.registerEntityRenderer(BiomesplsModEntities.QUADDY.get(), QuaddyRenderer::new);
		event.registerEntityRenderer(BiomesplsModEntities.NIGHT_OKO_AGGRESSIVE.get(), NightOkoAggressiveRenderer::new);
	}
}
