package com.pe.uni.fiis.modprueba;

import com.pe.uni.fiis.modprueba.item.ModItem;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ModPrueba.Mod_ID)

public class ModPrueba {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String Mod_ID = "modprueba";
    public static final CreativeModeTab ACOSTA_GROUP = new AcostaGroup("AcostaTab");

    public ModPrueba() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItem.register(eventBus);
        eventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    public static class AcostaGroup extends CreativeModeTab{

        public AcostaGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ModItem.STICKACOSTA.get().getDefaultInstance();
        }

    }
}