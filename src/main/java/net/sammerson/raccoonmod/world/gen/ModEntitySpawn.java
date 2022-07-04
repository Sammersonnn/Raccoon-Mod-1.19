package net.sammerson.raccoonmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.fabricmc.fabric.mixin.object.builder.SpawnRestrictionAccessor;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.sammerson.raccoonmod.entity.custom.ModEntities;


public class ModEntitySpawn {
    public static void addEntitySpawn() {
        BiomeModifications.addSpawn(
                biome -> biome.hasTag(ConventionalBiomeTags.FOREST),
                SpawnGroup.CREATURE, ModEntities.RACCOON, 25, 2, 5);

        SpawnRestrictionAccessor.callRegister(ModEntities.RACCOON, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);

    }
}
