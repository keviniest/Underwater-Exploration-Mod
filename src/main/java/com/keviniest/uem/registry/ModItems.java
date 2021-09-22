package com.keviniest.uem.registry;

import com.keviniest.uem.Client;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TITANIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ALUMINIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SILICON = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final BlockItem TITANIUM_BLOCK = new BlockItem(ModBlocks.TITANIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final ArmorMaterial SILICON_MAT = new ModArmour();

    public static final Item DIVING_SUIT_HELMET = new ArmorItem(SILICON_MAT, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item DIVING_SUIT_CHEST = new ArmorItem(SILICON_MAT, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item DIVING_SUIT_LEG = new ArmorItem(SILICON_MAT, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item DIVING_SUIT_BOOT = new ArmorItem(SILICON_MAT, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "titanium"), TITANIUM);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "aluminium"), ALUMINIUM);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "silicon"), SILICON);

        //Registry.register(Registry.ITEM, new Identifier(Client.modID, "silicon_mat"), SILICON_MAT);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "diving_suit_helmet"), DIVING_SUIT_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "diving_suit_chest"), DIVING_SUIT_CHEST);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "diving_suit_leg"), DIVING_SUIT_LEG);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "diving_suit_boot"), DIVING_SUIT_BOOT);
    }

}
