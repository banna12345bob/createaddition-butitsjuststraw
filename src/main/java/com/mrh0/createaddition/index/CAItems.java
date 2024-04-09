package com.mrh0.createaddition.index;

import static com.simibubi.create.AllTags.forgeItemTag;
import static com.simibubi.create.AllTags.AllItemTags.PLATES;
import com.mrh0.createaddition.CreateAddition;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.world.item.Item;


public class CAItems {

	static {
	}

	public static final ItemEntry<Item> STRAW =
			CreateAddition.REGISTRATE.item("straw", Item::new)
			.properties(p -> p.stacksTo(16))
			.register();

	public static void register() {

	}
}
