package net.mcreator.mariocraft.procedures;

import net.minecraft.world.entity.Entity;

public class RottenburningProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
