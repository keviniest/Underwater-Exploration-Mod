package com.keviniest.uem.registry;

import com.keviniest.uem.Client;
import com.keviniest.uem.registry.items.armour.DivingSuitArmour;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModArmour {

    public static final ArmorMaterial SILICON_MAT = new DivingSuitArmour();

    public static final Item DIVING_SUIT_HELMET = new ArmorItem(SILICON_MAT, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item DIVING_SUIT_CHEST = new ArmorItem(SILICON_MAT, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item DIVING_SUIT_LEG = new ArmorItem(SILICON_MAT, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item DIVING_SUIT_BOOT = new ArmorItem(SILICON_MAT, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item FIN = new ArmorItem(SILICON_MAT, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerArmours() {
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "diving_suit_helmet"), DIVING_SUIT_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "diving_suit_chest"), DIVING_SUIT_CHEST);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "diving_suit_leg"), DIVING_SUIT_LEG);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "diving_suit_boot"), DIVING_SUIT_BOOT);
        Registry.register(Registry.ITEM, new Identifier(Client.modID, "fin"), FIN);
    }

}
