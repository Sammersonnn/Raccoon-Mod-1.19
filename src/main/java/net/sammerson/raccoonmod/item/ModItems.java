package net.sammerson.raccoonmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sammerson.raccoonmod.RaccoonMod;
import net.sammerson.raccoonmod.entity.custom.ModEntities;

public class ModItems {

    public static final Item RACCOON_SPAWN_EGG = registerItem("raccoon_spawn_egg",
            new SpawnEggItem(ModEntities.RACCOON,0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ModItemGroup.RACCOON).maxCount(1)));

    private static Item registerItem(String name, Item item) {
       return Registry.register(Registry.ITEM, new Identifier(RaccoonMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RaccoonMod.LOGGER.info("Register Mod Items for " + RaccoonMod.MOD_ID);
    }
}
