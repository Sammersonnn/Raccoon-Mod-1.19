package net.sammerson.raccoonmod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.sammerson.raccoonmod.RaccoonMod;
import net.sammerson.raccoonmod.entity.custom.RaccoonEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RaccoonRenderer extends GeoEntityRenderer<RaccoonEntity> {
    public RaccoonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RaccoonModel());
    }

    @Override
    public Identifier getTextureResource(RaccoonEntity instance) {
        return new Identifier(RaccoonMod.MOD_ID, "textures/entity/raccoon/raccoon.png");
    }
}
