package net.examplemod.forge;

import dev.architectury.platform.forge.EventBuses;
import net.examplemod.Initializer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Initializer.MOD_ID)
public class ModForge {
    public ModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Initializer.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Initializer.init();
    }
}
