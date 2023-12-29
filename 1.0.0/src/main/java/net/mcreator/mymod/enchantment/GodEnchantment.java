
package net.mcreator.mymod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class GodEnchantment extends Enchantment {
	public GodEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(Items.WOODEN_SWORD), new ItemStack(Items.STONE_SWORD), new ItemStack(Items.IRON_SWORD), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.NETHERITE_SWORD), new ItemStack(Items.GOLDEN_SWORD),
				new ItemStack(Items.WOODEN_AXE), new ItemStack(Items.STONE_AXE), new ItemStack(Items.IRON_AXE), new ItemStack(Items.GOLDEN_AXE), new ItemStack(Items.DIAMOND_AXE), new ItemStack(Items.NETHERITE_AXE), new ItemStack(Items.BOW),
				new ItemStack(Items.CROSSBOW)).test(itemstack);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
