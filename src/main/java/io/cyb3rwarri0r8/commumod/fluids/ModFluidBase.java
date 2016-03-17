package io.cyb3rwarri0r8.commumod.fluids;


/*
 * CommuMod - A Minecraft Modification
 * Copyright (c) 2016. noahk (Cyb3rWarri0r8/Endergriefer153/Starwarsman)
 */

import io.cyb3rwarri0r8.commumod.lib.helpers.StringHelper;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public abstract class ModFluidBase extends BlockFluidClassic{
    String name = "";
    String modName = "commumod";
    protected float particleRed = 1.0F;
    protected float particleGreen = 1.0F;
    protected float particleBlue = 1.0F;
    protected boolean shouldDisplaceFluids = false;

    protected boolean[] isOptimalFlowDirection = new boolean[4];
    protected int[] flowCost = new int[4];

    protected FluidStack stack;

    public ModFluidBase(Fluid fluid, Material material, String name) {

        super(fluid, material);

        this.name = StringHelper.titleCase(name);


        setUnlocalizedName(modName + ".fluid." + name);
        displacements.put(this, false);
    }

    public ModFluidBase(String modName, Fluid fluid, Material material, String name) {

        super(fluid, material);

        this.name = StringHelper.titleCase(name);
        this.modName = modName;

        setUnlocalizedName(modName + ".fluid." + name);
        displacements.put(this, false);
    }

    public ModFluidBase setParticleColor(int c) {

        return setParticleColor(((c >> 16) & 255) / 255f, ((c >> 8) & 255) / 255f, ((c >> 0) & 255) / 255f);
    }

    public ModFluidBase setParticleColor(float particleRed, float particleGreen, float particleBlue) {

        this.particleRed = particleRed;
        this.particleGreen = particleGreen;
        this.particleBlue = particleBlue;

        return this;
    }

    public boolean preInit() {

        return true;
    }

    public ModFluidBase setDisplaceFluids(boolean a) {

        this.shouldDisplaceFluids = a;
        return this;
    }




    @Override
    public boolean canDisplace(IBlockAccess world, BlockPos blockPos) {

        if (!shouldDisplaceFluids && world.getBlockState(blockPos).getBlock().getMaterial().isLiquid()) {
            return false;
        }
        return super.canDisplace(world, blockPos);
    }

    @Override
    public boolean displaceIfPossible(World world, BlockPos blockPos) {

        if (!shouldDisplaceFluids && world.getBlockState(blockPos).getBlock().getMaterial().isLiquid()) {
            return false;
        }
        return super.displaceIfPossible(world, blockPos);
    }




}
