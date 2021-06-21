package com.teste.testemod.objects.items;

import com.teste.testemod.TesteMod;
import com.teste.testemod.init.ItemInit;
import com.teste.testemod.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {


    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }




    @Override
    public void registerModels() {
        TesteMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
