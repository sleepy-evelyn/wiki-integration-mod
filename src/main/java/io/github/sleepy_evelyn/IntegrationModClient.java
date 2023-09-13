package io.github.sleepy_evelyn;

import io.github.sleepy_evelyn.block.IntegrationBlocks;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

public class IntegrationModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {
		BlockRenderLayerMap.put(RenderLayer.getCutout(),
			IntegrationBlocks.PINEAPPLE_POLLY_BLOCK,
			IntegrationBlocks.PUMPKIN_PETE_BLOCK
		);
	}
}
