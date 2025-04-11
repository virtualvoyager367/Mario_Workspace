package net.mcreator.mariocraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EvilMushroomDespawnProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((ForgeRegistries.ENTITY_TYPES.getKey(sourceentity.getType()).toString()).equals("mario_craft:evilmushroom") || (ForgeRegistries.ENTITY_TYPES.getKey(sourceentity.getType()).toString()).equals("mario_craft:permanent_evil_mushroom")) {
			if (!sourceentity.level().isClientSide())
				sourceentity.discard();
		}
	}
}
