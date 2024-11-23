
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moredamageitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.moredamageitems.MoreDamageItemsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreDamageItemsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDamageItemsMod.MODID);
	public static final RegistryObject<CreativeModeTab> P = REGISTRY.register("p",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.more_damage_items.p")).icon(() -> new ItemStack(Blocks.GRASS_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(MoreDamageItemsModItems.YELLOW.get());
				tabData.accept(MoreDamageItemsModBlocks.YELLOW_ORE.get().asItem());
				tabData.accept(MoreDamageItemsModBlocks.YELLOW_BLOCK.get().asItem());
				tabData.accept(MoreDamageItemsModItems.YELLOW_PICKAXE.get());
				tabData.accept(MoreDamageItemsModItems.YELLOW_AXE.get());
				tabData.accept(MoreDamageItemsModItems.YELLOW_HOE.get());
				tabData.accept(MoreDamageItemsModItems.YELLOW_ARMOR_HELMET.get());
				tabData.accept(MoreDamageItemsModItems.YELLOW_ARMOR_CHESTPLATE.get());
				tabData.accept(MoreDamageItemsModItems.YELLOW_ARMOR_LEGGINGS.get());
				tabData.accept(MoreDamageItemsModItems.YELLOW_ARMOR_BOOTS.get());
				tabData.accept(MoreDamageItemsModItems.PINK.get());
				tabData.accept(MoreDamageItemsModBlocks.PINK_ORE.get().asItem());
				tabData.accept(MoreDamageItemsModBlocks.PINK_BLOCK.get().asItem());
				tabData.accept(MoreDamageItemsModItems.PINK_PICKAXE.get());
				tabData.accept(MoreDamageItemsModItems.PINK_AXE.get());
				tabData.accept(MoreDamageItemsModItems.PINK_SWORD.get());
				tabData.accept(MoreDamageItemsModItems.PINK_SHOVEL.get());
				tabData.accept(MoreDamageItemsModItems.PINK_HOE.get());
				tabData.accept(MoreDamageItemsModItems.PINK_ARMOR_HELMET.get());
				tabData.accept(MoreDamageItemsModItems.PINK_ARMOR_CHESTPLATE.get());
				tabData.accept(MoreDamageItemsModItems.PINK_ARMOR_LEGGINGS.get());
				tabData.accept(MoreDamageItemsModItems.PINK_ARMOR_BOOTS.get());
				tabData.accept(MoreDamageItemsModItems.PINKYELLOW.get());
				tabData.accept(MoreDamageItemsModItems.PINGGUOXIANG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(MoreDamageItemsModBlocks.YELLOW_ORE.get().asItem());
			tabData.accept(MoreDamageItemsModBlocks.YELLOW_BLOCK.get().asItem());
			tabData.accept(MoreDamageItemsModBlocks.PINK_ORE.get().asItem());
			tabData.accept(MoreDamageItemsModBlocks.PINK_BLOCK.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(MoreDamageItemsModItems.YELLOW_SWORD.get());
			tabData.accept(MoreDamageItemsModItems.YELLOW_ARMOR_HELMET.get());
			tabData.accept(MoreDamageItemsModItems.YELLOW_ARMOR_CHESTPLATE.get());
			tabData.accept(MoreDamageItemsModItems.YELLOW_ARMOR_LEGGINGS.get());
			tabData.accept(MoreDamageItemsModItems.YELLOW_ARMOR_BOOTS.get());
			tabData.accept(MoreDamageItemsModItems.PINK_SWORD.get());
			tabData.accept(MoreDamageItemsModItems.PINK_ARMOR_HELMET.get());
			tabData.accept(MoreDamageItemsModItems.PINK_ARMOR_CHESTPLATE.get());
			tabData.accept(MoreDamageItemsModItems.PINK_ARMOR_LEGGINGS.get());
			tabData.accept(MoreDamageItemsModItems.PINK_ARMOR_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(MoreDamageItemsModItems.YELLOW.get());
			tabData.accept(MoreDamageItemsModItems.PINK.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(MoreDamageItemsModItems.YELLOW_PICKAXE.get());
			tabData.accept(MoreDamageItemsModItems.YELLOW_AXE.get());
			tabData.accept(MoreDamageItemsModItems.YELLOW_SHOVEL.get());
			tabData.accept(MoreDamageItemsModItems.YELLOW_HOE.get());
			tabData.accept(MoreDamageItemsModItems.PINK_PICKAXE.get());
			tabData.accept(MoreDamageItemsModItems.PINK_AXE.get());
			tabData.accept(MoreDamageItemsModItems.PINK_SHOVEL.get());
			tabData.accept(MoreDamageItemsModItems.PINK_HOE.get());
			tabData.accept(MoreDamageItemsModItems.PINKYELLOW.get());

		}
	}
}
