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
    public static final SoundEvent SO_LOW = registerSoundEvent ("so_low");
    public static final RegistryKey<JukeboxSong> SO_LOW_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "so_low"));

    public static final SoundEvent HESITATIONS = registerSoundEvent ("hesitations");
    public static final RegistryKey<JukeboxSong> HESITATIONS_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "hesitations"));

    public static final SoundEvent NOVOCAINE = registerSoundEvent ("novocaine");
    public static final RegistryKey<JukeboxSong> NOVOCAINE_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "novocaine"));

    public static final SoundEvent ENDLESS = registerSoundEvent ("endless");
    public static final RegistryKey<JukeboxSong> ENDLESS_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "endless"));

    public static final SoundEvent IS_THIS_TOO_MUCH = registerSoundEvent ("is_this_too_much");
    public static final RegistryKey<JukeboxSong> IS_THIS_TOO_MUCH_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ShilohSong.MOD_ID, "is_this_too_much"));

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(ShilohSong.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {

    }
}
