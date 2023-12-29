
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mymod.GxrMod;

public class GxrModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, GxrMod.MODID);
	public static final RegistryObject<Potion> SUPERPROTECTION = REGISTRY.register("superprotection",
			() -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 3600, 255, false, true), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 255, false, true)));
}
