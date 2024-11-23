
package net.mcreator.moredamageitems.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PumpkinredandblueItem extends Item {
	public PumpkinredandblueItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(10f).build()));
	}
}
