
package net.mcreator.biomespls.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.biomespls.entity.model.QuaddyModel;
import net.mcreator.biomespls.entity.layer.QuaddyLayer;
import net.mcreator.biomespls.entity.QuaddyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class QuaddyRenderer extends GeoEntityRenderer<QuaddyEntity> {
	public QuaddyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new QuaddyModel());
		this.shadowRadius = 0.8f;
		this.addLayer(new QuaddyLayer(this));
	}

	@Override
	public RenderType getRenderType(QuaddyEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
