package me.purplepineapple.bijoux.world.feature.generation;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.world.feature.BijouxPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class BijouxOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        if(event.getCategory() == Biome.BiomeCategory.OCEAN) {
            base.add(BijouxPlacedFeatures.AQUAMARINE_ORE_PLACED);
        } else if(event.getCategory() == Biome.BiomeCategory.THEEND) {
            base.add(BijouxPlacedFeatures.SAPPHIRE_ORE_PLACED);
        } else {
            base.add(BijouxPlacedFeatures.RUBY_ORE_PLACED);
        }
    }
}
