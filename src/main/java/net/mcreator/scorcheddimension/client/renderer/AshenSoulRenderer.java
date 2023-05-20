
package net.mcreator.scorcheddimension.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.scorcheddimension.entity.model.AshenSoulModel;
import net.mcreator.scorcheddimension.entity.layer.AshenSoulLayer;
import net.mcreator.scorcheddimension.entity.AshenSoulEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AshenSoulRenderer extends GeoEntityRenderer<AshenSoulEntity> {
	public AshenSoulRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new AshenSoulModel());
		this.shadowRadius = 0.7999999999999999f;
		this.addLayer(new AshenSoulLayer(this));
	}

	@Override
	public RenderType getRenderType(AshenSoulEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(AshenSoulEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
