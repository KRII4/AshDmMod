// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelghost<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ghost"), "main");
	private final ModelPart Head;
	private final ModelPart Torso;
	private final ModelPart LArm;
	private final ModelPart RArm;
	private final ModelPart LLeg;
	private final ModelPart RLeg;

	public Modelghost(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Torso = root.getChild("Torso");
		this.LArm = root.getChild("LArm");
		this.RArm = root.getChild("RArm");
		this.LLeg = root.getChild("LLeg");
		this.RLeg = root.getChild("RLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition Torso = partdefinition
				.addOrReplaceChild("Torso",
						CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition LArm = partdefinition.addOrReplaceChild("LArm",
				CubeListBuilder.create().texOffs(24, 16)
						.addBox(0.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 53)
						.addBox(1.0F, 7.0F, -2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(2.0F, 7.0F, -2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 53)
						.addBox(4.0F, 7.0F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 59)
						.addBox(4.0F, 7.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 44)
						.addBox(4.0F, 7.0F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 53)
						.addBox(4.0F, 7.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 53)
						.addBox(3.0F, 7.0F, 2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 59)
						.addBox(2.0F, 7.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 53)
						.addBox(0.0F, 7.0F, 2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
						.addBox(0.001F, 7.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 44)
						.addBox(0.0F, 7.0F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 59)
						.addBox(0.0F, 7.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 59)
						.addBox(0.0F, 7.0F, -2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1F, 3.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition RArm = partdefinition.addOrReplaceChild("RArm",
				CubeListBuilder.create().texOffs(0, 31)
						.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 59)
						.addBox(-3.0F, 2.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 53)
						.addBox(-2.0F, 2.0F, -2.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(0.0F, 2.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 53)
						.addBox(0.0F, 2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 56)
						.addBox(0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 44)
						.addBox(0.0F, 2.0F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 53)
						.addBox(-1.0F, 2.0F, 2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 47)
						.addBox(-3.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 60)
						.addBox(-4.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 39)
						.addBox(-4.0F, 2.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-4.0F, 2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 56)
						.addBox(-4.0F, 2.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 59)
						.addBox(-4.0F, 2.0F, -2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 3.0F, 0.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition LLeg = partdefinition.addOrReplaceChild("LLeg",
				CubeListBuilder.create().texOffs(0, 39)
						.addBox(-2.0F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 56)
						.addBox(-2.0F, 12.0F, 2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 59)
						.addBox(-1.0F, 12.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 49)
						.addBox(0.0F, 12.0F, 2.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 56)
						.addBox(1.0F, 12.0F, 2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 49)
						.addBox(2.0F, 12.0F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(2.0F, 12.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 39)
						.addBox(2.0F, 12.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 49)
						.addBox(0.0F, 12.0F, -2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 49)
						.addBox(-1.0F, 12.0F, -2.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 56)
						.addBox(-2.0F, 12.0F, -2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 1.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition RLeg = partdefinition.addOrReplaceChild("RLeg",
				CubeListBuilder.create().texOffs(16, 31)
						.addBox(-2.0F, 11.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 56)
						.addBox(-2.0F, 13.0F, -2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 49)
						.addBox(-2.0F, 13.0F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 56)
						.addBox(-2.0F, 13.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 44)
						.addBox(-2.0F, 13.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 60)
						.addBox(-2.0F, 13.0F, 2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 49)
						.addBox(-1.0F, 13.0F, 2.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 56)
						.addBox(1.0F, 13.0F, 2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 59)
						.addBox(0.0F, 13.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(1.0F, 13.0F, -2.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 59)
						.addBox(-1.0F, 13.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(0.0F, 13.0F, -2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LArm.yRot = headPitch / (180F / (float) Math.PI);
		this.RArm.yRot = headPitch / (180F / (float) Math.PI);
	}
}