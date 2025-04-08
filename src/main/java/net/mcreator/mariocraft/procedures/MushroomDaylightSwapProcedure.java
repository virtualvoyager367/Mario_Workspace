package net.mcreator.mariocraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class MushroomDaylightSwapProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world instanceof Level _lvl0 && _lvl0.isDay()) == false && (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("mario_craft:mushroom")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon mario_craft:evilmushroom");
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if ((world instanceof Level _lvl4 && _lvl4.isDay()) == true && (ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("mario_craft:evilmushroom")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon mario_craft:mushroom");
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
