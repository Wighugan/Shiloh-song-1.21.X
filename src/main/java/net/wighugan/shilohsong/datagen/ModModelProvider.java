package net.wighugan.shilohsong.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.wighugan.shilohsong.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUSIC_DISC_SO_LOW, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HESITATIONS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NOVOCAINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_IS_THIS_TOO_MUCH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ENDLESS, Models.GENERATED);
    }
}
