package net.mcreator.scorcheddimension.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.scorcheddimension.entity.AshSlimeEntity;

public class AshSlimeModel extends AnimatedGeoModel<AshSlimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(AshSlimeEntity entity) {
		return new ResourceLocation("scorcheddimension", "animations/ashslime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AshSlimeEntity entity) {
		return new ResourceLocation("scorcheddimension", "geo/ashslime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AshSlimeEntity entity) {
		return new ResourceLocation("scorcheddimension", "textures/entities/" + entity.getTexture() + ".png");
	}

}
