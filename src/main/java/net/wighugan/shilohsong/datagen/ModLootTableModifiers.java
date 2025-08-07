package net.wighugan.shilohsong.datagen;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.wighugan.shilohsong.item.ModItems;


public class ModLootTableModifiers {

    public static void modifyLootTables(){
        for (Item disc : ModItems.allDiscs) {
            LootTableEvents.MODIFY.register((registryKey, builder, lootTableSource, wrapperLookup) ->
            {
                if(LootTables.ANCIENT_CITY_CHEST.equals(registryKey) || LootTables.SIMPLE_DUNGEON_CHEST.equals(registryKey) || LootTables.SHIPWRECK_TREASURE_CHEST.equals(registryKey) || LootTables.BURIED_TREASURE_CHEST.equals(registryKey)){
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.75f))
                            .with(ItemEntry.builder(disc))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                    builder.pool(poolBuilder.build());
                }
            });
        }
    }
}

