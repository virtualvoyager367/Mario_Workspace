// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltoad<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "toad"), "main");
	private final ModelPart mushroomtop;
	private final ModelPart rightfoot;
	private final ModelPart leftfoot;
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart face;
	private final ModelPart rightarm;
	private final ModelPart leftarm;

	public Modeltoad(ModelPart root) {
		this.mushroomtop = root.getChild("mushroomtop");
		this.rightfoot = root.getChild("rightfoot");
		this.leftfoot = root.getChild("leftfoot");
		this.body = root.getChild("body");
		this.neck = root.getChild("neck");
		this.face = root.getChild("face");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mushroomtop = partdefinition.addOrReplaceChild("mushroomtop", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = mushroomtop.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -7.0F, -9.0F, 10.0F, 7.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -16.0F, 4.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition rightfoot = partdefinition.addOrReplaceChild("rightfoot", CubeListBuilder.create(),
				PartPose.offset(5.0F, 24.0F, 2.0F));

		PartDefinition cube_r2 = rightfoot.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 37).addBox(-5.0F, -3.0F, -1.0F, 5.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition leftfoot = partdefinition.addOrReplaceChild("leftfoot", CubeListBuilder.create(),
				PartPose.offset(1.0F, 23.0F, -2.0F));

		PartDefinition cube_r3 = leftfoot
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 31).addBox(-5.0F, -3.0F, -1.0F, 5.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.0F, 1.0F, -1.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 17).addBox(
				-1.0F, -9.0F, -4.0F, 5.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck = partdefinition.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(26, 30).addBox(
				-4.0F, -8.0F, 0.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 21.0F, -3.0F));

		PartDefinition face = partdefinition.addOrReplaceChild("face", CubeListBuilder.create().texOffs(26, 17).addBox(
				-1.0F, -16.0F, -4.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r4 = rightarm
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(24, 38).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, -3.0F, 5.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r5 = leftarm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(16, 31).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, -5.0F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		mushroomtop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		face.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}