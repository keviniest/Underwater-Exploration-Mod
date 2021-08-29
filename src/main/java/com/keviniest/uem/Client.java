package com.keviniest.uem;

import com.keviniest.uem.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Client implements ModInitializer {

    public static final String MOD_ID = "uem";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
