package com.codenamerevy.additionalbarsbop.common.util;

import com.codenamerevy.additionalbarsbop.common.AdditionalBarsBOP;
import com.codenamerevy.additionalbarsbop.common.registry.ABBlocksBOP;
import com.codenamerevy.additionalbarsbop.common.registry.ABItemsBOP;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//Oh no... TODO: Fix or remove this Y*ndereDev shit
@Mod.EventBusSubscriber(modid = AdditionalBarsBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Remapper {

	@SubscribeEvent
	public static void remapBlockModId(RegistryEvent.MissingMappings<Block> mappings) {
		AdditionalBarsBOP.LOGGER.debug("Checking Block mappings...");
		for (RegistryEvent.MissingMappings.Mapping<Block> entry : mappings.getAllMappings()) {
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("fir_bars")) { entry.remap(ABBlocksBOP.FIR_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("redwood_bars")) { entry.remap(ABBlocksBOP.REDWOOD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("cherry_bars")) { entry.remap(ABBlocksBOP.CHERRY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("mahogany_bars")) { entry.remap(ABBlocksBOP.MAHOGANY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("jacaranda_bars")) { entry.remap(ABBlocksBOP.JACARANDA_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("palm_bars")) { entry.remap(ABBlocksBOP.PALM_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("willow_bars")) { entry.remap(ABBlocksBOP.WILLOW_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("dead_bars")) { entry.remap(ABBlocksBOP.DEAD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("magic_bars")) { entry.remap(ABBlocksBOP.MAGIC_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("umbran_bars")) { entry.remap(ABBlocksBOP.UMBRAN_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("hellbark_bars")) { entry.remap(ABBlocksBOP.HELLBARK_BARS.get()); }

			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_fir_bars")) { entry.remap(ABBlocksBOP.CROSSED_FIR_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_redwood_bars")) { entry.remap(ABBlocksBOP.CROSSED_REDWOOD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_cherry_bars")) { entry.remap(ABBlocksBOP.CROSSED_CHERRY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_mahogany_bars")) { entry.remap(ABBlocksBOP.CROSSED_MAHOGANY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_jacaranda_bars")) { entry.remap(ABBlocksBOP.CROSSED_JACARANDA_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_palm_bars")) { entry.remap(ABBlocksBOP.CROSSED_PALM_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_willow_bars")) { entry.remap(ABBlocksBOP.CROSSED_WILLOW_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_dead_bars")) { entry.remap(ABBlocksBOP.CROSSED_DEAD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_magic_bars")) { entry.remap(ABBlocksBOP.CROSSED_MAGIC_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_umbran_bars")) { entry.remap(ABBlocksBOP.CROSSED_UMBRAN_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_hellbark_bars")) { entry.remap(ABBlocksBOP.CROSSED_HELLBARK_BARS.get()); }

			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_fir_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_FIR_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_redwood_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_REDWOOD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_cherry_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CHERRY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_mahogany_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_MAHOGANY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_jacaranda_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_JACARANDA_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_palm_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_PALM_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_willow_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_WILLOW_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_dead_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_DEAD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_magic_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_MAGIC_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_umbran_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_UMBRAN_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_hellbark_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_HELLBARK_BARS.get()); }

			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_fir_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_FIR_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_redwood_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_REDWOOD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_cherry_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_CHERRY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_mahogany_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_MAHOGANY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_jacaranda_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_JACARANDA_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_palm_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_PALM_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_willow_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_WILLOW_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_dead_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_DEAD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_magic_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_MAGIC_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_umbran_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_UMBRAN_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_hellbark_bars")) { entry.remap(ABBlocksBOP.HORIZONTAL_CROSSED_HELLBARK_BARS.get()); }
		}
	}

	@SubscribeEvent
	public static void remapItemModId(RegistryEvent.MissingMappings<Item> mappings) {
		AdditionalBarsBOP.LOGGER.debug("Checking Item mappings...");
		for (RegistryEvent.MissingMappings.Mapping<Item> entry : mappings.getAllMappings()) {
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("fir_bars")) { entry.remap(ABItemsBOP.FIR_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("redwood_bars")) { entry.remap(ABItemsBOP.REDWOOD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("cherry_bars")) { entry.remap(ABItemsBOP.CHERRY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("mahogany_bars")) { entry.remap(ABItemsBOP.MAHOGANY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("jacaranda_bars")) { entry.remap(ABItemsBOP.JACARANDA_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("palm_bars")) { entry.remap(ABItemsBOP.PALM_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("willow_bars")) { entry.remap(ABItemsBOP.WILLOW_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("dead_bars")) { entry.remap(ABItemsBOP.DEAD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("magic_bars")) { entry.remap(ABItemsBOP.MAGIC_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("umbran_bars")) { entry.remap(ABItemsBOP.UMBRAN_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("hellbark_bars")) { entry.remap(ABItemsBOP.HELLBARK_BARS.get()); }

			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_fir_bars")) { entry.remap(ABItemsBOP.CROSSED_FIR_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_redwood_bars")) { entry.remap(ABItemsBOP.CROSSED_REDWOOD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_cherry_bars")) { entry.remap(ABItemsBOP.CROSSED_CHERRY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_mahogany_bars")) { entry.remap(ABItemsBOP.CROSSED_MAHOGANY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_jacaranda_bars")) { entry.remap(ABItemsBOP.CROSSED_JACARANDA_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_palm_bars")) { entry.remap(ABItemsBOP.CROSSED_PALM_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_willow_bars")) { entry.remap(ABItemsBOP.CROSSED_WILLOW_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_dead_bars")) { entry.remap(ABItemsBOP.CROSSED_DEAD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_magic_bars")) { entry.remap(ABItemsBOP.CROSSED_MAGIC_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_umbran_bars")) { entry.remap(ABItemsBOP.CROSSED_UMBRAN_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("crossed_hellbark_bars")) { entry.remap(ABItemsBOP.CROSSED_HELLBARK_BARS.get()); }

			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_fir_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_FIR_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_redwood_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_REDWOOD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_cherry_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CHERRY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_mahogany_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_MAHOGANY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_jacaranda_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_JACARANDA_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_palm_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_PALM_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_willow_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_WILLOW_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_dead_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_DEAD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_magic_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_MAGIC_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_umbran_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_UMBRAN_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_hellbark_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_HELLBARK_BARS.get()); }

			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_fir_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_FIR_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_redwood_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_REDWOOD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_cherry_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_CHERRY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_mahogany_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_MAHOGANY_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_jacaranda_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_JACARANDA_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_palm_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_PALM_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_willow_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_WILLOW_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_dead_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_DEAD_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_magic_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_MAGIC_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_umbran_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_UMBRAN_BARS.get()); }
			if (entry.key.getNamespace().equals("additionalbars") && entry.key.getPath().equals("horizontal_crossed_hellbark_bars")) { entry.remap(ABItemsBOP.HORIZONTAL_CROSSED_HELLBARK_BARS.get()); }
		}

	}
}
