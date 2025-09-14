package com.meowmel.gtswcore.client.renderer;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.client.renderer.machine.DynamicRenderManager;

import com.meowmel.gtswcore.client.renderer.machine.LargeCombustionSetRenderer;
import com.meowmel.gtswcore.client.renderer.machine.PersonalBeaconRenderer;

public class GTSWRenderers {

    public static void init() {
        DynamicRenderManager.register(GTCEu.id("large_combustion_set_renderer"), LargeCombustionSetRenderer.TYPE);
        DynamicRenderManager.register(GTCEu.id("personal_beacon_renderer"), PersonalBeaconRenderer.TYPE);
    }
}
