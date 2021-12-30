package com.pe.uni.fiis.modprueba.item;

import com.pe.uni.fiis.modprueba.ModPrueba;
import com.pe.uni.fiis.modprueba.item.custom.Notebook;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModPrueba.Mod_ID);
    
    public static final RegistryObject<Item> STICKACOSTA = ITEMS.register("stickacostaa",
            () -> new Item(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> NOTEBOOK = ITEMS.register("notebook",
            () -> new Notebook(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
   }
}