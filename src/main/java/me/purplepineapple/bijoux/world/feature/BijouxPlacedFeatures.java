package me.purplepineapple.bijoux.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class BijouxPlacedFeatures {
    public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
            BijouxConfiguredFeatures.RUBY_ORE_GEN, BijouxOrePlacements.commonOrePlacement(5, //Veins per chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(14), VerticalAnchor.aboveBottom(76))));
}
