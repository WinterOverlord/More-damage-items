
package net.mcreator.moredamageitems.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.moredamageitems.init.MoreDamageItemsModItems;

public class PinkAxeItem extends AxeItem {
	public PinkAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoreDamageItemsModItems.PINK.get()));
			}
		}, 1, -2f, new Item.Properties().fireResistant());
	}
}
