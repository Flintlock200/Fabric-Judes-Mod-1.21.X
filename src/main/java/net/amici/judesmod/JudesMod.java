package net.amici.judesmod;

import net.amici.judesmod.block.ModBlocks;
import net.amici.judesmod.item.ModItemGroups;
import net.amici.judesmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JudesMod implements ModInitializer {
	public static final String MOD_ID = "judesmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}