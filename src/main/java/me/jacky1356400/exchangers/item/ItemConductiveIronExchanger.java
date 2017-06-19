package me.jacky1356400.exchangers.item;

import me.jacky1356400.exchangers.Config;
import me.jacky1356400.exchangers.Exchangers;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemConductiveIronExchanger extends ItemExchangerBaseRF {

    public ItemConductiveIronExchanger(){
        setRegistryName(Exchangers.MODID + ":conductive_iron_exchanger");
        setUnlocalizedName(Exchangers.MODID + ".conductive_iron_exchanger");
        setMaxStackSize(1);
        setMaxDamage(0);
        setCreativeTab(Exchangers.exchangersCreativeTab);
        setNoRepair();
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public int getMaxEnergyStored(ItemStack container) {
        return Config.conductiveIronExchangerMaxRF;
    }

    public boolean showDurabilityBar(ItemStack stack) {
        return super.showDurabilityBar(stack);
    }

    public double getDurabilityForDisplay(ItemStack stack) {
        int max = getMaxEnergyStored(stack);
        return (max - getEnergyStored(stack)) / max;
    }

}