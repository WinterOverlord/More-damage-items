
package net.mcreator.moredamageitems.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class PingguoxiangItem extends RecordItem {
	public PingguoxiangItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("more_damage_items:apple")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 100);
	}
}
