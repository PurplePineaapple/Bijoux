package me.purplepineapple.bijoux.entity.entities;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ClamEntity extends WaterAnimal {
    public ClamEntity(EntityType<? extends ClamEntity> p_30341_, Level p_30342_) {
        super(p_30341_, p_30342_);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1.0D, 20));
    }


    @Override
    protected int getExperienceReward(Player player) {
        return 3 + this.random.nextInt(5);
    }

    // Sound events are placeholders
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.PUFFER_FISH_FLOP;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.PUFFER_FISH_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.PUFFER_FISH_HURT;
    }

}
