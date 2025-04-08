package net.mcreator.mariocraft.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class PermanentEvilMushroomModel extends GeoModel<PermanentEvilMushroomEntity> {
	@Override
	public ResourceLocation getAnimationResource(PermanentEvilMushroomEntity entity) {
		return new ResourceLocation("mario_craft", "animations/mushroom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PermanentEvilMushroomEntity entity) {
		return new ResourceLocation("mario_craft", "geo/mushroom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PermanentEvilMushroomEntity entity) {
		return new ResourceLocation("mario_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(PermanentEvilMushroomEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("bone3");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}