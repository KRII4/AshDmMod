package net.mcreator.biomespls.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.biomespls.entity.AshSlimeEntity;

public class AshSlimeModel extends AnimatedGeoModel<AshSlimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(AshSlimeEntity entity) {
		return new ResourceLocation("biomespls", "animations/ashslime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AshSlimeEntity entity) {
		return new ResourceLocation("biomespls", "geo/ashslime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AshSlimeEntity entity) {
		return new ResourceLocation("biomespls", "textures/entities/" + entity.getTexture() + ".png");
	}

}
