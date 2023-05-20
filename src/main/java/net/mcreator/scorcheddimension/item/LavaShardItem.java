
package net.mcreator.scorcheddimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.scorcheddimension.init.ScorcheddimensionModTabs;

public class LavaShardItem extends Item {
	public LavaShardItem() {
		super(new Item.Properties().tab(ScorcheddimensionModTabs.TAB_SCORCHED_BIOME).stacksTo(64).rarity(Rarity.COMMON));
	}
}
