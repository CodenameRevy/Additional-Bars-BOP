package com.gamma1772.additionalbarsbop.util;

import com.gamma1772.additionalbars.content.block.BlockType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public enum BOPBarsType implements BlockType {
    BOP("bop", ChatFormatting.LIGHT_PURPLE);

    private final String type;
    private final ChatFormatting color;
    private final Component text;

    BOPBarsType(String type, ChatFormatting color) {
        this.type = type;
        this.text = Component.translatable("tooltip.gamma1772." + type);
        this.color = color;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Component getText() {
        return text;
    }

    @Override
    public ChatFormatting getTextColor() {
        return color;
    }
}
