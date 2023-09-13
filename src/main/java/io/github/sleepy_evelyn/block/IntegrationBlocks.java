package io.github.sleepy_evelyn.block;

import io.github.sleepy_evelyn.IntegrationMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class IntegrationBlocks {

	public static final Block PUMPKIN_PETE_BLOCK = new PumpkinPeteBlock();
	public static final Block PINEAPPLE_POLLY_BLOCK = new PineapplePollyBlock();

	public static void registerAll() {
		register("pumpkin", PUMPKIN_PETE_BLOCK);
		register("pineapple", PINEAPPLE_POLLY_BLOCK);
	}

	private static void register(String path, Block block) {
		// Register the block
		Registry.register(Registries.BLOCK, IntegrationMod.id(path), block);
		// Register an associated block item
		var blockItem = new BlockItem(block, new QuiltItemSettings());
		Registry.register(Registries.ITEM, IntegrationMod.id(path), blockItem);
	}
}
