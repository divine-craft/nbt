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
 * The {@code TAG_Short} tag.
 */
public final class ShortTag extends Tag<@NotNull Short> {
    /**
     * The value.
     */
    private final short value;

    /**
     * Creates the tag.
     *
     * @param name The name.
     * @param value The value.
     */
    public ShortTag(String name, short value) {
        super(TagType.TAG_SHORT, name);
        this.value = value;
    }

    /**
     * Creates the tag.
     *
     * @param value The value.
     */
    public ShortTag(short value) {
        super(TagType.TAG_SHORT);
        this.value = value;
    }

    @Override
    public @NotNull Short getValue() {
        return value;
    }

    @Override
    public @NotNull String toString() {
        String name = getName();
        String append = "";
        if (name != null && !name.isEmpty()) {
            append = "(\"" + this.getName() + "\")";
        }
        return "TAG_Short" + append + ": " + value;
    }

    public @NotNull ShortTag clone() {
        return new ShortTag(getName(), value);
    }
}
