package net.sammerson.raccoonmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sammerson.raccoonmod.RaccoonMod;

public class ModItemGroup {
    public static final ItemGroup RACCOON = FabricItemGroupBuilder.build(new Identifier(RaccoonMod.MOD_ID, "raccoon"),
            () -> new ItemStack(ModItems.RACCOON_SPAWN_EGG));
}
