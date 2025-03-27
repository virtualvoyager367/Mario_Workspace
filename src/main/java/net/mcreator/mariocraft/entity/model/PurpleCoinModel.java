package net.mcreator.mariocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mariocraft.entity.PurpleCoinEntity;

public class PurpleCoinModel extends GeoModel<PurpleCoinEntity> {
	@Override
	public ResourceLocation getAnimationResource(PurpleCoinEntity entity) {
		return new ResourceLocation("mario_craft", "animations/purpelcoin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleCoinEntity entity) {
		return new ResourceLocation("mario_craft", "geo/purpelcoin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleCoinEntity entity) {
		return new ResourceLocation("mario_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
