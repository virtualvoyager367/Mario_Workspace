package net.mcreator.mariocraft.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mariocraft.network.MarioCraftModVariables;

public class PurpleCoinCalculationProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + Math.round((entity.getCapability(MarioCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarioCraftModVariables.PlayerVariables())).PurpleCoinNumber);
	}
}
