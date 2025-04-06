package net.mcreator.mariocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mariocraft.entity.EvilmushroomEntity;

public class EvilmushroomModel extends GeoModel<EvilmushroomEntity> {
	@Override
	public ResourceLocation getAnimationResource(EvilmushroomEntity entity) {
		return new ResourceLocation("mario_craft", "animations/mushroom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EvilmushroomEntity entity) {
		return new ResourceLocation("mario_craft", "geo/mushroom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EvilmushroomEntity entity) {
		return new ResourceLocation("mario_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
