
package net.mcreator.moredamageitems.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.moredamageitems.init.MoreDamageItemsModItems;

public class YellowPickaxeItem extends PickaxeItem {
	public YellowPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoreDamageItemsModItems.YELLOW.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
