package net.mcreator.scorcheddimension.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.scorcheddimension.entity.LavaSlimeEntity;

public class LavaSlimeModel extends AnimatedGeoModel<LavaSlimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(LavaSlimeEntity entity) {
		return new ResourceLocation("scorcheddimension", "animations/ashslimetwo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LavaSlimeEntity entity) {
		return new ResourceLocation("scorcheddimension", "geo/ashslimetwo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LavaSlimeEntity entity) {
		return new ResourceLocation("scorcheddimension", "textures/entities/" + entity.getTexture() + ".png");
	}

}
