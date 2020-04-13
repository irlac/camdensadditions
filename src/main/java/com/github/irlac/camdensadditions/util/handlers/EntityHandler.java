package com.github.irlac.camdensadditions.util.handlers;

import com.github.irlac.camdensadditions.Main;
import com.github.irlac.camdensadditions.entity.Pinny.EntityPinny;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityHandler {
    public static void registerEntities() {
        registerEntity("pinny_wooh", EntityPinny.class, Main.ENTITY_PINNY, 50, 13310623, 65354);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int colour1, int colour2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Main.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, colour1, colour2);
    }

    private static void registerNonMobEntity() {

    }
}
