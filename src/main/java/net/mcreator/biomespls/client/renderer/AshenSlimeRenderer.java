
package net.mcreator.biomespls.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.biomespls.entity.model.AshenSlimeModel;
import net.mcreator.biomespls.entity.layer.AshenSlimeLayer;
import net.mcreator.biomespls.entity.AshenSlimeEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AshenSlimeRenderer extends GeoEntityRenderer<AshenSlimeEntity> {
	public AshenSlimeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new AshenSlimeModel());
		this.shadowRadius = 0.4f;
		this.addLayer(new AshenSlimeLayer(this));
	}

	@Override
	public RenderType getRenderType(AshenSlimeEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
