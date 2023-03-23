package net.mcreator.biomespls.entity.model;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.biomespls.entity.NightOkoAggressiveEntity;

public class NightOkoAggressiveModel extends AnimatedGeoModel<NightOkoAggressiveEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightOkoAggressiveEntity entity) {
		return new ResourceLocation("biomespls", "animations/nightoko.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightOkoAggressiveEntity entity) {
		return new ResourceLocation("biomespls", "geo/nightoko.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightOkoAggressiveEntity entity) {
		return new ResourceLocation("biomespls", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(NightOkoAggressiveEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}
