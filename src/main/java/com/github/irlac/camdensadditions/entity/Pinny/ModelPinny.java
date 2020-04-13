package com.github.irlac.camdensadditions.entity.Pinny;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelPinny extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer ears;
	private final ModelRenderer armL;
	private final ModelRenderer armR;
	private final ModelRenderer body;
	private final ModelRenderer legR;
	private final ModelRenderer legL;

	public ModelPinny() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 2.0F, 1.0F);
		head.cubeList.add(new ModelBox(head, 0, 19, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 26, 0, -2.0F, -4.0F, -5.0F, 4, 3, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -4.0F, -6.0F, 2, 1, 1, 0.0F, false));

		ears = new ModelRenderer(this);
		ears.setRotationPoint(0.0F, 22.0F, -1.0F);
		head.addChild(ears);
		ears.cubeList.add(new ModelBox(ears, 0, 23, -6.0F, -32.0F, 2.0F, 3, 3, 1, 0.0F, false));
		ears.cubeList.add(new ModelBox(ears, 0, 19, 3.0F, -32.0F, 2.0F, 3, 3, 1, 0.0F, false));

		armL = new ModelRenderer(this);
		armL.setRotationPoint(-7.0F, 3.5F, 1.0F);
		armL.cubeList.add(new ModelBox(armL, 32, 0, -2.0F, -1.5F, -2.0F, 4, 9, 4, 0.0F, false));

		armR = new ModelRenderer(this);
		armR.setRotationPoint(7.0F, 3.5F, 1.0F);
		armR.cubeList.add(new ModelBox(armR, 28, 31, -2.0F, -1.5F, -2.0F, 4, 9, 4, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 9.75F, -0.75F);
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -7.75F, -1.25F, 10, 13, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 31, 18, -5.0F, -2.75F, -2.25F, 10, 8, 1, 0.0F, false));

		legR = new ModelRenderer(this);
		legR.setRotationPoint(3.0F, 15.0F, 1.0F);
		legR.cubeList.add(new ModelBox(legR, 0, 35, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false));

		legL = new ModelRenderer(this);
		legL.setRotationPoint(-3.0F, 15.0F, 1.0F);
		legL.cubeList.add(new ModelBox(legL, 16, 40, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		armL.render(f5);
		armR.render(f5);
		body.render(f5);
		legR.render(f5);
		legL.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
	{
		head.rotateAngleY = netHeadYaw * 0.017453292F;
		head.rotateAngleX = headPitch * 0.017453292F;
		legL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount * 0.5F;
		legR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.5F;
		armL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		armR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
	}
}