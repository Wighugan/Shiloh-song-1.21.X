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

import javax.naming.Name;
import java.util.List;

public class ModItems {
    public static final Item MUSIC_DISC_AGAIN = registerItem("music_disc_again", new Item(new Item.Settings().jukeboxPlayable(ModSounds.AGAIN_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_CHASING_YOUR_HEART = registerItem("music_disc_chasing_your_heart", new Item(new Item.Settings().jukeboxPlayable(ModSounds.CHASING_YOUR_HEART_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_DEAR_INDUSTRY = registerItem("music_disc_dear_industry", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DEAR_INDUSTRY_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_DRUNK_CONFUSED = registerItem("music_disc_drunk_confused", new Item(new Item.Settings().jukeboxPlayable(ModSounds.DRUNK_CONFUSED_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_ENDLESS = registerItem("music_disc_endless", new Item(new Item.Settings().jukeboxPlayable(ModSounds.ENDLESS_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_HESITATIONS = registerItem("music_disc_hesitations", new Item(new Item.Settings().jukeboxPlayable(ModSounds.HESITATIONS_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_I_DONT_WANT = registerItem("music_disc_i_dont_want", new Item(new Item.Settings().jukeboxPlayable(ModSounds.I_DONT_WANT_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_I_KNOW_YOURE_SOMEWHERE = registerItem("music_disc_i_know_youre_somewhere", new Item(new Item.Settings().jukeboxPlayable(ModSounds.I_KNOW_YOURE_SOMEWHERE_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_ILL_KEEP_YOU_SAFE = registerItem("music_disc_ill_keep_you_safe", new Item(new Item.Settings().jukeboxPlayable(ModSounds.ILL_KEEP_YOU_SAFE_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_IMAGINATION = registerItem("music_disc_imagination", new Item(new Item.Settings().jukeboxPlayable(ModSounds.IMAGINATION_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_IS_THIS_TOO_MUCH = registerItem("music_disc_is_this_too_much", new Item(new Item.Settings().jukeboxPlayable(ModSounds.IS_THIS_TOO_MUCH_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_LONELY = registerItem("music_disc_lonely", new Item(new Item.Settings().jukeboxPlayable(ModSounds.LONELY_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_LOSING_INTEREST = registerItem("music_disc_losing_interest", new Item(new Item.Settings().jukeboxPlayable(ModSounds.LOSING_INTEREST_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_NIGHTMARES = registerItem("music_disc_nightmares", new Item(new Item.Settings().jukeboxPlayable(ModSounds.NIGHTMARES_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_NOVOCAINE = registerItem("music_disc_novocaine", new Item(new Item.Settings().jukeboxPlayable(ModSounds.NOVOCAINE_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_PEEP_SHIT = registerItem("music_disc_peep_shit", new Item(new Item.Settings().jukeboxPlayable(ModSounds.PEEP_SHIT_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_SEX = registerItem("music_disc_sex", new Item(new Item.Settings().jukeboxPlayable(ModSounds.SEX_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_SO_INNOCENT = registerItem("music_disc_so_innocent", new Item(new Item.Settings().jukeboxPlayable(ModSounds.SO_INNOCENT_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_SO_LOW = registerItem("music_disc_so_low", new Item(new Item.Settings().jukeboxPlayable(ModSounds.SO_LOW_KEY).rarity(Rarity.RARE).maxCount(1)));
    public static final Item MUSIC_DISC_WAITING = registerItem("music_disc_waiting", new Item(new Item.Settings().jukeboxPlayable(ModSounds.WAITING_KEY).rarity(Rarity.RARE).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ShilohSong.MOD_ID, name), item);
    }

    public static final List<Item> allDiscs = List.of(
            MUSIC_DISC_AGAIN,
            MUSIC_DISC_CHASING_YOUR_HEART,
            MUSIC_DISC_DEAR_INDUSTRY,
            MUSIC_DISC_DRUNK_CONFUSED,
            MUSIC_DISC_ENDLESS,
            MUSIC_DISC_HESITATIONS,
            MUSIC_DISC_I_DONT_WANT,
            MUSIC_DISC_I_KNOW_YOURE_SOMEWHERE,
            MUSIC_DISC_ILL_KEEP_YOU_SAFE,
            MUSIC_DISC_IMAGINATION,
            MUSIC_DISC_IS_THIS_TOO_MUCH,
            MUSIC_DISC_LONELY,
            MUSIC_DISC_LOSING_INTEREST,
            MUSIC_DISC_NIGHTMARES,
            MUSIC_DISC_NOVOCAINE,
            MUSIC_DISC_PEEP_SHIT,
            MUSIC_DISC_SEX,
            MUSIC_DISC_SO_INNOCENT,
            MUSIC_DISC_SO_LOW,
            MUSIC_DISC_WAITING
    );

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            for (Item disc : allDiscs)
                fabricItemGroupEntries.add(disc);
        });
    }
}
