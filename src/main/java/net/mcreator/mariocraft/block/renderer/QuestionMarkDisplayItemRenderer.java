package net.mcreator.mariocraft.block.renderer;

public class QuestionMarkDisplayItemRenderer extends GeoItemRenderer<QuestionMarkDisplayItem> {
	public QuestionMarkDisplayItemRenderer() {
		super(new QuestionMarkDisplayModel());
	}

	@Override
	public RenderType getRenderType(QuestionMarkDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}