
package net.mcreator.scorcheddimension.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.scorcheddimension.init.ScorcheddimensionModTabs;

public class AshSoulHeartItem extends Item {
	public AshSoulHeartItem() {
		super(new Item.Properties().tab(ScorcheddimensionModTabs.TAB_SCORCHED_BIOME).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
