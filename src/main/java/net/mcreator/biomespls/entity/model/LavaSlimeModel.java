package net.mcreator.biomespls.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.biomespls.entity.LavaSlimeEntity;

public class LavaSlimeModel extends AnimatedGeoModel<LavaSlimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(LavaSlimeEntity entity) {
		return new ResourceLocation("biomespls", "animations/ashslimetwo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LavaSlimeEntity entity) {
		return new ResourceLocation("biomespls", "geo/ashslimetwo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LavaSlimeEntity entity) {
		return new ResourceLocation("biomespls", "textures/entities/" + entity.getTexture() + ".png");
	}

}
