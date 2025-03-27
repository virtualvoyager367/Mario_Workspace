package net.mcreator.mariocraft.procedures;

import net.minecraftforge.eventbus.api.Event;

public class QuestionMarkDropCoinProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean CoinCollected = false;
		if (CoinCollected == false) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(Math.round(x), (Math.round(y) + 1), Math.round(z)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"summon mario_craft:coin");
			CoinCollected = true;
		}
	}
}
