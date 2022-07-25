package net.fratboychad21.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fratboychad21.tutorialmod.TutorialMod;
import net.fratboychad21.tutorialmod.item.custom.EightBallItem;
import net.fratboychad21.tutorialmod.item.custom.TanzaniteEnderPearlItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_TANZANITE = regiseterItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item TANZANITE = regiseterItem("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item EIGHT_BALL = regiseterItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(1)));

    public static final Item TANZANITE_ENDER_PEARL = regiseterItem("tanzanite_ender_pearl",
            new TanzaniteEnderPearlItem(new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(1)));


    private static Item regiseterItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for" + TutorialMod.MOD_ID);
    }
}
