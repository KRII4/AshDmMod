
package net.mcreator.scorcheddimension.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.scorcheddimension.init.ScorcheddimensionModTabs;

public class ElementalShardItem extends Item {
	public ElementalShardItem() {
		super(new Item.Properties().tab(ScorcheddimensionModTabs.TAB_SCORCHED_BIOME).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
