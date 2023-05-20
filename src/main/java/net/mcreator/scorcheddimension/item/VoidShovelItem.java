
package net.mcreator.scorcheddimension.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.scorcheddimension.procedures.VoidPicaxeSmeltProcedure;
import net.mcreator.scorcheddimension.procedures.VoidItemsFlameProcedure;
import net.mcreator.scorcheddimension.init.ScorcheddimensionModTabs;
import net.mcreator.scorcheddimension.init.ScorcheddimensionModItems;

import java.util.List;

public class VoidShovelItem extends ShovelItem {
	public VoidShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1760;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
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
		}, 1, -3f, new Item.Properties().tab(ScorcheddimensionModTabs.TAB_SCORCHED_BIOME));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		VoidPicaxeSmeltProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Sneak to disable melting"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			VoidItemsFlameProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
	}
}
