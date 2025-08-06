package net.wighugan.shilohsong.item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.wighugan.shilohsong.ShilohSong;
import net.wighugan.shilohsong.sound.ModSounds;

public class ModItems {
    public static final Item MUSIC_DISC_SO_LOW = registerItem("music_disc_so_low", new Item(new Item.Settings().jukeboxPlayable(ModSounds.SO_LOW_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_HESITATIONS = registerItem("music_disc_hesitations", new Item(new Item.Settings().jukeboxPlayable(ModSounds.HESITATIONS_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_NOVOCAINE = registerItem("music_disc_novocaine", new Item(new Item.Settings().jukeboxPlayable(ModSounds.NOVOCAINE_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_ENDLESS = registerItem("music_disc_endless", new Item(new Item.Settings().jukeboxPlayable(ModSounds.ENDLESS_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_IS_THIS_TOO_MUCH = registerItem("music_disc_is_this_too_much", new Item(new Item.Settings().jukeboxPlayable(ModSounds.IS_THIS_TOO_MUCH_KEY).rarity(Rarity.RARE).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ShilohSong.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MUSIC_DISC_SO_LOW);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MUSIC_DISC_HESITATIONS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MUSIC_DISC_NOVOCAINE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MUSIC_DISC_ENDLESS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MUSIC_DISC_IS_THIS_TOO_MUCH);
        });
    }
}
