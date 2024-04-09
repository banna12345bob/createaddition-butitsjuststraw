package com.mrh0.createaddition.ponder;

import com.mrh0.createaddition.blocks.liquid_blaze_burner.LiquidBlazeBurnerBlock;
import com.mrh0.createaddition.index.CABlocks;
import com.mrh0.createaddition.index.CAItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import com.simibubi.create.foundation.ponder.ElementLink;
import com.simibubi.create.foundation.ponder.PonderPalette;
import com.simibubi.create.foundation.ponder.SceneBuilder;
import com.simibubi.create.foundation.ponder.SceneBuildingUtil;
import com.simibubi.create.foundation.ponder.Selection;
import com.simibubi.create.foundation.ponder.element.InputWindowElement;
import com.simibubi.create.foundation.ponder.element.WorldSectionElement;
import com.simibubi.create.foundation.utility.Pointing;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;


public class PonderScenes {

	public static void liquidBlazeBurner(SceneBuilder scene, SceneBuildingUtil util) {
		scene.title("liquid_blaze_burner", "Liquid Fuel Burning");
		scene.configureBasePlate(0, 0, 5);
		scene.showBasePlate();
		scene.idle(5);
		//scene.world.setBlock(util.grid.at(3, 2, 2), Blocks.WATER.defaultBlockState(), false);

		BlockPos burner = util.grid.at(2, 1, 2);
		BlockPos[] blocks = {
				util.grid.at(1, 1, 2),
				util.grid.at(0, 1, 2),
				util.grid.at(0, 2, 2),
				util.grid.at(0, 3, 2)
		};
		scene.world.showSection(util.select.position(burner), Direction.DOWN);
		scene.idle(5);
		scene.overlay.showText(50)
		.attachKeyFrame()
		.text("Giving the Blaze Burner a Straw")
		.placeNearTarget()
		.pointAt(util.vector.topOf(burner));
		scene.idle(10);
		scene.overlay.showControls(new InputWindowElement(util.vector.topOf(burner), Pointing.DOWN).rightClick()
				.withItem(new ItemStack(CAItems.STRAW.get())), 40);
		scene.world.setBlock(burner, CABlocks.LIQUID_BLAZE_BURNER.getDefaultState().setValue(LiquidBlazeBurnerBlock.HEAT_LEVEL, BlazeBurnerBlock.HeatLevel.SMOULDERING), false);
		scene.idle(60);
		scene.overlay.showText(50)
			.attachKeyFrame()
			.text("will allow it to accept liquid fuels by Buckets,")
			.placeNearTarget()
			.pointAt(util.vector.topOf(burner));
		scene.idle(10);
		scene.overlay.showControls(new InputWindowElement(util.vector.topOf(burner), Pointing.DOWN).rightClick()
				.withItem(new ItemStack(Fluids.LAVA.getBucket())), 40);
		scene.idle(60);
		scene.overlay.showText(50)
			.text("- or by pipes.")
			.placeNearTarget()
			.pointAt(util.vector.topOf(burner));
		scene.idle(10);

		for (int i = 0; i < blocks.length; i++) {
			scene.idle(5);
			scene.world.showSection(util.select.position(blocks[i]), Direction.EAST);
		}
		scene.idle(20);
		scene.markAsFinished();
	}

}
