package net.mcreator.scorcheddimension.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.scorcheddimension.entity.GeckoashEntity;

public class GeckoashModel extends AnimatedGeoModel<GeckoashEntity> {
	@Override
	public ResourceLocation getAnimationResource(GeckoashEntity entity) {
		return new ResourceLocation("scorcheddimension", "animations/Geckoash.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeckoashEntity entity) {
		return new ResourceLocation("scorcheddimension", "geo/Geckoash.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeckoashEntity entity) {
		return new ResourceLocation("scorcheddimension", "textures/entities/" + entity.getTexture() + ".png");
	}

}
