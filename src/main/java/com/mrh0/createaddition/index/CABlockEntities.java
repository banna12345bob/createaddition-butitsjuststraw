package com.mrh0.createaddition.index;

import com.mrh0.createaddition.blocks.liquid_blaze_burner.*;
import com.mrh0.createaddition.CreateAddition;
import com.simibubi.create.content.kinetics.base.HalfShaftInstance;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class CABlockEntities {
	
	public static final BlockEntityEntry<LiquidBlazeBurnerBlockEntity> LIQUID_BLAZE_BURNER = CreateAddition.REGISTRATE
			.blockEntity("liquid_blaze_burner", LiquidBlazeBurnerBlockEntity::new)
			.validBlocks(CABlocks.LIQUID_BLAZE_BURNER)
			.renderer(() -> LiquidBlazeBurnerRenderer::new)
			.register();
	
	public static void register() {}
}