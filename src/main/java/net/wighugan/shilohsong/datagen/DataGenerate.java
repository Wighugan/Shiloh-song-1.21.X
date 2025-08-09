package net.wighugan.shilohsong.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;


public class DataGenerate implements DataGeneratorEntrypoint {
/*    public static void main(String[] args) throws IOException {
        Path soundsDir = Paths.get("src/main/resources/assets/shilohsong/sounds");
        Path outputDir = Paths.get("src/main/resources/data/shilohsong/jukebox_song");
        String langDir = "src/main/resources/assets/shilohsong/lang/en_us.json";
        String soundsJsonDir = "src/main/resources/assets/shilohsong/sounds.json";

        if (!Files.exists(outputDir))
            Files.createDirectories(outputDir);

        try (Stream<Path> files = Files.list(soundsDir)) {
            List<Path> listFiles = files.filter(f -> f.toString().toLowerCase().endsWith(".ogg")).toList();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(soundsJsonDir, true))) {
                bw.write("{\n");
                for (int i = 0; i < listFiles.size(); i++) {
                    String fileName = listFiles.get(i).getFileName().toString().replace(".ogg", "");
                    String soundsJ = "\t\"" + fileName + "\": {\n\t\t" +
                            "\"sounds\": [\n\t\t\t" +
                            "{\n\t\t\t" +
                            "\"name\": \"shilohsong:" + fileName + "\",\n\t\t\t" +
                            "\"stream\": true\n\t\t\t" +
                            "}\n\t\t" + "]\n\t" + "}";
                    if (i != listFiles.size() - 1) {
                        bw.write(soundsJ);
                        bw.write(",\n\n");
                    } else {
                        bw.write(soundsJ);
                        bw.write("\n\n");
                    }
                }
                bw.write("}");
                  String descName = fileName.substring(0,1).toUpperCase() + fileName.replace("_", " ").substring(1);
                    String langJ = "\t\"item.shilohsong.music_disc_" + fileName + "\": \"Music Disc\",\n" +
                            "\t\"item.shilohsong.music_disc_" + fileName + ".desc\": \"Shiloh Dynasty - " +  descName;
                    if (i != listFiles.size() - 1) {
                        bw.write(langJ);
                        bw.write("\",\n\n");
                    } else {
                        bw.write(langJ);
                        bw.write("\"\n\n");
                    }
                }
                bw.write("}");

                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file.toFile());
                AudioFormat format = audioInputStream.getFormat();

                long audioFileLength = Files.size(file); // Length in bytes
                int frameSize = format.getFrameSize();
                float frameRate = format.getFrameRate();
                float durationInSeconds = audioFileLength / (frameSize * frameRate);

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


            } catch (Exception error) {
                error.printStackTrace();
            }
        }
    }
*/

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

    }
}

