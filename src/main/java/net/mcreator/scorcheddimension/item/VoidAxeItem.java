
package net.mcreator.scorcheddimension.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.scorcheddimension.procedures.VoidSwordBurnProcedure;
import net.mcreator.scorcheddimension.procedures.VoidItemsFlameProcedure;
import net.mcreator.scorcheddimension.init.ScorcheddimensionModTabs;
import net.mcreator.scorcheddimension.init.ScorcheddimensionModItems;

public class VoidAxeItem extends AxeItem {
	public VoidAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1760;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ScorcheddimensionModItems.LAVA_VOID_SHARD.get()));
			}
		}, 1, -2.9f, new Item.Properties().tab(ScorcheddimensionModTabs.TAB_SCORCHED_BIOME).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		VoidSwordBurnProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			VoidItemsFlameProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
	}
}
