package net.mcreator.biomespls.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelscorchsoulfirst<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("biomespls", "modelscorchsoulfirst"), "main");
	public final ModelPart golova;
	public final ModelPart telo;
	public final ModelPart LevRuka;
	public final ModelPart PravRuka;
	public final ModelPart LevNoga;
	public final ModelPart PravNoga;

	public Modelscorchsoulfirst(ModelPart root) {
		this.golova = root.getChild("golova");
		this.telo = root.getChild("telo");
		this.LevRuka = root.getChild("LevRuka");
		this.PravRuka = root.getChild("PravRuka");
		this.LevNoga = root.getChild("LevNoga");
		this.PravNoga = root.getChild("PravNoga");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition golova = partdefinition.addOrReplaceChild("golova",
				CubeListBuilder.create().texOffs(90, 22).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(88, 17).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 35)
						.addBox(-4.0F, -1.0F, -4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 61).addBox(-4.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 12)
						.addBox(3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 57).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 34)
						.addBox(-4.0F, -3.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 52).addBox(2.0F, -3.0F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 46)
						.addBox(-2.0F, -3.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 0).addBox(-4.0F, -8.0F, -3.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 0)
						.addBox(-3.999F, -8.1F, -3.999F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 14).addBox(-4.099F, -8.1F, -1.999F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 44)
						.addBox(-4.099F, -8.1F, 0.001F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(120, 103).addBox(1.0F, -4.0F, -3.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 89)
						.addBox(-3.0F, -4.0F, -3.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 113).addBox(-2.0F, -2.0F, -3.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 126)
						.addBox(1.0F, -1.1F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 120).addBox(1.0F, -0.8F, -3.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 22)
						.addBox(1.0F, -8.0F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 54).addBox(0.0F, -8.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 38)
						.addBox(-4.0F, -8.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(65, 53).addBox(-2.0F, -8.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 40)
						.addBox(-1.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 116).addBox(-1.0F, -7.7F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(119, 105)
						.addBox(-2.0F, -7.7F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 101).addBox(-2.0F, -7.6F, 2.699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 106)
						.addBox(-2.0F, -7.0F, 1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 122).addBox(-3.0F, -6.0F, 2.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(111, 124)
						.addBox(-2.0F, -4.0F, 2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(119, 87).addBox(-1.0F, -3.0F, 2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(107, 124)
						.addBox(0.0F, -2.0F, 2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 42).addBox(1.0F, -7.0F, 3.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 49)
						.addBox(-1.0F, -7.0F, 3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 22).addBox(-4.0F, -2.0F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 50)
						.addBox(-4.0F, -7.0F, 3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(87, 60).addBox(-2.0F, -5.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 60)
						.addBox(-3.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 28).addBox(-3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(117, 81)
						.addBox(0.0F, -0.8F, 1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = golova.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 5).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -7.5F, -4.1F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r2 = golova.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -7.0F, -4.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r3 = golova.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2F, -5.9F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r4 = golova.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 13).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
				.addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 39).addBox(0.0F, -1.0F, -4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, -7.0F, 0.5F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r5 = golova.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 43).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2F, -6.5F, -2.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r6 = golova.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 39).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -5.4F, -3.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r7 = golova.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 27).addBox(1.0F, -2.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, -4.6F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r8 = golova.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 50).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -5.6F, -1.5F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r9 = golova.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -6.5F, -4.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r10 = golova.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 61).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -6.5F, -4.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r11 = golova.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -4.9F, -4.2F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r12 = golova.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(6, 52).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -6.0F, 1.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r13 = golova.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(2, 60).addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.2F, -5.3F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r14 = golova.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(42, 13).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1166F, -7.009F, 2.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r15 = golova.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(62, 52).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -6.5F, -4.2F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r16 = golova.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(36, 25).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -2.5F, -3.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r17 = golova.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(27, 43).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -3.2F, -1.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r18 = golova.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(39, 60).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -4.5F, -2.5F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r19 = golova.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(53, 62).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -5.0F, -5.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r20 = golova.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(2, 68).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -4.6F, -4.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r21 = golova.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 49).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -4.0F, -3.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r22 = golova.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 46).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -4.0F, 0.0F, 0.0F, 0.0F, 0.1222F));
		PartDefinition cube_r23 = golova.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(55, 62).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -3.0F, -4.1F, -0.0698F, 0.0F, 0.0F));
		PartDefinition cube_r24 = golova.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(2, 77).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -3.4F, -4.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition telo = partdefinition.addOrReplaceChild("telo",
				CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -6.0F, -1.0F, 8.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 4).addBox(-4.0F, -6.0F, -2.0F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 37)
						.addBox(0.0F, 2.0F, -2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 30).addBox(0.0F, -1.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 3)
						.addBox(0.0F, -6.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 50).addBox(2.0F, 0.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 54)
						.addBox(2.0F, -6.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 43).addBox(3.0F, -4.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 60)
						.addBox(3.0F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 27).addBox(0.0F, 4.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 42)
						.addBox(2.0F, 4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 43).addBox(-4.0F, -6.0F, 1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 25)
						.addBox(1.0F, -6.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 1).addBox(2.0F, -5.0F, 1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 11)
						.addBox(-4.0F, -3.0F, 1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 19).addBox(0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 44)
						.addBox(-4.0F, -1.0F, 1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 27).addBox(-4.0F, 1.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 48)
						.addBox(-4.0F, 2.0F, 1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 27).addBox(-2.0F, 4.0F, 1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 43)
						.addBox(0.0F, 2.0F, 1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 9).addBox(-1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 60)
						.addBox(3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 5).addBox(1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 112)
						.addBox(1.0F, -5.0F, 0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(103, 124).addBox(0.0F, -6.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 122)
						.addBox(0.0F, -1.0F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 96).addBox(-1.0F, 1.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 124)
						.addBox(-2.0F, 2.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(121, 123).addBox(2.0F, 0.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 121)
						.addBox(3.0F, 1.0F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(107, 115).addBox(1.0F, -6.0F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 119)
						.addBox(2.0F, -4.0F, -1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 123).addBox(3.0F, -1.0F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(123, 83)
						.addBox(3.0F, 4.0F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition cube_r25 = telo.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(2, 100).addBox(1.0F, 4.1653F, 0.9394F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(57, 62).addBox(0.0F, 3.3873F, 0.7889F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(51, 58)
						.addBox(-2.0F, 3.2888F, 0.7715F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(65, 16).addBox(-1.0F, 2.5896F, 0.6616F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(65, 18)
						.addBox(1.0F, 0.817F, 0.349F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -0.25F, -0.1282F, 0.0F, 1.5708F, 0.1745F));
		PartDefinition cube_r26 = telo.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(59, 62).addBox(1.0F, 2.2273F, 0.4683F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 61).addBox(0.0F, 0.2401F, 0.2225F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(63, 0)
						.addBox(-1.0F, 0.4296F, 0.2825F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(43, 61).addBox(0.0F, -0.7558F, 0.0606F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -0.25F, -0.1282F, 0.0F, 1.5708F, 0.1309F));
		PartDefinition cube_r27 = telo.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 63).addBox(-2.0F, 1.2371F, 0.2678F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, -0.25F, -0.1282F, 0.0F, 1.5708F, 0.0873F));
		PartDefinition cube_r28 = telo.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(59, 65).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 3.0F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r29 = telo.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(3, 102).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 4.7F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r30 = telo.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 64).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.2F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r31 = telo.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(22, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 2.0F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r32 = telo.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(2, 80).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 2.5F, -2.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r33 = telo.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(4, 62).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 5.1F, -3.2F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r34 = telo.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(2, 83).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 3.7F, -2.2F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r35 = telo.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(44, 56).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 5.5F, -2.1F, -0.1745F, 0.0F, 0.0F));
		PartDefinition LevRuka = partdefinition.addOrReplaceChild("LevRuka",
				CubeListBuilder.create().texOffs(82, 29).addBox(0.0F, -2.0F, -1.0F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 4).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 47)
						.addBox(2.0F, 4.0F, -2.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 56).addBox(0.0F, 6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 11)
						.addBox(0.0F, 9.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 44).addBox(1.0F, 4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(79, 60)
						.addBox(1.0F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 53).addBox(0.0F, -2.0F, 1.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 40)
						.addBox(0.0F, 9.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 48).addBox(2.0F, 7.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 60)
						.addBox(1.0F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 95).addBox(0.0F, 8.0F, 0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(123, 99)
						.addBox(0.0F, 7.0F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(91, 123).addBox(0.0F, 4.0F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 120)
						.addBox(1.0F, 5.0F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 123).addBox(0.0F, 7.0F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 3)
						.addBox(0.0F, 9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 12).addBox(3.0F, 9.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 114)
						.addBox(1.0F, 8.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(122, 79).addBox(0.0F, 9.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition PravRuka = partdefinition.addOrReplaceChild("PravRuka",
				CubeListBuilder.create().texOffs(64, 28).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(59, 25).addBox(-2.0F, 7.0F, -2.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-3.0F, 7.0F, -2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 69).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 61)
						.addBox(-4.0F, 7.0F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54).addBox(-4.0F, 7.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 27)
						.addBox(-4.0F, 7.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 29).addBox(-3.0F, 7.0F, 2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 92)
						.addBox(-1.0F, 7.0F, 2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 66).addBox(-2.0F, 7.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 54)
						.addBox(0.0F, 7.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(0.0F, 7.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 38)
						.addBox(-3.0F, 7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 21).addBox(-2.0F, 7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition cube_r36 = PravRuka.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(6, 61).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 4.5F, -1.5F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r37 = PravRuka.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(6, 49).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 2.8F, -1.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r38 = PravRuka.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(8, 61).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 0.8F, -1.5F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r39 = PravRuka.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(49, 52).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 3.7F, 1.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r40 = PravRuka.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(10, 61).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 3.5F, 0.5F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r41 = PravRuka.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(25, 57).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2F, 2.7F, -0.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r42 = PravRuka.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(18, 10).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 5.0F, 0.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r43 = PravRuka.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(21, 53).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 6.3F, -1.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r44 = PravRuka.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(12, 61).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 6.2F, -0.5F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r45 = PravRuka.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(34, 53).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 6.4F, 0.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r46 = PravRuka.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(14, 61).addBox(1.0F, -2.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, 6.9F, 1.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r47 = PravRuka.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(55, 65).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 3.8F, 2.1F, 0.1047F, 0.0F, 0.0F));
		PartDefinition cube_r48 = PravRuka.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(43, 63).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 4.5F, 2.1F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r49 = PravRuka.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(57, 65).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 6.3F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r50 = PravRuka.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(16, 62).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 5.7F, 2.1F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r51 = PravRuka.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(45, 63).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 4.8F, 2.2F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r52 = PravRuka.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(3, 98).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.0F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r53 = PravRuka.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 63).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 6.3F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r54 = PravRuka.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(16, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.4F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r55 = PravRuka.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(24, 62).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 1.8F, -2.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r56 = PravRuka.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(2, 50).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 3.1F, -2.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r57 = PravRuka.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(18, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 3.7F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r58 = PravRuka.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(26, 62).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 2.6F, -3.2F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r59 = PravRuka.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(26, 64).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 3.5F, -2.15F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r60 = PravRuka.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(20, 66).addBox(-0.5F, -1.0F, 0.05F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 4.8F, -2.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r61 = PravRuka.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(28, 64).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 4.5F, -2.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r62 = PravRuka.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(16, 59).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 5.5F, -2.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r63 = PravRuka.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(4, 60).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 6.3F, -2.1F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r64 = PravRuka.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(2, 74).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 6.5F, -2.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r65 = PravRuka.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(38, 53).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 8.0F, -2.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition LevNoga = partdefinition.addOrReplaceChild("LevNoga",
				CubeListBuilder.create().texOffs(114, 30).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(106, 18).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 52)
						.addBox(1.0F, 1.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 4).addBox(-2.0F, 2.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 50)
						.addBox(-2.0F, 5.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(107, 41).addBox(0.0F, 7.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 30)
						.addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(119, 66).addBox(1.1F, 6.3F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 123)
						.addBox(1.1F, 0.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 119).addBox(0.0F, -1.0F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 71)
						.addBox(0.0F, 1.0F, -1.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 88).addBox(-1.0F, 2.0F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(123, 73)
						.addBox(0.999F, 6.0F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition cube_r66 = LevNoga.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(4, 71).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 9.0F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r67 = LevNoga.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(2, 95).addBox(-0.5F, -1.5F, 0.05F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 6.5F, -2.2F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r68 = LevNoga.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(4, 83).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 10.1F, -2.3F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r69 = LevNoga.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(14, 65).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.8F, -2.2F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r70 = LevNoga.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(28, 12).addBox(-1.0F, -0.5F, -0.0704F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 11.5087F, 2.1004F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r71 = LevNoga.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(57, 15).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6F, 11.1F, 2.1F, 0.1484F, 0.0F, 0.0F));
		PartDefinition cube_r72 = LevNoga.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(62, 50).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 10.3F, -3.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r73 = LevNoga.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(55, 57).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0985F, 10.9826F, 0.5F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r74 = LevNoga.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0299F, 11.4974F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r75 = LevNoga.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(52, 9).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.1002F, -2.0461F, -0.1745F, 0.0F, 0.0F));
		PartDefinition PravNoga = partdefinition.addOrReplaceChild("PravNoga", CubeListBuilder.create().texOffs(112, 1).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition cube_r76 = PravNoga.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(1, 86).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.7F, 2.1F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r77 = PravNoga.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(3, 104).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.0F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r78 = PravNoga.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 2.3F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r79 = PravNoga.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(49, 63).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 4.2F, 2.1F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r80 = PravNoga.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(2, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 6.0F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r81 = PravNoga.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(4, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 5.5F, 2.1F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r82 = PravNoga.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(51, 63).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 10.5F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r83 = PravNoga.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(4, 49).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 9.2F, 2.1F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r84 = PravNoga.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(12, 59).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 6.8F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r85 = PravNoga.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(61, 63).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 9.2F, 2.1F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r86 = PravNoga.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(1, 103).addBox(-0.5F, -1.9F, 0.2F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 51).addBox(-1.5F, -1.0F, 0.1F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 11.0F, 2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r87 = PravNoga.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(18, 62).addBox(-0.5F, -2.0F, 0.2F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 10.0F, 2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r88 = PravNoga.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(63, 25).addBox(1.0F, -3.0404F, -0.1743F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(61, 58).addBox(-1.0F, -5.3165F, -0.5398F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 62)
						.addBox(-2.0F, -6.7F, -0.6912F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 63).addBox(0.0F, -2.439F, -0.146F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(47, 65)
						.addBox(-2.0F, -1.0533F, 0.0214F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(49, 61).addBox(0.0F, -0.7558F, 0.0606F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(63, 14)
						.addBox(-1.0F, 0.4296F, 0.2825F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 65).addBox(-2.0F, 0.2356F, 0.1911F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(47, 61)
						.addBox(0.0F, 0.2401F, 0.2225F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(63, 3).addBox(1.0F, 2.2273F, 0.4683F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, 5.75F, -0.1282F, 0.0F, 1.5708F, 0.1309F));
		PartDefinition cube_r89 = PravNoga.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, -5.6317F, -1.1088F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, 5.75F, -0.1282F, 0.0F, 1.5708F, 0.2182F));
		PartDefinition cube_r90 = PravNoga.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(53, 65).addBox(0.0F, -3.9431F, -0.1854F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(63, 7).addBox(-2.0F, 1.2371F, 0.2678F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, 5.75F, -0.1282F, 0.0F, 1.5708F, 0.0873F));
		PartDefinition cube_r91 = PravNoga.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(22, 63).addBox(-1.0F, -4.6882F, -0.6351F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 88).addBox(-2.0F, -3.8116F, -0.4671F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(59, 0)
						.addBox(-2.0F, -2.7185F, -0.2878F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 86).addBox(1.0F, 0.817F, 0.349F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 65)
						.addBox(-1.0F, 2.5896F, 0.6616F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 53).addBox(-2.0F, 3.2888F, 0.7715F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 63)
						.addBox(0.0F, 3.3873F, 0.7889F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 65).addBox(1.0F, 4.1653F, 0.9394F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 65)
						.addBox(1.0F, -3.9101F, -0.4845F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, 5.75F, -0.1282F, 0.0F, 1.5708F, 0.1745F));
		PartDefinition cube_r92 = PravNoga.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(63, 17).addBox(-1.0F, -1.1567F, 0.0737F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, 5.75F, -0.1282F, 0.0F, 1.5708F, 0.1309F));
		PartDefinition cube_r93 = PravNoga.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(32, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 2.8F, -2.1F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r94 = PravNoga.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(3, 40).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 4.2F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r95 = PravNoga.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(2, 30).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5F, -2.1F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r96 = PravNoga.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(4, 73).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.3F, -2.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r97 = PravNoga.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(62, 30).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r98 = PravNoga.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(32, 62).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 1.0F, -2.2F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r99 = PravNoga.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(3, 43).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 2.5F, -2.2F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r100 = PravNoga.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(34, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 2.9F, -2.1F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r101 = PravNoga.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(6, 65).addBox(-0.5F, -1.5F, 0.0496F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 4.7935F, -2.1996F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r102 = PravNoga.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(59, 47).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 4.5F, -2.2F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r103 = PravNoga.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(4, 75).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 5.7F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r104 = PravNoga.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(4, 77).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 7.6F, -2.1F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r105 = PravNoga.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(62, 32).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 6.0F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r106 = PravNoga.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(3, 46).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 6.1F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r107 = PravNoga.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(8, 65).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 7.7F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r108 = PravNoga.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(4, 79).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 7.0F, -2.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r109 = PravNoga.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(34, 62).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 8.0F, -2.2F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r110 = PravNoga.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(4, 81).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 9.4F, -2.1F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r111 = PravNoga.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(10, 65).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.5F, -2.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r112 = PravNoga.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 10.6F, -2.2F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r113 = PravNoga.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(12, 65).addBox(-0.5F, -1.5F, 0.05F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 9.5F, -2.2F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r114 = PravNoga.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(3, 53).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 10.7F, -2.2F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r115 = PravNoga.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(42, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 11.0F, -2.1F, -0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		golova.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		telo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LevRuka.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		PravRuka.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LevNoga.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		PravNoga.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.PravRuka.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.golova.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.golova.xRot = headPitch / (180F / (float) Math.PI);
		this.PravNoga.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LevRuka.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.LevNoga.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
