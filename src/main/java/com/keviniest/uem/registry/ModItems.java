package com.keviniest.uem.registry;

import com.keviniest.uem.Client;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TITANIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Client.MOD_ID, "titanium"), TITANIUM);
    }

}
