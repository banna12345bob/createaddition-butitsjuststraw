package com.mrh0.createaddition.index;

import com.mrh0.createaddition.CreateAddition;
import com.mrh0.createaddition.ponder.PonderScenes;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;
import com.simibubi.create.foundation.ponder.PonderRegistry;
import com.simibubi.create.foundation.ponder.PonderTag;

import com.simibubi.create.infrastructure.ponder.AllPonderTags;
import net.minecraft.resources.ResourceLocation;

public class CAPonder {
	
	static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(CreateAddition.MODID);
	
	public static void register() {
		HELPER.addStoryBoard(CAItems.STRAW, "liquid_blaze_burner", PonderScenes::liquidBlazeBurner, AllPonderTags.LOGISTICS);
		HELPER.addStoryBoard(AllBlocks.BLAZE_BURNER, "liquid_blaze_burner", PonderScenes::liquidBlazeBurner, AllPonderTags.LOGISTICS);
	}
}