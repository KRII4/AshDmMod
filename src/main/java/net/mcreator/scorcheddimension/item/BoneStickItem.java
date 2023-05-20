
package net.mcreator.scorcheddimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.scorcheddimension.init.ScorcheddimensionModTabs;

public class BoneStickItem extends Item {
	public BoneStickItem() {
		super(new Item.Properties().tab(ScorcheddimensionModTabs.TAB_SCORCHED_BIOME).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
