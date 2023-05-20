
package net.mcreator.scorcheddimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.scorcheddimension.init.ScorcheddimensionModTabs;
import net.mcreator.scorcheddimension.init.ScorcheddimensionModFluids;

public class AshwaterItem extends BucketItem {
	public AshwaterItem() {
		super(ScorcheddimensionModFluids.ASHWATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(ScorcheddimensionModTabs.TAB_SCORCHED_BIOME));
	}
}
