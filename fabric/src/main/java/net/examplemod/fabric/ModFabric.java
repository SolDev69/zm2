package net.examplemod.fabric;

import net.examplemod.Initializer;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Initializer.init();
    }
}
