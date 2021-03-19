package com.codenamerevy.additionalbarsbop.common;

import com.codenamerevy.additionalbars.common.AdditionalBars;
import com.codenamerevy.additionalbars.common.registry.ABBlocks;
import com.codenamerevy.additionalbars.common.registry.ABItems;
import com.codenamerevy.additionalbarsbop.common.registry.ABBlocksBOP;
import com.codenamerevy.additionalbarsbop.common.registry.ABItemsBOP;
import com.codenamerevy.additionalbarsbop.common.util.Remapper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AdditionalBarsBOP.MODID)
public class AdditionalBarsBOP {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "additionalbarsbop";

	public AdditionalBarsBOP() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ABBlocksBOP.BOP_BLOCKS.register(modEventBus);
		ABItemsBOP.BOP_ITEMS.register(modEventBus);

		//modEventBus.addListener(Remapper::remapBlockModId);
		//modEventBus.addListener(Remapper::remapItemModId);

		MinecraftForge.EVENT_BUS.register(this);

		AdditionalBars.LOGGER.info("Additional Bars - Biomes o' Plenty Addon has successfully loaded!");
	}
}
