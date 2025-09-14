package com.meowmel.gtswcore.client.renderer.machine;

import com.gregtechceu.gtceu.client.renderer.machine.DynamicRender;

public class GTSWDynamicRenderHelper {

    public static DynamicRender<?, ?> createLargeCombustionRenderer() {
        return new LargeCombustionSetRenderer();
    }

    public static DynamicRender<?, ?> createPersonalBeaconRenderer() {
        return new PersonalBeaconRenderer();
    }
}
