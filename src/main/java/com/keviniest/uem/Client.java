package com.keviniest.uem;

import com.keviniest.uem.registry.ModItems;
import com.keviniest.uem.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class Client implements ModInitializer {

    public static String modID = "uem";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
