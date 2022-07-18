package me.purplepineapple.bijoux.world.feature;

import me.purplepineapple.bijoux.block.BijouxBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class BijouxConfiguredFeatures {

    public static final RuleTest END_STONE = new BlockMatchTest(Blocks.END_STONE);

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RUBY_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BijouxBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BijouxBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
    );

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_AQUAMARINE_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BijouxBlocks.AQUAMARINE_ORE.get().defaultBlockState())
    );

    public static final List<OreConfiguration.TargetBlockState> END_SAPPHIRE_ORE = List.of(
            OreConfiguration.target(END_STONE, BijouxBlocks.SAPPHIRE_ORE.get().defaultBlockState())
    );



    // p_206489_: name | p_161014_: veinSize
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RUBY_ORE_GEN = FeatureUtils.register("ruby_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORE, 4));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AQUAMARINE_ORE_GEN = FeatureUtils.register("aquamarine_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_AQUAMARINE_ORE, 6));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SAPPHIRE_ORE_GEN = FeatureUtils.register("sapphire_ore",
            Feature.ORE, new OreConfiguration(END_SAPPHIRE_ORE, 5));

}
