
package net.mcreator.scorcheddimension.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.scorcheddimension.entity.model.AshSlimeModel;
import net.mcreator.scorcheddimension.entity.layer.AshSlimeLayer;
import net.mcreator.scorcheddimension.entity.AshSlimeEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AshSlimeRenderer extends GeoEntityRenderer<AshSlimeEntity> {
	public AshSlimeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new AshSlimeModel());
		this.shadowRadius = 0.4f;
		this.addLayer(new AshSlimeLayer(this));
	}

	@Override
	public RenderType getRenderType(AshSlimeEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
