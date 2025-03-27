package net.mcreator.mariocraft.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mariocraft.init.MarioCraftModBlockEntities;
import net.mcreator.mariocraft.block.renderer.QuestionMarkTileRenderer;
import net.mcreator.mariocraft.MarioCraftMod;

@Mod.EventBusSubscriber(modid = MarioCraftMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(MarioCraftModBlockEntities.QUESTION_MARK.get(), context -> new QuestionMarkTileRenderer());
	}
}
