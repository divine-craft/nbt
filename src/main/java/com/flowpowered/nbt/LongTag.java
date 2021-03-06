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
 * The {@code TAG_Long} tag.
 */
public final class LongTag extends Tag<@NotNull Long> {
    /**
     * The value.
     */
    private final long value;

    /**
     * Creates the tag.
     *
     * @param name The name.
     * @param value The value.
     */
    public LongTag(String name, long value) {
        super(TagType.TAG_LONG, name);
        this.value = value;
    }

    /**
     * Creates the tag.
     *
     * @param value The value.
     */
    public LongTag(long value) {
        super(TagType.TAG_LONG);
        this.value = value;
    }

    @Override
    public @NotNull Long getValue() {
        return value;
    }

    @Override
    public @NotNull String toString() {
        String name = getName();
        String append = "";
        if (name != null && !name.isEmpty()) {
            append = "(\"" + this.getName() + "\")";
        }
        return "TAG_Long" + append + ": " + value;
    }

    public @NotNull LongTag clone() {
        return new LongTag(getName(), value);
    }
}
