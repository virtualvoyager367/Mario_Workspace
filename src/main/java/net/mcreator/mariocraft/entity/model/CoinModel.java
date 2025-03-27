package net.mcreator.mariocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mariocraft.entity.CoinEntity;

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
