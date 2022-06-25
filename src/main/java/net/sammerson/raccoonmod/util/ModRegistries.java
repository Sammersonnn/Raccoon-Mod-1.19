package net.sammerson.raccoonmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.sammerson.raccoonmod.entity.custom.ModEntities;
import net.sammerson.raccoonmod.entity.custom.RaccoonEntity;

public class ModRegistries {
    public static void registerModStuff() {
        registerAttributes();

    }

        private static void registerAttributes() {
            FabricDefaultAttributeRegistry.register(ModEntities.RACCOON, RaccoonEntity.setAttributes());
    }
}
