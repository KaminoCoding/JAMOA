package io.cyb3rwarri0r8.commumod.lib.handler;


/*
 * CommuMod - A Minecraft Modification
 * Copyright (c) 2016. noahk (Cyb3rWarri0r8/Endergriefer153/Starwarsman)
 */

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by noah on 10/27/14.
 */
public class ModBucketHandler {
    public static ModBucketHandler INSTANCE = new ModBucketHandler();
    public Map<Block, Item> buckets = new HashMap<Block, Item>();

    private ModBucketHandler()
    {

    }

    @SubscribeEvent
    public void onBucketFill(FillBucketEvent event)
    {
        ItemStack result = fillCustomBucket(event.world, event.target);
        if(result == null)
        {
            return;
        }

        event.result = result;
        event.setResult(Event.Result.ALLOW);

    }

    private ItemStack fillCustomBucket(World world, MovingObjectPosition pos)
    {
        BlockPos blockPos = new BlockPos(pos.getBlockPos().getX(), pos.getBlockPos().getY(), pos.getBlockPos().getZ());
        Block block = world.getBlockState(blockPos).getBlock();

        Item bucket = buckets.get(block);

        if (bucket != null && world.getBlockState(blockPos).getBlock().getMetaFromState(world.getBlockState(blockPos)) == 0) {
            world.setBlockToAir(blockPos);
            return new ItemStack(bucket);
        } else
            return null;
    }

}
