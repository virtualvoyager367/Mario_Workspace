package net.mcreator.mariocraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.mariocraft.network.MarioCraftModVariables;

public class PurpleCoinCollisionProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double old_coin_count = 0;
		double new_coin_count = 0;
		old_coin_count = (sourceentity.getCapability(MarioCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarioCraftModVariables.PlayerVariables())).PurpleCoinNumber;
		if ((sourceentity.getCapability(MarioCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarioCraftModVariables.PlayerVariables())).Grabbed_Coin == false) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 20);
			{
				double _setval = (sourceentity.getCapability(MarioCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarioCraftModVariables.PlayerVariables())).PurpleCoinNumber + 1;
				sourceentity.getCapability(MarioCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PurpleCoinNumber = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			{
				boolean _setval = true;
				sourceentity.getCapability(MarioCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Grabbed_Coin = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		new_coin_count = (sourceentity.getCapability(MarioCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MarioCraftModVariables.PlayerVariables())).PurpleCoinNumber;
		if (old_coin_count == new_coin_count) {
			{
				boolean _setval = false;
				sourceentity.getCapability(MarioCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Grabbed_Coin = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
