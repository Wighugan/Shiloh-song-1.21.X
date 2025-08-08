package net.wighugan.shilohsong.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class DataGenerate implements DataGeneratorEntrypoint {
    public static void main(String[] args) throws IOException {
        Path soundsDir = Paths.get("src/main/resources/assets/shilohsong/sounds");
        Path outputDir = Paths.get("src/main/resources/data/shilohsong/jukebox_song");

        if (!Files.exists(outputDir))
            Files.createDirectories(outputDir);

        try (Stream<Path> files = Files.list(soundsDir)) {
            files.filter(f -> f.toString().toLowerCase().endsWith(".ogg")).forEach(file -> {
                try {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file.toFile());
                    AudioFormat format = audioInputStream.getFormat();

                    long audioFileLength = Files.size(file); // Length in bytes
                    int frameSize = format.getFrameSize();
                    float frameRate = format.getFrameRate();
                    float durationInSeconds = audioFileLength / (frameSize * frameRate);

                    String fileName = file.getFileName().toString().replace(".ogg", "");
                    String writeFile = "{\n" +
                                    "\"comparator_output\": 15,\n" +
                                    "\"description\": {\n" +
                                    "\"translate\":\"item.shilohsong.music_disc_" + fileName + ".desc\"\n" +
                                    "},\n" +
                                    "\"length_in_seconds\": " + durationInSeconds + ",\n" +
                                    "\"sound_event\":\"shilohsong:" + fileName + "\"\n" +
                                    "}";

                    Path outFile = outputDir.resolve(fileName + ".json");
                    Files.write(outFile, writeFile.getBytes());
                    System.out.println("Generated JSON for: " + fileName);
                } catch (Exception error) {
                    error.printStackTrace();
                }
            });
        }
    }

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

    }
}

