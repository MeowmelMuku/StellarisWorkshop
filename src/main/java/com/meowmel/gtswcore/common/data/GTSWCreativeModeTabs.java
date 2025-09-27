package com.meowmel.gtswcore.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gregtechceu.gtceu.common.data.GTItems;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import com.meowmel.gtswcore.GTSWCore;
import com.tterrag.registrate.util.entry.RegistryEntry;

import static com.meowmel.gtswcore.api.registries.GTSWRegistires.REGISTRATE;

public class GTSWCreativeModeTabs {

    public static RegistryEntry<CreativeModeTab> GTSW = REGISTRATE.defaultCreativeTab(GTSWCore.MOD_ID,
            builder -> builder
                    .displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(GTSWCore.MOD_ID, REGISTRATE))
                    .icon(GTItems.MAINFRAME_IV::asStack)
                    .title(Component.literal("孤星工坊"))
                    .build())
            .register();

    public static void init() {}
}
