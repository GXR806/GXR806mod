
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mymod.GxrMod;

public class GxrModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GxrMod.MODID);
	public static final RegistryObject<CreativeModeTab> MYMOD = REGISTRY.register("mymod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gxr.mymod")).icon(() -> new ItemStack(GxrModItems.QUICKSET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GxrModItems.QUICKSET.get());
				tabData.accept(GxrModItems.QUICKEQUIPMENT.get());
			}).withSearchBar().build());
}
