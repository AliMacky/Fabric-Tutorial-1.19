package net.fratboychad21.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.fratboychad21.tutorialmod.block.ModBlocks;
import net.fratboychad21.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very Important Comment

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
