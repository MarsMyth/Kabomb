package net.mars_myth.kabomb;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Kabomb implements ModInitializer {
	public static final String MOD_ID = "kabomb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Don't let Pipe Bombs to get mailed to you");
	}
}