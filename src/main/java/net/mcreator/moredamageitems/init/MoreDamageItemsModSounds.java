
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moredamageitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.moredamageitems.MoreDamageItemsMod;

public class MoreDamageItemsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreDamageItemsMod.MODID);
	public static final RegistryObject<SoundEvent> APPLE = REGISTRY.register("apple", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("more_damage_items", "apple")));
}
