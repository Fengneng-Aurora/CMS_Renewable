package com.cms.cmsrenewable;

import com.cms.cmsrenewable.groups.ModGroup;
import com.cms.cmsrenewable.index.CMSRItems;
import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

@Mod (CMSRenewable.MODID)
public class CMSRenewable {
    private static final Logger LOGGER = LogUtils.getLogger();

    private static final NonNullSupplier <CreateRegistrate> registrate = CreateRegistrate.lazy(CMSRenewable.MODID);

    public static final String MODID = "cmsrenewable";

    public CMSRenewable() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        MinecraftForge.EVENT_BUS.register(this);

        new ModGroup("base");

        CMSRItems.register();
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("CMSRenewable loaded.");
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // Some example code to dispatch IMC to another mod
        //InterModComms.sendTo("cmsrenewable", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("CMSRenewable started in the server");

    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry (final RegistryEvent.Register<Block> blockRegistryEvent) {
            // Register a new block here

        }
    }

    public static CreateRegistrate registrate() {
        return registrate.get();
    }
}
