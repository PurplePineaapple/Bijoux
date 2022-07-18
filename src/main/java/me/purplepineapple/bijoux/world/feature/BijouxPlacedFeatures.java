package me.purplepineapple.bijoux.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class BijouxPlacedFeatures {
    public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
            BijouxConfiguredFeatures.RUBY_ORE_GEN, BijouxOrePlacements.commonOrePlacement(2, //Veins per chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(14), VerticalAnchor.aboveBottom(76))));

    public static final Holder<PlacedFeature> AQUAMARINE_ORE_PLACED = PlacementUtils.register("aquamarine_ore_placed",
            BijouxConfiguredFeatures.AQUAMARINE_ORE_GEN, BijouxOrePlacements.commonOrePlacement(15,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(70), VerticalAnchor.aboveBottom(109))));

    public static final Holder<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacementUtils.register("sapphire_ore_placed",
            BijouxConfiguredFeatures.SAPPHIRE_ORE_GEN, BijouxOrePlacements.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.aboveBottom(30))));
}
