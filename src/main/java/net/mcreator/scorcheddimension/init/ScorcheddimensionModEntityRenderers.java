
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scorcheddimension.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.scorcheddimension.client.renderer.ShechelRenderer;
import net.mcreator.scorcheddimension.client.renderer.QuaddyRenderer;
import net.mcreator.scorcheddimension.client.renderer.NightOkoAggressiveRenderer;
import net.mcreator.scorcheddimension.client.renderer.LavaSlimeRenderer;
import net.mcreator.scorcheddimension.client.renderer.GhostRenderer;
import net.mcreator.scorcheddimension.client.renderer.GeckoashRenderer;
import net.mcreator.scorcheddimension.client.renderer.AshenSoulRenderer;
import net.mcreator.scorcheddimension.client.renderer.AshenSkeletonRenderer;
import net.mcreator.scorcheddimension.client.renderer.AshSlimeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ScorcheddimensionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ScorcheddimensionModEntities.LAVA_SLIME.get(), LavaSlimeRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.ASHEN_SOUL.get(), AshenSoulRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.GHOST.get(), GhostRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.ASHEN_SKELETON.get(), AshenSkeletonRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.QUADDY.get(), QuaddyRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.NIGHT_OKO_AGGRESSIVE.get(), NightOkoAggressiveRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.ASH_SLIME.get(), AshSlimeRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.VOID_SPEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.THROWING_TORCH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.SHECHEL.get(), ShechelRenderer::new);
		event.registerEntityRenderer(ScorcheddimensionModEntities.GECKOASH.get(), GeckoashRenderer::new);
	}
}
