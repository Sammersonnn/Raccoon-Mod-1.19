package net.sammerson.raccoonmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.sammerson.raccoonmod.entity.client.RaccoonRenderer;
import net.sammerson.raccoonmod.entity.custom.ModEntities;

public class RaccoonModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.RACCOON, RaccoonRenderer::new);

    }
}
