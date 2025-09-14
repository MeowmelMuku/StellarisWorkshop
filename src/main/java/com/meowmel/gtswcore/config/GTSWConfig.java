package com.meowmel.gtswcore.config;

import com.meowmel.gtswcore.GTSWCore;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.format.ConfigFormats;

@Config(id = GTSWCore.MOD_ID)
public class GTSWConfig {

    public static GTSWConfig INSTANCE;

    public static void init() {
        INSTANCE = Configuration.registerConfig(GTSWConfig.class, ConfigFormats.yaml()).getConfigInstance();
    }

    @Configurable
    public ServerConfigs server = new ServerConfigs();

    public static class ServerConfigs {

        @Configurable
        @Configurable.Comment({ "Maximum parallel count of industrial steam machine", "Default: 64" })
        public int industrialSteamMachineMaxParallels = 64;

        @Configurable
        @Configurable.Comment({
                "Whether large advanced turbine will blow up entities in front of rotor holder when working",
                "Default: true" })
        public boolean enableAdvancedTurbineBlowing = true;
    }
}
