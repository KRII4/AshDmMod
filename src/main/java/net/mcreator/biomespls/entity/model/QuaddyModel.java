package net.mcreator.biomespls.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.biomespls.entity.QuaddyEntity;

public class QuaddyModel extends AnimatedGeoModel<QuaddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(QuaddyEntity entity) {
		return new ResourceLocation("biomespls", "animations/quaddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(QuaddyEntity entity) {
		return new ResourceLocation("biomespls", "geo/quaddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(QuaddyEntity entity) {
		return new ResourceLocation("biomespls", "textures/entities/" + entity.getTexture() + ".png");
	}

}
