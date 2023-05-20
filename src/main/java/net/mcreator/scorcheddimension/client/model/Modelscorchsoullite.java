package net.mcreator.scorcheddimension.client.model;

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
public class Modelscorchsoullite<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("scorcheddimension", "modelscorchsoullite"), "main");
	public final ModelPart golova;
	public final ModelPart telo;
	public final ModelPart LevRuka;
	public final ModelPart PravRuka;
	public final ModelPart LevNoga;
	public final ModelPart PravNoga;

	public Modelscorchsoullite(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 17).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 15)
						.addBox(-4.0F, -1.0F, -4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 58).addBox(-4.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 30)
						.addBox(3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 54).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 36)
						.addBox(-4.0F, -3.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 51).addBox(2.0F, -3.0F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 24)
						.addBox(-2.0F, -3.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0).addBox(-4.0F, -8.0F, -3.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 0)
						.addBox(-3.999F, -8.1F, -3.999F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 42).addBox(-4.099F, -8.1F, -1.999F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 39)
						.addBox(1.0F, -4.0F, -3.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 28).addBox(-3.0F, -4.0F, -3.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 22)
						.addBox(-2.0F, -2.0F, -3.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 25).addBox(1.0F, -1.1F, -3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 13)
						.addBox(1.0F, -0.8F, -3.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 22).addBox(1.0F, -8.0F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 9)
						.addBox(0.0F, -8.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 38).addBox(-4.0F, -8.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 51)
						.addBox(-2.0F, -8.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 58).addBox(-1.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 48)
						.addBox(-1.0F, -7.7F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 16).addBox(-2.0F, -7.7F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 6)
						.addBox(-2.0F, -7.6F, 2.699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 40).addBox(-2.0F, -7.0F, 1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 54)
						.addBox(-3.0F, -6.0F, 2.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 41).addBox(-2.0F, -4.0F, 2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 0)
						.addBox(-1.0F, -3.0F, 2.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 56).addBox(0.0F, -2.0F, 2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(1.0F, -7.0F, 3.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 47).addBox(-1.0F, -7.0F, 3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 44)
						.addBox(-4.0F, -2.0F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 49).addBox(-4.0F, -7.0F, 3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 58)
						.addBox(-2.0F, -5.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(-3.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 54)
						.addBox(-3.0F, -3.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 33).addBox(0.0F, -0.8F, 1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = golova.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 3).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -7.5F, -4.1F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r2 = golova.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -7.0F, -4.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r3 = golova.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -6.5F, -4.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r4 = golova.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 32).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -6.5F, -4.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r5 = golova.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 40).addBox(0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.2F, -5.3F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r6 = golova.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 58).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -6.5F, -4.2F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r7 = golova.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 58).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -5.0F, -5.1F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r8 = golova.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 40).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -4.6F, -4.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r9 = golova.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -3.4F, -4.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition telo = partdefinition.addOrReplaceChild("telo",
				CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -6.0F, -1.0F, 8.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 4).addBox(-4.0F, -6.0F, -2.0F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 45)
						.addBox(0.0F, 2.0F, -2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 41).addBox(0.0F, -1.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 5)
						.addBox(0.0F, -6.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 56).addBox(2.0F, 0.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 53)
						.addBox(2.0F, -6.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 54).addBox(3.0F, -4.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 17)
						.addBox(3.0F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 48).addBox(0.0F, 4.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 15)
						.addBox(2.0F, 4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 43).addBox(-4.0F, -6.0F, 1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 3)
						.addBox(1.0F, -6.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.0F, -5.0F, 1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 12)
						.addBox(-4.0F, -3.0F, 1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 57).addBox(0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 35)
						.addBox(-4.0F, -1.0F, 1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 27).addBox(-4.0F, 1.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 47)
						.addBox(-4.0F, 2.0F, 1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 27).addBox(-2.0F, 4.0F, 1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 38)
						.addBox(0.0F, 2.0F, 1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 13).addBox(-1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 11)
						.addBox(3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 4).addBox(1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 47)
						.addBox(1.0F, -5.0F, 0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 22).addBox(0.0F, -6.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 5)
						.addBox(0.0F, -1.0F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 56).addBox(-1.0F, 1.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 56)
						.addBox(-2.0F, 2.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 55).addBox(2.0F, 0.0F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(3.0F, 1.0F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 47).addBox(1.0F, -6.0F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 50)
						.addBox(2.0F, -4.0F, -1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 55).addBox(3.0F, -1.0F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 9)
						.addBox(3.0F, 4.0F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition LevRuka = partdefinition.addOrReplaceChild("LevRuka",
				CubeListBuilder.create().texOffs(30, 29).addBox(0.0F, -2.0F, -1.0F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 44).addBox(2.0F, 4.0F, -2.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 19)
						.addBox(0.0F, 6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 54).addBox(0.0F, 9.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 58)
						.addBox(1.0F, 4.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 46).addBox(1.0F, 8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(0.0F, -2.0F, 1.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 4).addBox(0.0F, 9.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 30)
						.addBox(2.0F, 7.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 56).addBox(1.0F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 29)
						.addBox(0.0F, 8.0F, 0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 44).addBox(0.0F, 7.0F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 55)
						.addBox(0.0F, 4.0F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 22).addBox(1.0F, 5.0F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 55)
						.addBox(0.0F, 7.0F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 33).addBox(0.0F, 9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 51)
						.addBox(3.0F, 9.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 46).addBox(1.0F, 8.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 51)
						.addBox(0.0F, 9.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition PravRuka = partdefinition.addOrReplaceChild("PravRuka",
				CubeListBuilder.create().texOffs(0, 27).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 51).addBox(-2.0F, 7.0F, -2.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 16)
						.addBox(-3.0F, 7.0F, -2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 51).addBox(-4.0F, 7.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 57)
						.addBox(-4.0F, 7.0F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 25).addBox(-4.0F, 7.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-4.0F, 7.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(-3.0F, 7.0F, 2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 58)
						.addBox(-1.0F, 7.0F, 2.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 48).addBox(-2.0F, 7.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 27)
						.addBox(0.0F, 7.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 11).addBox(0.0F, 7.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 34)
						.addBox(-3.0F, 7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 58).addBox(-2.0F, 7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition cube_r10 = PravRuka.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 8.0F, -2.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition LevNoga = partdefinition.addOrReplaceChild("LevNoga",
				CubeListBuilder.create().texOffs(16, 29).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 52).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 49)
						.addBox(1.0F, 1.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 18).addBox(-2.0F, 2.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-2.0F, 5.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 26).addBox(0.0F, 7.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 30)
						.addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 53).addBox(1.1F, 6.3F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 55)
						.addBox(1.1F, 0.0F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 45).addBox(0.0F, -1.0F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 6)
						.addBox(0.0F, 1.0F, -1.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-1.0F, 2.0F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(0.999F, 6.0F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition PravNoga = partdefinition.addOrReplaceChild("PravNoga", CubeListBuilder.create().texOffs(20, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
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
