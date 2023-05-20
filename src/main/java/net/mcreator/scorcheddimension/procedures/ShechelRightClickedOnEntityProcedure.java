package net.mcreator.scorcheddimension.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.scorcheddimension.entity.ShechelEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ShechelRightClickedOnEntityProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getTarget());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ShechelEntity) {
			((ShechelEntity) entity).setAnimation("aaa");
		}
	}
}
