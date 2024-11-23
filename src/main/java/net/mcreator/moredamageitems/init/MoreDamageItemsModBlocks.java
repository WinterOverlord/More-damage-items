
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moredamageitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moredamageitems.block.YellowOreBlock;
import net.mcreator.moredamageitems.block.YellowBlockBlock;
import net.mcreator.moredamageitems.block.PinkyellowPortalBlock;
import net.mcreator.moredamageitems.block.PinkOreBlock;
import net.mcreator.moredamageitems.block.PinkBlockBlock;
import net.mcreator.moredamageitems.block.CyanOreBlock;
import net.mcreator.moredamageitems.block.CyanBlockBlock;
import net.mcreator.moredamageitems.block.BananablockBlock;
import net.mcreator.moredamageitems.MoreDamageItemsMod;

public class MoreDamageItemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreDamageItemsMod.MODID);
	public static final RegistryObject<Block> YELLOW_ORE = REGISTRY.register("yellow_ore", () -> new YellowOreBlock());
	public static final RegistryObject<Block> YELLOW_BLOCK = REGISTRY.register("yellow_block", () -> new YellowBlockBlock());
	public static final RegistryObject<Block> PINK_ORE = REGISTRY.register("pink_ore", () -> new PinkOreBlock());
	public static final RegistryObject<Block> PINK_BLOCK = REGISTRY.register("pink_block", () -> new PinkBlockBlock());
	public static final RegistryObject<Block> PINKYELLOW_PORTAL = REGISTRY.register("pinkyellow_portal", () -> new PinkyellowPortalBlock());
	public static final RegistryObject<Block> BANANABLOCK = REGISTRY.register("bananablock", () -> new BananablockBlock());
	public static final RegistryObject<Block> CYAN_ORE = REGISTRY.register("cyan_ore", () -> new CyanOreBlock());
	public static final RegistryObject<Block> CYAN_BLOCK = REGISTRY.register("cyan_block", () -> new CyanBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
