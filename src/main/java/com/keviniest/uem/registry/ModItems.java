package com.keviniest.uem.registry;

import com.keviniest.uem.Client;
import com.keviniest.uem.registry.items.tool.KnifeTool;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TITANIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ALUMINIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SILICON = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final BlockItem TITANIUM_BLOCK = new BlockItem(ModBlocks.TITANIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final ToolItem SURVIVAL_KNIFE = new SwordItem(KnifeTool.INSTANCE, 4, 0.1f, new Item.Settings().group(ItemGroup.TOOLS));
    //public static final ToolItem TITA_ALLOY_PICK = new PickaxeItem(TitaAlloyTool.INSTANCE, 1, 1.0f, new Item.Settings().group(ItemGroup.TOOLS)); FIXME ...has protected access

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "titanium"), TITANIUM);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "aluminium"), ALUMINIUM);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "silicon"), SILICON);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "survival_knife"), SURVIVAL_KNIFE);
    }

}
