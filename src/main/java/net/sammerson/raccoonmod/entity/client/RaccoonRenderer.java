package net.sammerson.raccoonmod.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
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

    @Override
    public RenderLayer getRenderType(RaccoonEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.5f, 0.5f, 0.5f);
        }else{
            stack.scale(1f, 1f, 1f);


        }


        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
