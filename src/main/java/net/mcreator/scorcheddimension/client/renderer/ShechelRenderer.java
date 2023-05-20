
package net.mcreator.scorcheddimension.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.scorcheddimension.entity.model.ShechelModel;
import net.mcreator.scorcheddimension.entity.layer.ShechelLayer;
import net.mcreator.scorcheddimension.entity.ShechelEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShechelRenderer extends GeoEntityRenderer<ShechelEntity> {
	public ShechelRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ShechelModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new ShechelLayer(this));
	}

	@Override
	public RenderType getRenderType(ShechelEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(ShechelEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
