package com.meowmel.gtswcore.common.vanilla;

import net.minecraft.world.item.Items;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import com.meowmel.gtswcore.GTSWCore;

@Mod.EventBusSubscriber(modid = GTSWCore.MOD_ID)
public class ItemProperties {

    public static void init() {}

    @SubscribeEvent
    public static void onFuelCheck(FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().getItem() == Items.DIAMOND) {
            event.setBurnTime(512 * 10 * 20); // 512 items
        }
        if (event.getItemStack().getItem() == Items.DIAMOND_BLOCK) { // 检查是否为钻石块
            event.setBurnTime(5120 * 10 * 20); // 5120 items
        }
    }

    @SubscribeEvent
    public void lootLoad(LootTableLoadEvent evt) {
        // if (evt.getName().toString().equals("minecraft:gameplay/fishing")) {
        //
        // }
    }
}
