package com.gamma1772.additionalbarsbop.common;

import com.gamma1772.additionalbars.common.AdditionalBars;
import com.gamma1772.additionalbarsbop.common.registry.ABBlocksBOP;
import com.gamma1772.additionalbarsbop.common.registry.ABItemsBOP;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

@Mod(AdditionalBarsBOP.MODID)
public class AdditionalBarsBOP {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "additionalbarsbop";

	public static AdditionalBarsBOP INSTANCE;

	public AdditionalBarsBOP() {
		INSTANCE = this;
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ABBlocksBOP.BOP_BLOCKS.register(modEventBus);
		ABItemsBOP.BOP_ITEMS.register(modEventBus);

		MinecraftForge.EVENT_BUS.register(this);

		AdditionalBars.LOGGER.info("Additional Bars - Biomes o' Plenty Addon has successfully loaded!");
	}

 	/**The code below is used to remap Biomes o' Plenty bars blocks and items from namespace 'additionalbars' to 'additionalbarsbop'
	  * @method handleMissingMappings is from the Mantle lib and it's here for the sole reason that I only needed that part and nothing else from Mantle
	  * @method missingBlock and missingItems contain what blocks and items need to be remapped
	  * @method remapMissingBlocks and remapMissingItems are called on world load. They call handleMissingMappings.
	  **/

	//Mantle event for fixing missing mappings, it's here so I don't have to include the whole Mantle lib for one method
	private static <T extends IForgeRegistryEntry<T>> void handleMissingMappings(RegistryEvent.MissingMappings<T> event, String modID, Function<String, T> handler) {
		for (RegistryEvent.MissingMappings.Mapping<T> mapping : event.getAllMappings()) {
			if (modID.equals(mapping.key.getNamespace())) {
				T value = handler.apply(mapping.key.getPath());
				if (value != null) {
					mapping.remap(value);
					LOGGER.debug("Remapped " + value.toString());
				}
			}
		}
	}

	private static Block missingBlock(String name) {
		LOGGER.debug("Checking for missing blocks...");
		switch(name) {
			//case "test_bars": return ABBlocksBOP.FIR_BARS.get();
			case "fir_bars": return ABBlocksBOP.FIR_BARS.get();
			case "dead_bars": return ABBlocksBOP.DEAD_BARS.get();
			case "redwood_bars": return ABBlocksBOP.REDWOOD_BARS.get();
			case "willow_bars": return ABBlocksBOP.WILLOW_BARS.get();
			case "jacaranda_bars": return ABBlocksBOP.JACARANDA_BARS.get();
			case "magic_bars": return ABBlocksBOP.MAGIC_BARS.get();
			case "mahogany_bars": return ABBlocksBOP.MAHOGANY_BARS.get();
			case "umbran_bars": return ABBlocksBOP.UMBRAN_BARS.get();
			case "palm_bars": return ABBlocksBOP.PALM_BARS.get();
			case "hellbark_bars": return ABBlocksBOP.HELLBARK_BARS.get();
			case "cherry_bars": return ABBlocksBOP.CHERRY_BARS.get();

			case "crossed_fir_bars": return ABBlocksBOP.CROSSED_FIR_BARS.get();
			case "crossed_dead_bars": return ABBlocksBOP.CROSSED_DEAD_BARS.get();
			case "crossed_redwood_bars": return ABBlocksBOP.CROSSED_REDWOOD_BARS.get();
			case "crossed_willow_bars": return ABBlocksBOP.CROSSED_WILLOW_BARS.get();
			case "crossed_jacaranda_bars": return ABBlocksBOP.CROSSED_JACARANDA_BARS.get();
			case "crossed_magic_bars": return ABBlocksBOP.CROSSED_MAGIC_BARS.get();
			case "crossed_mahogany_bars": return ABBlocksBOP.CROSSED_MAHOGANY_BARS.get();
			case "crossed_umbran_bars": return ABBlocksBOP.CROSSED_UMBRAN_BARS.get();
			case "crossed_palm_bars": return ABBlocksBOP.CROSSED_PALM_BARS.get();
			case "crossed_hellbark_bars": return ABBlocksBOP.CROSSED_HELLBARK_BARS.get();
			case "crossed_cherry_bars": return ABBlocksBOP.CROSSED_CHERRY_BARS.get();

			case "horizontal_fir_bars": return ABBlocksBOP.HORIZONTAL_FIR_BARS.get();
			case "horizontal_dead_bars": return ABBlocksBOP.HORIZONTAL_DEAD_BARS.get();
			case "horizontal_redwood_bars": return ABBlocksBOP.HORIZONTAL_REDWOOD_BARS.get();
			case "horizontal_willow_bars": return ABBlocksBOP.HORIZONTAL_WILLOW_BARS.get();
			case "horizontal_jacaranda_bars": return ABBlocksBOP.HORIZONTAL_JACARANDA_BARS.get();
			case "horizontal_magic_bars": return ABBlocksBOP.HORIZONTAL_MAGIC_BARS.get();
			case "horizontal_mahogany_bars": return ABBlocksBOP.HORIZONTAL_MAHOGANY_BARS.get();
			case "horizontal_umbran_bars": return ABBlocksBOP.HORIZONTAL_UMBRAN_BARS.get();
			case "horizontal_palm_bars": return ABBlocksBOP.HORIZONTAL_PALM_BARS.get();
			case "horizontal_hellbark_bars": return ABBlocksBOP.HORIZONTAL_HELLBARK_BARS.get();
			case "horizontal_cherry_bars": return ABBlocksBOP.HORIZONTAL_CHERRY_BARS.get();

			case "horizontal_crossed_fir_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_FIR_BARS.get();
			case "horizontal_crossed_dead_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_DEAD_BARS.get();
			case "horizontal_crossed_redwood_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_REDWOOD_BARS.get();
			case "horizontal_crossed_willow_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_WILLOW_BARS.get();
			case "horizontal_crossed_jacaranda_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_JACARANDA_BARS.get();
			case "horizontal_crossed_magic_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_MAGIC_BARS.get();
			case "horizontal_crossed_mahogany_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_MAHOGANY_BARS.get();
			case "horizontal_crossed_umbran_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_UMBRAN_BARS.get();
			case "horizontal_crossed_palm_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_PALM_BARS.get();
			case "horizontal_crossed_hellbark_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_HELLBARK_BARS.get();
			case "horizontal_crossed_cherry_bars": return ABBlocksBOP.HORIZONTAL_CROSSED_CHERRY_BARS.get();
		}
		return null;
	}
	private static Item missingItem(String name) {
		LOGGER.debug("Checking for missing items...");
		switch(name) {
			//case "test": return ABItemsBOP.FIR_BARS.get();
			case "fir_bars": return ABItemsBOP.FIR_BARS.get();
			case "dead_bars": return ABItemsBOP.DEAD_BARS.get();
			case "redwood_bars": return ABItemsBOP.REDWOOD_BARS.get();
			case "willow_bars": return ABItemsBOP.WILLOW_BARS.get();
			case "jacaranda_bars": return ABItemsBOP.JACARANDA_BARS.get();
			case "magic_bars": return ABItemsBOP.MAGIC_BARS.get();
			case "mahogany_bars": return ABItemsBOP.MAHOGANY_BARS.get();
			case "umbran_bars": return ABItemsBOP.UMBRAN_BARS.get();
			case "palm_bars": return ABItemsBOP.PALM_BARS.get();
			case "hellbark_bars": return ABItemsBOP.HELLBARK_BARS.get();
			case "cherry_bars": return ABItemsBOP.CHERRY_BARS.get();

			case "crossed_fir_bars": return ABItemsBOP.CROSSED_FIR_BARS.get();
			case "crossed_dead_bars": return ABItemsBOP.CROSSED_DEAD_BARS.get();
			case "crossed_redwood_bars": return ABItemsBOP.CROSSED_REDWOOD_BARS.get();
			case "crossed_willow_bars": return ABItemsBOP.CROSSED_WILLOW_BARS.get();
			case "crossed_jacaranda_bars": return ABItemsBOP.CROSSED_JACARANDA_BARS.get();
			case "crossed_magic_bars": return ABItemsBOP.CROSSED_MAGIC_BARS.get();
			case "crossed_mahogany_bars": return ABItemsBOP.CROSSED_MAHOGANY_BARS.get();
			case "crossed_umbran_bars": return ABItemsBOP.CROSSED_UMBRAN_BARS.get();
			case "crossed_palm_bars": return ABItemsBOP.CROSSED_PALM_BARS.get();
			case "crossed_hellbark_bars": return ABItemsBOP.CROSSED_HELLBARK_BARS.get();
			case "crossed_cherry_bars": return ABItemsBOP.CROSSED_CHERRY_BARS.get();

			case "horizontal_fir_bars": return ABItemsBOP.HORIZONTAL_FIR_BARS.get();
			case "horizontal_dead_bars": return ABItemsBOP.HORIZONTAL_DEAD_BARS.get();
			case "horizontal_redwood_bars": return ABItemsBOP.HORIZONTAL_REDWOOD_BARS.get();
			case "horizontal_willow_bars": return ABItemsBOP.HORIZONTAL_WILLOW_BARS.get();
			case "horizontal_jacaranda_bars": return ABItemsBOP.HORIZONTAL_JACARANDA_BARS.get();
			case "horizontal_magic_bars": return ABItemsBOP.HORIZONTAL_MAGIC_BARS.get();
			case "horizontal_mahogany_bars": return ABItemsBOP.HORIZONTAL_MAHOGANY_BARS.get();
			case "horizontal_umbran_bars": return ABItemsBOP.HORIZONTAL_UMBRAN_BARS.get();
			case "horizontal_palm_bars": return ABItemsBOP.HORIZONTAL_PALM_BARS.get();
			case "horizontal_hellbark_bars": return ABItemsBOP.HORIZONTAL_HELLBARK_BARS.get();
			case "horizontal_cherry_bars": return ABItemsBOP.HORIZONTAL_CHERRY_BARS.get();

			case "horizontal_crossed_fir_bars": return ABItemsBOP.HORIZONTAL_CROSSED_FIR_BARS.get();
			case "horizontal_crossed_dead_bars": return ABItemsBOP.HORIZONTAL_CROSSED_DEAD_BARS.get();
			case "horizontal_crossed_redwood_bars": return ABItemsBOP.HORIZONTAL_CROSSED_REDWOOD_BARS.get();
			case "horizontal_crossed_willow_bars": return ABItemsBOP.HORIZONTAL_CROSSED_WILLOW_BARS.get();
			case "horizontal_crossed_jacaranda_bars": return ABItemsBOP.HORIZONTAL_CROSSED_JACARANDA_BARS.get();
			case "horizontal_crossed_magic_bars": return ABItemsBOP.HORIZONTAL_CROSSED_MAGIC_BARS.get();
			case "horizontal_crossed_mahogany_bars": return ABItemsBOP.HORIZONTAL_CROSSED_MAHOGANY_BARS.get();
			case "horizontal_crossed_umbran_bars": return ABItemsBOP.HORIZONTAL_CROSSED_UMBRAN_BARS.get();
			case "horizontal_crossed_palm_bars": return ABItemsBOP.HORIZONTAL_CROSSED_PALM_BARS.get();
			case "horizontal_crossed_hellbark_bars": return ABItemsBOP.HORIZONTAL_CROSSED_HELLBARK_BARS.get();
			case "horizontal_crossed_cherry_bars": return ABItemsBOP.HORIZONTAL_CROSSED_CHERRY_BARS.get();
		}
		IItemProvider block = missingBlock(name);
		return block == null ? null : block.asItem();
	}

	@SubscribeEvent
	void remapMissingItems(final RegistryEvent.MissingMappings<Item> event) {
		LOGGER.debug("Handling missing / remapped items...");
		handleMissingMappings(event, "additionalbars", AdditionalBarsBOP::missingItem);
	}

	@SubscribeEvent
	void remapMissingBlocks(final RegistryEvent.MissingMappings<Block> event) {
		LOGGER.debug("Handling missing / remapped blocks...");
		handleMissingMappings(event, "additionalbars", AdditionalBarsBOP::missingBlock);
	}
}
