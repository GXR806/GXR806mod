
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mymod.item.QuicksetItem;
import net.mcreator.mymod.item.QuickequipmentItem;
import net.mcreator.mymod.GxrMod;

public class GxrModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GxrMod.MODID);
	public static final RegistryObject<Item> QUICKSET = REGISTRY.register("quickset", () -> new QuicksetItem());
	public static final RegistryObject<Item> QUICKEQUIPMENT = REGISTRY.register("quickequipment", () -> new QuickequipmentItem());
}
