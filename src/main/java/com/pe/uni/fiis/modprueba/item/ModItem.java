package com.pe.uni.fiis.modprueba.item;

import com.pe.uni.fiis.modprueba.ModPrueba;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {

    //creacion del registro de items del mod
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModPrueba.Mod_ID);
    

    //agregando items basicos al registro
    public static final RegistryObject<Item> STICKACOSTA = ITEMS.register("stickacostaa",
            () -> new Item(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_MISC)));

    //agregando herramientas
    
    //agregando armas al registro

    //agregando items finales/especiales

    //agregando huevos spawners


   public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
   }
}