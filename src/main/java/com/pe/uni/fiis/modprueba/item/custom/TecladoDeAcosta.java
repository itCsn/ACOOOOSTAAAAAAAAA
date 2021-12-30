package com.pe.uni.fiis.modprueba.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;



public class TecladoDeAcosta extends SwordItem{

    public TecladoDeAcosta(Tier tier, int dmg, float speed, Properties propiedades) {
        super(tier, dmg, speed, propiedades);
    }

    @Override
    public boolean hurtEnemy(ItemStack item, LivingEntity objective, LivingEntity player) {
        item.hurtAndBreak(1, player, (p_43296_) -> {
            p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });

         objective.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,400));
         objective.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,400));

        return true;
    }
}
