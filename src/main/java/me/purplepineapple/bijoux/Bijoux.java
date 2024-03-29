package me.purplepineapple.bijoux;


import me.purplepineapple.bijoux.block.BijouxBlocks;
import me.purplepineapple.bijoux.item.BijouxItems;
import me.purplepineapple.bijoux.item.BijouxTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * (Minecraft)
 * @version 1.20.1
 */

@Mod("bijoux")
public class Bijoux {
    public static final String BIJOUX = "bijoux"; // MOD ID
    public static final Logger LOGGER = LogManager.getLogger();
    public Bijoux() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus(); // Get loading bus

        BijouxItems.register(bus); // Registers items
        BijouxBlocks.register(bus);
        BijouxTabs.register(bus); // Registers creative tabs
    }
}
