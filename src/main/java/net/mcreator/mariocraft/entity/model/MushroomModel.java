package net.mcreator.mariocraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mariocraft.entity.MushroomEntity;

public class MushroomModel extends GeoModel<MushroomEntity> {
	@Override
	public ResourceLocation getAnimationResource(MushroomEntity entity) {
		return new ResourceLocation("mario_craft", "animations/mushroom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MushroomEntity entity) {
		return new ResourceLocation("mario_craft", "geo/mushroom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MushroomEntity entity) {
		return new ResourceLocation("mario_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
