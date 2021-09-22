package com.keviniest.uem.registry.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TitaAlloyTool implements ToolMaterial {

    /*
    TODO : register this
     */
    public static final TitaAlloyTool INSTANCE = new TitaAlloyTool();

    @Override
    public int getDurability() {
        return 5218;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
