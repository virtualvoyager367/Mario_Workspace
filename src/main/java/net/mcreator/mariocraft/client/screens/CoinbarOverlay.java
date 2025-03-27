
package net.mcreator.mariocraft.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.mariocraft.procedures.PurpleCoinCalculationProcedure;
import net.mcreator.mariocraft.procedures.CoinCalculationProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class CoinbarOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {

			event.getGuiGraphics().blit(new ResourceLocation("mario_craft:textures/screens/coin.png"), -2, -1, 0, 0, 32, 32, 32, 32);

			event.getGuiGraphics().blit(new ResourceLocation("mario_craft:textures/screens/purple_coin.png"), -2, 25, 0, 0, 32, 32, 32, 32);

			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					CoinCalculationProcedure.execute(entity), 30, 12, -205, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					PurpleCoinCalculationProcedure.execute(entity), 30, 37, -6749953, false);
		}
	}
}
