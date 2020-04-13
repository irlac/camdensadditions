package com.github.irlac.camdensadditions.events;

import com.github.irlac.camdensadditions.entity.Pinny.EntityPinny;
import com.github.irlac.camdensadditions.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class LootTableEvent {
    @SubscribeEvent
    public void customLootTableDrop(LivingDropsEvent event) {
        Random random = new Random();
        if(event.getEntityLiving() instanceof EntityPinny) {
            if(random.nextInt(3) == 0) {
                event.getEntityLiving().entityDropItem(new ItemStack(ModItems.YEETUS_CRYSTAL), 0.0F);
            }
            if(random.nextInt(50) == 0) {
                event.getEntityLiving().entityDropItem(new ItemStack(ModItems.YEETUS_SWORD), 0.0F);
            }
        }
    }
}
