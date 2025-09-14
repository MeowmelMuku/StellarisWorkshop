package com.meowmel.gtswcore.common.machine.multiblock.steam;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.common.machine.multiblock.steam.SteamParallelMultiblockMachine;

import com.meowmel.gtswcore.config.GTSWConfig;

public class IndustrialSteamParallelMultiblockMachine extends SteamParallelMultiblockMachine {

    public IndustrialSteamParallelMultiblockMachine(IMachineBlockEntity holder, Object... args) {
        super(holder, GTSWConfig.INSTANCE.server.industrialSteamMachineMaxParallels);
    }
}
