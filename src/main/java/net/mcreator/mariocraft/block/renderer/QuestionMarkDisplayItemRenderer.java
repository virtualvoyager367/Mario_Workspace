package net.mcreator.mariocraft.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.mariocraft.block.model.QuestionMarkDisplayModel;
import net.mcreator.mariocraft.block.display.QuestionMarkDisplayItem;

public class QuestionMarkDisplayItemRenderer extends GeoItemRenderer<QuestionMarkDisplayItem> {
	public QuestionMarkDisplayItemRenderer() {
		super(new QuestionMarkDisplayModel());
	}

	@Override
	public RenderType getRenderType(QuestionMarkDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
