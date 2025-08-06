package net.wighugan.shilohsong;

import net.fabricmc.api.ModInitializer;

import net.wighugan.shilohsong.datagen.ModLootTableModifiers;
import net.wighugan.shilohsong.item.ModItems;
import net.wighugan.shilohsong.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShilohSong implements ModInitializer {
	public static final String MOD_ID = "shilohsong";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModSounds.registerSounds();

		ModLootTableModifiers.modifyLootTables();

	}
}