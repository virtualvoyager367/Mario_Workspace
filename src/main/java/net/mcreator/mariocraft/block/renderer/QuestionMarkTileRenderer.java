package net.mcreator.mariocraft.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.mariocraft.block.model.QuestionMarkBlockModel;
import net.mcreator.mariocraft.block.entity.QuestionMarkTileEntity;

public class QuestionMarkTileRenderer extends GeoBlockRenderer<QuestionMarkTileEntity> {
	public QuestionMarkTileRenderer() {
		super(new QuestionMarkBlockModel());
	}

	@Override
	public RenderType getRenderType(QuestionMarkTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
