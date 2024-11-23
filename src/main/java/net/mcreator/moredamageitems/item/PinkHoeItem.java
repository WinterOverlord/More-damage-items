
package net.mcreator.moredamageitems.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.moredamageitems.init.MoreDamageItemsModItems;

public class PinkHoeItem extends HoeItem {
	public PinkHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 1f;
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
		}, 0, 2f, new Item.Properties().fireResistant());
	}
}
