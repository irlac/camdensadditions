package com.github.irlac.camdensadditions.util.handlers;

import com.github.irlac.camdensadditions.events.LootTableEvent;
import net.minecraftforge.common.MinecraftForge;

public class ModEventHandler {
    public static void registerEvents() {
        LootTableEvent lootEvent = new LootTableEvent();

        MinecraftForge.EVENT_BUS.register(lootEvent);
    }
}
