package me.jacky1356400.exchangers.item;

import me.jacky1356400.exchangers.Exchangers;
import me.jacky1356400.exchangers.Config;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGoldenExchanger extends ItemExchangerBase {

    public ItemGoldenExchanger(){
        setRegistryName(Exchangers.MODID + ":golden_exchanger");
        setUnlocalizedName(Exchangers.MODID + ".golden_exchanger");
        setMaxStackSize(1);
        setMaxDamage(Config.goldenExchangerMaxDamage);
        setCreativeTab(Exchangers.exchangersCreativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
