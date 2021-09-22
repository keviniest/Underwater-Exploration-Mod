package com.keviniest.uem;

import com.keviniest.uem.registry.ModArmour;
import com.keviniest.uem.registry.ModItems;
import com.keviniest.uem.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;

public class Client implements ModInitializer {

    public static String modID = "uem";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModArmour.registerArmours();
    }

    public static void sendInfoMessage(String message) {
        message = "\u00A77: " + message;
        MinecraftClient.getInstance().player.sendChatMessage(message);
    }

}
