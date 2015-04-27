package io.cyb3rwarri0r8.commumod.blocks;


import io.cyb3rwarri0r8.commumod.lib.Reference;
import io.cyb3rwarri0r8.commumod.items.ModItems;
import io.cyb3rwarri0r8.commumod.main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by noah on 8/8/14.
 */
public class BlockRubyOre extends Block {
    public BlockRubyOre(Material material){
        super(material);
        setUnlocalizedName("rubyOre");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.rubyOre), 0, new ModelResourceLocation(Reference.MODID + ":" + getUnlocalizedName().substring(5), "inventory"));

        setCreativeTab(main.modTab);
        setStepSound(soundTypePiston);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe",0);


    }


    public Item getItemDropped(int meta, Random random, int fortune){
        return ModItems.ruby;
    }
}
