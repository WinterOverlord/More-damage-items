
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moredamageitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.moredamageitems.potion.RepeateddeductionofbloodMobEffect;
import net.mcreator.moredamageitems.MoreDamageItemsMod;

public class MoreDamageItemsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MoreDamageItemsMod.MODID);
	public static final RegistryObject<MobEffect> REPEATEDDEDUCTIONOFBLOOD = REGISTRY.register("repeateddeductionofblood", () -> new RepeateddeductionofbloodMobEffect());
}
