package net.emiya.afrikelibagana;

import net.emiya.afrikelibagana.block.ModBlocks;
import net.emiya.afrikelibagana.item.ModItemGroups;
import net.emiya.afrikelibagana.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Afrikelibagana implements ModInitializer {
	public static final String MOD_ID = "afrikelibagana";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}