/*
 * This file is part of Flow NBT, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2011 DivineCraft <https://divinecraft.ru/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.flowpowered.nbt;

import org.jetbrains.annotations.NotNull;

/**
 * The {@code TAG_Compound} tag.
 */
public final class CompoundTag extends Tag<@NotNull CompoundMap> {
    /**
     * The value.
     */
    private final @NotNull CompoundMap value;

    /**
     * Creates the tag.
     *
     * @param name The name.
     * @param value The value.
     */
    public CompoundTag(String name, @NotNull CompoundMap value) {
        super(TagType.TAG_COMPOUND, name);
        //this.value = (CompoundMap) Collections.unmodifiableMap(value); This doesn't work anymore, needs a new solution
        this.value = value;
    }

    /**
     * Creates the tag.
     *
     * @param value The value.
     */
    public CompoundTag(@NotNull CompoundMap value) {
        super(TagType.TAG_COMPOUND);
        //this.value = (CompoundMap) Collections.unmodifiableMap(value); This doesn't work anymore, needs a new solution
        this.value = value;
    }

    @Override
    public @NotNull CompoundMap getValue() {
        return value;
    }

    @Override
    public @NotNull String toString() {
        String name = getName();
        String append = "";
        if (name != null && !name.equals("")) {
            append = "(\"" + this.getName() + "\")";
        }

        StringBuilder bldr = new StringBuilder();
        bldr.append("TAG_Compound").append(append).append(": ").append(value.size()).append(" entries\r\n{\r\n");
        for (Tag entry : value.values()) {
            bldr.append("   ").append(entry.toString().replaceAll("\r\n", "\r\n   ")).append("\r\n");
        }
        bldr.append("}");
        return bldr.toString();
    }

    public @NotNull CompoundTag clone() {
        return new CompoundTag(getName(), new CompoundMap(value));
    }
}
