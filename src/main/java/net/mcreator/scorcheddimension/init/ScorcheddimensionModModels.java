
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scorcheddimension.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.scorcheddimension.client.model.Modelscorchsoullite;
import net.mcreator.scorcheddimension.client.model.Modelscorchsoulfirst;
import net.mcreator.scorcheddimension.client.model.Modelghost;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ScorcheddimensionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelghost.LAYER_LOCATION, Modelghost::createBodyLayer);
		event.registerLayerDefinition(Modelscorchsoullite.LAYER_LOCATION, Modelscorchsoullite::createBodyLayer);
		event.registerLayerDefinition(Modelscorchsoulfirst.LAYER_LOCATION, Modelscorchsoulfirst::createBodyLayer);
	}
}
