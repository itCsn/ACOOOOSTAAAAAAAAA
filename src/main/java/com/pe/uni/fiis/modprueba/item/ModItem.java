package com.pe.uni.fiis.modprueba.item;

import com.pe.uni.fiis.modprueba.ModPrueba;
import com.pe.uni.fiis.modprueba.item.custom.Notebook;
import com.pe.uni.fiis.modprueba.item.custom.TecladoDeAcosta;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModPrueba.Mod_ID);
    
        public static final RegistryObject<Item> STICKACOSTA = ITEMS.register("stickacostaa",
            () -> new Item(new Item.Properties().stacksTo(16).tab(ModPrueba.ACOSTA_GROUP)));

        public static final RegistryObject<Item> NOTEBOOK = ITEMS.register("notebook",
            () -> new Notebook(new Item.Properties().stacksTo(64).tab(ModPrueba.ACOSTA_GROUP)));

        public static final RegistryObject<Item> HACHAPRUEBA = ITEMS.register("hacha_prueba", 
            () -> new AxeItem(Tiers.DIAMOND, 12.0f, 1.0f, new Item.Properties().defaultDurability(200).tab(ModPrueba.ACOSTA_GROUP)));

        public static final RegistryObject<Item> TECLADOACOSTA = ITEMS.register("teclado_acosta",
            () -> new TecladoDeAcosta(Tiers.IRON, 5, 1.0f, new Item.Properties().tab(ModPrueba.ACOSTA_GROUP).durability(1000).rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
   }
}