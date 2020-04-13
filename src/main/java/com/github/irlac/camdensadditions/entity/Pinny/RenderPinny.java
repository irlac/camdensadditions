package com.github.irlac.camdensadditions.entity.Pinny;

import com.github.irlac.camdensadditions.Main;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPinny extends RenderLiving<EntityPinny> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID + ":textures/entities/pinny_wooh.png");

    public RenderPinny(RenderManager renderManager) {
        super(renderManager, new ModelPinny(), 0.2F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPinny entity) {
        return TEXTURE;
    }
}
