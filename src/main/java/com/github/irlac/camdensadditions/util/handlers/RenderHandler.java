package com.github.irlac.camdensadditions.util.handlers;

import com.github.irlac.camdensadditions.entity.Pinny.EntityPinny;
import com.github.irlac.camdensadditions.entity.Pinny.RenderPinny;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityPinny.class, new IRenderFactory<EntityPinny>() {
            @Override
            public Render<? super EntityPinny> createRenderFor(RenderManager manager) {
                return new RenderPinny(manager);
            }
        });
    }
}
