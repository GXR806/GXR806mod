
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.mymod.enchantment.PoshangfengEnchantment;
import net.mcreator.mymod.enchantment.GodEnchantment;
import net.mcreator.mymod.GxrMod;

public class GxrModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, GxrMod.MODID);
	public static final RegistryObject<Enchantment> GODF = REGISTRY.register("godf", () -> new GodEnchantment());
	public static final RegistryObject<Enchantment> POSHANGFENG = REGISTRY.register("poshangfeng", () -> new PoshangfengEnchantment());
}
