package net.mcreator.mariocraft.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MushroomDaylightSwapProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world instanceof Level _lvl0 && _lvl0.isDay()) == false) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon mario_craft:evilmushroom");
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if ((world instanceof Level _lvl3 && _lvl3.isDay()) == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon mario_craft:mushroom");
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
