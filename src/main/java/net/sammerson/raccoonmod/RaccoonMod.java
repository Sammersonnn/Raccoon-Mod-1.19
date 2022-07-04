package net.sammerson.raccoonmod;

import net.fabricmc.api.ModInitializer;
import net.sammerson.raccoonmod.item.ModItems;
import net.sammerson.raccoonmod.util.ModRegistries;
import net.sammerson.raccoonmod.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class RaccoonMod implements ModInitializer {

	public static final String MOD_ID = "raccoonmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModRegistries.registerModStuff();
		ModWorldGen.generateModWorldGen();
		ModItems.registerModItems();

		GeckoLib.initialize();

	}
}
