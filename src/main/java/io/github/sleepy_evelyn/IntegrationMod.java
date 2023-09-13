package io.github.sleepy_evelyn;

import io.github.sleepy_evelyn.block.IntegrationBlocks;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegrationMod implements ModInitializer {

	public static final String MOD_ID = "mod_integration";
	public static final Logger LOGGER = LoggerFactory.getLogger("Quilt Wiki Integration Mod");

	@Override
	public void onInitialize(ModContainer mod) {
		IntegrationBlocks.registerAll();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
