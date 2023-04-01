
package net.mcreator.biomespls.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.biomespls.init.BiomesplsModTabs;

public class LavaShardItem extends Item {
	public LavaShardItem() {
		super(new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME).stacksTo(64).rarity(Rarity.COMMON));
	}
}
