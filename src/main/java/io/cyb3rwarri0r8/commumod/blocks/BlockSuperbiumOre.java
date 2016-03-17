package io.cyb3rwarri0r8.commumod.blocks;

/*
 * CommuMod - A Minecraft Modification
 * Copyright (c) 2016. noahk (Cyb3rWarri0r8/Endergriefer153/Starwarsman)
 */

import io.cyb3rwarri0r8.commumod.Commumod;
import io.cyb3rwarri0r8.commumod.lib.Reference;
import io.cyb3rwarri0r8.commumod.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import java.util.Random;


public class BlockSuperbiumOre extends Block {

    public BlockSuperbiumOre()
    {
        super(Material.rock);
        this.setUnlocalizedName("superbiumOre");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.superbiumOre), 0, new ModelResourceLocation(Reference.MODID + ":" + getUnlocalizedName().substring(5), "inventory"));
        this.setCreativeTab(Commumod.modTab);
        this.setStepSound(soundTypePiston);
        setHardness(4.0F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 0);


    }

    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
       return ModItems.superbiumDust;
    }
}
