package net.mcreator.mariocraft.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class CoinModel extends GeoModel<CoinEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoinEntity entity) {
		return new ResourceLocation("mario_craft", "animations/mario_coin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoinEntity entity) {
		return new ResourceLocation("mario_craft", "geo/mario_coin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoinEntity entity) {
		return new ResourceLocation("mario_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

}