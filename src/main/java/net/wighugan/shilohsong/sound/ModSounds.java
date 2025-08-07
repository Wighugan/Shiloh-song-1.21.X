package net.wighugan.shilohsong.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.wighugan.shilohsong.ShilohSong;

public class ModSounds {
    public static final SoundEvent AGAIN = registerSoundEvent ("again");
    public static final RegistryKey<JukeboxSong> AGAIN_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "again"));

    public static final SoundEvent CHASING_YOUR_HEART = registerSoundEvent ("chasing_your_heart");
    public static final RegistryKey<JukeboxSong> CHASING_YOUR_HEART_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "chasing_your_heart"));

    public static final SoundEvent DEAR_INDUSTRY = registerSoundEvent ("dear_industry");
    public static final RegistryKey<JukeboxSong> DEAR_INDUSTRY_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "dear_industry"));

    public static final SoundEvent DRUNK_CONFUSED = registerSoundEvent ("drunk_confused");
    public static final RegistryKey<JukeboxSong> DRUNK_CONFUSED_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "drunk_confused"));

    public static final SoundEvent ENDLESS = registerSoundEvent ("endless");
    public static final RegistryKey<JukeboxSong> ENDLESS_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "endless"));

    public static final SoundEvent HESITATIONS = registerSoundEvent ("hesitations");
    public static final RegistryKey<JukeboxSong> HESITATIONS_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "hesitations"));

    public static final SoundEvent I_DONT_WANT = registerSoundEvent ("i_dont_want");
    public static final RegistryKey<JukeboxSong> I_DONT_WANT_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "i_dont_want"));

    public static final SoundEvent I_KNOW_YOURE_SOMEWHERE = registerSoundEvent ("i_know_youre_somewhere");
    public static final RegistryKey<JukeboxSong> I_KNOW_YOURE_SOMEWHERE_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "i_know_youre_somewhere"));

    public static final SoundEvent ILL_KEEP_YOU_SAFE = registerSoundEvent ("ill_keep_you_safe");
    public static final RegistryKey<JukeboxSong> ILL_KEEP_YOU_SAFE_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "ill_keep_you_safe"));

    public static final SoundEvent IMAGINATION = registerSoundEvent ("imagination");
    public static final RegistryKey<JukeboxSong> IMAGINATION_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "imagination"));

    public static final SoundEvent IS_THIS_TOO_MUCH = registerSoundEvent ("is_this_too_much");
    public static final RegistryKey<JukeboxSong> IS_THIS_TOO_MUCH_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "is_this_too_much"));

    public static final SoundEvent LONELY = registerSoundEvent ("lonely");
    public static final RegistryKey<JukeboxSong> LONELY_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "lonely"));

    public static final SoundEvent LOSING_INTEREST = registerSoundEvent ("losing_interest");
    public static final RegistryKey<JukeboxSong> LOSING_INTEREST_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "losing_interest"));

    public static final SoundEvent NIGHTMARES = registerSoundEvent ("nightmares");
    public static final RegistryKey<JukeboxSong> NIGHTMARES_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "nightmares"));

    public static final SoundEvent NOVOCAINE = registerSoundEvent ("novocaine");
    public static final RegistryKey<JukeboxSong> NOVOCAINE_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "novocaine"));

    public static final SoundEvent PEEP_SHIT = registerSoundEvent ("peep_shit");
    public static final RegistryKey<JukeboxSong> PEEP_SHIT_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "peep_shit"));

    public static final SoundEvent SEX = registerSoundEvent ("sex");
    public static final RegistryKey<JukeboxSong> SEX_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "sex"));

    public static final SoundEvent SO_INNOCENT = registerSoundEvent ("so_innocent");
    public static final RegistryKey<JukeboxSong>  SO_INNOCENT_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "so_innocent"));

    public static final SoundEvent SO_LOW = registerSoundEvent ("so_low");
    public static final RegistryKey<JukeboxSong> SO_LOW_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "so_low"));

    public static final SoundEvent WAITING = registerSoundEvent ("waiting");
    public static final RegistryKey<JukeboxSong> WAITING_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "waiting"));

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(ShilohSong.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {

    }
}
