package com.github.irlac.camdensadditions.util.handlers;

import com.github.irlac.camdensadditions.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSoundHandler {
    public static SoundEvent ENTITY_PINNY_AMBIENT, ENTITY_PINNY_HURT, ENTITY_PINNY_DEATH, ENTITY_PINNY_STEP;

    public static void registerSounds() {
        ENTITY_PINNY_AMBIENT = registerSound("entity.pinny.pinny_ambient");
        ENTITY_PINNY_HURT = registerSound("entity.pinny.pinny_hurt");
        ENTITY_PINNY_DEATH = registerSound("entity.pinny.pinny_death");
        ENTITY_PINNY_STEP = registerSound("entity.pinny.pinny_step");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Main.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
