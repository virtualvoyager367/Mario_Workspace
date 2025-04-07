package net.mcreator.mariocraft.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
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

	@Override
	public void setCustomAnimations(MushroomEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("bone3");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
