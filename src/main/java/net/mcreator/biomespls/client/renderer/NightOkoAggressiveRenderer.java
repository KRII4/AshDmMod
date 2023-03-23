
package net.mcreator.biomespls.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.biomespls.entity.model.NightOkoAggressiveModel;
import net.mcreator.biomespls.entity.layer.NightOkoAggressiveLayer;
import net.mcreator.biomespls.entity.NightOkoAggressiveEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NightOkoAggressiveRenderer extends GeoEntityRenderer<NightOkoAggressiveEntity> {
	public NightOkoAggressiveRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new NightOkoAggressiveModel());
		this.shadowRadius = 2f;
		this.addLayer(new NightOkoAggressiveLayer(this));
	}

	@Override
	public RenderType getRenderType(NightOkoAggressiveEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
