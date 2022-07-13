package me.purplepineapple.bijoux.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.entity.BijouxEntityTypes;
import me.purplepineapple.bijoux.entity.entities.ClamEntity;
import me.purplepineapple.bijoux.entity.model.ClamEntityModel;
import me.purplepineapple.bijoux.entity.renderer.ClamEntityRenderer;
import me.purplepineapple.bijoux.item.BijouxItems;
import me.purplepineapple.bijoux.villager.BijouxVillagers;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid= Bijoux.MOD_ID)
public class BijouxEvents {
    @SubscribeEvent
    public static void createCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == BijouxVillagers.GEOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> geologistTrades = event.getTrades();
        }
    }

    @SubscribeEvent
    public static void spawnEntities(final BiomeLoadingEvent event) {
        if(event.getCategory() == Biome.BiomeCategory.OCEAN) {

        }
    }


}
