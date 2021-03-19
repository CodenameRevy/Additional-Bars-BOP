package com.codenamerevy.additionalbarsbop.common.registry;
import com.codenamerevy.additionalbars.common.AdditionalBars;
import com.codenamerevy.additionalbars.common.registry.ABBlocks;
import com.codenamerevy.additionalbarsbop.common.AdditionalBarsBOP;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ABBlocksBOP extends ABBlocks {
	public static final DeferredRegister<Block> BOP_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalBarsBOP.MODID);

	public static final RegistryObject<Block> FIR_BARS = BOP_BLOCKS.register("fir_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> REDWOOD_BARS = BOP_BLOCKS.register("redwood_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CHERRY_BARS = BOP_BLOCKS.register("cherry_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> MAHOGANY_BARS = BOP_BLOCKS.register("mahogany_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> JACARANDA_BARS = BOP_BLOCKS.register("jacaranda_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> PALM_BARS = BOP_BLOCKS.register("palm_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> WILLOW_BARS = BOP_BLOCKS.register("willow_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> DEAD_BARS = BOP_BLOCKS.register("dead_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> MAGIC_BARS = BOP_BLOCKS.register("magic_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> UMBRAN_BARS = BOP_BLOCKS.register("umbran_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> HELLBARK_BARS = BOP_BLOCKS.register("hellbark_bars", ABBlocks::createBarsBlock);

	public static final RegistryObject<Block> CROSSED_FIR_BARS = BOP_BLOCKS.register("crossed_fir_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_REDWOOD_BARS = BOP_BLOCKS.register("crossed_redwood_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_CHERRY_BARS = BOP_BLOCKS.register("crossed_cherry_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_MAHOGANY_BARS = BOP_BLOCKS.register("crossed_mahogany_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_JACARANDA_BARS = BOP_BLOCKS.register("crossed_jacaranda_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_PALM_BARS = BOP_BLOCKS.register("crossed_palm_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_WILLOW_BARS = BOP_BLOCKS.register("crossed_willow_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_DEAD_BARS = BOP_BLOCKS.register("crossed_dead_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_MAGIC_BARS = BOP_BLOCKS.register("crossed_magic_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_UMBRAN_BARS = BOP_BLOCKS.register("crossed_umbran_bars", ABBlocks::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_HELLBARK_BARS = BOP_BLOCKS.register("crossed_hellbark_bars", ABBlocks::createBarsBlock);

	public static final RegistryObject<Block> HORIZONTAL_FIR_BARS = BOP_BLOCKS.register("horizontal_fir_bars",ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_REDWOOD_BARS = BOP_BLOCKS.register("horizontal_redwood_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CHERRY_BARS = BOP_BLOCKS.register("horizontal_cherry_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_MAHOGANY_BARS = BOP_BLOCKS.register("horizontal_mahogany_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_JACARANDA_BARS = BOP_BLOCKS.register("horizontal_jacaranda_bars",ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_PALM_BARS = BOP_BLOCKS.register("horizontal_palm_bars",ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_WILLOW_BARS = BOP_BLOCKS.register("horizontal_willow_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_DEAD_BARS = BOP_BLOCKS.register("horizontal_dead_bars",ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_MAGIC_BARS = BOP_BLOCKS.register("horizontal_magic_bars",ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_UMBRAN_BARS = BOP_BLOCKS.register("horizontal_umbran_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_HELLBARK_BARS = BOP_BLOCKS.register("horizontal_hellbark_bars", ABBlocks::createHorizontalBarsBlock);

	public static final RegistryObject<Block> HORIZONTAL_CROSSED_FIR_BARS = BOP_BLOCKS.register("horizontal_crossed_fir_bars",  ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_REDWOOD_BARS = BOP_BLOCKS.register("horizontal_crossed_redwood_bars",ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_CHERRY_BARS = BOP_BLOCKS.register("horizontal_crossed_cherry_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_MAHOGANY_BARS = BOP_BLOCKS.register("horizontal_crossed_mahogany_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_JACARANDA_BARS = BOP_BLOCKS.register("horizontal_crossed_jacaranda_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_PALM_BARS = BOP_BLOCKS.register("horizontal_crossed_palm_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_WILLOW_BARS = BOP_BLOCKS.register("horizontal_crossed_willow_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_DEAD_BARS = BOP_BLOCKS.register("horizontal_crossed_dead_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_MAGIC_BARS = BOP_BLOCKS.register("horizontal_crossed_magic_bars",ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_UMBRAN_BARS = BOP_BLOCKS.register("horizontal_crossed_umbran_bars", ABBlocks::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_HELLBARK_BARS = BOP_BLOCKS.register("horizontal_crossed_hellbark_bars", ABBlocks::createHorizontalBarsBlock);

}
