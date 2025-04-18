package net.mcreator.mariocraft.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mariocraft.block.display.QuestionMarkDisplayItem;

public class QuestionMarkDisplayModel extends GeoModel<QuestionMarkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(QuestionMarkDisplayItem animatable) {
		return new ResourceLocation("mario_craft", "animations/qustion_mark_block_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(QuestionMarkDisplayItem animatable) {
		return new ResourceLocation("mario_craft", "geo/qustion_mark_block_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(QuestionMarkDisplayItem entity) {
		return new ResourceLocation("mario_craft", "textures/block/mario.png");
	}
}
