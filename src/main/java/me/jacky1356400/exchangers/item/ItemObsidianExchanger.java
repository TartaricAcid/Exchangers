package me.jacky1356400.exchangers.item;

import me.jacky1356400.exchangers.Exchangers;
import me.jacky1356400.exchangers.Config;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemObsidianExchanger extends Item {

    public ItemObsidianExchanger(){
        setRegistryName(Exchangers.MODID + ":obsidian_exchanger");
        setUnlocalizedName(Exchangers.MODID + ".obsidian_exchanger");
        setMaxStackSize(1);
        setMaxDamage(Config.obsidianExchangerMaxDamage);
        setCreativeTab(Exchangers.exchangersCreativeTab);
    }

    public boolean showDurabilityBar(ItemStack stack){
        return stack.isItemDamaged();
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}