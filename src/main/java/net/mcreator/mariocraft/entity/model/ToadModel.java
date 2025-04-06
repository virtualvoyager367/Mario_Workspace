package net.mcreator.mariocraft.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mariocraft.entity.ToadEntity;

public class ToadModel extends GeoModel<ToadEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToadEntity entity) {
		return new ResourceLocation("mario_craft", "animations/toad23.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToadEntity entity) {
		return new ResourceLocation("mario_craft", "geo/toad23.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToadEntity entity) {
		return new ResourceLocation("mario_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ToadEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
