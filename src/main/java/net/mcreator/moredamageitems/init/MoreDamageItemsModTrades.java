
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.moredamageitems.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MoreDamageItemsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == MoreDamageItemsModVillagerProfessions.SB.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.WHITE_WOOL), new ItemStack(Blocks.GRASS_BLOCK), new ItemStack(Items.EMERALD), 10, 0, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(MoreDamageItemsModItems.PUMPKINREDANDBLUE.get()), new ItemStack(Blocks.DIRT), new ItemStack(Blocks.SUGAR_CANE), 10, 5, 0.05f));
		}
	}
}
