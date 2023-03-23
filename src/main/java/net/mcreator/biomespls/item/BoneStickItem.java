
package net.mcreator.biomespls.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.biomespls.init.BiomesplsModTabs;

public class BoneStickItem extends Item {
	public BoneStickItem() {
		super(new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
