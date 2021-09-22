package com.keviniest.uem.registry;

import com.keviniest.uem.Client;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL)
            .strength(5.5f, 30.0f));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Client.modID, "titanium_block"), TITANIUM_BLOCK);
    }
}
