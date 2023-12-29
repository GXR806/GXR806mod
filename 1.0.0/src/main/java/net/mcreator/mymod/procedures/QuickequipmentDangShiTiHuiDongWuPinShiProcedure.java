package net.mcreator.mymod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class QuickequipmentDangShiTiHuiDongWuPinShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						"give @p minecraft:netherite_axe{Enchantments:[{id:\"sharpness\",lvl:99999},{id:\"efficiency\",lvl:99999},{id:\"fire_aspect\",lvl:99999},{id:\"knockback\",lvl:99999},{id:\"looting\",lvl:99999},{id:\"smite\",lvl:99999},{id:\"bane_of_arthropods\",lvl:99999},{id:\"unbreaking\",lvl:99999}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @p minecraft:netherite_pickaxe{Enchantments:[{id:\"efficiency\",lvl:99999},{id:\"fortune\",lvl:99999},{id:\"unbreaking\",lvl:99999}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						"give @p minecraft:bow{Enchantments:[{id:\"punch\",lvl:99999},{id:\"power\",lvl:99999},{id:\"flame\",lvl:99999},{id:\"infinity\",lvl:99999},{id:\"looting\",lvl:99999},{id:\"unbreaking\",lvl:99999}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						"give @p minecraft:netherite_sword{Enchantments:[{id:\"sharpness\",lvl:99999},{id:\"fire_aspect\",lvl:99999},{id:\"knockback\",lvl:99999},{id:\"looting\",lvl:99999},{id:\"smite\",lvl:99999},{id:\"bane_of_arthropods\",lvl:99999},{id:\"unbreaking\",lvl:99999}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						"give @p minecraft:netherite_helmet{Enchantments:[{id:\"fire_protection\",lvl:99999},{id:\"feather_falling\",lvl:99999},{id:\"blast_protection\",lvl:99999},{id:\"projectile_protection\",lvl:99999},{id:\"respiration\",lvl:99999},{id:\"aqua_affinity\",lvl:99999},{id:\"thorns\",lvl:99999},{id:\"unbreaking\",lvl:99999}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						"give @p minecraft:netherite_chestplate{Enchantments:[{id:\"fire_protection\",lvl:99999},{id:\"feather_falling\",lvl:99999},{id:\"blast_protection\",lvl:99999},{id:\"projectile_protection\",lvl:99999},{id:\"respiration\",lvl:99999},{id:\"aqua_affinity\",lvl:99999},{id:\"thorns\",lvl:99999},{id:\"unbreaking\",lvl:99999}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						"give @p minecraft:netherite_leggings{Enchantments:[{id:\"fire_protection\",lvl:99999},{id:\"feather_falling\",lvl:99999},{id:\"blast_protection\",lvl:99999},{id:\"projectile_protection\",lvl:99999},{id:\"respiration\",lvl:99999},{id:\"aqua_affinity\",lvl:99999},{id:\"thorns\",lvl:99999},{id:\"unbreaking\",lvl:99999}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						"give @p minecraft:netherite_boots{Enchantments:[{id:\"fire_protection\",lvl:99999},{id:\"feather_falling\",lvl:99999},{id:\"blast_protection\",lvl:99999},{id:\"projectile_protection\",lvl:99999},{id:\"respiration\",lvl:99999},{id:\"aqua_affinity\",lvl:99999},{id:\"thorns\",lvl:99999},{id:\"unbreaking\",lvl:99999}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
						"give @p minecraft:netherite_pickaxe{Enchantments:[{id:\"efficiency\",lvl:99999},{id:\"silk_touch\",lvl:99999},{id:\"unbreaking\",lvl:99999}]}");
			}
		}
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u6210\u529F\u8FD0\u884C\uFF01"), true);
	}
}
