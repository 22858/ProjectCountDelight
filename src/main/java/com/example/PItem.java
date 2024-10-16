package com.example;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class PItem {

    public static final Item SHIT = registerItem("shit",
            new Item(new FabricItemSettings()));
    public static final Item PROJECTCOUONT = registerItem("projectcount",
            new Item(new FabricItemSettings()));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Projectcountdelight.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Projectcountdelight.LOGGER.debug("Registering mod items for" + Projectcountdelight.MOD_ID);
    }
}
