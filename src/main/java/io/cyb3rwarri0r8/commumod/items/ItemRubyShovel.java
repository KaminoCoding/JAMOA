package io.cyb3rwarri0r8.commumod.items;


import io.cyb3rwarri0r8.commumod.lib.Reference;
import io.cyb3rwarri0r8.commumod.main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by noah on 8/22/14.
 */
public class ItemRubyShovel extends ItemSpade {
    public ItemRubyShovel(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("rubyShovel");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, new ModelResourceLocation("commumod:textures/items/rubyShovel", "inventory"));
        setCreativeTab(main.modTab);

    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5)
    {
        super.onUpdate(itemStack,world,entity,par4,par5);
        {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getCurrentEquippedItem();
            if (equipped == itemStack)
            {
                player.addPotionEffect(new PotionEffect(Potion.digSpeed.id,6,4));
            }
        }
    }

}
