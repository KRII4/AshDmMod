
package net.mcreator.biomespls.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.biomespls.init.BiomesplsModTabs;
import net.mcreator.biomespls.init.BiomesplsModFluids;

public class AshwaterItem extends BucketItem {
	public AshwaterItem() {
		super(BiomesplsModFluids.ASHWATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(BiomesplsModTabs.TAB_SCORCHED_BIOME));
	}
}
