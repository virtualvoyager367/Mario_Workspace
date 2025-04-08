
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariocraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mariocraft.client.renderer.ToadRenderer;
import net.mcreator.mariocraft.client.renderer.PurpleCoinRenderer;
import net.mcreator.mariocraft.client.renderer.PermanentMushroomRenderer;
import net.mcreator.mariocraft.client.renderer.PermanentEvilMushroomRenderer;
import net.mcreator.mariocraft.client.renderer.MushroomRenderer;
import net.mcreator.mariocraft.client.renderer.EvilmushroomRenderer;
import net.mcreator.mariocraft.client.renderer.CoinRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MarioCraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MarioCraftModEntities.COIN.get(), CoinRenderer::new);
		event.registerEntityRenderer(MarioCraftModEntities.PURPLE_COIN.get(), PurpleCoinRenderer::new);
		event.registerEntityRenderer(MarioCraftModEntities.TOAD.get(), ToadRenderer::new);
		event.registerEntityRenderer(MarioCraftModEntities.MUSHROOM.get(), MushroomRenderer::new);
		event.registerEntityRenderer(MarioCraftModEntities.EVILMUSHROOM.get(), EvilmushroomRenderer::new);
		event.registerEntityRenderer(MarioCraftModEntities.PERMANENT_MUSHROOM.get(), PermanentMushroomRenderer::new);
		event.registerEntityRenderer(MarioCraftModEntities.PERMANENT_EVIL_MUSHROOM.get(), PermanentEvilMushroomRenderer::new);
	}
}
