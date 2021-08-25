package com.gamma1772.additionalbarsbop.client;

import com.gamma1772.additionalbars.common.AdditionalBars;
import com.gamma1772.additionalbarsbop.common.AdditionalBarsBOP;
import com.gamma1772.additionalbarsbop.common.registry.ABBlocksBOP;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = AdditionalBarsBOP.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientABBOP {

	public ClientABBOP()
	{
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		//modEventBus.addListener(this::clientSetup);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void clientSetup (final FMLClientSetupEvent event) {
		AdditionalBars.LOGGER.debug("[ADDITIONAL BARS BOP] Doing client stuff...");

		RenderTypeLookup.setRenderLayer(ABBlocksBOP.FIR_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.REDWOOD_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CHERRY_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.MAHOGANY_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.JACARANDA_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.PALM_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.WILLOW_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.DEAD_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.MAGIC_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.UMBRAN_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HELLBARK_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_FIR_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_REDWOOD_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_CHERRY_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_MAHOGANY_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_JACARANDA_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_PALM_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_WILLOW_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_DEAD_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_MAGIC_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_UMBRAN_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.CROSSED_HELLBARK_BARS.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_FIR_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_REDWOOD_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CHERRY_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_MAHOGANY_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_JACARANDA_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_PALM_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_WILLOW_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_DEAD_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_MAGIC_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_UMBRAN_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_HELLBARK_BARS.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_FIR_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_REDWOOD_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_CHERRY_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_MAHOGANY_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_JACARANDA_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_PALM_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_WILLOW_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_DEAD_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_MAGIC_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_UMBRAN_BARS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ABBlocksBOP.HORIZONTAL_CROSSED_HELLBARK_BARS.get(), RenderType.cutout());
	}
}
