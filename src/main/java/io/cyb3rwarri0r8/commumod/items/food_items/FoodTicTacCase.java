package io.cyb3rwarri0r8.commumod.items.food_items;

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

import io.cyb3rwarri0r8.commumod.Commumod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class FoodTicTacCase extends Item {
    public FoodTicTacCase()
    {
        super();
        setUnlocalizedName("ticTacCase");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, new ModelResourceLocation("commumod:textures/items/ticTacCase", "inventory"));
        setMaxDamage(20);
        setCreativeTab(Commumod.modTab);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
//        itemStack.damageItem(1,entityPlayer);
//        entityPlayer.getFoodStats().setFoodLevel(entityPlayer.getFoodStats().getFoodLevel() + 2);
        final int maxDamage = 20;
        final int maxFood = 20;
        final int currentFood = entityPlayer.getFoodStats().getFoodLevel();

        if(!world.isRemote)
        {
            if(currentFood < maxFood)
            {
                entityPlayer.getFoodStats().setFoodLevel(currentFood + 2);
                itemStack.damageItem(1, entityPlayer);
                if(itemStack.getItemDamage() == 19)
                {
                    return itemStack;
                }
            }
            else if(currentFood >= maxFood)
            {
                return itemStack;
            }
        }
        else {
            return itemStack;
        }
        return itemStack;
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean b) {
        list.add("A case full of tic tacs");
        super.addInformation(itemStack, entityPlayer, list, b);
    }
}
