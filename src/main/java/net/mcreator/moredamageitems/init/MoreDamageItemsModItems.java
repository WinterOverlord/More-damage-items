
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moredamageitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moredamageitems.item.YellowSwordItem;
import net.mcreator.moredamageitems.item.YellowShovelItem;
import net.mcreator.moredamageitems.item.YellowPickaxeItem;
import net.mcreator.moredamageitems.item.YellowItem;
import net.mcreator.moredamageitems.item.YellowHoeItem;
import net.mcreator.moredamageitems.item.YellowAxeItem;
import net.mcreator.moredamageitems.item.YellowArmorItem;
import net.mcreator.moredamageitems.item.PumpkinredandblueItem;
import net.mcreator.moredamageitems.item.PinkyellowItem;
import net.mcreator.moredamageitems.item.PinkSwordItem;
import net.mcreator.moredamageitems.item.PinkShovelItem;
import net.mcreator.moredamageitems.item.PinkPickaxeItem;
import net.mcreator.moredamageitems.item.PinkItem;
import net.mcreator.moredamageitems.item.PinkHoeItem;
import net.mcreator.moredamageitems.item.PinkAxeItem;
import net.mcreator.moredamageitems.item.PinkArmorItem;
import net.mcreator.moredamageitems.item.PingguoxiangItem;
import net.mcreator.moredamageitems.item.BananaItem;
import net.mcreator.moredamageitems.MoreDamageItemsMod;

public class MoreDamageItemsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDamageItemsMod.MODID);
	public static final RegistryObject<Item> YELLOW = REGISTRY.register("yellow", () -> new YellowItem());
	public static final RegistryObject<Item> YELLOW_ORE = block(MoreDamageItemsModBlocks.YELLOW_ORE);
	public static final RegistryObject<Item> YELLOW_BLOCK = block(MoreDamageItemsModBlocks.YELLOW_BLOCK);
	public static final RegistryObject<Item> YELLOW_PICKAXE = REGISTRY.register("yellow_pickaxe", () -> new YellowPickaxeItem());
	public static final RegistryObject<Item> YELLOW_AXE = REGISTRY.register("yellow_axe", () -> new YellowAxeItem());
	public static final RegistryObject<Item> YELLOW_SWORD = REGISTRY.register("yellow_sword", () -> new YellowSwordItem());
	public static final RegistryObject<Item> YELLOW_SHOVEL = REGISTRY.register("yellow_shovel", () -> new YellowShovelItem());
	public static final RegistryObject<Item> YELLOW_HOE = REGISTRY.register("yellow_hoe", () -> new YellowHoeItem());
	public static final RegistryObject<Item> YELLOW_ARMOR_HELMET = REGISTRY.register("yellow_armor_helmet", () -> new YellowArmorItem.Helmet());
	public static final RegistryObject<Item> YELLOW_ARMOR_CHESTPLATE = REGISTRY.register("yellow_armor_chestplate", () -> new YellowArmorItem.Chestplate());
	public static final RegistryObject<Item> YELLOW_ARMOR_LEGGINGS = REGISTRY.register("yellow_armor_leggings", () -> new YellowArmorItem.Leggings());
	public static final RegistryObject<Item> YELLOW_ARMOR_BOOTS = REGISTRY.register("yellow_armor_boots", () -> new YellowArmorItem.Boots());
	public static final RegistryObject<Item> PINK = REGISTRY.register("pink", () -> new PinkItem());
	public static final RegistryObject<Item> PINK_ORE = block(MoreDamageItemsModBlocks.PINK_ORE);
	public static final RegistryObject<Item> PINK_BLOCK = block(MoreDamageItemsModBlocks.PINK_BLOCK);
	public static final RegistryObject<Item> PINK_PICKAXE = REGISTRY.register("pink_pickaxe", () -> new PinkPickaxeItem());
	public static final RegistryObject<Item> PINK_AXE = REGISTRY.register("pink_axe", () -> new PinkAxeItem());
	public static final RegistryObject<Item> PINK_SWORD = REGISTRY.register("pink_sword", () -> new PinkSwordItem());
	public static final RegistryObject<Item> PINK_SHOVEL = REGISTRY.register("pink_shovel", () -> new PinkShovelItem());
	public static final RegistryObject<Item> PINK_HOE = REGISTRY.register("pink_hoe", () -> new PinkHoeItem());
	public static final RegistryObject<Item> PINK_ARMOR_HELMET = REGISTRY.register("pink_armor_helmet", () -> new PinkArmorItem.Helmet());
	public static final RegistryObject<Item> PINK_ARMOR_CHESTPLATE = REGISTRY.register("pink_armor_chestplate", () -> new PinkArmorItem.Chestplate());
	public static final RegistryObject<Item> PINK_ARMOR_LEGGINGS = REGISTRY.register("pink_armor_leggings", () -> new PinkArmorItem.Leggings());
	public static final RegistryObject<Item> PINK_ARMOR_BOOTS = REGISTRY.register("pink_armor_boots", () -> new PinkArmorItem.Boots());
	public static final RegistryObject<Item> PINKYELLOW = REGISTRY.register("pinkyellow", () -> new PinkyellowItem());
	public static final RegistryObject<Item> PUMPKINREDANDBLUE = REGISTRY.register("pumpkinredandblue", () -> new PumpkinredandblueItem());
	public static final RegistryObject<Item> BANANA = REGISTRY.register("banana", () -> new BananaItem());
	public static final RegistryObject<Item> BANANABLOCK = block(MoreDamageItemsModBlocks.BANANABLOCK);
	public static final RegistryObject<Item> PINGGUOXIANG = REGISTRY.register("pingguoxiang", () -> new PingguoxiangItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
