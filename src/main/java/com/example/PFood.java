package com.example;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class PFood {
    public static final FoodComponent SHIT = new FoodComponent.Builder()
            .hunger(1).saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,600),1f)
            .alwaysEdible()
            .build();
}
