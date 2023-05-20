package net.mcreator.scorcheddimension.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.scorcheddimension.entity.ShechelEntity;

public class ShechelModel extends AnimatedGeoModel<ShechelEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShechelEntity entity) {
		return new ResourceLocation("scorcheddimension", "animations/shechel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShechelEntity entity) {
		return new ResourceLocation("scorcheddimension", "geo/shechel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShechelEntity entity) {
		return new ResourceLocation("scorcheddimension", "textures/entities/" + entity.getTexture() + ".png");
	}

}
