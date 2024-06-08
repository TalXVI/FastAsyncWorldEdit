/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.util;

import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.world.block.BaseBlock;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Represents a block located at some position.
 */
public record LocatedBlock(BlockVector3 location, BaseBlock block) {

    public LocatedBlock {
        checkNotNull(location);
        checkNotNull(block);
    }

    /**
     * Gets the location.
     *
     * @return The location
     * @deprecated This class is now a record. Use {@link #location()} instead.
     */
    @Deprecated(forRemoval = true, since = "TODO")
    public BlockVector3 getLocation() {
        return this.location;
    }

    /**
     * Gets the block.
     *
     * @return The block
     * @deprecated This class is now a record. Use {@link #block()} instead.
     */
    @Deprecated(forRemoval = true, since = "TODO")
    public BaseBlock getBlock() {
        return this.block;
    }

}
