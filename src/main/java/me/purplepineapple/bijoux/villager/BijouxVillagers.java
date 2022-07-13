package me.purplepineapple.bijoux.villager;

import com.google.common.collect.ImmutableSet;
import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.block.BijouxBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class BijouxVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES,
            Bijoux.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS,
            Bijoux.MOD_ID);

    public static final RegistryObject<PoiType> GEOLOGIST_POI = POI_TYPES.register("geologist_poi", () ->
            new PoiType("geologist_poi", PoiType.getBlockStates(BijouxBlocks.ROCK_TUMBLER.get()), 1, 1));


    public static final RegistryObject<VillagerProfession> GEOLOGIST = VILLAGER_PROFESSIONS.register("geologist", () ->
            new VillagerProfession("geologist", GEOLOGIST_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));


    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, GEOLOGIST_POI.get());
        } catch(InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    // Registers both Deferred Registers at the same time
    public static void register(IEventBus bus) {
        POI_TYPES.register(bus);
        VILLAGER_PROFESSIONS.register(bus);
    }


}
