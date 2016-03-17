package io.cyb3rwarri0r8.commumod.entity.render;
/*
 * CommuMod - A Minecraft Modification
 * Copyright (c) 2016. noahk (Cyb3rWarri0r8/Endergriefer153/Starwarsman)
 */

import io.cyb3rwarri0r8.commumod.entity.model.ModelMiner;
import io.cyb3rwarri0r8.commumod.lib.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderMiner extends RendererLivingEntity {

    private static final ResourceLocation textureLocation = new ResourceLocation(Reference.MODID + ":" + "textures/models/miner.png");

    public ModelMiner modelMiner;

    public RenderMiner(RenderManager renderManager, ModelBiped modelBiped, float f) {
        super(renderManager, modelBiped, f);
        this.modelMiner = (ModelMiner)this.mainModel;
    }

    @Override
    public void doRender(EntityLivingBase entity, double x, double y, double z, float p_76986_8_, float partialTicks) {
        super.doRender(entity, x, y, z, p_76986_8_, partialTicks);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     *
     * @param entity
     */
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return textureLocation;
    }
}
