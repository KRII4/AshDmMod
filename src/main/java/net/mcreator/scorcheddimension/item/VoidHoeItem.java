
package net.mcreator.scorcheddimension.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.network.chat.Component;

import net.mcreator.scorcheddimension.init.ScorcheddimensionModTabs;
import net.mcreator.scorcheddimension.init.ScorcheddimensionModItems;

import java.util.List;

public class VoidHoeItem extends HoeItem {
	public VoidHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1760;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ScorcheddimensionModItems.ELEMENTAL_SHARD.get()));
			}
		}, 0, 0f, new Item.Properties().tab(ScorcheddimensionModTabs.TAB_SCORCHED_BIOME).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Useless thing ever"));
	}
}
