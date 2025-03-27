package net.mcreator.mariocraft.block.renderer;

public class QuestionMarkTileRenderer extends GeoBlockRenderer<QuestionMarkTileEntity> {
	public QuestionMarkTileRenderer() {
		super(new QuestionMarkBlockModel());
	}

	@Override
	public RenderType getRenderType(QuestionMarkTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}