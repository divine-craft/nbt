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
 * The {@code TAG_Float} tag.
 */
public final class FloatTag extends Tag<@NotNull Float> {
    /**
     * The value.
     */
    private final float value;

    /**
     * Creates the tag.
     *
     * @param name The name.
     * @param value The value.
     */
    public FloatTag(String name, float value) {
        super(TagType.TAG_FLOAT, name);
        this.value = value;
    }

    /**
     * Creates the tag.
     *
     * @param value The value.
     */
    public FloatTag(float value) {
        super(TagType.TAG_FLOAT);
        this.value = value;
    }

    @Override
    public @NotNull Float getValue() {
        return value;
    }

    @Override
    public @NotNull String toString() {
        String name = getName();
        String append = "";
        if (name != null && !name.isEmpty()) {
            append = "(\"" + this.getName() + "\")";
        }
        return "TAG_Float" + append + ": " + value;
    }

    public @NotNull FloatTag clone() {
        return new FloatTag(getName(), value);
    }
}
