package com.amatis;

import com.amatis.config.AmatisConfig;
import com.amatis.events.AmatisEvents;
import com.amatis.registry.ModItems;
import net.fabricmc.api.ModInitializer;

/**
 * Amatis Upgrade (Fabric): el nivel siguiente a la netherita (x2.9 de sus estadisticas).
 */
public class AmatisUpgrade implements ModInitializer {
    public static final String MOD_ID = "amatis_upgrade";

    @Override
    public void onInitialize() {
        AmatisConfig.load();
        ModItems.init();
        AmatisEvents.register();
    }
}
