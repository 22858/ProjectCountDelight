package com.example;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PGroup {
    public static ItemGroup GROUP = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.projectcountdelight.group"))
            .icon(() -> new ItemStack(PItem.PROJECTCOUONT))
            .entries((context, entries) -> {
                entries.add(PItem.SHIT);
            })
            .build();
    public static void registerModItemGroup() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Projectcountdelight.MOD_ID, "temp"), GROUP);
        Projectcountdelight.LOGGER.debug("Registering mod item group for" + Projectcountdelight.MOD_ID);
    }
}
