package com.keviniest.uem.registry;

import com.keviniest.uem.Client;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TITANIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ALUMINIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SILICON = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final BlockItem TITANIUM_BLOCK = new BlockItem(ModBlocks.TITANIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "titanium"), TITANIUM);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "aluminium"), ALUMINIUM);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "silicon"), SILICON);
    }

}
