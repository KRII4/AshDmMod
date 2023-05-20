
package net.mcreator.scorcheddimension.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.scorcheddimension.entity.model.GeckoashModel;
import net.mcreator.scorcheddimension.entity.GeckoashEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GeckoashRenderer extends GeoEntityRenderer<GeckoashEntity> {
	public GeckoashRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GeckoashModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(GeckoashEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(GeckoashEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
