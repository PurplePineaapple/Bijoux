package me.purplepineapple.bijoux.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class BijouxOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        if(event.getName().equals("minecraft:warm_ocean")) {

        }
        base.add(BijouxPlacedFeatures.RUBY_ORE_PLACED);
    }
}
