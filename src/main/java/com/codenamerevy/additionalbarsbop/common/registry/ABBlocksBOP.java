package com.codenamerevy.additionalbarsbop.common.registry;

import com.codenamerevy.additionalbars.common.content.block.HorizontalBarsSlabBlock;
import com.codenamerevy.additionalbarsbop.common.AdditionalBarsBOP;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ABBlocksBOP {
	public static final DeferredRegister<Block> BOP_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalBarsBOP.MODID);

	public static final RegistryObject<Block> FIR_BARS = BOP_BLOCKS.register("fir_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> REDWOOD_BARS = BOP_BLOCKS.register("redwood_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CHERRY_BARS = BOP_BLOCKS.register("cherry_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> MAHOGANY_BARS = BOP_BLOCKS.register("mahogany_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> JACARANDA_BARS = BOP_BLOCKS.register("jacaranda_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> PALM_BARS = BOP_BLOCKS.register("palm_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> WILLOW_BARS = BOP_BLOCKS.register("willow_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> DEAD_BARS = BOP_BLOCKS.register("dead_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> MAGIC_BARS = BOP_BLOCKS.register("magic_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> UMBRAN_BARS = BOP_BLOCKS.register("umbran_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> HELLBARK_BARS = BOP_BLOCKS.register("hellbark_bars", ABBlocksBOP::createBarsBlock);

	public static final RegistryObject<Block> CROSSED_FIR_BARS = BOP_BLOCKS.register("crossed_fir_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_REDWOOD_BARS = BOP_BLOCKS.register("crossed_redwood_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_CHERRY_BARS = BOP_BLOCKS.register("crossed_cherry_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_MAHOGANY_BARS = BOP_BLOCKS.register("crossed_mahogany_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_JACARANDA_BARS = BOP_BLOCKS.register("crossed_jacaranda_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_PALM_BARS = BOP_BLOCKS.register("crossed_palm_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_WILLOW_BARS = BOP_BLOCKS.register("crossed_willow_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_DEAD_BARS = BOP_BLOCKS.register("crossed_dead_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_MAGIC_BARS = BOP_BLOCKS.register("crossed_magic_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_UMBRAN_BARS = BOP_BLOCKS.register("crossed_umbran_bars", ABBlocksBOP::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_HELLBARK_BARS = BOP_BLOCKS.register("crossed_hellbark_bars", ABBlocksBOP::createBarsBlock);

	public static final RegistryObject<Block> HORIZONTAL_FIR_BARS = BOP_BLOCKS.register("horizontal_fir_bars",ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_REDWOOD_BARS = BOP_BLOCKS.register("horizontal_redwood_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CHERRY_BARS = BOP_BLOCKS.register("horizontal_cherry_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_MAHOGANY_BARS = BOP_BLOCKS.register("horizontal_mahogany_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_JACARANDA_BARS = BOP_BLOCKS.register("horizontal_jacaranda_bars",ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_PALM_BARS = BOP_BLOCKS.register("horizontal_palm_bars",ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_WILLOW_BARS = BOP_BLOCKS.register("horizontal_willow_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_DEAD_BARS = BOP_BLOCKS.register("horizontal_dead_bars",ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_MAGIC_BARS = BOP_BLOCKS.register("horizontal_magic_bars",ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_UMBRAN_BARS = BOP_BLOCKS.register("horizontal_umbran_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_HELLBARK_BARS = BOP_BLOCKS.register("horizontal_hellbark_bars", ABBlocksBOP::createHorizontalBarsBlock);

	public static final RegistryObject<Block> HORIZONTAL_CROSSED_FIR_BARS = BOP_BLOCKS.register("horizontal_crossed_fir_bars",  ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_REDWOOD_BARS = BOP_BLOCKS.register("horizontal_crossed_redwood_bars",ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_CHERRY_BARS = BOP_BLOCKS.register("horizontal_crossed_cherry_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_MAHOGANY_BARS = BOP_BLOCKS.register("horizontal_crossed_mahogany_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_JACARANDA_BARS = BOP_BLOCKS.register("horizontal_crossed_jacaranda_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_PALM_BARS = BOP_BLOCKS.register("horizontal_crossed_palm_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_WILLOW_BARS = BOP_BLOCKS.register("horizontal_crossed_willow_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_DEAD_BARS = BOP_BLOCKS.register("horizontal_crossed_dead_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_MAGIC_BARS = BOP_BLOCKS.register("horizontal_crossed_magic_bars",ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_UMBRAN_BARS = BOP_BLOCKS.register("horizontal_crossed_umbran_bars", ABBlocksBOP::createHorizontalBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_HELLBARK_BARS = BOP_BLOCKS.register("horizontal_crossed_hellbark_bars", ABBlocksBOP::createHorizontalBarsBlock);

	private static PaneBlock createBarsBlock() {
		return new PaneBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F).notSolid().setAllowsSpawn(ABBlocksBOP::never).setOpaque(ABBlocksBOP::never).setSuffocates(ABBlocksBOP::never).setBlocksVision(ABBlocksBOP::never));
	}
//
//	private static PaneBlock createBarsBlock(Material material, MaterialColor color, SoundType sound) {
//		return new PaneBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0f, 4.0f).notSolid().setAllowsSpawn(ABBlocksBOP::never).setOpaque(ABBlocksBOP::never).setSuffocates(ABBlocksBOP::never).setBlocksVision(ABBlocksBOP::never));
//	}
//
//	private static PaneBlock createBarsBlock(Material material, MaterialColor color, SoundType sound, ToolType tool, float hardness, float resistance) {
//		return new PaneBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(tool).harvestLevel(0).hardnessAndResistance(hardness, resistance).notSolid().setAllowsSpawn(ABBlocksBOP::never).setOpaque(ABBlocksBOP::never).setSuffocates(ABBlocksBOP::never).setBlocksVision(ABBlocksBOP::never));
//	}

	private static HorizontalBarsSlabBlock createHorizontalBarsBlock() {
		return new HorizontalBarsSlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F).notSolid().setAllowsSpawn(ABBlocksBOP::never).setOpaque(ABBlocksBOP::never).setSuffocates(ABBlocksBOP::never).setBlocksVision(ABBlocksBOP::never));
	}

//	private static HorizontalBarsSlabBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound) {
//		return new HorizontalBarsSlabBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0f, 4.0f).notSolid().setAllowsSpawn(ABBlocksBOP::never).setOpaque(ABBlocksBOP::never).setSuffocates(ABBlocksBOP::never).setBlocksVision(ABBlocksBOP::never));
//	}
//
//	private static HorizontalBarsSlabBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound, ToolType tool, float hardness, float resistance) {
//		return new HorizontalBarsSlabBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(tool).harvestLevel(0).hardnessAndResistance(hardness, resistance).notSolid().setAllowsSpawn(ABBlocksBOP::never).setOpaque(ABBlocksBOP::never).setSuffocates(ABBlocksBOP::never).setBlocksVision(ABBlocksBOP::never));
//	}

	private static Boolean never(BlockState blockState, IBlockReader blockView, BlockPos blockPos, EntityType<?> entityType) { return false; }
	private static boolean never(BlockState blockState, IBlockReader blockView, BlockPos blockPos) { return false; }
}
