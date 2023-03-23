package net.mcreator.biomespls.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.biomespls.entity.AshenSlimeEntity;

public class AshenSlimeModel extends AnimatedGeoModel<AshenSlimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(AshenSlimeEntity entity) {
		return new ResourceLocation("biomespls", "animations/ashslime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AshenSlimeEntity entity) {
		return new ResourceLocation("biomespls", "geo/ashslime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AshenSlimeEntity entity) {
		return new ResourceLocation("biomespls", "textures/entities/" + entity.getTexture() + ".png");
	}

}
