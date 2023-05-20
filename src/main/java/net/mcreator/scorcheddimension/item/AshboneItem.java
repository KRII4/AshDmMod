
package net.mcreator.scorcheddimension.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.scorcheddimension.init.ScorcheddimensionModTabs;

public class AshboneItem extends Item {
	public AshboneItem() {
		super(new Item.Properties().tab(ScorcheddimensionModTabs.TAB_SCORCHED_BIOME).stacksTo(16).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
