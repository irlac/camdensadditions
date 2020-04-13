package com.github.irlac.camdensadditions.entity.Pinny;

import com.github.irlac.camdensadditions.util.handlers.ModSoundHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityPinny extends EntityCreature {
    public EntityPinny(World worldIn) {
        super(worldIn);
        this.setSize(0.9F, 1.9F);
    }

    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        return ModSoundHandler.ENTITY_PINNY_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return ModSoundHandler.ENTITY_PINNY_HURT;
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSoundHandler.ENTITY_PINNY_DEATH;
    }

    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15F, 1.0F);
    }

    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause);
    }

    public void travel(float strafe, float vertical, float forward)
    {
        this.stepHeight = 0.5F;
        this.jumpMovementFactor = 0.02F;
        super.travel(strafe, vertical, forward);
    }
}