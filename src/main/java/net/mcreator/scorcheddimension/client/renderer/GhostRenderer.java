
package net.mcreator.scorcheddimension.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.scorcheddimension.entity.model.GhostModel;
import net.mcreator.scorcheddimension.entity.layer.GhostLayer;
import net.mcreator.scorcheddimension.entity.GhostEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GhostRenderer extends GeoEntityRenderer<GhostEntity> {
	public GhostRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GhostModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new GhostLayer(this));
	}

	@Override
	public RenderType getRenderType(GhostEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(GhostEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
