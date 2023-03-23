
package net.mcreator.biomespls.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.biomespls.entity.model.LavaSlimeModel;
import net.mcreator.biomespls.entity.layer.LavaSlimeLayer;
import net.mcreator.biomespls.entity.LavaSlimeEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LavaSlimeRenderer extends GeoEntityRenderer<LavaSlimeEntity> {
	public LavaSlimeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new LavaSlimeModel());
		this.shadowRadius = 0.6f;
		this.addLayer(new LavaSlimeLayer(this));
	}

	@Override
	public RenderType getRenderType(LavaSlimeEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
