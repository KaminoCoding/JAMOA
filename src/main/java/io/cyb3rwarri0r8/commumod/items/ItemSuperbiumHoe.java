package io.cyb3rwarri0r8.commumod.items;

/*
 * CommuMod - A Minecraft Modification
 * Copyright (c) 2016. noahk (Cyb3rWarri0r8/Endergriefer153/Starwarsman)
 */

import io.cyb3rwarri0r8.commumod.Commumod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.ItemHoe;

/**
 * Created by noah on 5/27/14.
 */
public class ItemSuperbiumHoe extends ItemHoe {
    public ItemSuperbiumHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("superbiumHoe");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, new ModelResourceLocation("commumod:textures/items/superbiumHoe", "inventory"));
        setCreativeTab(Commumod.modTab);
    }
}
