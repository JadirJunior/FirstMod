package com.teste.testemod;

import com.teste.testemod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = TesteMod.MOD_ID,
        name = TesteMod.MOD_NAME,
        version = TesteMod.VERSION
)
public class TesteMod {

    public static final String MOD_ID = "TesteMod";
    public static final String MOD_NAME = "TesteMod";
    public static final String VERSION = "1.0-SNAPSHOT";
    public static final String CLIENT = "com.teste.testemod.proxy.ClientProxy";
    public static final String COMMOM = "com.teste.testemod.proxy.CommonProxy";


    @SidedProxy(clientSide = CLIENT, serverSide = COMMOM)
    public static CommonProxy proxy;

    @Mod.Instance(MOD_ID)
    public static TesteMod INSTANCE;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

}
