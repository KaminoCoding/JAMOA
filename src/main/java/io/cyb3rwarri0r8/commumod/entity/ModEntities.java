package io.cyb3rwarri0r8.commumod.entity;

/*
 *  CommuMod - A Minecraft Modification
 *  Copyright (C) ${YEAR} Cyb3rWarri0r8
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

import io.cyb3rwarri0r8.commumod.lib.helpers.RegisterHelper;
import net.minecraft.entity.Entity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ModEntities {

    public static Class[] entities = {
            EntityMiner.class,
            EntitySuperbiumGolem.class,
            EntityAradactiteGolem.class
    };

    public static String[] names = {
            "entityMiner",
            "entitySuperbiumGolem",
            "entityAradactiteGolem"
    };

    public static void init()
    {

        RegisterHelper.registerEntity(EntityMiner.class, "miner", 0);
        RegisterHelper.registerEntity(EntitySuperbiumGolem.class, "superbiumGolem", 1);
        RegisterHelper.registerEntity(EntityAradactiteGolem.class, "aradactiteGolem", 2);
    }
}
