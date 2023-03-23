
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomespls.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BiomesplsModTabs {
	public static CreativeModeTab TAB_SCORCHED_BIOME;

	public static void load() {
		TAB_SCORCHED_BIOME = new CreativeModeTab("tabscorched_biome") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BiomesplsModBlocks.ASHGRASS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
