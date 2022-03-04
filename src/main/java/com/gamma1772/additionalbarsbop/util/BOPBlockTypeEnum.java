package com.gamma1772.additionalbarsbop.util;

import com.gamma1772.additionalbars.content.block.BlockType;

public enum BOPBlockTypeEnum implements BlockType {
    BOP("bop");

    private String text;
    BOPBlockTypeEnum(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
