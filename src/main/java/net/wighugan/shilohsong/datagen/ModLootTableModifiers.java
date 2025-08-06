package net.wighugan.shilohsong.datagen;

import io.netty.util.Constant;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.block.enums.ChestType;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.wighugan.shilohsong.item.ModItems;
import net.wighugan.shilohsong.sound.ModSounds;

import java.util.List;

public class ModLootTableModifiers {

/*
    private static final List<RegistryKey<LootTable>> villageChest = List.of(
            LootTables.ANCIENT_CITY_CHEST,
            LootTables.ABANDONED_MINESHAFT_CHEST,
            LootTables.ANCIENT_CITY_ICE_BOX_CHEST,
            LootTables.BASTION_BRIDGE_CHEST,
            LootTables.BASTION_HOGLIN_STABLE_CHEST,
            LootTables.BASTION_OTHER_CHEST,
            LootTables.BASTION_TREASURE_CHEST,
            LootTables.BURIED_TREASURE_CHEST,
            LootTables.DESERT_PYRAMID_CHEST,
            LootTables.IGLOO_CHEST_CHEST,
            LootTables.UNDERWATER_RUIN_BIG_CHEST,
            LootTables.UNDERWATER_RUIN_SMALL_CHEST,
            LootTables.JUNGLE_TEMPLE_CHEST,
            LootTables.JUNGLE_TEMPLE_DISPENSER_CHEST,
            LootTables.NETHER_BRIDGE_CHEST,
            LootTables.PILLAGER_OUTPOST_CHEST,
            LootTables.RUINED_PORTAL_CHEST,
            LootTables.SHIPWRECK_MAP_CHEST,
            LootTables.SHIPWRECK_SUPPLY_CHEST,
            LootTables.SHIPWRECK_TREASURE_CHEST,
            LootTables.SIMPLE_DUNGEON_CHEST,
            LootTables.STRONGHOLD_CORRIDOR_CHEST,
            LootTables.STRONGHOLD_CROSSING_CHEST,
            LootTables.STRONGHOLD_LIBRARY_CHEST,
            LootTables.WOODLAND_MANSION_CHEST,
            LootTables.VILLAGE_ARMORER_CHEST,
            LootTables.VILLAGE_PLAINS_CHEST,
            LootTables.VILLAGE_BUTCHER_CHEST,
            LootTables.VILLAGE_CARTOGRAPHER_CHEST,
            LootTables.VILLAGE_DESERT_HOUSE_CHEST,
            LootTables.VILLAGE_MASON_CHEST,
            LootTables.VILLAGE_SAVANNA_HOUSE_CHEST,
            LootTables.VILLAGE_SHEPARD_CHEST,
            LootTables.VILLAGE_SNOWY_HOUSE_CHEST,
            LootTables.VILLAGE_TAIGA_HOUSE_CHEST,
            LootTables.VILLAGE_TEMPLE_CHEST
    );
*/

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((registryKey, builder, lootTableSource, wrapperLookup) ->
        {
            if(LootTables.ANCIENT_CITY_CHEST.equals(registryKey) || LootTables.SIMPLE_DUNGEON_CHEST.equals(registryKey) || LootTables.SHIPWRECK_TREASURE_CHEST.equals(registryKey) || LootTables.BURIED_TREASURE_CHEST.equals(registryKey)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_SO_LOW))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_HESITATIONS))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_NOVOCAINE))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_ENDLESS))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_IS_THIS_TOO_MUCH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                builder.pool(poolBuilder.build());
            }
        });
    }
}

