package net.mcreator.scorcheddimension.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.scorcheddimension.entity.QuaddyEntity;

public class QuaddyModel extends AnimatedGeoModel<QuaddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(QuaddyEntity entity) {
		return new ResourceLocation("scorcheddimension", "animations/quaddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(QuaddyEntity entity) {
		return new ResourceLocation("scorcheddimension", "geo/quaddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(QuaddyEntity entity) {
		return new ResourceLocation("scorcheddimension", "textures/entities/" + entity.getTexture() + ".png");
	}

}
