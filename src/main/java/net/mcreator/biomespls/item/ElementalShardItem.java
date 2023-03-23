
package net.mcreator.biomespls.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.biomespls.init.BiomesplsModTabs;

public class ElementalShardItem extends Item {
	public ElementalShardItem() {
		super(new Item.Properties().tab(BiomesplsModTabs.TAB_SCORCHED_BIOME).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
