
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariocraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mariocraft.client.renderer.PurpleCoinRenderer;
import net.mcreator.mariocraft.client.renderer.CoinRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MarioCraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MarioCraftModEntities.COIN.get(), CoinRenderer::new);
		event.registerEntityRenderer(MarioCraftModEntities.PURPLE_COIN.get(), PurpleCoinRenderer::new);
	}
}
