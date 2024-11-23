
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moredamageitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.moredamageitems.MoreDamageItemsMod;

public class MoreDamageItemsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MoreDamageItemsMod.MODID);
	public static final RegistryObject<Potion> REPEATEDDEDUCTIONOFBLOODMEDICINE = REGISTRY.register("repeateddeductionofbloodmedicine",
			() -> new Potion(new MobEffectInstance(MoreDamageItemsModMobEffects.REPEATEDDEDUCTIONOFBLOOD.get(), 9999, 0, true, true)));
}
