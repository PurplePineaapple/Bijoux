package me.purplepineapple.bijoux.world.feature;

import me.purplepineapple.bijoux.registry.BijouxBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class BijouxConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RUBY_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BijouxBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BijouxBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
    );

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_AQUAMARINE_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BijouxBlocks.RUBY_ORE.get().defaultBlockState())
    );



    // p_206489_: name | p_161014_: veinSize
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RUBY_ORE_GEN = FeatureUtils.register("ruby_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORE, 5));

}
